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
}