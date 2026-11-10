package net.ibizsys.central.cloud.saas.extension.runtime.dataentity.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.PrintWriter;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.security.dr.DataSetDRProvider;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.dataentity.security.dr.IDataEntityDRProvider;
import net.ibizsys.central.security.ISysUserRoleRuntime;
import net.ibizsys.central.security.ISystemAccessManager;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelServiceImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.priv.IPSDEUserRole;
import net.ibizsys.model.security.IPSSysUserRole;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.util.ISearchCond;
import net.ibizsys.runtime.util.ISearchCustomCond;
import net.ibizsys.runtime.util.ISearchFieldCond;
import net.ibizsys.runtime.util.ISearchGroupCond;

/** Executes the native model roles and DataSetDRProvider predicates against an isolated in-memory SQL fixture. */
public class InternalMessageAccessManagerTest {

    private static final String SYSTEM = "ibizmodeling";
    private static final String ENTITY = "INTERNAL_MESSAGE";
    private static final Pattern SESSION = Pattern.compile("#\\{ctx\\.sessioncontext\\.(srfuserid|srfdcsystemid)\\}");
    private final Map<String, Employee> directory = new HashMap<>();
    private final Map<String, IEmployeeContext> users = new LinkedHashMap<>();
    private final AtomicInteger scopeQueries = new AtomicInteger();
    private Connection connection;
    private PSModelServiceImpl models;
    private IPSDataEntity entity;
    private IDataEntityRuntime runtime;
    private IDataEntityRuntimeContext runtimeContext;
    private InternalMessageAccessManager manager;
    private final List<String> executedPredicates = new ArrayList<>();

