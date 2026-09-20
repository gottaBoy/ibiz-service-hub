package cn.ibizlab.runner.servicerunner.harness;

import net.ibizsys.central.SystemRuntimeSetting;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HarnessRecoveryWorkerConfigTest {

    @Test
    void usesConservativeDefaults() {
        HarnessRecoveryWorkerConfig config = HarnessRecoveryWorkerConfig.from(
                new SystemRuntimeSetting(null, Collections.emptyMap()),
                "worker-default");

        assertFalse(config.isEnabled());
        assertEquals("worker-default", config.getWorkerId());
        assertEquals(5000L, config.getPollIntervalMs());
        assertEquals(100, config.getBatchSize());
        assertEquals(60000L, config.getLeaseMs());
        assertEquals(20000L, config.getLeaseRenewIntervalMs());
        assertEquals(3, config.getMaxAttempts());
        assertEquals(5000L, config.getInitialBackoffMs());
        assertEquals(60000L, config.getMaxBackoffMs());
    }

    @Test
    void readsNestedRuntimeSettings() {
        Map<String, Object> recovery = new LinkedHashMap<>();
        recovery.put("enabled", true);
        recovery.put("worker-id", " worker-01 ");
        recovery.put("poll-interval-ms", 250L);
        recovery.put("batch-size", 25);
        recovery.put("lease-ms", 1000L);
        recovery.put("lease-renew-interval-ms", 250L);
        recovery.put("max-attempts", 5);
        recovery.put("initial-backoff-ms", 100L);
        recovery.put("max-backoff-ms", 2500L);
        Map<String, Object> harness = Collections.singletonMap("recovery", recovery);
        Map<String, Object> settings = Collections.singletonMap("harness", harness);

        HarnessRecoveryWorkerConfig config = HarnessRecoveryWorkerConfig.from(
                new SystemRuntimeSetting(null, settings),
                "worker-default");

        assertTrue(config.isEnabled());
        assertEquals("worker-01", config.getWorkerId());
        assertEquals(250L, config.getPollIntervalMs());
        assertEquals(25, config.getBatchSize());
        assertEquals(1000L, config.getLeaseMs());
        assertEquals(250L, config.getLeaseRenewIntervalMs());
        assertEquals(5, config.getMaxAttempts());
        assertEquals(100L, config.getInitialBackoffMs());
        assertEquals(2500L, config.getMaxBackoffMs());
    }

    @Test
    void rejectsInvalidValues() {
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(true, " ", 1L, 1, 1L));
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(true, "worker", 0L, 1, 1L));
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(true, "worker", 1L, 0, 1L));
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(
                        true,
                        "worker",
                        1L,
                        HarnessRecoveryWorkerConfig.MAX_BATCH_SIZE + 1,
                        1L));
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(true, "worker", 1L, 1, 0L));
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(
                        true, "worker", 1L, 1, 1L, 0, 1L, 1L));
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(
                        true, "worker", 1L, 1, 1L, 1, 0L, 1L));
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(
                        true, "worker", 1L, 1, 1L, 1, 2L, 1L));
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(
                        true, "worker", 1L, 1, 100L, 0L, 1, 1L, 1L));
        assertThrows(IllegalArgumentException.class,
                () -> new HarnessRecoveryWorkerConfig(
                        true, "worker", 1L, 1, 100L, 101L, 1, 1L, 1L));
    }
}
