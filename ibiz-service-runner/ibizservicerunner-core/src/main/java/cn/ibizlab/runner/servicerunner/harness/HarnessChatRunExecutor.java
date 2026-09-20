package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import cn.ibizlab.runner.servicerunner.runtime.ISystemRuntime;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIChatAgentRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.security.IUserContextRuntime;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.JsonUtils;

import java.util.Collections;
import java.util.Map;

/**
 * Restores a synchronous Chat completion from the versioned AI_RUN request
 * snapshot.
 */
public final class HarnessChatRunExecutor implements HarnessRunExecutor {

    static final int SCHEMA_VERSION = 1;
    static final String EXECUTOR_CHAT_COMPLETION = "chat_completion";

    private final ISystemRuntime systemRuntime;

    public HarnessChatRunExecutor(ISystemRuntime systemRuntime) {
        if (systemRuntime == null) {
            throw new IllegalArgumentException("Harness Chat executor requires a SystemRuntime");
        }
        this.systemRuntime = systemRuntime;
    }

    @Override
    public HarnessRunExecutionResult execute(HarnessRecoveryClaim claim)
            throws Throwable {
        if (claim == null) {
            throw new IllegalArgumentException("Harness recovery claim is required");
        }
        ChatExecutionRequest executionRequest = parseRequest(claim.getRun());
        ISysAIFactoryRuntime factoryRuntime = systemRuntime.getSysAIFactoryRuntime(
                executionRequest.factoryId, true);
        if (factoryRuntime == null) {
            throw HarnessRunExecutionException.permanent(
                    "AI_FACTORY_NOT_FOUND",
                    "AI factory runtime does not exist: " + executionRequest.factoryId);
        }
        String agentId = requireText(
                claim.getRun().getAgentId(),
                "RUN_AGENT_ID_MISSING",
                "Run agent_id is required for Chat recovery");
        ISysAIChatAgentRuntime agentRuntime =
                factoryRuntime.getAIChatAgentRuntime(agentId, true);
        if (agentRuntime == null) {
            throw HarnessRunExecutionException.permanent(
                    "AI_CHAT_AGENT_NOT_FOUND",
                    "AI Chat agent runtime does not exist: " + agentId);
        }

        IUserContext previous = UserContext.getCurrent();
        IUserContext recovered = createRecoveredUserContext(claim.getRun());
        try {
            UserContext.setCurrent(recovered);
            ChatCompletionResult result;
            try {
                result = agentRuntime.chatCompletion(
                        executionRequest.dataOrKeys,
                        executionRequest.request,
                        executionRequest.params,
                        executionRequest.appendSystemMessage,
                        executionRequest.appendHistories);
            } catch (HarnessRunExecutionException ex) {
                throw ex;
            } catch (Throwable ex) {
                throw HarnessRunExecutionException.retryable(
                        "CHAT_COMPLETION_FAILED",
                        messageOrClass(ex),
                        ex);
            }
            if (result == null) {
                throw HarnessRunExecutionException.retryable(
                        "CHAT_COMPLETION_EMPTY_RESULT",
                        "AI Chat agent returned no completion result",
                        null);
            }
            return HarnessRunExecutionResult.from(result);
        } finally {
            UserContext.setCurrent(previous);
        }
    }