    @BeforeEach
    void prepare() throws Exception {
        connection = DriverManager.getConnection("jdbc:h2:mem:" + UUID.randomUUID() + ";MODE=MySQL");
        connection.createStatement().execute("CREATE TABLE INTERNAL_MESSAGE (ID VARCHAR(100) PRIMARY KEY,"
                + "SENDER VARCHAR(200),RECEIVER VARCHAR(200),STATUS VARCHAR(60),SYSTEM_TAG VARCHAR(100),"
                + "OWNER_TYPE VARCHAR(30),OWNER_ID VARCHAR(100),TITLE VARCHAR(200))");
        models = new PSModelServiceImpl();
        models.setPSModelFolderPath("/sysmodel/saas-extension", true);
        IPSSystem system = models.getPSSystem();
        entity = system.getAllPSDataEntities().stream().filter(value -> ENTITY.equals(value.getName())).findFirst().get();
        for (String tenant : Arrays.asList("tenant_a", "tenant_b")) {
            for (String role : Arrays.asList("editor", "viewer", "noaccess")) {
                String id = tenant + "_" + role;
                users.put(id, employee(id, tenant, false));
                Employee person = new Employee();
                person.setUserId(id);
                person.setDomains(tenant);
                directory.put(id, person);
                insert("message_" + id, id, id, "RECEIVED", SYSTEM);
            }
        }
        insert("sender_message", "tenant_a_editor", "tenant_a_viewer", "SENT", SYSTEM);
        insert("foreign_system", "tenant_a_editor", "tenant_a_editor", "RECEIVED", "other_system");
        insert("deleted_message", "tenant_a_editor", "tenant_a_editor", "DELETED", SYSTEM);
        List<IPSDEUserRole> modelRoles = system.getAllPSSysUserRoles().stream()
                .filter(role -> "USER".equals(role.getDefaultUser()))
                .flatMap(role -> role.getPSSysUserRoleDatas().stream())
                .filter(data -> ENTITY.equals(data.getPSDataEntityMust().getName()))
                .map(data -> data.getPSDEUserRoleMust()).collect(Collectors.toList());
        assertEquals(Arrays.asList("CurReceiver", "CurSender"),
                modelRoles.stream().map(role -> role.getRoleTag()).sorted().collect(Collectors.toList()));
        ISysUserRoleRuntime userRole = proxy(ISysUserRoleRuntime.class, (name, args) -> {
            if ("getPSDEUserRoles".equals(name)) return modelRoles;
            throw unsupported(name);
        });
        List<IPSDEUserRole> adminRoles = system.getAllPSSysUserRoles().stream()
                .filter(role -> "ADMIN".equals(role.getDefaultUser()))
                .flatMap(role -> role.getPSSysUserRoleDatas().stream())
                .filter(data -> ENTITY.equals(data.getPSDataEntityMust().getName()))
                .map(data -> data.getPSDEUserRoleMust()).collect(Collectors.toList());
        assertTrue(adminRoles.stream().anyMatch(role -> role.isAllData()));
        ISysUserRoleRuntime adminRole = proxy(ISysUserRoleRuntime.class, (name, args) -> {
            if ("getPSDEUserRoles".equals(name)) return adminRoles;
            throw unsupported(name);
        });
        ISystemAccessManager access = proxy(ISystemAccessManager.class, (name, args) -> {
            if ("getUserSysUserRoleRuntimes".equals(name)) return Collections.singletonList(userRole);
            if ("getAdminSysUserRoleRuntimes".equals(name)) return Collections.singletonList(adminRole);
            if ("getSysUserRoleRuntimes".equals(name)) return Collections.emptyList();
            if ("getPSSysDEOPPriv".equals(name)) return null;
            throw unsupported(name);
        });
        IServiceSystemRuntime systemRuntime = proxy(IServiceSystemRuntime.class, (name, args) -> {
            if ("getRuntimeObjects".equals(name)) {
                assertEquals(IDataEntityDRProvider.class, args[0]);
                return Collections.singletonMap("dataset", new DataSetDRProvider());
            }
            if ("getPSSystemService".equals(name)) return models;
            if ("getSystemAccessManager".equals(name)) return access;
            throw unsupported(name);
        });
        ISysDBSchemeRuntime schema = proxy(ISysDBSchemeRuntime.class, (name, args) -> {
            if ("getDBType".equals(name)) return "MYSQL5";
            throw unsupported(name);
        });
        runtime = proxy(IDataEntityRuntime.class, (name, args) -> {
            if ("getPSDataEntity".equals(name)) return entity;
            if ("getName".equals(name)) return ENTITY;
            if ("getId".equals(name)) return entity.getId();
            if ("getSystemRuntime".equals(name)) return systemRuntime;
            if ("getDataAccCtrlMode".equals(name)) return entity.getDataAccCtrlMode();
            if ("getKeyPSDEField".equals(name)) return entity.getKeyPSDEFieldMust();
            if ("getOrgIdPSDEField".equals(name) || "getDeptIdPSDEField".equals(name)) return null;
            if ("isEnableWF".equals(name) || "isEnableDEMapping".equals(name)) return false;
            if ("getSysDBSchemeRuntime".equals(name) || "getSysDBSchemeRuntimeMust".equals(name)) return schema;
            if ("createSearchContext".equals(name)) return new SearchContextDTO();
            if ("existsData".equals(name)) return exists((ISearchContextDTO) args[0]);
            if ("getSimpleEntity".equals(name)) return get(String.valueOf(args[0]));
            if ("testDataAccessAction".equals(name)) return true;
            throw unsupported(name);
        });
        runtimeContext = proxy(IDataEntityRuntimeContext.class, (name, args) -> {
            if ("getDataEntityRuntime".equals(name)) return runtime;
            throw unsupported(name);
        });
        manager = new InternalMessageAccessManager() {
            @Override
            protected Employee getRecipient(String id) {
                if ("lookup_failure".equals(id)) throw new IllegalStateException("Directory unavailable");
                return directory.get(id);
            }
        };
        manager.init(runtimeContext, access);
    }

    @AfterEach
    void cleanup() throws Exception {
        EmployeeContext.setCurrent(null);
        if (connection != null) connection.close();
    }

