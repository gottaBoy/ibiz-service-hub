package net.ibizsys.modeling.core.dataentity.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.InvocationHandler;
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
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.security.IDataEntityAccessManager;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.modeling.core.dataentity.security.PSModelDEAccessManager;
import net.ibizsys.modeling.core.security.ISystemAccessManager;
import net.ibizsys.modeling.core.security.PSDevSysUser;
import net.ibizsys.modeling.core.security.PSDevUser;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.AppContext;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.JsonUtils;

class ModelObservationOverviewReaderTest {
    static final List<String> ENTITIES = Arrays.asList(
            "PSSYSAPP", "PSDATAENTITY", "PSSYSSERVICEAPI", "PSSYSPFPLUGIN", "PSSYSSFPLUGIN");
    private final IUserContext previous = UserContext.getCurrent();

    @AfterEach
    void restoreContext() {
        UserContext.setCurrent(previous);
    }

    @Test
    void sixReadDecisionsPrecedeFiveIndependentBoundedCountsAndExactSerialization() throws Throwable {
        Fixture fixture = new Fixture();
        ModelObservationOverviewDTO result = fixture.read();
        assertEquals(Arrays.asList("READ:MODELOBSERVATION",
                "READ:PSSYSAPP", "READ:PSDATAENTITY", "READ:PSSYSSERVICEAPI",
                "READ:PSSYSPFPLUGIN", "READ:PSSYSSFPLUGIN",
                "FETCH:PSSYSAPP", "FETCH:PSDATAENTITY", "FETCH:PSSYSSERVICEAPI",
                "FETCH:PSSYSPFPLUGIN", "FETCH:PSSYSSFPLUGIN"), fixture.events);
        assertEquals(5, fixture.filters.size());
        for (int i = 0; i < fixture.filters.size(); i++) {
            ISearchContextDTO filter = fixture.filters.get(i);
            assertEquals(fixture.systemId, filter.get("pssystemid"));
            assertEquals(0, filter.getPageable().getPageNumber());
            assertEquals(1, filter.getPageable().getPageSize());
            assertTrue(filter.isCount());
            for (int j = 0; j < i; j++) assertNotSame(filter, fixture.filters.get(j));
        }
        ObjectNode serialized = JsonUtils.toObjectNode(result);
        assertEquals(5, serialized.size());
        assertEquals(11, serialized.get("sysappcnt").asLong());
        assertEquals(22, serialized.get("sysdecnt").asLong());
        assertEquals(33, serialized.get("serviceapicnt").asLong());
        assertEquals(44, serialized.get("pfplugincnt").asLong());
        assertEquals(55, serialized.get("sfplugincnt").asLong());
        assertFalse(serialized.has("pssystemid"));
        assertFalse(serialized.has("psdevslnsysid"));
    }

    @Test
    void everyNativePermissionDenialStopsAllCountFetches() throws Throwable {
        for (String denied : Arrays.asList("MODELOBSERVATION", "PSSYSAPP", "PSDATAENTITY",
                "PSSYSSERVICEAPI", "PSSYSPFPLUGIN", "PSSYSSFPLUGIN")) {
            Fixture fixture = new Fixture();
            fixture.denied = denied;
            ErrorException error = assertThrows(ErrorException.class, fixture::read, denied);
            assertEquals(Errors.ACCESSDENY, error.getErrorCode());
            assertTrue(fixture.events.stream().noneMatch(event -> event.startsWith("FETCH:")), denied);
        }
    }

    @Test
    void conflictingAbsentTypedAndMalformedRootsFailBeforeGrantOrPermissionLookup() throws Throwable {
        for (Object root : Arrays.asList("", " ", 123, Boolean.TRUE, "root-b", "root-a ", "root\na")) {
            Fixture fixture = new Fixture();
            fixture.app.set("PSDEVSLNSYS", root);
            assertThrows(ErrorException.class, fixture::read);
            assertTrue(fixture.events.isEmpty());
            assertEquals(0, fixture.grantLookups);
        }
        Fixture missing = new Fixture();
        missing.app.reset("PSDEVSLNSYS");
        assertThrows(ErrorException.class, missing::read);
        assertTrue(missing.events.isEmpty());
        assertEquals(0, missing.grantLookups);
    }

