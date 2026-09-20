package net.ibizsys.modeling.core.util;

import static org.junit.jupiter.api.Assertions.*;



import java.util.Collections;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.util.domain.MergeModelDSLInput;
import net.ibizsys.modeling.core.util.domain.MergeModelDSLResult;

/**
 * Minimal unit tests for {@link PSModelDSLMerger}.
 *
 * <p>These tests exercise the merger's validation logic, empty-result strategy,
 * and the {@link PSModelDSLMerger.ChangelogProvider} contract. Full end-to-end
 * DSL compilation/export requires a live {@link IModelEnhancerSysUtilRuntime}
 * and is not covered here.</p>
 */
class PSModelDSLMergerTest {

    // ========================================================================
    //  Stub runtime (no-op, throws on any system runtime access)
    // ========================================================================

    private static class StubEnhancerRuntime implements IModelEnhancerSysUtilRuntime {
        @Override public net.ibizsys.central.ISystemRuntime getSystemRuntime() {
            throw new UnsupportedOperationException("not available in unit test");
        }
        @Override public IPSModelDSLNode createPSModelDSLNode(String name, Object attrs, IPSModelDSLNode parent) {
            @SuppressWarnings("unchecked")
            Map<String, Object> mapAttrs = (Map<String, Object>) attrs;
            return new PSModelDSLNode(parent, name, mapAttrs, null);

        }

        // --- unused stubs ---
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

    // ========================================================================
    //  Tests
    // ========================================================================

    @Test
    void constructorRejectsNullRuntime() {
        assertThrows(NullPointerException.class,
                () -> new PSModelDSLMerger(null));
    }

    @Test
    void constructorAcceptsValidRuntime() {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        assertNotNull(merger);
    }

    @Test
    void mergeRejectsNullInput() {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        assertThrows(NullPointerException.class,
                () -> merger.merge(null));
    }

    @Test
    void mergeChangedModelWithoutFromThrows() {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        MergeModelDSLInput input = new MergeModelDSLInput();
        input.setChangedModel("true");
        // from is null
        Exception ex = assertThrows(Exception.class,
                () -> merger.merge(input));
        assertTrue(ex.getMessage().contains("起始时间"));
    }

    @Test
    void mergeChangedModelWithoutProviderThrows() {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        MergeModelDSLInput input = new MergeModelDSLInput();
        input.setChangedModel("true");
        input.setFrom("2026-01-01 00:00:00");
        Exception ex = assertThrows(Exception.class,
                () -> merger.merge(input));
        assertTrue(ex.getMessage().contains("ChangelogProvider"));
    }

    @Test
    void mergeChangedModelWithoutProviderReturnsEmptyWhenConfigured() throws Throwable {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        merger.setEmptyResultOnMissingChangelog(true);
        MergeModelDSLInput input = new MergeModelDSLInput();
        input.setChangedModel("true");
        input.setFrom("2026-01-01 00:00:00");
        MergeModelDSLResult result = merger.merge(input);
        assertNotNull(result);
        assertEquals("", result.getDSL());
    }

    @Test
    void mergeDirectModeWithEmptyDslThrows() {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        MergeModelDSLInput input = new MergeModelDSLInput();
        input.setDSL(Collections.emptyMap());
        Exception ex = assertThrows(Exception.class,
                () -> merger.merge(input));
        assertTrue(ex.getMessage().contains("未传入编译DSL对象"));
    }

    @Test
    void mergeDirectModeWithNullDslThrows() {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        MergeModelDSLInput input = new MergeModelDSLInput();
        input.setChangedModel("false");
        // DSL not set → null
        Exception ex = assertThrows(Exception.class,
                () -> merger.merge(input));
        assertTrue(ex.getMessage().contains("未传入编译DSL对象"));
    }

    @Test
    void setChangelogProviderAndEmptyResultStrategy() {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        // Default: throws
        assertThrows(Exception.class, () -> {
            MergeModelDSLInput input = new MergeModelDSLInput();
            input.setChangedModel("true");
            input.setFrom("2026-01-01 00:00:00");
            merger.merge(input);
        });
        // With empty-result strategy: returns empty
        merger.setEmptyResultOnMissingChangelog(true);
        assertDoesNotThrow(() -> {
            MergeModelDSLInput input = new MergeModelDSLInput();
            input.setChangedModel("true");
            input.setFrom("2026-01-01 00:00:00");
            MergeModelDSLResult result = merger.merge(input);
            assertEquals("", result.getDSL());
        });
    }

    // ========================================================================
    //  ChangelogProvider / ChangelogEntry contract tests
    // ========================================================================

    @Test
    void changelogProviderIntegration() throws Throwable {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        merger.setChangelogProvider(from -> List.of(
                new PSModelDSLMerger.ChangelogEntry() {
                    @Override public String getChgType() { return "CREATE"; }
                    @Override public String getObjType() { return "PSDATAENTITY"; }
                    @Override public String getPSObjId() { return "entity1"; }
                }
        ));
        merger.setEmptyResultOnMissingChangelog(true);

        // The provider will return data but the system runtime is stubbed,
        // so the export will fail silently (log error) and the DSL map will be empty.
        MergeModelDSLInput input = new MergeModelDSLInput();
        input.setChangedModel("true");
        input.setFrom("2026-01-01 00:00:00");
        // This will hit the stub's getSystemRuntime() which throws,
        // so we expect empty result due to the error logging
        MergeModelDSLResult result = merger.merge(input);
        assertEquals("", result.getDSL());
    }

    @Test
    void changelogProviderReturnsEmptyEntries() throws Throwable {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        merger.setChangelogProvider(from -> List.of());

        // No entries → empty DSL map → empty result (with emptyResultOnMissingChangelog)
        merger.setEmptyResultOnMissingChangelog(true);
        MergeModelDSLInput input = new MergeModelDSLInput();
        input.setChangedModel("true");
        input.setFrom("2026-01-01 00:00:00");
        MergeModelDSLResult result = merger.merge(input);
        assertEquals("", result.getDSL());
    }

    @Test
    void changelogProviderReturnsOnlyDeletes() throws Throwable {
        PSModelDSLMerger merger = new PSModelDSLMerger(new StubEnhancerRuntime());
        merger.setChangelogProvider(from -> List.of(
                new PSModelDSLMerger.ChangelogEntry() {
                    @Override public String getChgType() { return "DELETE"; }
                    @Override public String getObjType() { return "PSDATAENTITY"; }
                    @Override public String getPSObjId() { return "entity1"; }
                }
        ));
        merger.setEmptyResultOnMissingChangelog(true);
        MergeModelDSLInput input = new MergeModelDSLInput();
        input.setChangedModel("true");
        input.setFrom("2026-01-01 00:00:00");
        MergeModelDSLResult result = merger.merge(input);
        assertEquals("", result.getDSL());
    }

    @Test
    void changelogEntryInterfaceAccessors() {
        PSModelDSLMerger.ChangelogEntry entry = new PSModelDSLMerger.ChangelogEntry() {
            @Override public String getChgType() { return "CREATE"; }
            @Override public String getObjType() { return "PSDATAENTITY"; }
            @Override public String getPSObjId() { return "id_123"; }
        };
        assertEquals("CREATE", entry.getChgType());
        assertEquals("PSDATAENTITY", entry.getObjType());
        assertEquals("id_123", entry.getPSObjId());
    }
}