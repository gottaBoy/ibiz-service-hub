package cn.ibizlab.runner.servicerunner.harness;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HarnessEventReplayCursorTest {

    @Test
    void roundTripsRunIdAndSequenceWithoutPadding() {
        String cursor = HarnessEventReplayCursor.encode("run/01", 42L);

        assertEquals(42L,
                HarnessEventReplayCursor.decode(cursor).getSequence());
        assertEquals("run/01",
                HarnessEventReplayCursor.decode(cursor).getRunId());
        org.junit.jupiter.api.Assertions.assertFalse(cursor.contains("="));
    }

    @Test
    void rejectsMissingMalformedForeignAndNegativeValues() {
        assertThrows(IllegalArgumentException.class,
                () -> HarnessEventReplayCursor.decode(null));
        assertThrows(IllegalArgumentException.class,
                () -> HarnessEventReplayCursor.decode("not-base64"));
        assertThrows(IllegalArgumentException.class,
                () -> HarnessEventReplayCursor.encode("run-01", -1L));
        assertThrows(IllegalArgumentException.class,
                () -> HarnessEventReplayCursor.encode(" ", 0L));

        String malformed = Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(
                        "run-01\n1\n2".getBytes(StandardCharsets.UTF_8));
        assertThrows(IllegalArgumentException.class,
                () -> HarnessEventReplayCursor.decode(malformed));

        String negative = Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(
                        "run-01\n-1".getBytes(StandardCharsets.UTF_8));
        assertThrows(IllegalArgumentException.class,
                () -> HarnessEventReplayCursor.decode(negative));
    }
}
