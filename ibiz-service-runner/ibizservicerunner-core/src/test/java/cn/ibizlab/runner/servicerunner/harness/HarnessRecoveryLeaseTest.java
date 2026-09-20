package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HarnessRecoveryLeaseTest {

    @Test
    void renewsUntilClosed() throws Exception {
        AtomicInteger renewals = new AtomicInteger();
        CountDownLatch renewedTwice = new CountDownLatch(2);
        HarnessRecoveryLease lease = new HarnessRecoveryLease(
                claim(),
                10L,
                () -> {
                    renewals.incrementAndGet();
                    renewedTwice.countDown();
                    return true;
                });
        try {
            lease.start();
            assertTrue(renewedTwice.await(2, TimeUnit.SECONDS));
            assertTrue(lease.isActive());
        } finally {
            lease.close();
        }
        int completedRenewals = renewals.get();
        Thread.sleep(50L);
        assertTrue(renewals.get() == completedRenewals);
    }

    @Test
    void rejectedRenewalMarksClaimInactive() throws Exception {
        CountDownLatch attempted = new CountDownLatch(1);
        HarnessRecoveryLease lease = new HarnessRecoveryLease(
                claim(),
                10L,
                () -> {
                    attempted.countDown();
                    return false;
                });
        try {
            lease.start();
            assertTrue(attempted.await(2, TimeUnit.SECONDS));
            assertFalse(lease.isActive());
        } finally {
            lease.close();
        }
    }

    @Test
    void transientRenewalFailureAllowsLaterRetry() throws Exception {
        AtomicInteger attempts = new AtomicInteger();
        CountDownLatch retried = new CountDownLatch(2);
        HarnessRecoveryLease lease = new HarnessRecoveryLease(
                claim(),
                10L,
                () -> {
                    int attempt = attempts.incrementAndGet();
                    retried.countDown();
                    if (attempt == 1) {
                        throw new IllegalStateException("temporary database error");
                    }
                    return true;
                });
        try {
            lease.start();
            assertTrue(retried.await(2, TimeUnit.SECONDS));
            assertTrue(lease.isActive());
            assertTrue(attempts.get() >= 2);
        } finally {
            lease.close();
        }
    }

    private static HarnessRecoveryClaim claim() {
        return new HarnessRecoveryClaim(
                new AIRunDTO().setId("run-01"),
                "worker-01",
                1,
                new Timestamp(System.currentTimeMillis() + 60000L));
    }
}