    @Test
    void factoryRestrictsOnlyInternalMessageToNativeModelAuthorization() {
        net.ibizsys.central.cloud.saas.extension.runtime.security.SystemAccessManager factory =
                new net.ibizsys.central.cloud.saas.extension.runtime.security.SystemAccessManager();
        assertTrue(factory.createDataEntityAccessManager(runtime) instanceof InternalMessageAccessManager);
        IDataEntityRuntime other = proxy(IDataEntityRuntime.class, (name, args) -> {
            if ("getName".equals(name)) return "IMPORT_SCHEMA";
            throw unsupported(name);
        });
        assertEquals(DataEntityAccessManager.class, factory.createDataEntityAccessManager(other).getClass());
    }

    @Test
    void sixOrdinaryUsersCannotReadUpdateDeleteOrMarkReadAnotherPersonsKeyAcrossEitherTenant() throws Exception {
        String markReadAction = entity.getAllPSDEActions().stream().filter(action -> "mark_read".equals(action.getName()))
                .findFirst().get().getDataAccessAction();
        assertEquals(DataAccessActions.UPDATE, markReadAction);
        for (Map.Entry<String, IEmployeeContext> actor : users.entrySet()) {
            for (String recipient : users.keySet()) {
                String key = "message_" + recipient;
                boolean expected = actor.getKey().equals(recipient);
                for (String action : Arrays.asList(DataAccessActions.READ, DataAccessActions.UPDATE, DataAccessActions.DELETE)) {
                    EntityDTO input = DataAccessActions.UPDATE.equals(action) ? dto("id", key, "title", "changed") : null;
                    assertEquals(expected, allowed(actor.getValue(), key, input, action),
                            actor.getKey() + " / " + action + " / " + recipient);
                }
                assertEquals(expected, allowed(actor.getValue(), key, dto("id", key, "status", "READ"), markReadAction));
            }
        }
        assertTrue(scopeQueries.get() >= 144, "By-key authorization must execute native model scopes, not an allow-all override");
        assertTrue(executedPredicates.stream().anyMatch(sql -> sql.contains("`RECEIVER`") && sql.contains("`SYSTEM_TAG`")));
        assertTrue(users.values().stream().allMatch(user -> SYSTEM.equals(user.getDcsystemid())),
                "Logical system tag is shared by both tenants and is not a fake tenant partition");
    }

    @Test
    void nativeSenderAndReceiverStatusAndSystemConditionsRemainEffective() throws Exception {
        IEmployeeContext sender = users.get("tenant_a_editor");
        assertTrue(allowed(sender, "sender_message", null, DataAccessActions.READ));
        assertFalse(allowed(users.get("tenant_a_viewer"), "sender_message", null, DataAccessActions.READ));
        assertFalse(allowed(sender, "foreign_system", null, DataAccessActions.READ));
        assertFalse(allowed(sender, "deleted_message", null, DataAccessActions.DELETE));
        assertFalse(allowed(sender, "absent_message", null, DataAccessActions.READ));
    }

    @Test
    void personalCreationAllowsRealSameTenantRecipientButRejectsSenderSystemOwnerAndRecipientSpoofing() throws Exception {
        IEmployeeContext actor = users.get("tenant_a_editor");
        EntityDTO valid = creation("tenant_a_editor", "tenant_a_viewer");
        assertTrue(allowed(actor, null, valid, DataAccessActions.CREATE));
        for (String field : Arrays.asList("sender", "system_tag", "owner_id", "owner_type")) {
            EntityDTO spoofed = creation("tenant_a_editor", "tenant_a_viewer");
            spoofed.set(field, "owner_type".equals(field) ? "SYSTEM" : "foreign_value");
            assertFalse(allowed(actor, null, spoofed, DataAccessActions.CREATE), field);
        }
        for (Object receiver : Arrays.asList("tenant_b_editor", "absent_user", "lookup_failure", "", Integer.valueOf(1))) {
            EntityDTO spoofed = creation("tenant_a_editor", "tenant_a_viewer");
            spoofed.set("receiver", receiver);
            assertFalse(allowed(actor, null, spoofed, DataAccessActions.CREATE), String.valueOf(receiver));
        }
        assertFalse(allowed(actor, null, null, DataAccessActions.CREATE));
        assertFalse(allowed(actor, null, new EntityDTO(), DataAccessActions.CREATE));
        Employee ambiguous = directory.get("tenant_a_viewer");
        ambiguous.setSrfdcid("tenant_b");
        assertFalse(allowed(actor, null, valid, DataAccessActions.CREATE), "Conflicting directory tenant fields must not be selected opportunistically");
        ambiguous.setSrfdcid("tenant_a");
        ambiguous.setDomains(null);
        assertFalse(allowed(actor, null, valid, DataAccessActions.CREATE), "Typed EBSX Domains membership is required");
    }

