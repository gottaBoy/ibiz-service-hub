package cn.ibizlab.runner.servicerunner.harness.web;

import cn.ibizlab.runner.servicerunner.harness.HarnessEventReplayCursor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HarnessRunRestControllerTest {

    @Test
    void explicitAfterCursorTakesPrecedenceOverLastEventId() {
        String afterCursor =
                HarnessEventReplayCursor.encode("run-01", 7L);

        String resolved = HarnessRunRestController.resolveInitialCursor(
                "run-01", afterCursor, "2");

        assertEquals(afterCursor, resolved);
    }

    @Test
    void numericLastEventIdIsConvertedToRunScopedCursor() {
        String resolved = HarnessRunRestController.resolveInitialCursor(
                "run-01", null, "12");

        assertEquals(12L,
                HarnessEventReplayCursor.decode(resolved).getSequence());
        assertEquals("run-01",
                HarnessEventReplayCursor.decode(resolved).getRunId());
    }

    @Test
    void rejectsCursorBelongingToAnotherRun() {
        String foreignCursor =
                HarnessEventReplayCursor.encode("run-02", 3L);

        assertThrows(IllegalArgumentException.class,
                () -> HarnessRunRestController.resolveInitialCursor(
                        "run-01", foreignCursor, null));
        assertThrows(IllegalArgumentException.class,
                () -> HarnessRunRestController.resolveInitialCursor(
                        "run-01", null, foreignCursor));
    }

    @Test
    void recognizesEveryTerminalRunStatus() {
        assertTrue(HarnessRunRestController.isTerminalStatus("completed"));
        assertTrue(HarnessRunRestController.isTerminalStatus("failed"));
        assertTrue(HarnessRunRestController.isTerminalStatus("cancelled"));
    }
}
