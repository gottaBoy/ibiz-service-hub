package net.ibizsys.modeling.core.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Proxy;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.dataentity.PSDataEntityImpl;
import net.ibizsys.modeling.core.dataentity.security.PSConfigDEAccessManager;
import net.ibizsys.modeling.core.dataentity.security.PSDevSlnDEAccessManager;
import net.ibizsys.modeling.core.dataentity.security.PSModelDEAccessManager;
import net.ibizsys.modeling.core.util.PSModels;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.res.ISysSFPluginRuntime;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.JsonUtils;

class SystemAccessManagerEditorRegistryTest {
    private static final String ROOT_A = "fixture-library-a";
    private static final String ROOT_B = "fixture-library-b";
    private static final String SYSTEM_A = "fixture-model-system-a";
    private static final String EDITOR = "fixture-person-editor";
    private static final String VIEWER = "fixture-person-viewer";
    private static final String NO_ACCESS = "fixture-person-no-access";
    private static final List<String> EDITOR_MODELS = Arrays.asList(
            "PSSysDBScheme", "PSSysApp", "PSSysSFPub", "PSSysServiceAPI", "PSSubSysServiceAPI");
    private static final List<String> ACTIONS = Arrays.asList(
            "READ", "CREATE", "UPDATE", "DELETE", "MANAGE", "UNKNOWN");
    private final IUserContext previousContext = UserContext.getCurrent();

    @AfterEach
    void restoreThreadContext() {
        UserContext.setCurrent(previousContext);
    }

    @Test
    void fiveEditorEntitiesSelectTheActualRootManagerFromNativeModelObjects() throws Exception {
        for (String codeName : EDITOR_MODELS) {
            Factory fixture = new Factory();
            PSDataEntityImpl model = model(codeName);
            assertEquals(PSDataEntityImpl.class, model.getClass());
            assertEquals(codeName.toUpperCase(), model.getName());
            assertEquals(1, model.getDataAccCtrlMode());
            assertTrue(PSModels.isModelInstDataEntity(model.getName()));
            assertFalse(PSModels.isConfigInstDataEntity(model.getName()));
            assertEquals("T_SRF" + model.getName(), PSModels.getModelInstDataEntityTable(model.getName()));
            IDataEntityAccessManager manager = fixture.create(model);
            assertEquals(PSModelDEAccessManager.class, manager.getClass());
            assertSame(manager, fixture.autowired.get(0));
            assertEquals(Arrays.asList(codeName + "DEAccessManager", "PSModelDEAccessManager"),
                    fixture.pluginLookups);
        }
    }

    @Test
    void existingModuleEntityConfigurationMetadataAndUnknownBranchesAreUnchanged() throws Exception {
        Map<String, Class<?>> branches = new LinkedHashMap<>();
        branches.put("PSModule", PSModelDEAccessManager.class);
        branches.put("PSDataEntity", PSModelDEAccessManager.class);
        branches.put("PSDBType", PSConfigDEAccessManager.class);
        branches.put("PSDevSln", PSDevSlnDEAccessManager.class);
        branches.put("UnknownEntity", net.ibizsys.central.cloud.core.dataentity.security.DataEntityAccessManager.class);
        for (Map.Entry<String, Class<?>> branch : branches.entrySet()) {
            Factory fixture = new Factory();
            assertEquals(branch.getValue(), fixture.create(model(branch.getKey())).getClass(), branch.getKey());
        }
        assertFalse(PSModels.isModelInstDataEntity("UNKNOWNENTITY"));
        assertFalse(PSModels.isConfigInstDataEntity("UNKNOWNENTITY"));
        assertTrue(PSModels.isConfigInstDataEntity("PSDBTYPE"));
        assertEquals("T_SRFPSDBTYPE", PSModels.getConfigInstDataEntityTable("PSDBTYPE"));
    }

    @Test
    void applicationConfigurationEntitiesSelectTheReadOnlyConfigManager() throws Exception {
        for (String codeName : Arrays.asList("PSPF", "PSPFStyle", "PSAppType")) {
            Factory fixture = new Factory();
            PSDataEntityImpl model = model(codeName);
            assertTrue(PSModels.isConfigInstDataEntity(model.getName()));
            assertFalse(PSModels.isModelInstDataEntity(model.getName()));
            IDataEntityAccessManager manager = fixture.create(model);
            assertEquals(PSConfigDEAccessManager.class, manager.getClass());
            assertSame(manager, fixture.autowired.get(0));
            assertEquals(Arrays.asList(codeName + "DEAccessManager", "PSConfigDEAccessManager"),
                    fixture.pluginLookups);
        }
    }

