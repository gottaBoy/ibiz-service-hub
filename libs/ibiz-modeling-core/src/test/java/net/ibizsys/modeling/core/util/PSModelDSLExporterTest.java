package net.ibizsys.modeling.core.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

import org.junit.jupiter.api.Test;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLInput;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLResult;

/**
 * Minimal unit tests for {@link PSModelDSLExporter}.
 */
class PSModelDSLExporterTest {

    private static class StubEnhancerRuntime implements IModelEnhancerSysUtilRuntime {
        @Override public net.ibizsys.central.ISystemRuntime getSystemRuntime() {
            throw new UnsupportedOperationException("not available in unit test");
        }
        @Override public IPSModelDSLNode createPSModelDSLNode(String name, Object attrs, IPSModelDSLNode parent) {
            @SuppressWarnings("unchecked")
            Map<String, Object> mapAttrs = (Map<String, Object>) attrs;
            return new PSModelDSLNode(parent, name, mapAttrs, null);
        }

        @Override public void preparePSModel(String a, Object[] b, int c) {}
        @Override public void initializePSModel(String a, Object[] b) {}
        @Override public boolean containsPSModelInitializer(String a) { return false; }
        @Override public void registerPSModelInitializer(String a, net.ibizsys.modeling.core.addin.IPSModelInitializer b) {}
        @Override public boolean unregisterPSModelInitializer(String a, net.ibizsys.modeling.core.addin.IPSModelInitializer b) { return false; }
        @Override public boolean containsPSModelV2Exchanger(String a) { return false; }
        @Override public void registerPSModelV2Exchanger(String a, net.ibizsys.modeling.core.addin.IPSModelV2Exchanger b) {}
        @Override public boolean unregisterPSModelV2Exchanger(String a, net.ibizsys.modeling.core.addin.IPSModelV2Exchanger b) { return false; }
        @Override public void prepareImportPSModelV2(String a, Object[] b) {}
        @Override public void finishImportPSModelV2(String a, Object[] b, Object c) {}
        @Override public void prepareExportPSModelV2(String a, Object[] b) {}
        @Override public void finishExportPSModelV2(String a, Object[] b, Object c) {}
        @Override public boolean containsPSModelCloner(String a) { return false; }
        @Override public void registerPSModelCloner(String a, net.ibizsys.modeling.core.addin.IPSModelCloner b) {}
        @Override public boolean unregisterPSModelCloner(String a, net.ibizsys.modeling.core.addin.IPSModelCloner b) { return false; }
        @Override public Object copyPSModel(String a, Object[] b) { return null; }
        @Override public Object pastePSModel(String a, Object[] b) { return null; }
        @Override public boolean containsPSModelDSLTranspiler(String a) { return false; }
        @Override public void registerPSModelDSLTranspiler(String a, net.ibizsys.modeling.core.addin.IPSModelDSLTranspiler b) {}
        @Override public boolean unregisterPSModelDSLTranspiler(String a, net.ibizsys.modeling.core.addin.IPSModelDSLTranspiler b) { return false; }
        @Override public Object compilePSModelDSL(String a, Object[] b) { return null; }
        @Override public void compilePSModelDSLNode(String a, PSModelDSLCompileSession b, IPSModelDSLNode c) {}
        @Override public void prepareCompilePSModelDSLNode(String a, PSModelDSLCompileSession b, IPSModelDSLNode c) {}
        @Override public Object exportPSModelDSL(String a, Object[] b) { return null; }
        @Override public void exportPSModelDSLNodes(String a, PSModelDSLExportSession b, List<? extends IEntityDTO> c) {}
        @Override public void prepareExportPSModelDSLNodes(String a, PSModelDSLExportSession b, List<? extends IEntityDTO> c) {}
        @Override public Object mergePSModelDSL(String a, Object[] b) { return null; }
        @Override public net.ibizsys.model.res.IPSSysUtil getPSModelObject() { return null; }
        @Override public net.ibizsys.central.IDynaInstRuntime getDynaInstRuntime() { return null; }
        @Override public net.ibizsys.runtime.IModelRuntimeSetting getSetting() { return null; }
        @Override public Object executeAction(String a, Object[] b) { return null; }
        @Override public void init(net.ibizsys.runtime.ISystemRuntimeContext a, net.ibizsys.model.res.IPSSysUtil b) {}
        @Override public void reload() {}
        @Override public String getFullUniqueTag() { return null; }
        @Override public String getLowerCaseFullUniqueTag() { return null; }
        @Override public String getLogicName() { return null; }
        @Override public String getId() { return null; }
        @Override public String getName() { return null; }
        @Override public String getLowerCaseName() { return null; }
        @Override public void uninstall() {}
        @Override public void install() throws Exception {}
        @Override public boolean isInstalled() { return false; }
        @Override public void installData(String mode) throws Exception {}
    }

    private static class TestableExporter extends PSModelDSLExporter {
        TestableExporter() { super(new StubEnhancerRuntime()); }
        @Override public PSModelDSLExportSession createPSModelDSLExportSession(ExportModelDSLInput input) {
            return super.createPSModelDSLExportSession(input);
        }
    }

    @Test
    void createExportSession() {
        TestableExporter exporter = new TestableExporter();
        ExportModelDSLInput input = new ExportModelDSLInput();
        PSModelDSLExportSession session = exporter.createPSModelDSLExportSession(input);
        assertNotNull(session);
        assertSame(input, session.getExportModelDSLInput());
    }

    @Test
    void exporterExposesEnhancerRuntime() {
        IModelEnhancerSysUtilRuntime stub = new StubEnhancerRuntime();
        PSModelDSLExporter exporter = new PSModelDSLExporter(stub);
        assertSame(stub, exporter.getModelEnhancerSysUtilRuntime());
    }

    @Test
    void exportResultIsCreatedWithEmptyDSL() throws Throwable {
        TestableExporter exporter = new TestableExporter();
        ExportModelDSLInput input = new ExportModelDSLInput();
        PSModelDSLExportSession session = exporter.createPSModelDSLExportSession(input);
        ExportModelDSLResult result = exporter.toExportModelDSLResult(session);
        assertNotNull(result);
        String dsl = result.getDSL();
        assertTrue(dsl == null || dsl.isEmpty());
    }
}