    @Test
    void expiredWrongPrincipalWrongCenterWrongRootAndUnreadableGrantsFailClosed() throws Throwable {
        for (int variant = 0; variant < 8; variant++) {
            Fixture fixture = new Fixture();
            if (variant == 0) fixture.grant.setExpiredTime(new Timestamp(0));
            if (variant == 1) fixture.grant.setPSDevUserId("other-person");
            if (variant == 2) fixture.grant.setPSDevCenterId("other-center");
            if (variant == 3) fixture.grant.setPSDevSlnSysId("root-b");
            if (variant == 4) fixture.grant.setAccMode(2);
            if (variant == 5) fixture.grant.setAccMode(0);
            if (variant == 6) fixture.grant.setPSSystemId(" invalid-system");
            if (variant == 7) fixture.actor.setExpiredTime(new Timestamp(0));
            assertThrows(ErrorException.class, fixture::read, "variant " + variant);
            assertTrue(fixture.events.isEmpty(), "variant " + variant);
        }
    }

    @Test
    void systemRewritesByAnExplicitDestinationManagerCannotSelectAnotherLibrary() throws Throwable {
        Fixture fixture = new Fixture();
        fixture.rewritten = "PSSYSPFPLUGIN";
        assertThrows(ErrorException.class, fixture::read);
        assertTrue(fixture.events.stream().noneMatch(event -> event.startsWith("FETCH:")));
    }

    @Test
    void registeredCountEntitiesRetainTheActualRootModelManagerForOrdinaryViewerAndEditor() throws Throwable {
        for (int mode : new int[] { 1, 3 }) {
            Fixture fixture = new Fixture();
            fixture.grant.setAccMode(mode);
            for (String name : ENTITIES.subList(0, 3)) {
                fixture.managers.put(name, new PSModelDEAccessManager() {
                    @Override
                    public ISystemAccessManager getSystemAccessManager() {
                        return fixture.access;
                    }
                });
            }
            assertFalse(fixture.grant.isAdminMode());
            assertEquals(11, fixture.read().getSysAppCnt());
            assertEquals(4, fixture.grantLookups, "Reader resolution and three real model managers");
            assertEquals(5, fixture.filters.size());
        }
    }

    @Test
    void absentGrantAndAnonymousUserCannotReachEntityPermissionOrCountCalls() throws Throwable {
        Fixture fixture = new Fixture();
        fixture.missingGrant = true;
        assertThrows(ErrorException.class, fixture::read);
        assertTrue(fixture.events.isEmpty());
        assertThrows(ErrorException.class, () -> new ModelObservationOverviewReader().read(
                fixture.observation, fixture.parent, fixture.root, null, fixture.access, fixture.input));
        assertTrue(fixture.events.isEmpty());
    }

    @Test
    void rootsHaveDifferentServerDerivedNonzeroTotalsAndEmptyAuthorizedRootsAreRealZeroes() throws Throwable {
        Fixture first = new Fixture();
        assertEquals(11, first.read().getSysAppCnt());
        Fixture second = new Fixture();
        second.root = "root-b";
        second.systemId = "model-system-b";
        second.grant.setPSDevSlnSysId(second.root);
        second.grant.setPSSystemId(second.systemId);
        second.app.set("PSDEVSLNSYS", second.root);
        second.totals[0] = 91;
        assertEquals(91, second.read().getSysAppCnt());
        Fixture empty = new Fixture();
        Arrays.fill(empty.totals, 0);
        assertEquals(0, empty.read().getSysAppCnt());
        assertEquals(11, first.read().getSysAppCnt());
    }

    @Test
    void queryFailureNeverReturnsInputCountersOrPartialResults() throws Throwable {
        for (String entity : ENTITIES) {
            Fixture fixture = new Fixture();
            fixture.failed = entity;
            fixture.input.set("sysappcnt", 99999);
            assertEquals("query-failed", assertThrows(IllegalStateException.class, fixture::read).getMessage());
            assertEquals(99999, fixture.input.get("sysappcnt"));
        }
    }

    @Test
    void invalidPageAndNonPageResultsCannotBecomeZeroes() throws Throwable {
        Fixture fixture = new Fixture();
        fixture.nonPage = true;
        assertThrows(IllegalStateException.class, fixture::read);
        Fixture oversized = new Fixture();
        oversized.oversized = true;
        assertThrows(IllegalStateException.class, oversized::read);
        assertThrows(IllegalArgumentException.class,
                () -> new ModelObservationOverviewDTO(new long[] { 1, 2, 3, 4, -1 }));
    }

