package net.ibizsys.modeling.core.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.SystemRuntime;
import net.ibizsys.central.cloud.core.security.AuthenticationUser;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.service.util.ResponseExceptionHandler;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.modeling.core.dataentity.security.PSModelDEAccessManager;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnService;
import net.ibizsys.modeling.core.dataentity.service.IPSDevSlnSysService;
import net.ibizsys.modeling.core.util.PSDevSysUserHolder;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IAppContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

class SystemAccessManagerRootErrorMappingTest {
    private Authentication previousAuthentication;
    private IUserContext previousUserContext;
    private final ResponseExceptionHandler handler = new ResponseExceptionHandler();

    private static final class Manager extends SystemAccessManagerBase {
        final SystemRuntime runtime = new SystemRuntime();
        final List<String> targetReads = new ArrayList<>();
        int cacheReads;
        int cacheWrites;

        Manager() {
            setSysCacheUtilRuntime(proxy(ISysCacheUtilRuntime.class, (object, method, args) -> {
                if ("get".equals(method.getName())) {
                    assertEquals(PSDevUserCacheCodec.Entry.class, args[2]);
                    cacheReads++;
                    return null;
                }
                if ("set".equals(method.getName())) {
                    cacheWrites++;
                    return null;
                }
                throw new AssertionError("Unexpected cache call: " + method.getName());
            }));
        }

        @Override
        public ISystemRuntime getSystemRuntime() {
            return runtime;
        }

        @Override
        public IPSDevUser getCurrentPSDevUser() {
            PSDevUser user = new PSDevUser();
            user.setPSDevUserId("owned-editor");
            user.setPSDevCenterId("owned-center");
            return user;
        }
    }

    @BeforeEach
    void saveThreadContexts() {
        previousAuthentication = SecurityContextHolder.getContext().getAuthentication();
        previousUserContext = UserContext.getCurrent();
        assertNull(ActionSessionManager.getCurrentSession());
        assertNull(PSDevSysUserHolder.peek());
        UserContext.setCurrent(null);
    }

    @AfterEach
    void restoreThreadContexts() {
        try {
            ActionSessionManager.closeSession(false);
        } finally {
            SecurityContextHolder.getContext().setAuthentication(previousAuthentication);
            UserContext.setCurrent(previousUserContext);
        }
    }

    @Test
    void missingModelApplicationContextMapsTo403BeforeLookupOrMutation() {
        assertModelRootDenied(null);
    }

    @Test
    void malformedModelRootsMapTo403ForRecordAndSearchReadAndUpdate() {
        for (Object root : Arrays.asList(null, "", " ", "\t", 0,
                " owned-library", "owned-library ", "owned\nlibrary", "owned\u0000library")) {
            AppContext app = new AppContext();
            if (root != null) app.set("PSDEVSLNSYS", root);
            assertModelRootDenied(app);
        }
    }

    private void assertModelRootDenied(IAppContext app) {
        List<String> lookups = new ArrayList<>();
        ISystemAccessManager access = proxy(ISystemAccessManager.class, (object, method, args) -> {
            if ("getPSDevUserBase".equals(method.getName())) {
                lookups.add((String) args[1]);
                throw new AssertionError("Malformed roots must not reach grant lookup");
            }
            throw new AssertionError("Unexpected system access call: " + method.getName());
        });
        PSModelDEAccessManager manager = new PSModelDEAccessManager() {
            @Override
            public ISystemAccessManager getSystemAccessManager() {
                return access;
            }
        };
        IUserContext user = proxy(IUserContext.class, (object, method, args) -> {
            if ("getAppContext".equals(method.getName())) return app;
            throw new AssertionError("Unexpected user-context call: " + method.getName());
        });
        UserContext.setCurrent(user);
        for (String action : Arrays.asList("READ", "UPDATE")) {
            EntityDTO input = new EntityDTO();
            input.set("pssystemid", "original-untrusted-input");
            Throwable recordFailure = assertThrows(ErrorException.class, () ->
                manager.testDataAccessAction(user, null, null, "owned-record", input, action));
            assertMapped(recordFailure, 403, Errors.ACCESSDENY);
            assertEquals("original-untrusted-input", input.get("pssystemid"));
            SearchContextDTO search = new SearchContextDTO();
            search.set("pssystemid", "original-untrusted-filter");
            Throwable searchFailure = assertThrows(ErrorException.class, () ->
                manager.testDataAccessAction(user, null, null, search, action));
            assertMapped(searchFailure, 403, Errors.ACCESSDENY);
            assertEquals("original-untrusted-filter", search.get("pssystemid"));
        }
        assertTrue(lookups.isEmpty());
    }

    @Test
    void malformedSystemAndSchemeRootsMapTo403WithoutCacheOrTargetLookup() {
        Manager manager = new Manager();
        for (String type : Arrays.asList("SYS", "SLN")) {
            for (String root : Arrays.asList(null, "", " ", "\t", "owned-library ",
                    " owned-library", "owned\nlibrary", "owned\u00a0library", "owned\u0000library")) {
                Throwable failure = assertThrows(SystemRuntimeException.class, () ->
                    manager.getPSDevUserBase(type, root));
                assertMapped(failure, 403, Errors.ACCESSDENY);
                assertTrue(failure.getCause() instanceof ErrorException);
            }
        }
        assertEquals(0, manager.cacheReads);
        assertEquals(0, manager.cacheWrites);
        assertTrue(manager.targetReads.isEmpty());
    }

    @Test
    void absentSystemRootsIncludingLogicalSystemAsRootMapTo403WithoutCaching() throws Exception {
        assertMissingTargetDenied("SYS");
    }

