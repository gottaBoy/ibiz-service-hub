package net.ibizsys.runtime.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActionSessionManagerExecutionTest {

    @BeforeEach
    void requireCleanThread() {
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @AfterEach
    void closeReplacementOwnedByTheTest() {
        ActionSessionManager.closeSession(false);
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void successfulOwnedExecutionClosesOnlyCommitCallbacksAndPreservesTheResult() throws Throwable {
        List<String> callbacks = new ArrayList<>();
        Object expected = new Object();
        Object actual = execute(args -> {
            ActionSession owner = ActionSessionManager.getCurrentSessionMust();
            owner.registerFutureAction(callbacks(callbacks));
            return expected;
        });

        assertSame(expected, actual);
        assertEquals(Arrays.asList("commit"), callbacks);
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void actionFailureRetainsTheSameThrowableAfterSuccessfulRollback() {
        Throwable expected = new Exception("owned action failure");
        List<String> callbacks = new ArrayList<>();
        Throwable actual = assertThrows(Throwable.class, () -> execute(args -> {
            ActionSessionManager.getCurrentSessionMust().registerFutureAction(callbacks(callbacks));
            throw expected;
        }));

        assertSame(expected, actual);
        assertEquals(Arrays.asList("rollback"), callbacks);
        assertEquals(0, actual.getSuppressed().length);
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void rollbackExceptionIsSuppressedOnTheOriginalActionFailure() {
        assertRollbackFailurePreservesOriginal(
                new Exception("original checked failure"),
                new IllegalStateException("secondary rollback failure"));
    }

    @Test
    void rollbackErrorIsSuppressedOnTheOriginalActionError() {
        assertRollbackFailurePreservesOriginal(
                new AssertionError("original action error"),
                new AssertionError("secondary rollback error"));
    }

    private void assertRollbackFailurePreservesOriginal(Throwable original, Throwable secondary) {
        AtomicBoolean rolledBack = new AtomicBoolean();
        Throwable actual = assertThrows(Throwable.class, () -> execute(args -> {
            ActionSessionManager.getCurrentSessionMust().registerFutureAction(new ASFutureActionBase() {
                @Override
                public void commit() {
                    throw new AssertionError("A failed action cannot commit.");
                }

                @Override
                public void rollback() {
                    rolledBack.set(true);
                    throwUnchecked(secondary);
                }
            });
            throw original;
        }));

        assertSame(original, actual);
        assertTrue(rolledBack.get());
        assertEquals(1, actual.getSuppressed().length);
        assertSame(secondary, actual.getSuppressed()[0]);
        assertNull(ActionSessionManager.getCurrentSession());
        ActionSessionManager.closeSession(false);
        assertEquals(1, actual.getSuppressed().length, "A later close cannot replay the failed rollback.");
    }

    @Test
    void rollbackRethrowingTheActionFailureDoesNotAttemptSelfSuppression() {
        RuntimeException expected = new IllegalStateException("shared failure instance");
        Throwable actual = assertThrows(Throwable.class, () -> execute(args -> {
            ActionSessionManager.getCurrentSessionMust().registerFutureAction(new ASFutureActionBase() {
                @Override
                public void commit() {
                    throw new AssertionError("A failed action cannot commit.");
                }

                @Override
                public void rollback() {
                    throw expected;
                }
            });
            throw expected;
        }));

        assertSame(expected, actual);
        assertEquals(0, actual.getSuppressed().length);
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void failedCommitPropagatesWithoutAttemptingRollbackOrRetryingCallbacks() {
        assertCommitFailureDoesNotRollback(new IllegalStateException("owned commit failure"));
    }

    @Test
    void failedCommitErrorPropagatesWithoutAttemptingRollbackOrRetryingCallbacks() {
        assertCommitFailureDoesNotRollback(new AssertionError("owned commit error"));
    }

    private void assertCommitFailureDoesNotRollback(Throwable expected) {
        List<String> callbacks = new ArrayList<>();
        Throwable actual = assertThrows(Throwable.class, () -> execute(args -> {
            ActionSessionManager.getCurrentSessionMust().registerFutureAction(new ASFutureActionBase() {
                @Override
                public void commit() {
                    callbacks.add("commit");
                    throwUnchecked(expected);
                }

                @Override
                public void rollback() {
                    callbacks.add("unexpected-rollback");
                }
            });
            return "completed action";
        }));

        assertSame(expected, actual);
        assertEquals(Arrays.asList("commit"), callbacks);
        assertEquals(0, actual.getSuppressed().length);
        assertNull(ActionSessionManager.getCurrentSession());
        ActionSessionManager.closeSession(false);
        assertEquals(Arrays.asList("commit"), callbacks);
    }

    @Test
    void successfulActionCannotCommitItsReplacementSession() throws Throwable {
        assertActionReplacementSurvives(false);
    }

    @Test
    void failedActionCannotRollbackItsReplacementSession() throws Throwable {
        assertActionReplacementSurvives(true);
    }

    private void assertActionReplacementSurvives(boolean fail) throws Throwable {
        AtomicReference<ActionSession> original = new AtomicReference<>();
        AtomicReference<ActionSession> replacement = new AtomicReference<>();
        List<String> callbacks = new ArrayList<>();
        Throwable expected = new Exception("action failed after replacing its session");
        IAction action = args -> {
            original.set(ActionSessionManager.getCurrentSessionMust());
            ActionSessionManager.closeSession(true);
            replacement.set(ActionSessionManager.openSession("replacement"));
            replacement.get().setActionParam("CACHE_replacement", "owned replacement grant");
            replacement.get().registerFutureAction(callbacks(callbacks));
            if (fail) throw expected;
            return "completed action";
        };

        if (fail) assertSame(expected, assertThrows(Throwable.class, () -> execute(action)));
        else assertEquals("completed action", execute(action));

        assertNotSame(original.get(), replacement.get());
        assertSame(replacement.get(), ActionSessionManager.getCurrentSession());
        assertEquals("owned replacement grant", replacement.get().getActionParam("CACHE_replacement"));
        assertTrue(callbacks.isEmpty(), "The executor cannot close a session opened by its action.");
        ActionSessionManager.closeSession(false);
        assertEquals(Arrays.asList("rollback"), callbacks);
    }

    @Test
    void failedCommitCallbackCannotCloseItsReplacementSession() {
        assertCloseReplacementSurvives(true);
    }

    @Test
    void failedRollbackCallbackPreservesItsReplacementAndOriginalActionFailure() {
        assertCloseReplacementSurvives(false);
    }

    private void assertCloseReplacementSurvives(boolean commit) {
        AtomicReference<ActionSession> replacement = new AtomicReference<>();
        AtomicBoolean recursive = new AtomicBoolean();
        List<String> replacementCallbacks = new ArrayList<>();
        RuntimeException closeFailure = new IllegalStateException("close failed after replacement");
        Throwable actionFailure = new Exception("original action failure");
        Throwable actual = assertThrows(Throwable.class, () -> execute(args -> {
            ActionSession original = ActionSessionManager.getCurrentSessionMust();
            original.registerFutureAction(new ASFutureActionBase() {
                private void replace() {
                    if (recursive.compareAndSet(false, true)) {
                        ActionSessionManager.closeSession(commit);
                        assertNull(ActionSessionManager.getCurrentSession());
                        replacement.set(ActionSessionManager.openSession("callback replacement"));
                        replacement.get().registerFutureAction(callbacks(replacementCallbacks));
                        throw closeFailure;
                    }
                }

                @Override
                public void commit() {
                    replace();
                }

                @Override
                public void rollback() {
                    replace();
                }
            });
            if (!commit) throw actionFailure;
            return "completed action";
        }));

        if (commit) {
            assertSame(closeFailure, actual);
            assertEquals(0, actual.getSuppressed().length);
        } else {
            assertSame(actionFailure, actual);
            assertEquals(1, actual.getSuppressed().length);
            assertSame(closeFailure, actual.getSuppressed()[0]);
        }
        assertSame(replacement.get(), ActionSessionManager.getCurrentSession());
        assertTrue(replacementCallbacks.isEmpty(), "No secondary close can target the replacement.");
        ActionSessionManager.closeSession(false);
        assertEquals(Arrays.asList("rollback"), replacementCallbacks);
    }

    @Test
    void reusedLegacySessionIsNotClosedOnSuccessOrFailure() throws Throwable {
        ActionSession outer = ActionSessionManager.openSession("outer");
        List<String> callbacks = new ArrayList<>();
        outer.registerFutureAction(callbacks(callbacks));
        assertEquals("result", execute(args -> {
            assertSame(outer, ActionSessionManager.openSession("inner"));
            return "result";
        }));
        Throwable failure = new Exception("inner action failure");
        assertSame(failure, assertThrows(Throwable.class, () -> execute(args -> {
            assertSame(outer, ActionSessionManager.getCurrentSession());
            throw failure;
        })));

        assertSame(outer, ActionSessionManager.getCurrentSession());
        assertEquals("outer", outer.getName());
        assertTrue(callbacks.isEmpty());
        ActionSessionManager.closeSession(true);
        assertEquals(Arrays.asList("commit"), callbacks);
    }

    private static Object execute(IAction action) throws Throwable {
        return ActionSessionManager.execute(action, null, ITransactionalUtil.PROPAGATION_UNKNOWN);
    }

    private static ASFutureActionBase callbacks(List<String> events) {
        return new ASFutureActionBase() {
            @Override
            public void commit() {
                events.add("commit");
            }

            @Override
            public void rollback() {
                events.add("rollback");
            }
        };
    }

    private static void throwUnchecked(Throwable failure) {
        if (failure instanceof Error) throw (Error) failure;
        if (failure instanceof RuntimeException) throw (RuntimeException) failure;
        throw new AssertionError("Test callback failures must be unchecked", failure);
    }
}