    @Test
    void updateAndMarkReadCannotRewriteOwnershipOrSwapThePathKey() throws Exception {
        IEmployeeContext actor = users.get("tenant_a_editor");
        String key = "message_tenant_a_editor";
        assertTrue(allowed(actor, key, dto("id", key, "status", "READ"), DataAccessActions.UPDATE));
        for (String field : Arrays.asList("id", "sender", "receiver", "system_tag", "owner_id", "owner_type")) {
            EntityDTO patch = dto("id", key, "status", "READ");
            patch.set(field, "foreign_value");
            assertFalse(allowed(actor, key, patch, DataAccessActions.UPDATE), field);
        }
        assertEquals("RECEIVED", get(key).get("status"), "Authorization checks cannot mutate the message");
    }

    @Test
    void missingActorFramesAndNonEmployeeContextsFailClosedWithoutChangingTrustedSuperuserSemantics() throws Exception {
        for (String missing : Arrays.asList("userid", "tenant", "dcsystemid")) {
            IEmployeeContext actor = proxy(IEmployeeContext.class, (name, args) -> {
                String getter = "get" + Character.toUpperCase(missing.charAt(0)) + missing.substring(1);
                if (getter.equals(name)) return null;
                return contextValue("tenant_a_editor", "tenant_a", false, name, args);
            });
            assertFalse(allowed(actor, null, creation("tenant_a_editor", "tenant_a_editor"), DataAccessActions.CREATE), missing);
        }
        IUserContext anonymous = proxy(IUserContext.class, (name, args) -> {
            if ("isSuperuser".equals(name)) return false;
            throw unsupported(name);
        });
        assertFalse(manager.testDataAccessAction(anonymous, null, null, "message_tenant_a_editor", null, DataAccessActions.READ));
        IEmployeeContext root = employee("system", null, true);
        assertTrue(allowed(root, "message_tenant_b_editor", null, DataAccessActions.DELETE));
        IUserContext serviceRoot = proxy(IUserContext.class, (name, args) -> {
            if ("isSuperuser".equals(name)) return true;
            throw unsupported(name);
        });
        assertTrue(manager.testDataAccessAction(serviceRoot, null, null,
                "message_tenant_b_editor", null, DataAccessActions.DELETE));
    }

    @Test
    void explicitNativeAllDataModelRoleRetainsItsAdministrativeScope() throws Exception {
        IEmployeeContext administrator = proxy(IEmployeeContext.class, (name, args) -> {
            if ("isSystemadmin".equals(name)) return true;
            return contextValue("administrator", "tenant_a", false, name, args);
        });
        assertTrue(allowed(administrator, "message_tenant_b_editor", null, DataAccessActions.READ));
        EntityDTO systemMessage = creation("trusted_service", "tenant_b_editor");
        systemMessage.set("owner_type", "SYSTEM");
        assertTrue(allowed(administrator, null, systemMessage, DataAccessActions.CREATE));
    }

