package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunEventDTO;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HarnessCoordinatorProjectionTest {

    @Test
    void terminalEventClearsRecoveryLeaseFields() {
        Timestamp occurredAt = new Timestamp(2000L);
        AIRunDTO current = new AIRunDTO()
                .setId("run-01")
                .setStatus("running")
                .setLeaseOwner("worker-01")
                .setLeaseUntil(new Timestamp(3000L))
                .setNextAttemptAt(new Timestamp(3000L));
        AIRunEventDTO event = new AIRunEventDTO()
                .setEventType("run.completed")
                .setSequence(7L)
                .setOccurredAt(occurredAt);
        AIRunDTO projection = new AIRunDTO().setId("run-01");

        new HarnessCoordinator().applyRunProjection(current, event, projection);

        assertEquals("completed", projection.getStatus());
        assertEquals(occurredAt, projection.getFinishedAt());
        assertTrue(projection.containsLeaseOwner());
        assertTrue(projection.containsLeaseUntil());
        assertTrue(projection.containsNextAttemptAt());
        assertNull(projection.getLeaseOwner());
        assertNull(projection.getLeaseUntil());
        assertNull(projection.getNextAttemptAt());
        assertEquals(7L, projection.getLastEventSequence());
    }
}
