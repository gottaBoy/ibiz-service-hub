package net.ibizsys.modeling.core.util;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.addin.IPSModelCloner;
import net.ibizsys.modeling.core.addin.IPSModelDSLTranspiler;
import net.ibizsys.modeling.core.addin.IPSModelInitializer;
import net.ibizsys.modeling.core.addin.IPSModelV2Exchanger;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLInput;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLResult;

/**
 * Minimal unit tests for {@link PSModelDSLCompiler}.
 */
class PSModelDSLCompilerTest {

    private static class StubEnhancerRuntime implements IModelEnhancerSysUtilRuntime {

        private static final String NA = "n/a";

        @Override
        public net.ibizsys.central.ISystemRuntime getSystemRuntime() {
            throw new UnsupportedOperationException("not available in unit test");
        }

        @Override
        public IPSModelDSLNode createPSModelDSLNode(String name, Object attrs, IPSModelDSLNode parent) {
            @SuppressWarnings("unchecked")
            Map<String, Object> mapAttrs = (Map<String, Object>) attrs;
            return new PSModelDSLNode(parent, name, mapAttrs, null);
        }

        @Override public String getId() { return NA; }
        @Override public String getName() { return NA; }
        @Override public String getLowerCaseName() { return NA; }
        @Override public String getLogicName() { return NA; }
        @Override public String getFullUniqueTag() { return null; }
        @Override public String getLowerCaseFullUniqueTag() { return null; }
        @Override public net.ibizsys.central.IDynaInstRuntime getDynaInstRuntime() { return null; }
        @Override public net.ibizsys.runtime.IModelRuntimeSetting getSetting() { return null; }
        @Override public void install() {}
        @Override public boolean isInstalled() { return false; }
        @Override public void uninstall() {}
        @Override public void installData(String mode) {}
        @Override public net.ibizsys.model.res.IPSSysUtil getPSModelObject() { return null; }
        @Override public Object executeAction(String a, Object[] b) { return null; }
        @Override public void reload() {}
        @Override public void init(net.ibizsys.runtime.ISystemRuntimeContext a, net.ibizsys.model.res.IPSSysUtil b) {}
        // ---- initializer addins ----
        @Override public void preparePSModel(String a, Object[] b, int c) {}
        @Override public void initializePSModel(String a, Object[] b) {}
        @Override public boolean containsPSModelInitializer(String a) { return false; }
        @Override public void registerPSModelInitializer(String a, IPSModelInitializer b) {}
        @Override public boolean unregisterPSModelInitializer(String a, IPSModelInitializer b) { return false; }
        // ---- V2 exchanger addins ----
        @Override public boolean containsPSModelV2Exchanger(String a) { return false; }
        @Override public void registerPSModelV2Exchanger(String a, IPSModelV2Exchanger b) {}
        @Override public boolean unregisterPSModelV2Exchanger(String a, IPSModelV2Exchanger b) { return false; }
        @Override public void prepareImportPSModelV2(String a, Object[] b) {}
        @Override public void finishImportPSModelV2(String a, Object[] b, Object c) {}
        @Override public void prepareExportPSModelV2(String a, Object[] b) {}
        @Override public void finishExportPSModelV2(String a, Object[] b, Object c) {}
        // ---- cloner addins ----
        @Override public boolean containsPSModelCloner(String a) { return false; }
        @Override public void registerPSModelCloner(String a, IPSModelCloner b) {}
        @Override public boolean unregisterPSModelCloner(String a, IPSModelCloner b) { return false; }
        @Override public Object copyPSModel(String a, Object[] b) { return null; }
        @Override public Object pastePSModel(String a, Object[] b) { return null; }
        // ---- DSL transpiler addins ----
        @Override public boolean containsPSModelDSLTranspiler(String a) { return false; }
        @Override public void registerPSModelDSLTranspiler(String a, IPSModelDSLTranspiler b) {}
        @Override public boolean unregisterPSModelDSLTranspiler(String a, IPSModelDSLTranspiler b) { return false; }
        @Override public Object compilePSModelDSL(String a, Object[] b) { return null; }
        @Override public void compilePSModelDSLNode(String a, PSModelDSLCompileSession b, IPSModelDSLNode c) {}
        @Override public void prepareCompilePSModelDSLNode(String a, PSModelDSLCompileSession b, IPSModelDSLNode c) {}
        @Override public Object exportPSModelDSL(String a, Object[] b) { return null; }
        @Override public void exportPSModelDSLNodes(String a, PSModelDSLExportSession b, List<? extends IEntityDTO> c) {}
        @Override public void prepareExportPSModelDSLNodes(String a, PSModelDSLExportSession b, List<? extends IEntityDTO> c) {}
        @Override public Object mergePSModelDSL(String a, Object[] b) { return null; }
    }