    @Test
    void mixedNativeBatchKeysFailWhenAnyMessageIsOutsideTheActorsModelScope() throws Exception {
        IEmployeeContext actor = users.get("tenant_a_editor");
        EmployeeContext.setCurrent(actor);
        assertTrue(manager.testDataAccessActionIf(actor,
                new LinkedHashSet<Object>(Arrays.asList("message_tenant_a_editor")), DataAccessActions.DELETE));
        assertFalse(manager.testDataAccessActionIf(actor,
                new LinkedHashSet<Object>(Arrays.asList("message_tenant_a_editor", "message_tenant_a_viewer")),
                DataAccessActions.DELETE));
        assertFalse(manager.testDataAccessActionIf(actor,
                new LinkedHashSet<Object>(Arrays.asList("message_tenant_a_editor", "message_tenant_b_editor")),
                DataAccessActions.DELETE));
        assertEquals("RECEIVED", get("message_tenant_a_editor").get("status"));
        assertEquals("RECEIVED", get("message_tenant_b_editor").get("status"));
    }

    @Test
    void owningTheReceiverIdDoesNotBypassMissingNativeModelRoleAssignments() throws Exception {
        ISystemAccessManager noRoles = proxy(ISystemAccessManager.class, (name, args) -> {
            if ("getUserSysUserRoleRuntimes".equals(name) || "getAdminSysUserRoleRuntimes".equals(name)
                    || "getSysUserRoleRuntimes".equals(name)) return Collections.emptyList();
            if ("getPSSysDEOPPriv".equals(name)) return null;
            throw unsupported(name);
        });
        InternalMessageAccessManager denied = new InternalMessageAccessManager();
        denied.init(runtimeContext, noRoles);
        IEmployeeContext actor = users.get("tenant_a_editor");
        EmployeeContext.setCurrent(actor);
        assertFalse(denied.testDataAccessAction(actor, null, null, "message_tenant_a_editor", null, DataAccessActions.READ));
        assertFalse(denied.testDataAccessAction(actor, null, null, null,
                creation("tenant_a_editor", "tenant_a_editor"), DataAccessActions.CREATE));
    }

    private boolean allowed(IEmployeeContext actor, String key, IEntityDTO input, String action) throws Exception {
        EmployeeContext.setCurrent(actor);
        return manager.testDataAccessAction(actor, null, null, key, input, action);
    }

    private EntityDTO creation(String sender, String receiver) {
        return dto("id", UUID.randomUUID().toString(), "sender", sender, "receiver", receiver,
                "system_tag", SYSTEM, "owner_type", "PERSONAL", "owner_id", sender,
                "status", "RECEIVED", "title", "Owned internal message");
    }