    private ChatExecutionRequest parseRequest(AIRunDTO run)
            throws HarnessRunExecutionException {
        String requestJson = run.getRequestJson();
        if (requestJson == null || requestJson.trim().isEmpty()) {
            throw HarnessRunExecutionException.permanent(
                    "RUN_REQUEST_SNAPSHOT_MISSING",
                    "Run request_json is required for recovery");
        }

        final JsonNode root;
        try {
            root = JsonUtils.toJsonNode(requestJson);
        } catch (RuntimeException ex) {
            throw new HarnessRunExecutionException(
                    "RUN_REQUEST_SNAPSHOT_INVALID",
                    "Run request_json is not valid JSON",
                    false,
                    ex);
        }
        if (root == null || !root.isObject()) {
            throw HarnessRunExecutionException.permanent(
                    "RUN_REQUEST_SNAPSHOT_INVALID",
                    "Run request_json must be a JSON object");
        }

        JsonNode schemaVersion = root.get("schema_version");
        if (schemaVersion == null
                || !schemaVersion.isIntegralNumber()
                || schemaVersion.asInt() != SCHEMA_VERSION) {
            throw HarnessRunExecutionException.permanent(
                    "RUN_REQUEST_SCHEMA_UNSUPPORTED",
                    "Run request_json schema_version must be " + SCHEMA_VERSION);
        }
        String executor = text(root.get("executor"));
        if (!EXECUTOR_CHAT_COMPLETION.equals(executor)) {
            throw HarnessRunExecutionException.permanent(
                    "RUN_EXECUTOR_UNSUPPORTED",
                    "Unsupported Harness Run executor: " + executor);
        }
        String factoryId = requireText(
                text(root.get("factory_id")),
                "RUN_FACTORY_ID_MISSING",
                "Run request_json factory_id is required");

        JsonNode chatRequestNode = root.get("chat_completion_request");
        if (chatRequestNode == null || !chatRequestNode.isObject()) {
            throw HarnessRunExecutionException.permanent(
                    "CHAT_COMPLETION_REQUEST_MISSING",
                    "Run request_json chat_completion_request must be an object");
        }
        final ChatCompletionRequest chatRequest;
        try {
            chatRequest = JsonUtils.as(chatRequestNode, ChatCompletionRequest.class);
        } catch (RuntimeException ex) {
            throw new HarnessRunExecutionException(
                    "CHAT_COMPLETION_REQUEST_INVALID",
                    "Run Chat completion request cannot be mapped",
                    false,
                    ex);
        }
        if (isBlank(chatRequest.getModel())) {
            chatRequest.setModel(requireText(
                    run.getModelId(),
                    "RUN_MODEL_ID_MISSING",
                    "Run model_id is required for Chat recovery"));
        }
        if (isBlank(chatRequest.getSessionId()) && !isBlank(run.getSessionId())) {
            chatRequest.setSessionId(run.getSessionId());
        }
        chatRequest.setStreaming(0);

        Object dataOrKeys = new Entity();
        JsonNode dataOrKeysNode = root.get("data_or_keys");
        if (dataOrKeysNode != null && !dataOrKeysNode.isNull()) {
            if (!dataOrKeysNode.isObject()) {
                throw HarnessRunExecutionException.permanent(
                        "RUN_DATA_OR_KEYS_INVALID",
                        "Run request_json data_or_keys must be an object");
            }
            dataOrKeys = JsonUtils.as(dataOrKeysNode, Entity.class);
        }

        Map<String, Object> params = Collections.emptyMap();
        JsonNode paramsNode = root.get("params");
        if (paramsNode != null && !paramsNode.isNull()) {
            if (!paramsNode.isObject()) {
                throw HarnessRunExecutionException.permanent(
                        "RUN_PARAMS_INVALID",
                        "Run request_json params must be an object");
            }
            params = JsonUtils.as(
                    paramsNode, new TypeReference<Map<String, Object>>() { });
        }

        boolean appendSystemMessage = booleanValue(
                root, "append_system_message", true);
        boolean appendHistories = booleanValue(
                root, "append_histories", false);
        return new ChatExecutionRequest(
                factoryId,
                chatRequest,
                dataOrKeys,
                params,
                appendSystemMessage,
                appendHistories);
    }

    private IUserContext createRecoveredUserContext(AIRunDTO run) {
        IUserContext context = systemRuntime.createDefaultUserContext();
        if (context instanceof IUserContextRuntime) {
            IUserContextRuntime runtimeContext = (IUserContextRuntime) context;
            if (!isBlank(run.getUserId())) {
                runtimeContext.setUserid(run.getUserId());
            }
            if (!isBlank(run.getTenantId())) {
                runtimeContext.setTenant(run.getTenantId());
            }
        }
        return context;
    }

    private boolean booleanValue(JsonNode root,
                                 String field,
                                 boolean defaultValue)
            throws HarnessRunExecutionException {
        JsonNode value = root.get(field);
        if (value == null || value.isNull()) {
            return defaultValue;
        }
        if (!value.isBoolean()) {
            throw HarnessRunExecutionException.permanent(
                    "RUN_REQUEST_SNAPSHOT_INVALID",
                    "Run request_json " + field + " must be boolean");
        }
        return value.asBoolean();
    }

    private String requireText(String value,
                               String errorCode,
                               String message)
            throws HarnessRunExecutionException {
        if (isBlank(value)) {
            throw HarnessRunExecutionException.permanent(errorCode, message);
        }
        return value.trim();
    }

    private String text(JsonNode node) {
        return node == null || !node.isTextual() ? null : node.asText();
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    private String messageOrClass(Throwable error) {
        String message = error == null ? null : error.getMessage();
        return isBlank(message)
                ? (error == null ? "Unknown Chat completion failure"
                    : error.getClass().getSimpleName())
                : message;
    }

    private static final class ChatExecutionRequest {
        private final String factoryId;
        private final ChatCompletionRequest request;
        private final Object dataOrKeys;
        private final Map<String, Object> params;
        private final boolean appendSystemMessage;
        private final boolean appendHistories;

        private ChatExecutionRequest(String factoryId,
                                     ChatCompletionRequest request,
                                     Object dataOrKeys,
                                     Map<String, Object> params,
                                     boolean appendSystemMessage,
                                     boolean appendHistories) {
            this.factoryId = factoryId;
            this.request = request;
            this.dataOrKeys = dataOrKeys;
            this.params = params;
            this.appendSystemMessage = appendSystemMessage;
            this.appendHistories = appendHistories;
        }
    }
}
