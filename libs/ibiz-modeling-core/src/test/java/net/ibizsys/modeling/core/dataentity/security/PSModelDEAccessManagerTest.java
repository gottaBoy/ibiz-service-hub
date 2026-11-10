package net.ibizsys.modeling.core.dataentity.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Proxy;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.modeling.core.security.PSDevSysUser;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.IAppContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class PSModelDEAccessManagerTest {
    private final IUserContext previousContext = UserContext.getCurrent();

    @AfterEach
    void restoreThreadContext() {
        UserContext.setCurrent(previousContext);
    }

    private IUserContext context(IAppContext appContext) {
        IUserContext user = (IUserContext) Proxy.newProxyInstance(
                getClass().getClassLoader(), new Class<?>[] {IUserContext.class},
                (proxy, method, args) -> {
                    if ("getAppContext".equals(method.getName())) {
                        return appContext;
                    }
                    throw new AssertionError("Unexpected user-context call: " + method.getName());
                });
        UserContext.setCurrent(user);
        return user;
    }

    private PSModelDEAccessManager manager(PSDevSysUser systemUser, List<String> roots) {
        ISystemAccessManager access = (ISystemAccessManager) Proxy.newProxyInstance(
                getClass().getClassLoader(), new Class<?>[] {ISystemAccessManager.class},
                (proxy, method, args) -> {
                    if ("getPSDevUserBase".equals(method.getName())) {
                        assertEquals("SYS", args[0]);
                        roots.add((String) args[1]);
                        return systemUser;
                    }
                    throw new AssertionError("Unexpected access-manager call: " + method.getName());
                });
        return new PSModelDEAccessManager() {
            @Override
            public ISystemAccessManager getSystemAccessManager() {
                return access;
            }
        };
    }

    private void verifyActions(int mode, boolean admin, List<String> allowed) throws Exception {
        PSDevSysUser systemUser = new PSDevSysUser();
        systemUser.setPSDevSlnSysId("isolated-system");
        systemUser.setPSSystemId("isolated-model-system");
        systemUser.setAccMode(mode);
        systemUser.setAdminMode(admin);
        List<String> roots = new ArrayList<>();
        PSModelDEAccessManager manager = manager(systemUser, roots);
        AppContext app = new AppContext();
        app.set("psdevslnsys", "isolated-system");
        IUserContext user = context(app);
        for (String action : Arrays.asList("READ", "CREATE", "UPDATE", "DELETE", "MANAGE", "UNKNOWN")) {
            EntityDTO input = new EntityDTO();
            input.set("pssystemid", "untrusted-input");
            assertEquals(allowed.contains(action),
                    manager.testDataAccessAction(user, null, null, "record", input, action), action);
            assertEquals(allowed.contains(action) ? "isolated-model-system" : "untrusted-input",
                    input.get("pssystemid"));
            SearchContextDTO search = new SearchContextDTO();
            search.set("pssystemid", "untrusted-filter");
            assertEquals(allowed.contains(action),
                    manager.testDataAccessAction(user, null, null, search, action), action);
            assertEquals(allowed.contains(action) ? "isolated-model-system" : "untrusted-filter",
                    search.get("pssystemid"));
        }
        assertEquals(12, roots.size());
        assertFalse(roots.stream().anyMatch(root -> !"isolated-system".equals(root)));
    }

    @Test
    void nonAdminViewerCannotWriteOrManage() throws Exception {
        verifyActions(1, false, Arrays.asList("READ"));
    }

    @Test
    void nonAdminEditorCanReadAndWriteButCannotManage() throws Exception {
        verifyActions(3, false, Arrays.asList("READ", "CREATE", "UPDATE", "DELETE"));
    }

    @Test
    void writeBitDoesNotImplicitlyGrantReadOrManage() throws Exception {
        verifyActions(2, false, Arrays.asList("CREATE", "UPDATE", "DELETE"));
    }

    @Test
    void zeroAccessAndUnrelatedBitsCannotGrantModelAccess() throws Exception {
        verifyActions(0, false, Arrays.asList());
        verifyActions(16, false, Arrays.asList());
    }

    @Test
    void adminModeIsAnExplicitSeparateGrant() throws Exception {
        verifyActions(0, true,
                Arrays.asList("READ", "CREATE", "UPDATE", "DELETE", "MANAGE", "UNKNOWN"));
    }

    @Test
    void missingAuthorizationDeniesBothRecordAndSearchAccess() throws Exception {
        AppContext app = new AppContext();
        app.set("PSDEVSLNSYS", "foreign-system");
        IUserContext user = context(app);
        List<String> roots = new ArrayList<>();
        PSModelDEAccessManager manager = manager(null, roots);
        verifyDeniedWithoutMutation(manager, user);
        assertEquals(Arrays.asList("foreign-system", "foreign-system"), roots);
    }

    @Test
    void missingApplicationOrRootCannotFallBackToDefaultSystem() {
        List<String> roots = new ArrayList<>();
        PSModelDEAccessManager manager = manager(new PSDevSysUser(), roots);
        for (IAppContext app : Arrays.asList(null, new AppContext())) {
            IUserContext user = context(app);
            assertThrows(Exception.class,
                    () -> manager.testDataAccessAction(user, null, null, "record", null, "READ"));
            assertThrows(Exception.class,
                    () -> manager.testDataAccessAction(user, null, null, new SearchContextDTO(), "READ"));
        }
        assertEquals(0, roots.size());
    }

    @Test
    void rootAuthorizationIsLookedUpForEveryRequest() throws Exception {
        PSDevSysUser systemUser = new PSDevSysUser();
        systemUser.setAccMode(1);
        systemUser.setPSSystemId("authorized-model-system");
        List<String> roots = new ArrayList<>();
        PSModelDEAccessManager manager = manager(systemUser, roots);
        for (String root : Arrays.asList("library-a", "library-b", "library-a")) {
            systemUser.setPSDevSlnSysId(root);
            AppContext app = new AppContext();
            app.set("PSDEVSLNSYS", root);
            IUserContext user = context(app);
            assertEquals(true, manager.testDataAccessAction(
                    user, null, null, new SearchContextDTO(), "READ"));
        }
        assertEquals(Arrays.asList("library-a", "library-b", "library-a"), roots);
    }

    private void verifyDeniedWithoutMutation(PSModelDEAccessManager manager, IUserContext user)
            throws Exception {
        EntityDTO input = new EntityDTO();
        input.set("pssystemid", "untrusted-input");
        assertFalse(manager.testDataAccessAction(user, null, null, "record", input, "UPDATE"));
        assertEquals("untrusted-input", input.get("pssystemid"));
        SearchContextDTO search = new SearchContextDTO();
        search.set("pssystemid", "untrusted-filter");
        assertFalse(manager.testDataAccessAction(user, null, null, search, "READ"));
        assertEquals("untrusted-filter", search.get("pssystemid"));
    }

    @Test
    void malformedRootIsRejectedBeforeAuthorizationLookupOrInputMutation() {
        List<String> roots = new ArrayList<>();
        PSModelDEAccessManager manager = manager(new PSDevSysUser(), roots);
        for (Object root : Arrays.asList("", " ", "\t", 123, " library-a",
                "library-a ", "library\n-a", "library\u0000a")) {
            AppContext app = new AppContext();
            app.set("PSDEVSLNSYS", root);
            IUserContext user = context(app);
            EntityDTO input = new EntityDTO();
            input.set("pssystemid", "untrusted-input");
            SearchContextDTO search = new SearchContextDTO();
            search.set("pssystemid", "untrusted-filter");
            assertThrows(Exception.class,
                    () -> manager.testDataAccessAction(user, null, null, "record", input, "READ"));
            assertThrows(Exception.class,
                    () -> manager.testDataAccessAction(user, null, null, search, "READ"));
            assertEquals("untrusted-input", input.get("pssystemid"));
            assertEquals("untrusted-filter", search.get("pssystemid"));
        }
        assertTrue(roots.isEmpty());
    }

    @Test
    void foreignOrMissingAuthorizationRootIsDeniedEvenForAdministrator() throws Exception {
        AppContext app = new AppContext();
        app.set("PSDEVSLNSYS", "library-a");
        IUserContext user = context(app);
        for (String root : Arrays.asList(null, "", "library-b")) {
            PSDevSysUser systemUser = new PSDevSysUser();
            systemUser.setPSDevSlnSysId(root);
            systemUser.setPSSystemId("model-b");
            systemUser.setAccMode(3);
            systemUser.setAdminMode(true);
            verifyDeniedWithoutMutation(manager(systemUser, new ArrayList<>()), user);
        }
    }

    @Test
    void missingOrMalformedAuthorizedSystemCannotFallBackToDemoRoot() throws Exception {
        AppContext app = new AppContext();
        app.set("PSDEVSLNSYS", "library-a");
        IUserContext user = context(app);
        for (String id : Arrays.asList(null, "", " ", " model-a", "model\na")) {
            PSDevSysUser systemUser = new PSDevSysUser();
            systemUser.setPSDevSlnSysId("library-a");
            systemUser.setPSSystemId(id);
            systemUser.setAccMode(3);
            systemUser.setAdminMode(true);
            verifyDeniedWithoutMutation(manager(systemUser, new ArrayList<>()), user);
        }
    }

    @Test
    void differentLibrariesBindTheirOwnAuthorizedModelSystem() throws Exception {
        PSDevSysUser systemUser = new PSDevSysUser();
        systemUser.setAccMode(3);
        List<String> roots = new ArrayList<>();
        PSModelDEAccessManager manager = manager(systemUser, roots);
        for (String library : Arrays.asList("library-a", "library-b", "library-a")) {
            systemUser.setPSDevSlnSysId(library);
            systemUser.setPSSystemId("model-" + library);
            AppContext app = new AppContext();
            app.set("PSDEVSLNSYS", library.toUpperCase(java.util.Locale.ROOT));
            IUserContext user = context(app);
            EntityDTO input = new EntityDTO();
            input.set("pssystemid", "foreign-model-system");
            SearchContextDTO search = new SearchContextDTO();
            search.set("pssystemid", PSModelDEAccessManager.DEFAULT_PSSYSTEMID);
            assertTrue(manager.testDataAccessAction(user, null, null, "record", input, "CREATE"));
            assertTrue(manager.testDataAccessAction(user, null, null, search, "READ"));
            assertEquals("model-" + library, input.get("pssystemid"));
            assertEquals("model-" + library, search.get("pssystemid"));
        }
        assertEquals(Arrays.asList("LIBRARY-A", "LIBRARY-A", "LIBRARY-B",
                "LIBRARY-B", "LIBRARY-A", "LIBRARY-A"), roots);
    }

    @Test
    void expiredAuthorizationCannotUseCachedReadWriteOrAdministratorGrants() throws Exception {
        AppContext app = new AppContext();
        app.set("PSDEVSLNSYS", "library-a");
        IUserContext user = context(app);
        for (boolean admin : Arrays.asList(false, true)) {
            PSDevSysUser systemUser = new PSDevSysUser();
            systemUser.setPSDevSlnSysId("library-a");
            systemUser.setPSSystemId("model-a");
            systemUser.setAccMode(3);
            systemUser.setAdminMode(admin);
            systemUser.setExpiredTime(new Timestamp(System.currentTimeMillis() - 60000));
            verifyDeniedWithoutMutation(manager(systemUser, new ArrayList<>()), user);
        }
    }

    @Test
    void negativeAccessModesCannotActAsBitmaskGrants() throws Exception {
        verifyActions(-1, false, Arrays.asList());
        verifyActions(-2, false, Arrays.asList());
    }
}