    @Test
    void explicitlyConfiguredEntityPluginStillPrecedesTheRegistryBranch() throws Exception {
        Factory fixture = new Factory();
        IDataEntityAccessManager explicit = new net.ibizsys.central.cloud.core.dataentity.security.DataEntityAccessManager();
        fixture.pluginTag = "PSSysAppDEAccessManager";
        fixture.pluginManager = explicit;
        assertSame(explicit, fixture.create(model("PSSysApp")));
        assertEquals(Collections.singletonList("PSSysAppDEAccessManager"), fixture.pluginLookups);
        assertTrue(fixture.autowired.isEmpty(), "The existing explicit plugin branch must not be replaced");
    }

    @Test
    void factorySelectedManagersKeepOrdinaryEditorReadWriteAndCanonicalSystemRewrite() throws Exception {
        verifyRole(EDITOR, 3, Arrays.asList("READ", "CREATE", "UPDATE", "DELETE"));
    }

    @Test
    void factorySelectedManagersKeepViewerReadOnlyWithoutManageOrUnknownFallback() throws Exception {
        verifyRole(VIEWER, 1, Collections.singletonList("READ"));
    }

    @Test
    void missingOrdinaryPersonGrantCannotAcquireAccessFromTheRegistryRepair() throws Exception {
        for (String codeName : EDITOR_MODELS) {
            Factory fixture = new Factory();
            fixture.allow(EDITOR, ROOT_A, grant(EDITOR, ROOT_A, 3));
            IDataEntityAccessManager manager = fixture.create(model(codeName));
            setContext(NO_ACCESS, root(ROOT_A));
            assertDenied(manager);
            assertEquals(Arrays.asList(NO_ACCESS + "|" + ROOT_A, NO_ACCESS + "|" + ROOT_A),
                    fixture.authorizationLookups);
        }
    }

    @Test
    void crossRootRequestCannotReuseTheSamePersonGrantOrRewriteEitherInput() throws Exception {
        for (String codeName : EDITOR_MODELS) {
            Factory fixture = new Factory();
            fixture.allow(EDITOR, ROOT_A, grant(EDITOR, ROOT_A, 3));
            IDataEntityAccessManager manager = fixture.create(model(codeName));
            setContext(EDITOR, root(ROOT_B));
            assertDenied(manager);
            assertEquals(Arrays.asList(EDITOR + "|" + ROOT_B, EDITOR + "|" + ROOT_B),
                    fixture.authorizationLookups);
        }
    }

    @Test
    void authorizationReturningAnotherRootStillFailsTheNativeRootEqualityGate() throws Exception {
        for (String codeName : EDITOR_MODELS) {
            Factory fixture = new Factory();
            fixture.allow(EDITOR, ROOT_A, grant(EDITOR, ROOT_B, 3));
            IDataEntityAccessManager manager = fixture.create(model(codeName));
            setContext(EDITOR, root(ROOT_A));
            assertDenied(manager);
        }
    }

    @Test
    void zeroNegativeAndExpiredGrantsRemainDeniedForEveryRepairedEditorEntity() throws Exception {
        for (String codeName : EDITOR_MODELS) {
            for (int mode : new int[] { 0, -1, 3 }) {
                Factory fixture = new Factory();
                PSDevSysUser user = grant(EDITOR, ROOT_A, mode);
                if (mode == 3) user.setExpiredTime(new Timestamp(System.currentTimeMillis() - 60_000));
                fixture.allow(EDITOR, ROOT_A, user);
                IDataEntityAccessManager manager = fixture.create(model(codeName));
                setContext(EDITOR, root(ROOT_A));
                assertDenied(manager);
            }
        }
    }

