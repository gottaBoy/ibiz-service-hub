package net.ibizsys.modeling.core.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PSModelsTest {

    @Test
    void knownModelAndConfigurationEntitiesHaveStableTables() {
        assertTrue(PSModels.isModelInstDataEntity(PSModels.PSDEFORM));
        assertEquals("T_SRFPSDEFORM", PSModels.getModelInstDataEntityTable(PSModels.PSDEFORM));

        assertTrue(PSModels.isModelInstDataEntity(PSModels.PSMODULE));
        assertEquals("T_SRFPSMODULE", PSModels.getModelInstDataEntityTable(PSModels.PSMODULE));

        assertTrue(PSModels.isModelInstDataEntity(PSModels.PSDATAENTITY));
        assertEquals("T_SRFPSDATAENTITY", PSModels.getModelInstDataEntityTable(PSModels.PSDATAENTITY));

        assertTrue(PSModels.isConfigInstDataEntity(PSModels.PSDBTYPE));
        assertEquals("T_SRFPSDBTYPE", PSModels.getConfigInstDataEntityTable(PSModels.PSDBTYPE));

        assertFalse(PSModels.isModelInstDataEntity("UNKNOWN_ENTITY"));
        assertFalse(PSModels.isConfigInstDataEntity("UNKNOWN_ENTITY"));
    }

    @Test
    void modelEntityListCannotMutateTheRegistry() {
        var entities = PSModels.getModelInstDataEntities();
        assertTrue(entities.contains(PSModels.PSSYSMODELINST));

        org.junit.jupiter.api.Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> entities.add("UNKNOWN_ENTITY"));
    }

    @Test
    void reviewedEditorEntitiesAreModelInstancesAndNeverConfigurationEntities() {
        String[][] mappings = {
            {PSModels.PSSYSDBSCHEME, "T_SRFPSSYSDBSCHEME"},
            {PSModels.PSSYSAPP, "T_SRFPSSYSAPP"},
            {PSModels.PSSYSSFPUB, "T_SRFPSSYSSFPUB"},
            {PSModels.PSSYSSERVICEAPI, "T_SRFPSSYSSERVICEAPI"},
            {PSModels.PSSUBSYSSERVICEAPI, "T_SRFPSSUBSYSSERVICEAPI"}
        };
        for (String[] mapping : mappings) {
            assertTrue(PSModels.isModelInstDataEntity(mapping[0]), mapping[0]);
            assertFalse(PSModels.isConfigInstDataEntity(mapping[0]), mapping[0]);
            assertEquals(mapping[1], PSModels.getModelInstDataEntityTable(mapping[0]));
        }
        assertEquals(26, PSModels.getModelInstDataEntities().size());
        assertFalse(PSModels.isModelInstDataEntity("PSSYSSFPUBPKG"));
    }

    @Test
    void appConfigurationEntitiesUseTheReadOnlyConfigurationManagerRegistry() {
        String[][] mappings = {
            {PSModels.PSPF, "T_SRFPSPF"},
            {PSModels.PSPFSTYLE, "T_SRFPSPFSTYLE"},
            {PSModels.PSAPPTYPE, "T_SRFPSAPPTYPE"}
        };
        for (String[] mapping : mappings) {
            assertTrue(PSModels.isConfigInstDataEntity(mapping[0]), mapping[0]);
            assertFalse(PSModels.isModelInstDataEntity(mapping[0]), mapping[0]);
            assertEquals(mapping[1], PSModels.getConfigInstDataEntityTable(mapping[0]));
        }
    }
}
