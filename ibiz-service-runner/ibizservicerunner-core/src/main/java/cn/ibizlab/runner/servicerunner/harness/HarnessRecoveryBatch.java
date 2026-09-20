package cn.ibizlab.runner.servicerunner.harness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Result of a recovery scan, including deadline-expired Runs handled in place.
 */
public final class HarnessRecoveryBatch {

    private final List<HarnessRecoveryClaim> claims;
    private final int expiredCount;

    HarnessRecoveryBatch(List<HarnessRecoveryClaim> claims, int expiredCount) {
        this.claims = Collections.unmodifiableList(
                new ArrayList<HarnessRecoveryClaim>(claims));
        this.expiredCount = expiredCount;
    }

    public List<HarnessRecoveryClaim> getClaims() {
        return claims;
    }

    public int getExpiredCount() {
        return expiredCount;
    }

    public int getHandledCount() {
        return claims.size() + expiredCount;
    }
}