    @Test
    void absentNullNumericAndMalformedTypedRootsFailBeforeAnyAuthorizationLookup() throws Exception {
        for (String codeName : EDITOR_MODELS) {
            Factory fixture = new Factory();
            fixture.allow(EDITOR, ROOT_A, grant(EDITOR, ROOT_A, 3));
            IDataEntityAccessManager manager = fixture.create(model(codeName));
            List<IAppContext> contexts = new ArrayList<>();
            contexts.add(null);
            contexts.add(new AppContext());
            for (Object value : Arrays.asList(null, "", 0, -1, Boolean.TRUE, ROOT_A + " ", ROOT_A + "\n")) {
                contexts.add(root(value));
            }
            for (IAppContext appContext : contexts) {
                setContext(EDITOR, appContext);
                EntityDTO input = new EntityDTO();
                input.set("pssystemid", "untrusted-record-system");
                SearchContextDTO search = new SearchContextDTO();
                search.set("pssystemid", "untrusted-search-system");
                assertThrows(Exception.class, () -> manager.testDataAccessAction(
                        UserContext.getCurrentMust(), null, null, "fixture-record", input, "READ"));
                assertThrows(Exception.class, () -> manager.testDataAccessAction(
                        UserContext.getCurrentMust(), null, null, search, "READ"));
                assertEquals("untrusted-record-system", input.get("pssystemid"));
                assertEquals("untrusted-search-system", search.get("pssystemid"));
            }
            assertTrue(fixture.authorizationLookups.isEmpty(), "No default root or privileged identity fallback");
        }
    }

    private void verifyRole(String person, int mode, List<String> allowed) throws Exception {
        for (String codeName : EDITOR_MODELS) {
            Factory fixture = new Factory();
            PSDevSysUser granted = grant(person, ROOT_A, mode);
            assertFalse(granted.isAdminMode());
            assertFalse(granted.isExpired());
            fixture.allow(person, ROOT_A, granted);
            IDataEntityAccessManager manager = fixture.create(model(codeName));
            setContext(person, root(ROOT_A));
            for (String action : ACTIONS) {
                EntityDTO input = new EntityDTO();
                input.set("pssystemid", "untrusted-record-system");
                SearchContextDTO search = new SearchContextDTO();
                search.set("pssystemid", "untrusted-search-system");
                boolean expected = allowed.contains(action);
                assertEquals(expected, manager.testDataAccessAction(
                        UserContext.getCurrentMust(), null, null, "fixture-record", input, action), codeName + ":" + action);
                assertEquals(expected, manager.testDataAccessAction(
                        UserContext.getCurrentMust(), null, null, search, action), codeName + ":" + action);
                assertEquals(expected ? SYSTEM_A : "untrusted-record-system", input.get("pssystemid"));
                assertEquals(expected ? SYSTEM_A : "untrusted-search-system", search.get("pssystemid"));
            }
            assertEquals(12, fixture.authorizationLookups.size());
            assertTrue(fixture.authorizationLookups.stream().allMatch(value -> value.equals(person + "|" + ROOT_A)));
        }
    }

    private static PSDataEntityImpl model(String codeName) {
        ObjectNode node = JsonUtils.createObjectNode();
        node.put("name", codeName.toUpperCase());
        node.put("codeName", codeName);
        node.put("dataAccCtrlMode", 1);
        node.put("dataAccCtrlArch", 1);
        PSDataEntityImpl model = new PSDataEntityImpl();
        model.init(new PSModelServiceImpl(), null, node);
        return model;
    }

    private static PSDevSysUser grant(String person, String root, int mode) {
        PSDevSysUser user = new PSDevSysUser();
        user.setPSDevUserId(person);
        user.setPSDevCenterId("fixture-center-a");
        user.setPSDevSlnId("fixture-scheme-a");
        user.setPSDevSlnSysId(root);
        user.setPSSystemId(SYSTEM_A);
        user.setAccMode(mode);
        user.setAdminMode(false);
        return user;
    }

    private static AppContext root(Object value) {
        AppContext context = new AppContext();
        context.set("PSDEVSLNSYS", value);
        return context;
    }

    private static void setContext(String person, IAppContext appContext) {
        IUserContext context = (IUserContext) Proxy.newProxyInstance(
                SystemAccessManagerEditorRegistryTest.class.getClassLoader(), new Class<?>[] { IUserContext.class },
                (proxy, method, args) -> {
                    if ("getAppContext".equals(method.getName())) return appContext;
                    if ("getUserid".equals(method.getName())) return person;
                    if ("isSuperuser".equals(method.getName())) return false;
                    throw new AssertionError("Unexpected identity operation: " + method.getName());
                });
        UserContext.setCurrent(context);
    }