    @Test
    void absentSchemeRootsMapTo403WithoutCaching() throws Exception {
        assertMissingTargetDenied("SLN");
    }

    private void assertMissingTargetDenied(String type) throws Exception {
        installIdentity();
        Manager manager = manager(type, null);
        for (String root : Arrays.asList("owned-logical-model-system", "owned-unknown-root")) {
            Throwable failure = assertThrows(SystemRuntimeException.class, () ->
                manager.getPSDevUserBase(type, root));
            assertMapped(failure, 403, Errors.ACCESSDENY);
            assertTrue(failure.getCause() instanceof ErrorException);
        }
        assertEquals(Arrays.asList("owned-logical-model-system", "owned-unknown-root"), manager.targetReads);
        assertEquals(2, manager.cacheReads);
        assertEquals(0, manager.cacheWrites);
    }

    @Test
    void genuineSystemServiceFailureRemains500InsteadOfAuthorizationDenial() throws Exception {
        assertServiceFailureRemainsInternal("SYS");
    }

    @Test
    void genuineSchemeServiceFailureRemains500InsteadOfAuthorizationDenial() throws Exception {
        assertServiceFailureRemainsInternal("SLN");
    }

    private void assertServiceFailureRemainsInternal(String type) throws Exception {
        installIdentity();
        Exception original = new Exception("owned service/database unavailable");
        Manager manager = manager(type, original);
        Throwable failure = assertThrows(SystemRuntimeException.class, () ->
            manager.getPSDevUserBase(type, "owned-requested-root"));
        assertSame(original, failure.getCause());
        assertMapped(failure, 500, Errors.INTERNALERROR);
        assertEquals(Arrays.asList("owned-requested-root"), manager.targetReads);
        assertEquals(0, manager.cacheWrites);
    }

    @Test
    void requiredCurrentRootWithoutContextMapsTo403WhileOptionalModeStaysNull() {
        Manager manager = new Manager();
        assertNull(manager.getCurrentPSDevSysUser(true));
        Throwable failure = assertThrows(SystemRuntimeException.class, () ->
            manager.getCurrentPSDevSysUser(false));
        assertMapped(failure, 403, Errors.ACCESSDENY);
        assertEquals(0, manager.cacheReads);
        assertTrue(manager.targetReads.isEmpty());
    }

    @Test
    void requiredCurrentMalformedRootMapsTo403WhileOptionalModeStaysNull() {
        Manager manager = new Manager();
        ActionSession session = ActionSessionManager.openSession("owned-root-mapping");
        for (Object root : Arrays.asList(null, "", " ", 0, "owned-library ", "owned\nlibrary")) {
            AppContext app = new AppContext();
            if (root != null) app.set("PSDEVSLNSYS", root);
            session.setAppContext(app);
            assertNull(manager.getCurrentPSDevSysUser(true));
            Throwable failure = assertThrows(SystemRuntimeException.class, () ->
                manager.getCurrentPSDevSysUser(false));
            assertMapped(failure, 403, Errors.ACCESSDENY);
        }
        assertEquals(0, manager.cacheReads);
        assertTrue(manager.targetReads.isEmpty());
    }

    @Test
    void responseMappingIsUnchangedForInternalAndInputErrors() {
        assertMapped(new ErrorException("owned denied", Errors.ACCESSDENY), 403, Errors.ACCESSDENY);
        assertMapped(new ErrorException("owned invalid input", Errors.INPUTERROR), 500, Errors.INPUTERROR);
        assertMapped(new Exception("owned internal failure"), 500, Errors.INTERNALERROR);
    }

    private void assertMapped(Throwable failure, int status, int code) {
        ResponseEntity<?> response = handler.getResponseEntity(failure);
        assertEquals(status, response.getStatusCodeValue());
        JsonNode body = (JsonNode) response.getBody();
        assertEquals(code, body.get("code").asInt());
    }

    private Manager manager(String type, Throwable serviceFailure) throws Exception {
        Manager manager = new Manager();
        Class<?> serviceType = "SYS".equals(type) ? IPSDevSlnSysService.class : IPSDevSlnService.class;
        Object service = Proxy.newProxyInstance(serviceType.getClassLoader(), new Class<?>[] {serviceType},
            (object, method, args) -> {
                if (!"get".equals(method.getName())) {
                    throw new AssertionError("Unexpected target service call: " + method.getName());
                }
                manager.targetReads.add((String) args[0]);
                assertEquals(Boolean.TRUE, args[1]);
                if (serviceFailure != null) throw serviceFailure;
                return null;
            });
        Field field = SystemAccessManagerBase.class.getDeclaredField(
                "SYS".equals(type) ? "iPSDevSlnSysService" : "iPSDevSlnService");
        field.setAccessible(true);
        field.set(manager, service);
        return manager;
    }

    private void installIdentity() {
        AuthenticationUser user = new AuthenticationUser();
        user.setUsername("owned-editor");
        user.setUserid("owned-editor");
        user.setLoginname("owned-editor");
        user.setToken("owned-unit-token");
        IEmployeeContext employee = proxy(IEmployeeContext.class, (object, method, args) -> {
            if ("getUserid".equals(method.getName())) return "owned-editor";
            if ("getUsername".equals(method.getName())) return "Owned editor";
            if ("getTenant".equals(method.getName())) return "owned-center";
            throw new AssertionError("Unexpected employee call: " + method.getName());
        });
        AuthenticationUser.setCurrent(user, employee);
    }

    private static <T> T proxy(Class<T> type, InvocationHandler handler) {
        return type.cast(Proxy.newProxyInstance(type.getClassLoader(), new Class<?>[] {type}, handler));
    }
}