    private void insert(String id, String sender, String receiver, String status, String system) throws Exception {
        try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO INTERNAL_MESSAGE VALUES (?,?,?,?,?,'PERSONAL',?,?)")) {
            statement.setString(1, id);
            statement.setString(2, sender);
            statement.setString(3, receiver);
            statement.setString(4, status);
            statement.setString(5, system);
            statement.setString(6, sender);
            statement.setString(7, id);
            statement.executeUpdate();
        }
    }

    private EntityDTO get(String id) throws Exception {
        try (PreparedStatement statement = connection.prepareStatement("SELECT * FROM INTERNAL_MESSAGE WHERE ID=?")) {
            statement.setString(1, id);
            try (ResultSet rows = statement.executeQuery()) {
                if (!rows.next()) return null;
                EntityDTO value = new EntityDTO();
                for (int index = 1; index <= rows.getMetaData().getColumnCount(); index++) {
                    value.set(rows.getMetaData().getColumnName(index).toLowerCase(), rows.getObject(index));
                }
                return value;
            }
        }
    }

    private boolean exists(ISearchContextDTO context) throws Exception {
        scopeQueries.incrementAndGet();
        List<Object> values = new ArrayList<>();
        List<String> conditions = new ArrayList<>();
        for (ISearchCond condition : context.getSearchConds()) conditions.add(render(condition, values, context));
        String predicate = String.join(" AND ", conditions);
        executedPredicates.add(predicate);
        try (PreparedStatement statement = connection.prepareStatement(
                "SELECT COUNT(*) FROM INTERNAL_MESSAGE t1 WHERE " + predicate)) {
            for (int index = 0; index < values.size(); index++) statement.setObject(index + 1, values.get(index));
            try (ResultSet rows = statement.executeQuery()) {
                rows.next();
                return rows.getInt(1) > 0;
            }
        }
    }

    private String render(ISearchCond condition, List<Object> values, ISearchContextDTO context) {
        if (condition instanceof ISearchGroupCond) {
            ISearchGroupCond group = (ISearchGroupCond) condition;
            assertTrue(Arrays.asList("AND", "OR").contains(group.getCondOp()));
            return "(" + group.getSearchConds().stream().map(item -> render(item, values, context))
                    .collect(Collectors.joining(" " + group.getCondOp() + " ")) + ")";
        }
        if (condition instanceof ISearchFieldCond) {
            ISearchFieldCond field = (ISearchFieldCond) condition;
            assertEquals("ID", field.getFieldName().toUpperCase());
            assertEquals("EQ", field.getCondOp());
            values.add(field.isParamMode() ? context.get((String) field.getValue()) : field.getValue());
            return "t1.ID=?";
        }
        if (condition instanceof ISearchCustomCond) {
            String sql = ((ISearchCustomCond) condition).getCustomCond();
            assertFalse(sql.contains(";"));
            Matcher matcher = SESSION.matcher(sql);
            StringBuffer translated = new StringBuffer();
            while (matcher.find()) {
                values.add(EmployeeContext.getCurrentMust().getSessionParam(matcher.group(1)));
                matcher.appendReplacement(translated, "?");
            }
            matcher.appendTail(translated);
            assertFalse(translated.toString().contains("#{"));
            return translated.toString();
        }
        throw unsupported(condition.getClass().getName());
    }

    private IEmployeeContext employee(String id, String tenant, boolean superuser) {
        return proxy(IEmployeeContext.class, (name, args) -> contextValue(id, tenant, superuser, name, args));
    }

    private Object contextValue(String id, String tenant, boolean superuser, String name, Object[] args) {
        if ("getUserid".equals(name)) return id;
        if ("getTenant".equals(name)) return tenant;
        if ("getDcsystemid".equals(name) || "getSystemid".equals(name)) return SYSTEM;
        if ("getOrgid".equals(name)) return tenant + "_org";
        if ("getDeptid".equals(name)) return null;
        if ("isSuperuser".equals(name)) return superuser;
        if ("isSystemadmin".equals(name)) return false;
        if ("getAuthorities".equals(name)) return Collections.emptyList();
        if ("getSessionParam".equals(name)) {
            if ("srfuserid".equals(args[0])) return id;
            if ("srfdcsystemid".equals(args[0])) return SYSTEM;
            throw unsupported(String.valueOf(args[0]));
        }
        throw unsupported(name);
    }

    private static EntityDTO dto(Object... pairs) {
        EntityDTO value = new EntityDTO();
        for (int index = 0; index < pairs.length; index += 2) value.set((String) pairs[index], pairs[index + 1]);
        return value;
    }

    private interface Calls {
        Object invoke(String name, Object[] args) throws Throwable;
    }

    private static <T> T proxy(Class<T> type, Calls calls) {
        return type.cast(Proxy.newProxyInstance(type.getClassLoader(), new Class<?>[] { type }, (object, method, args) -> {
            if ("toString".equals(method.getName())) return "InternalMessageAuthorizationFixture";
            if ("hashCode".equals(method.getName())) return System.identityHashCode(object);
            if ("equals".equals(method.getName())) return object == args[0];
            return calls.invoke(method.getName(), args);
        }));
    }

    private static IllegalStateException unsupported(String operation) {
        return new IllegalStateException("Unreviewed authorization fixture operation: " + operation);
    }

    public static void main(String[] args) {
        SummaryGeneratingListener summary = new SummaryGeneratingListener();
        org.junit.platform.launcher.Launcher launcher = LauncherFactory.create();
        launcher.registerTestExecutionListeners(summary);
        launcher.execute(LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectClass(InternalMessageAccessManagerTest.class)).build());
        summary.getSummary().printTo(new PrintWriter(System.out, true));
        summary.getSummary().printFailuresTo(new PrintWriter(System.out, true));
        if (summary.getSummary().getTestsFailedCount() != 0) throw new AssertionError("Internal message authorization tests failed");
    }
}