    static final class Fixture {
        String root = "root-a";
        String systemId = "model-system-a";
        String denied;
        String rewritten;
        String failed;
        boolean nonPage;
        boolean oversized;
        boolean missingGrant;
        int grantLookups;
        final long[] totals = { 11, 22, 33, 44, 55 };
        final List<String> events = new ArrayList<>();
        final List<ISearchContextDTO> filters = new ArrayList<>();
        final Map<String, IDataEntityRuntime> entities = new LinkedHashMap<>();
        final Map<String, IDataEntityAccessManager> managers = new LinkedHashMap<>();
        final AppContext app = new AppContext();
        final EntityDTO input = new EntityDTO();
        final PSDevUser actor = new PSDevUser();
        final PSDevSysUser grant = new PSDevSysUser();
        final IUserContext user;
        final ISystemAccessManager access;
        final ISystemRuntime system;
        final IDataEntityRuntime parent;
        final IDataEntityRuntime observation;

        Fixture() {
            app.set("PSDEVSLNSYS", root);
            actor.setPSDevUserId("person-a");
            actor.setPSDevCenterId("center-a");
            grant.setPSDevUserId(actor.getPSDevUserId());
            grant.setPSDevCenterId(actor.getPSDevCenterId());
            grant.setPSDevSlnSysId(root);
            grant.setPSSystemId(systemId);
            grant.setAccMode(1);
            user = proxy(IUserContext.class, (p, method, args) -> {
                if ("getAppContext".equals(method.getName())) return app;
                throw new AssertionError(method.getName());
            });
            UserContext.setCurrent(user);
            access = proxy(ISystemAccessManager.class, (p, method, args) -> {
                if ("getCurrentPSDevUserMust".equals(method.getName())) return actor;
                if ("getPSDevUserBase".equals(method.getName())) {
                    assertEquals("SYS", args[0]);
                    assertEquals(root, args[1]);
                    grantLookups++;
                    return missingGrant ? null : grant;
                }
                throw new AssertionError(method.getName());
            });
            system = proxy(ISystemRuntime.class, (p, method, args) -> {
                if ("getDataEntityRuntime".equals(method.getName())) return entities.get(args[0]);
                throw new AssertionError(method.getName());
            });
            parent = entity("PSDEVSLNSYS");
            observation = entity("MODELOBSERVATION");
            for (String name : ENTITIES) entities.put(name, entity(name));
        }

        ModelObservationOverviewDTO read() throws Throwable {
            return new ModelObservationOverviewReader().read(observation, parent, root, user, access, input);
        }

        private IDataEntityRuntime entity(String name) {
            IDataEntityAccessManager manager = proxy(IDataEntityAccessManager.class, (p, method, args) -> {
                assertEquals("testDataAccessAction", method.getName());
                assertSame(user, args[0]);
                assertSame(parent, args[1]);
                assertEquals(root, args[2]);
                assertEquals("READ", args[args.length - 1]);
                events.add("READ:" + name);
                if (args.length == 5) {
                    ISearchContextDTO filter = (ISearchContextDTO) args[3];
                    assertEquals(systemId, filter.get("pssystemid"));
                    if (name.equals(rewritten)) filter.set("pssystemid", "foreign-system");
                } else {
                    assertEquals(null, args[3]);
                    assertEquals(systemId, ((IEntityDTO) args[4]).get("pssystemid"));
                }
                return !name.equals(denied);
            });
            return proxy(IDataEntityRuntime.class, (p, method, args) -> {
                if ("getName".equals(method.getName())) return name;
                if ("getSystemRuntime".equals(method.getName())) return system;
                if ("getDataEntityAccessManager".equals(method.getName())) return managers.getOrDefault(name, manager);
                if ("createSearchContext".equals(method.getName())) return new SearchContextDTO();
                if ("fetchDataSet".equals(method.getName())) {
                    assertEquals("CurSys", args[0]);
                    assertEquals(null, args[1]);
                    events.add("FETCH:" + name);
                    ISearchContextDTO filter = (ISearchContextDTO) ((Object[]) args[2])[0];
                    filters.add(filter);
                    if (name.equals(failed)) throw new IllegalStateException("query-failed");
                    if (nonPage) return Collections.emptyList();
                    long total = totals[ENTITIES.indexOf(name)];
                    List<IEntityDTO> rows = total == 0 ? Collections.emptyList()
                            : oversized ? Arrays.asList(new EntityDTO(), new EntityDTO())
                            : Collections.singletonList(new EntityDTO());
                    return new PageImpl<>(rows, PageRequest.of(0, 1), total);
                }
                throw new AssertionError(method.getName());
            });
        }
    }

    @SuppressWarnings("unchecked")
    static <T> T proxy(Class<T> type, InvocationHandler handler) {
        return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class<?>[] { type }, handler);
    }
}
