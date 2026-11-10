package net.ibizsys.modeling.core.dataentity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Proxy;

import org.junit.jupiter.api.Test;

import net.ibizsys.central.dataentity.demap.IDEMapRuntime;
import net.ibizsys.central.util.EntityDTO;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;

class ModelActionDispatchTest {

    private static class DispatchRuntime extends DataEntityRuntimeBase {
        final IEntityDTO entity = new EntityDTO();
        String dispatched;
        Object input;

        Object dispatch(String action, Object value) throws Throwable {
            return onExecuteActionReal(action, null, new Object[] { value }, null);
        }

        @Override
        public IDEMapRuntime getDEMapRuntime(String name, IPSDEAction action, String mode) {
            return null;
        }

        @Override
        protected boolean isEnableRuntimeServiceMode() {
            return true;
        }

        @Override
        protected IEntityDTO doGetReal(Object key, Object[] args, Object data) {
            dispatched = "GET";
            input = key;
            return entity;
        }

        @Override
        protected IEntityDTO doGetDraftReal(IEntityDTO value, Object[] args, Object data) {
            dispatched = "GETDRAFT";
            input = value;
            return entity;
        }

        @Override
        protected void doCreateReal(IEntityDTO value, Object[] args, Object data) {
            dispatched = "CREATE";
            input = value;
        }

        @Override
        protected void doUpdateReal(IEntityDTO value, Object[] args, Object data) {
            dispatched = "UPDATE";
            input = value;
        }

        @Override
        protected void doRemoveReal(Object key, Object[] args, Object data) {
            dispatched = "REMOVE";
            input = key;
        }

        @Override
        protected Object doExecuteActionReal(String name, IPSDEAction action, Object[] args, Object data) {
            dispatched = name;
            input = args[0];
            return "custom-result";
        }
    }

    @Test
    void getAndGetDraftUseParentDispatchInsteadOfReturningNull() throws Throwable {
        DispatchRuntime runtime = new DispatchRuntime();
        assertSame(runtime.entity, runtime.dispatch("GET", "system-id"));
        assertEquals("GET", runtime.dispatched);
        assertEquals("system-id", runtime.input);
        IEntityDTO draft = new EntityDTO();
        assertSame(runtime.entity, runtime.dispatch("GETDRAFT", draft));
        assertEquals("GETDRAFT", runtime.dispatched);
        assertSame(draft, runtime.input);
    }

    @Test
    void mutationsAndCustomActionsReachTheirRuntimeImplementations() throws Throwable {
        DispatchRuntime runtime = new DispatchRuntime();
        IEntityDTO value = new EntityDTO();
        for (String action : new String[] { "CREATE", "UPDATE" }) {
            assertNull(runtime.dispatch(action, value));
            assertEquals(action, runtime.dispatched);
            assertSame(value, runtime.input);
        }
        assertNull(runtime.dispatch("REMOVE", "entity-id"));
        assertEquals("REMOVE", runtime.dispatched);
        assertEquals("entity-id", runtime.input);
        assertEquals("custom-result", runtime.dispatch("EXPORTMODELV2", value));
        assertEquals("EXPORTMODELV2", runtime.dispatched);
    }

    private static class LightModeRuntime extends DataEntityRuntimeBase {
        boolean fail;
        int executions;

        Object executeReal() throws Throwable {
            IPSDEAction action = (IPSDEAction) Proxy.newProxyInstance(
                    getClass().getClassLoader(), new Class<?>[] { IPSDEAction.class },
                    (proxy, method, args) -> {
                        throw new AssertionError(method.getName());
                    });
            return doExecuteActionReal("CUSTOM", action, new Object[] { "input" }, null);
        }

        @Override
        protected IDEActionRuntime getDEActionRuntime(IPSDEAction action) {
            return (IDEActionRuntime) Proxy.newProxyInstance(
                    getClass().getClassLoader(), new Class<?>[] { IDEActionRuntime.class },
                    (proxy, method, args) -> {
                        if ("isValid".equals(method.getName())) return true;
                        if ("execute".equals(method.getName())) {
                            executions++;
                            assertTrue(ActionSessionManager.getCurrentSessionMust()
                                    .isEnableNestedDataLightMode());
                            if (fail) throw new IllegalStateException("action-failed");
                            return "executed";
                        }
                        throw new AssertionError(method.getName());
                    });
        }
    }

    @Test
    void lightModeIsRestoredAfterSuccessWithoutRecursiveRedispatch() throws Throwable {
        ActionSession session = ActionSessionManager.openSession();
        try {
            session.setEnableNestedDataLightMode(false);
            LightModeRuntime runtime = new LightModeRuntime();
            assertEquals("executed", runtime.executeReal());
            assertEquals(1, runtime.executions);
            assertFalse(session.isEnableNestedDataLightMode());
            session.setEnableNestedDataLightMode(true);
            assertEquals("executed", runtime.executeReal());
            assertTrue(session.isEnableNestedDataLightMode());
        } finally {
            ActionSessionManager.closeSession(false);
        }
    }

    @Test
    void lightModeIsRestoredWhenTheActionFails() throws Throwable {
        ActionSession session = ActionSessionManager.openSession();
        try {
            session.setEnableNestedDataLightMode(false);
            LightModeRuntime runtime = new LightModeRuntime();
            runtime.fail = true;
            assertEquals("action-failed",
                    assertThrows(IllegalStateException.class, runtime::executeReal).getMessage());
            assertEquals(1, runtime.executions);
            assertFalse(session.isEnableNestedDataLightMode());
        } finally {
            ActionSessionManager.closeSession(false);
        }
    }
}