    @Test
    void createCompileSession() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        CompileModelDSLInput input = new CompileModelDSLInput();
        var session = compiler.createPSModelDSLCompileSession(input);
        assertNotNull(session);
        assertSame(input, session.getCompileModelDSLInput());
    }

    @Test
    void toCompileModelDSLResultReturnsEmptyMapWhenNoNodes() throws Throwable {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        CompileModelDSLInput input = new CompileModelDSLInput();
        var session = compiler.createPSModelDSLCompileSession(input);
        CompileModelDSLResult result = compiler.toCompileModelDSLResult(session);
        assertNotNull(result);
        Object data = result.getData();
        assertTrue(data == null || (data instanceof Map && ((Map<?, ?>)data).isEmpty()));
    }

    @Test
    @SuppressWarnings("unchecked")
    void onCreateNodeReturnsPSModelNode() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        var session = compiler.createPSModelDSLCompileSession(new CompileModelDSLInput());
        Map<String, Object> attrs = new LinkedHashMap<>();
        attrs.put("codename", "TestEntity");
        Object node = compiler.onCreateNode(session, "PSDataEntity", attrs, null);
        assertNotNull(node);
        assertTrue(node instanceof IPSModelDSLNode);
        IPSModelDSLNode dslNode = (IPSModelDSLNode) node;
        assertEquals("PSDATAENTITY", dslNode.getNodeName());
    }

    @Test
    void onCreateNodeRejectsPSSystem() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        var session = compiler.createPSModelDSLCompileSession(new CompileModelDSLInput());
        Map<String, Object> attrs = new LinkedHashMap<>();
        attrs.put("codename", "sys");
        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> compiler.onCreateNode(session, "PSSystem", attrs, null));
        assertTrue(ex.getMessage().contains("PSSYSTEM"));
    }

    @Test
    void onCreateNodeRejectsModelWithoutAttributes() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        var session = compiler.createPSModelDSLCompileSession(new CompileModelDSLInput());
        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> compiler.onCreateNode(session, "PSDataEntity", null, null));
        assertTrue(ex.getMessage().contains("\u672a\u6307\u5b9a\u6a21\u578b\u5c5e\u6027\u96c6\u5408"));
    }

    @Test
    void onCreateNodeRejectsUnknownNodeName() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        var session = compiler.createPSModelDSLCompileSession(new CompileModelDSLInput());
        Map<String, Object> attrs = new LinkedHashMap<>();
        attrs.put("x", "y");
        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> compiler.onCreateNode(session, "UnknownNode", attrs, null));
        assertTrue(ex.getMessage().contains("\u672a\u652f\u6301"));
    }

    @Test
    @SuppressWarnings("unchecked")
    void onCreateNodeRegistersNodeWithParent() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        var session = compiler.createPSModelDSLCompileSession(new CompileModelDSLInput());
        Map<String, Object> parentAttrs = new LinkedHashMap<>();
        parentAttrs.put("codename", "Parent");
        IPSModelDSLNode parent = (IPSModelDSLNode) compiler.onCreateNode(session, "PSDataEntity", parentAttrs, null);
        Map<String, Object> childAttrs = new LinkedHashMap<>();
        childAttrs.put("codename", "Child");
        Object child = compiler.onCreateNode(session, "PSDER", childAttrs, parent);
        assertNotNull(child);
        assertTrue(child instanceof IPSModelDSLNode);
        assertSame(parent, ((IPSModelDSLNode) child).getParent());
        assertNotNull(parent.getChildren());
        assertTrue(parent.getChildren().contains(child));
    }

    @Test
    @SuppressWarnings("unchecked")
    void optionNodeSetsOptionOnParent() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        var session = compiler.createPSModelDSLCompileSession(new CompileModelDSLInput());
        Map<String, Object> parentAttrs = new LinkedHashMap<>();
        parentAttrs.put("codename", "Entity");
        IPSModelDSLNode parent = (IPSModelDSLNode) compiler.onCreateNode(session, "PSDataEntity", parentAttrs, null);
        assertFalse(parent.isEnableUpdate());
        Map<String, Object> optAttrs = new LinkedHashMap<>();
        optAttrs.put("update", true);
        assertNull(compiler.onCreateNode(session, "OPTION", optAttrs, parent));
        assertTrue(parent.isEnableUpdate());
    }

    @Test
    void optionNodeOnNestedParentThrows() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        var session = compiler.createPSModelDSLCompileSession(new CompileModelDSLInput());
        Map<String, Object> attrs = new LinkedHashMap<>();
        attrs.put("codename", "Nested");
        attrs.put("_nested", true);
        IPSModelDSLNode nested = (IPSModelDSLNode) compiler.onCreateNode(session, "PSDataEntity", attrs, null);
        RuntimeException ex = assertThrows(RuntimeException.class,
                () -> compiler.onCreateNode(session, "OPTION", new LinkedHashMap<>(), nested));
        assertTrue(ex.getMessage().contains("\u672a\u652f\u6301\u9009\u9879"));
    }

    @Test
    void compilerExposesEnhancerRuntime() {
        var stub = new StubEnhancerRuntime();
        var compiler = new PSModelDSLCompiler(stub);
        assertSame(stub, compiler.getModelEnhancerSysUtilRuntime());
    }

    @Test
    void compileRejectsNullInput() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        assertThrows(IllegalArgumentException.class, () -> compiler.compile(null));
    }

    @Test
    void compileRejectsEmptyDSL() {
        var compiler = new PSModelDSLCompiler(new StubEnhancerRuntime());
        CompileModelDSLInput input = new CompileModelDSLInput();
        assertThrows(IllegalArgumentException.class, () -> compiler.compile(input));
    }
}