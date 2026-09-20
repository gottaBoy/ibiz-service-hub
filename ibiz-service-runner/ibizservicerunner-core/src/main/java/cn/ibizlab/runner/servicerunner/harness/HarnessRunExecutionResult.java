package cn.ibizlab.runner.servicerunner.harness;

import net.ibizsys.runtime.util.JsonUtils;

/**
 * Durable summary returned by a Harness Run executor.
 */
public final class HarnessRunExecutionResult {

    private final String resultJson;

    private HarnessRunExecutionResult(String resultJson) {
        this.resultJson = resultJson;
    }

    public static HarnessRunExecutionResult from(Object result) {
        if (result == null) {
            throw new IllegalArgumentException("Harness execution result is required");
        }
        return new HarnessRunExecutionResult(JsonUtils.toString(result));
    }

    public static HarnessRunExecutionResult fromJson(String resultJson) {
        if (resultJson == null || resultJson.trim().isEmpty()) {
            throw new IllegalArgumentException("Harness execution result JSON is required");
        }
        return new HarnessRunExecutionResult(
                JsonUtils.toString(JsonUtils.toJsonNode(resultJson)));
    }

    public String getResultJson() {
        return resultJson;
    }
}
