package cn.ibizlab.runner.servicerunner.harness;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class HarnessEventReplayCursor {

    private final String runId;
    private final long sequence;

    private HarnessEventReplayCursor(String runId, long sequence) {
        this.runId = runId;
        this.sequence = sequence;
    }

    public static String encode(String runId, long sequence) {
        validateRunId(runId);
        validateSequence(sequence);
        String value = runId + "\n" + sequence;
        return Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(value.getBytes(StandardCharsets.UTF_8));
    }

    public static HarnessEventReplayCursor decode(String cursor) {
        if (cursor == null || cursor.trim().isEmpty()) {
            throw new IllegalArgumentException("Harness event cursor is required");
        }
        final String value;
        try {
            value = new String(
                    Base64.getUrlDecoder().decode(cursor.trim()),
                    StandardCharsets.UTF_8);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException(
                    "Harness event cursor is not valid Base64 URL data", ex);
        }
        int separator = value.indexOf('\n');
        if (separator <= 0 || separator != value.lastIndexOf('\n')) {
            throw new IllegalArgumentException(
                    "Harness event cursor has an invalid format");
        }
        String runId = value.substring(0, separator);
        final long sequence;
        try {
            sequence = Long.parseLong(value.substring(separator + 1));
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                    "Harness event cursor sequence is invalid", ex);
        }
        validateRunId(runId);
        validateSequence(sequence);
        return new HarnessEventReplayCursor(runId, sequence);
    }

    public String getRunId() {
        return runId;
    }

    public long getSequence() {
        return sequence;
    }

    private static void validateRunId(String runId) {
        if (runId == null || runId.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Harness event cursor runId is required");
        }
        if (runId.indexOf('\n') >= 0 || runId.indexOf('\r') >= 0) {
            throw new IllegalArgumentException(
                    "Harness event cursor runId contains a line break");
        }
    }

    private static void validateSequence(long sequence) {
        if (sequence < 0L) {
            throw new IllegalArgumentException(
                    "Harness event cursor sequence must not be negative");
        }
    }
}
