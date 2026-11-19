package net.ibizsys.modeling.core.service;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

import net.ibizsys.modeling.core.dataentity.service.ModelObservationDEServiceAPIRuntime;

class ModelSysServiceAPIRuntimeBaseBindingTest {
    @Test
    void defaultEntityRuntimeUsesTheGatedOverviewCandidate() {
        TestRuntime runtime = new TestRuntime();

        assertInstanceOf(ModelObservationDEServiceAPIRuntime.class,
                runtime.createDefaultDEServiceAPIRuntime());
    }

    private static final class TestRuntime extends ModelSysServiceAPIRuntimeBase {
    }
}