    private static void assertDenied(IDataEntityAccessManager manager) throws Exception {
        EntityDTO input = new EntityDTO();
        input.set("pssystemid", "untrusted-record-system");
        SearchContextDTO search = new SearchContextDTO();
        search.set("pssystemid", "untrusted-search-system");
        assertFalse(manager.testDataAccessAction(UserContext.getCurrentMust(), null, null,
                "fixture-record", input, "READ"));
        assertFalse(manager.testDataAccessAction(UserContext.getCurrentMust(), null, null, search, "READ"));
        assertEquals("untrusted-record-system", input.get("pssystemid"));
        assertEquals("untrusted-search-system", search.get("pssystemid"));
    }

    private static class Factory extends SystemAccessManagerBase {
        private final List<Object> autowired = new ArrayList<>();
        private final List<String> pluginLookups = new ArrayList<>();
        private final List<String> authorizationLookups = new ArrayList<>();
        private final Map<String, PSDevSysUser> fixtureGrants = new LinkedHashMap<>();
        private String pluginTag;
        private IDataEntityAccessManager pluginManager;
        private final ISystemRuntime system = (ISystemRuntime) Proxy.newProxyInstance(
                getClass().getClassLoader(), new Class<?>[] { ISystemRuntime.class },
                (proxy, method, args) -> {
                    if ("getSysSFPluginRuntime".equals(method.getName())) {
                        String tag = (String) args[0];
                        assertEquals(Boolean.TRUE, args[1]);
                        pluginLookups.add(tag);
                        if (!tag.equals(pluginTag)) return null;
                        return Proxy.newProxyInstance(getClass().getClassLoader(),
                                new Class<?>[] { ISysSFPluginRuntime.class }, (plugin, operation, values) -> {
                                    assertEquals("getRuntimeObject", operation.getName());
                                    assertEquals(IDataEntityAccessManager.class, values[0]);
                                    assertEquals(Boolean.TRUE, values[1]);
                                    return pluginManager;
                                });
                    }
                    if ("autowareObject".equals(method.getName())) {
                        autowired.add(args[0]);
                        return null;
                    }
                    if ("getRuntimeObjects".equals(method.getName())) return Collections.emptyMap();
                    if ("getSystemAccessManager".equals(method.getName())) return this;
                    throw new AssertionError("Unexpected system operation: " + method.getName());
                });

        @Override
        public ISystemRuntime getSystemRuntime() {
            return system;
        }

        @Override
        public IPSDevUserBase getPSDevUserBase(String type, String root) {
            assertEquals("SYS", type);
            String person = UserContext.getCurrentMust().getUserid();
            authorizationLookups.add(person + "|" + root);
            return fixtureGrants.get(person + "|" + root);
        }

        void allow(String person, String root, PSDevSysUser grant) {
            assertEquals(person, grant.getPSDevUserId(), "Fixture grants bind one explicit ordinary person");
            assertFalse(grant.isAdminMode());
            fixtureGrants.put(person + "|" + root, grant);
        }

        IDataEntityAccessManager create(PSDataEntityImpl model) throws Exception {
            net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime entity =
                    (net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime) Proxy.newProxyInstance(
                            getClass().getClassLoader(),
                            new Class<?>[] { net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime.class },
                            (proxy, method, args) -> {
                                if ("getPSDataEntity".equals(method.getName())) return model;
                                if ("getName".equals(method.getName())) return model.getName();
                                if ("getId".equals(method.getName())) return model.getId();
                                if ("getDataAccCtrlMode".equals(method.getName())) return model.getDataAccCtrlMode();
                                if ("getPSDEField".equals(method.getName())) return null;
                                if ("getSystemRuntime".equals(method.getName())) return system;
                                throw new AssertionError("Unexpected entity operation: " + method.getName());
                            });
            IDataEntityRuntimeContext context = (IDataEntityRuntimeContext) Proxy.newProxyInstance(
                    getClass().getClassLoader(), new Class<?>[] { IDataEntityRuntimeContext.class },
                    (proxy, method, args) -> {
                        if ("getDataEntityRuntime".equals(method.getName())) return entity;
                        throw new AssertionError("Unexpected entity-context operation: " + method.getName());
                    });
            IDataEntityAccessManager manager = createDataEntityAccessManager(entity);
            manager.init(context, this);
            return manager;
        }
    }
}
