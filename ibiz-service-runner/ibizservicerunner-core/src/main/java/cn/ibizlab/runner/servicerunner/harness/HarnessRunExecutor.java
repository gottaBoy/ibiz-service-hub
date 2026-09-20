package cn.ibizlab.runner.servicerunner.harness;

/**
 * Executes the external side effect for a leased Harness Run.
 */
@FunctionalInterface
public interface HarnessRunExecutor {

    HarnessRunExecutionResult execute(HarnessRecoveryClaim claim) throws Throwable;
}
