package cn.ibizlab.runner.servicerunner.harness;

/**
 * Classifies executor failures into retryable runtime errors and permanent
 * request/configuration errors.
 */
public final class HarnessRunExecutionException extends Exception {

    private final String errorCode;
    private final boolean retryable;

    public HarnessRunExecutionException(String errorCode,
                                        String message,
                                        boolean retryable) {
        super(message);
        this.errorCode = requireErrorCode(errorCode);
        this.retryable = retryable;
    }

    public HarnessRunExecutionException(String errorCode,
                                        String message,
                                        boolean retryable,
                                        Throwable cause) {
        super(message, cause);
        this.errorCode = requireErrorCode(errorCode);
        this.retryable = retryable;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public boolean isRetryable() {
        return retryable;
    }

    public static HarnessRunExecutionException permanent(String errorCode,
                                                         String message) {
        return new HarnessRunExecutionException(errorCode, message, false);
    }

    public static HarnessRunExecutionException retryable(String errorCode,
                                                         String message,
                                                         Throwable cause) {
        return new HarnessRunExecutionException(errorCode, message, true, cause);
    }

    private static String requireErrorCode(String errorCode) {
        if (errorCode == null || errorCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Harness execution error code is required");
        }
        return errorCode;
    }
}
