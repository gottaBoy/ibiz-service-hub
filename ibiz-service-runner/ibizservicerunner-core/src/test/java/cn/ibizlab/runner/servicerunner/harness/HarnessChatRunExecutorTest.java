package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import cn.ibizlab.runner.servicerunner.runtime.ISystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.security.IUserContextRuntime;
import net.ibizsys.central.security.UserContextRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HarnessChatRunExecutorTest {

    @AfterEach
    void clearUserContext() {
        UserContext.setCurrent(null);
    }

    @Test
    void executesVersionedSnapshotWithRecoveredUserContext() throws Throwable {
        AtomicReference<String> factoryId = new AtomicReference<String>();
        AtomicReference<String> agentId = new AtomicReference<String>();
        AtomicReference<Object[]> chatArguments = new AtomicReference<Object[]>();
        AtomicReference<IUserContext> executionContext =
                new AtomicReference<IUserContext>();
        IEmployeeContext recoveredContext = employeeContext(
                "default-user", "default-tenant");

        ISysAIChatAgentRuntime agent = proxy(
                ISysAIChatAgentRuntime.class,
                (instance, method, args) -> {
                    if ("chatCompletion".equals(method.getName())
                            && args != null
                            && args.length == 5) {
                        chatArguments.set(args);
                        executionContext.set(UserContext.getCurrent());
                        return new ChatCompletionResult()
                                .setModel("result-model")
                                .setSessionId("result-session");
                    }
                    return defaultValue(method.getReturnType());
                });
        ISysAIFactoryRuntime factory = proxy(
                ISysAIFactoryRuntime.class,
                (instance, method, args) -> {
                    if ("getAIChatAgentRuntime".equals(method.getName())) {
                        agentId.set((String) args[0]);
                        return agent;
                    }
                    return defaultValue(method.getReturnType());
                });
        ISystemRuntime systemRuntime = systemRuntime(
                recoveredContext,
                (instance, method, args) -> {
                    if ("getSysAIFactoryRuntime".equals(method.getName())
                            && args != null
                            && args.length == 2) {
                        factoryId.set((String) args[0]);
                        return factory;
                    }
                    return defaultValue(method.getReturnType());
                });

        UserContextRuntime previous = new UserContextRuntime();
        previous.setUserid("previous-user");
        previous.setTenant("previous-tenant");
        UserContext.setCurrent(previous);

        HarnessRunExecutionResult result =
                new HarnessChatRunExecutor(systemRuntime).execute(
                        claim(run(validRequestJson())));

        assertSame(previous, UserContext.getCurrent());
        assertEquals("factory-01", factoryId.get());
        assertEquals("agent-01", agentId.get());
        assertSame(recoveredContext, executionContext.get());
        assertEquals("run-user", executionContext.get().getUserid());
        assertEquals("run-tenant", executionContext.get().getTenant());

        Object[] arguments = chatArguments.get();
        assertNotNull(arguments);
        Entity dataOrKeys = (Entity) arguments[0];
        assertEquals("record-01", dataOrKeys.get("id"));
        ChatCompletionRequest request = (ChatCompletionRequest) arguments[1];
        assertEquals("snapshot-model", request.getModel());
        assertEquals("snapshot-session", request.getSessionId());
        assertEquals(Integer.valueOf(0), request.getStreaming());
        assertEquals(1, request.getMessages().size());
        assertEquals("hello", request.getMessages().get(0).getContent());
        assertEquals("value-01", ((Map<?, ?>) arguments[2]).get("key-01"));
        assertEquals(Boolean.FALSE, arguments[3]);
        assertEquals(Boolean.TRUE, arguments[4]);
        assertEquals(
                "result-model",
                JsonUtils.toJsonNode(result.getResultJson()).get("model").asText());
    }

    @Test
    void rejectsMissingInvalidAndUnsupportedSnapshotsPermanently() {
        ISystemRuntime systemRuntime = systemRuntime(
                employeeContext("user", "tenant"),
                (instance, method, args) -> defaultValue(method.getReturnType()));
        HarnessChatRunExecutor executor =
                new HarnessChatRunExecutor(systemRuntime);

        assertPermanent(
                "RUN_REQUEST_SNAPSHOT_MISSING",
                () -> executor.execute(claim(run(null))));
        assertPermanent(
                "RUN_REQUEST_SNAPSHOT_INVALID",
                () -> executor.execute(claim(run("[]"))));
        assertPermanent(
                "RUN_REQUEST_SCHEMA_UNSUPPORTED",
                () -> executor.execute(claim(run(
                        "{\"schema_version\":2,\"executor\":\"chat_completion\"}"))));
        assertPermanent(
                "RUN_EXECUTOR_UNSUPPORTED",
                () -> executor.execute(claim(run(
                        "{\"schema_version\":1,\"executor\":\"tool\"}"))));
    }

    @Test
    void missingFactoryAndAgentArePermanentFailures() {
        IEmployeeContext context = employeeContext("user", "tenant");
        HarnessChatRunExecutor missingFactory = new HarnessChatRunExecutor(
                systemRuntime(
                        context,
                        (instance, method, args) ->
                                defaultValue(method.getReturnType())));
        assertPermanent(
                "AI_FACTORY_NOT_FOUND",
                () -> missingFactory.execute(claim(run(validRequestJson()))));

        ISysAIFactoryRuntime factoryWithoutAgent = proxy(
                ISysAIFactoryRuntime.class,
                (instance, method, args) -> defaultValue(method.getReturnType()));
        HarnessChatRunExecutor missingAgent = new HarnessChatRunExecutor(
                systemRuntime(
                        context,
                        (instance, method, args) -> {
                            if ("getSysAIFactoryRuntime".equals(method.getName())
                                    && args != null
                                    && args.length == 2) {
                                return factoryWithoutAgent;
                            }
                            return defaultValue(method.getReturnType());
                        }));
        assertPermanent(
                "AI_CHAT_AGENT_NOT_FOUND",
                () -> missingAgent.execute(claim(run(validRequestJson()))));
    }

    @Test
    void chatRuntimeFailureIsRetryableAndRestoresPreviousContext() {
        IEmployeeContext recovered = employeeContext("default", "default");
        ISysAIChatAgentRuntime failingAgent = proxy(
                ISysAIChatAgentRuntime.class,
                (instance, method, args) -> {
                    if ("chatCompletion".equals(method.getName())
                            && args != null
                            && args.length == 5) {
                        assertEquals("run-user", UserContext.getCurrent().getUserid());
                        throw new IllegalStateException("provider unavailable");
                    }
                    return defaultValue(method.getReturnType());
                });
        ISysAIFactoryRuntime factory = proxy(
                ISysAIFactoryRuntime.class,
                (instance, method, args) -> {
                    if ("getAIChatAgentRuntime".equals(method.getName())) {
                        return failingAgent;
                    }
                    return defaultValue(method.getReturnType());
                });
        ISystemRuntime systemRuntime = systemRuntime(
                recovered,
                (instance, method, args) -> {
                    if ("getSysAIFactoryRuntime".equals(method.getName())
                            && args != null
                            && args.length == 2) {
                        return factory;
                    }
                    return defaultValue(method.getReturnType());
                });
        UserContextRuntime previous = new UserContextRuntime();
        previous.setUserid("previous");
        UserContext.setCurrent(previous);

        HarnessRunExecutionException error = assertThrows(
                HarnessRunExecutionException.class,
                () -> new HarnessChatRunExecutor(systemRuntime).execute(
                        claim(run(validRequestJson()))));

        assertEquals("CHAT_COMPLETION_FAILED", error.getErrorCode());
        assertTrue(error.isRetryable());
        assertEquals("provider unavailable", error.getMessage());
        assertSame(previous, UserContext.getCurrent());
    }

    private static AIRunDTO run(String requestJson) {
        return new AIRunDTO()
                .setId("run-01")
                .setStatus("queued")
                .setUserId("run-user")
                .setTenantId("run-tenant")
                .setAgentId("agent-01")
                .setModelId("run-model")
                .setSessionId("run-session")
                .setRequestJson(requestJson);
    }

    private static HarnessRecoveryClaim claim(AIRunDTO run) {
        return new HarnessRecoveryClaim(
                run,
                "worker-01",
                1,
                new Timestamp(System.currentTimeMillis() + 60000L));
    }

    private static String validRequestJson() {
        return "{"
                + "\"schema_version\":1,"
                + "\"executor\":\"chat_completion\","
                + "\"factory_id\":\"factory-01\","
                + "\"chat_completion_request\":{"
                + "\"messages\":[{\"role\":\"user\",\"content\":\"hello\"}],"
                + "\"sessionid\":\"snapshot-session\","
                + "\"model\":\"snapshot-model\","
                + "\"streaming\":1"
                + "},"
                + "\"data_or_keys\":{\"id\":\"record-01\"},"
                + "\"params\":{\"key-01\":\"value-01\"},"
                + "\"append_system_message\":false,"
                + "\"append_histories\":true"
                + "}";
    }

    private static ISystemRuntime systemRuntime(
            IEmployeeContext recoveredContext,
            InvocationHandler delegate) {
        return proxy(
                ISystemRuntime.class,
                (instance, method, args) -> {
                    if ("createDefaultUserContext".equals(method.getName())) {
                        return recoveredContext;
                    }
                    return delegate.invoke(instance, method, args);
                });
    }

    private static IEmployeeContext employeeContext(String userId,
                                                    String tenantId) {
        Map<String, String> values = new java.util.HashMap<String, String>();
        values.put("userId", userId);
        values.put("tenantId", tenantId);
        return (IEmployeeContext) proxy(
                new Class<?>[] {IEmployeeContext.class, IUserContextRuntime.class},
                (instance, method, args) -> {
                    if ("setUserid".equals(method.getName())) {
                        values.put("userId", (String) args[0]);
                        return null;
                    }
                    if ("setTenant".equals(method.getName())) {
                        values.put("tenantId", (String) args[0]);
                        return null;
                    }
                    if ("getUserid".equals(method.getName())) {
                        return values.get("userId");
                    }
                    if ("getTenant".equals(method.getName())) {
                        return values.get("tenantId");
                    }
                    return defaultValue(method.getReturnType());
                });
    }

    private static void assertPermanent(
            String errorCode,
            ThrowingRunnable runnable) {
        HarnessRunExecutionException error = assertThrows(
                HarnessRunExecutionException.class,
                runnable::run);
        assertEquals(errorCode, error.getErrorCode());
        assertFalse(error.isRetryable());
    }

    private static <T> T proxy(Class<T> type,
                               InvocationHandler invocationHandler) {
        return type.cast(proxy(
                new Class<?>[] {type}, invocationHandler));
    }

    private static Object proxy(Class<?>[] types,
                                InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(
                HarnessChatRunExecutorTest.class.getClassLoader(),
                types,
                (instance, method, args) -> {
                    if (method.getDeclaringClass().equals(Object.class)) {
                        return objectMethod(instance, method, args);
                    }
                    return invocationHandler.invoke(instance, method, args);
                });
    }

    private static Object objectMethod(Object instance,
                                       Method method,
                                       Object[] args) {
        if ("equals".equals(method.getName())) {
            return instance == args[0];
        }
        if ("hashCode".equals(method.getName())) {
            return System.identityHashCode(instance);
        }
        if ("toString".equals(method.getName())) {
            return "HarnessTestProxy";
        }
        return null;
    }

    private static Object defaultValue(Class<?> type) {
        if (!type.isPrimitive()) {
            return null;
        }
        if (boolean.class.equals(type)) {
            return false;
        }
        if (char.class.equals(type)) {
            return '\0';
        }
        if (byte.class.equals(type)) {
            return (byte) 0;
        }
        if (short.class.equals(type)) {
            return (short) 0;
        }
        if (int.class.equals(type)) {
            return 0;
        }
        if (long.class.equals(type)) {
            return 0L;
        }
        if (float.class.equals(type)) {
            return 0.0F;
        }
        return 0.0D;
    }

    @FunctionalInterface
    private interface ThrowingRunnable {
        void run() throws Throwable;
    }
}
