package net.ibizsys.runtime.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActionSessionManagerCleanupTest {

    @BeforeEach
    void requireCleanThread() {
        assertNull(ActionSessionManager.getCurrentSession());
        assertNull(UserContext.getCurrent());
    }

    @AfterEach
    void closeOwnedThreadSession() {
        try {
            ActionSessionManager.closeSession(false);
        } finally {
            UserContext.setCurrent(null);
        }
    }

    @Test
    void legacyOpenRemainsIdempotentAndDoesNotRenameOrNestTheSession() {
        ActionSession first = ActionSessionManager.openSession("first");
        first.setIgnoreCheck(true);
        first.setActionParam("CACHE_owned", "grant");

        assertSame(first, ActionSessionManager.openSession("second"));
        assertSame(first, ActionSessionManager.openSession());
        assertSame(first, ActionSessionManager.getCurrentSession(true));
        assertSame(first, ActionSessionManager.getCurrentSessionMust());
        assertEquals("first", first.getName());
        assertTrue(first.isIgnoreCheck());
        assertEquals("grant", first.getActionParam("CACHE_owned"));
    }

    @Test
    void successfulCommitPreservesCallbackContextThenRemovesTheSession() {
        ActionSession session = ActionSessionManager.openSession("owned");
        IUserContext principal = user("owned-principal");
        IAppContext context = AppContext.newInstance(null);
        context.set("PSDEVSLNSYS", "owned-root");
        session.setUserContext(principal);
        session.setAppContext(context);
        session.setInTransaction(true);
        List<String> events = new ArrayList<>();

        session.registerFutureAction(new ASFutureActionBase() {
            @Override
            public void commit() {
                assertSame(session, ActionSessionManager.getCurrentSession());
                assertSame(principal, ActionSessionManager.getUserContext());
                assertSame(context, ActionSessionManager.getAppContext());
                assertTrue(ActionSessionManager.getCurrentSessionMust().isInTransaction());
                events.add("first");
            }
        });
        session.registerFutureAction(new ASFutureActionBase() {
            @Override
            public void commit() {
                events.add("second");
            }
        });

        ActionSessionManager.closeSession(true);

        assertEquals(Arrays.asList("first", "second"), events);
        assertNull(ActionSessionManager.getCurrentSession());
        assertNull(ActionSessionManager.getUserContext());
        assertNull(ActionSessionManager.getAppContext());
    }

    @Test
    void rollbackRunsOnlyRollbackCallbacksInTheirOriginalOrder() {
        ActionSession session = ActionSessionManager.openSession();
        List<String> events = new ArrayList<>();
        for (String name : Arrays.asList("first", "second")) {
            session.registerFutureAction(new ASFutureActionBase() {
                @Override
                public void commit() {
                    events.add("unexpected-commit");
                }

                @Override
                public void rollback() {
                    assertSame(session, ActionSessionManager.getCurrentSession());
                    events.add(name);
                }
            });
        }

        ActionSessionManager.closeSession(false);

        assertEquals(Arrays.asList("first", "second"), events);
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void commitCallbackFailurePropagatesTheSameExceptionAndRemovesTheSession() {
        RuntimeException failure = new IllegalStateException("owned commit failure");
        assertFailingCloseClearsSession(true, failure);
    }

    @Test
    void rollbackCallbackFailurePropagatesTheSameExceptionAndRemovesTheSession() {
        RuntimeException failure = new IllegalStateException("owned rollback failure");
        assertFailingCloseClearsSession(false, failure);
    }

    private void assertFailingCloseClearsSession(boolean commit, RuntimeException failure) {
        ActionSession session = ActionSessionManager.openSession();
        AtomicBoolean laterCallback = new AtomicBoolean();
        session.setUserContext(user("old-principal"));
        session.setAppContext(new AppContext());
        session.setIgnoreCheck(true);
        session.setActionParam("CACHE_owned", "old-grant");
        session.registerFutureAction(new ASFutureActionBase() {
            @Override
            public void commit() {
                if (commit) {
                    throw failure;
                }
            }

            @Override
            public void rollback() {
                if (!commit) {
                    throw failure;
                }
            }
        });
        session.registerFutureAction(new ASFutureActionBase() {
            @Override
            public void commit() {
                laterCallback.set(true);
            }

            @Override
            public void rollback() {
                laterCallback.set(true);
            }
        });

        assertSame(failure, assertThrows(RuntimeException.class,
                () -> ActionSessionManager.closeSession(commit)));
        assertFalse(laterCallback.get(), "Closing remains fail-fast; later callbacks are not retried.");
        assertNull(ActionSessionManager.getCurrentSession());
        assertNull(ActionSessionManager.getUserContext());
        assertNull(ActionSessionManager.getAppContext());
        ActionSessionManager.closeSession(!commit);
        assertFalse(laterCallback.get(), "A later close must not replay the failed session's callbacks.");
        ActionSession fresh = ActionSessionManager.openSession("next-request");
        assertNotSame(session, fresh);
        assertNull(fresh.getUserContext(true));
        assertNull(fresh.getAppContext(true));
        assertNull(fresh.getActionParam("CACHE_owned"));
        assertFalse(fresh.isIgnoreCheck());
        assertFalse(fresh.isInTransaction());
    }

    @Test
    void callbackErrorAlsoRemovesTheSessionWithoutConvertingTheError() {
        ActionSession session = ActionSessionManager.openSession();
        AssertionError failure = new AssertionError("owned callback error");
        session.registerFutureAction(new ASFutureActionBase() {
            @Override
            public void commit() {
                throw failure;
            }
        });

        assertSame(failure, assertThrows(AssertionError.class,
                () -> ActionSessionManager.closeSession(true)));
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void closingNoSessionOrClosingTwiceDoesNotReplayCallbacks() {
        ActionSessionManager.closeSession(true);
        ActionSession session = ActionSessionManager.openSession();
        List<String> events = new ArrayList<>();
        session.registerFutureAction(new ASFutureActionBase() {
            @Override
            public void commit() {
                events.add("commit");
            }

            @Override
            public void rollback() {
                events.add("rollback");
            }
        });

        ActionSessionManager.closeSession(true);
        ActionSessionManager.closeSession(false);
        ActionSessionManager.closeSession(true);

        assertEquals(Arrays.asList("commit"), events);
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void failedCloseDoesNotClearTheSeparatelyOwnedRequestUserContext() {
        IUserContext requestUser = user("request-user");
        IUserContext sessionUser = user("session-user");
        UserContext.setCurrent(requestUser);
        ActionSession session = ActionSessionManager.openSession();
        session.setUserContext(sessionUser);
        session.registerFutureAction(new ASFutureActionBase() {
            @Override
            public void commit() {
                assertSame(sessionUser, ActionSessionManager.getUserContext());
                throw new IllegalStateException("owned callback failure");
            }
        });

        assertThrows(IllegalStateException.class, () -> ActionSessionManager.closeSession(true));

        assertNull(ActionSessionManager.getCurrentSession());
        assertSame(requestUser, UserContext.getCurrent());
        assertSame(requestUser, ActionSessionManager.getUserContext());
    }

    @Test
    void aNewSessionOpenedByACommitCallbackSurvivesOuterClose() {
        assertReplacementSessionSurvives(true, false);
    }

    @Test
    void aNewSessionOpenedByARollbackCallbackSurvivesOuterClose() {
        assertReplacementSessionSurvives(false, false);
    }

    @Test
    void callbackFailureCannotClearItsReplacementSession() {
        assertReplacementSessionSurvives(true, true);
    }

    private void assertReplacementSessionSurvives(boolean commit, boolean failAfterReplacement) {
        ActionSession original = ActionSessionManager.openSession("original");
        AtomicBoolean recursiveClose = new AtomicBoolean();
        AtomicReference<ActionSession> replacement = new AtomicReference<>();
        RuntimeException failure = new IllegalStateException("after replacement");
        original.registerFutureAction(new ASFutureActionBase() {
            private void closeOriginalAndOpenReplacement() {
                if (recursiveClose.compareAndSet(false, true)) {
                    ActionSessionManager.closeSession(commit);
                    assertNull(ActionSessionManager.getCurrentSession());
                    replacement.set(ActionSessionManager.openSession("replacement"));
                    replacement.get().setActionParam("CACHE_new", "new-grant");
                    if (failAfterReplacement) {
                        throw failure;
                    }
                }
            }

            @Override
            public void commit() {
                closeOriginalAndOpenReplacement();
            }

            @Override
            public void rollback() {
                closeOriginalAndOpenReplacement();
            }
        });

        if (failAfterReplacement) {
            assertSame(failure, assertThrows(RuntimeException.class,
                    () -> ActionSessionManager.closeSession(commit)));
        } else {
            ActionSessionManager.closeSession(commit);
        }

        assertNotSame(original, replacement.get());
        assertSame(replacement.get(), ActionSessionManager.getCurrentSession());
        assertEquals("new-grant", ActionSessionManager.getCurrentSessionMust().getActionParam("CACHE_new"));
        ActionSessionManager.closeSession(false);
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void executeReusesAndDoesNotCloseAnExistingLegacySession() throws Throwable {
        ActionSession original = ActionSessionManager.openSession("outer");
        AtomicBoolean closed = new AtomicBoolean();
        original.registerFutureAction(new ASFutureActionBase() {
            @Override
            public void commit() {
                closed.set(true);
            }
        });

        Object result = ActionSessionManager.execute(args -> {
            assertSame(original, ActionSessionManager.openSession("inner"));
            original.setActionParam("CACHE_owned", "same-session");
            return "result";
        }, null, ITransactionalUtil.PROPAGATION_UNKNOWN);

        assertEquals("result", result);
        assertFalse(closed.get());
        assertSame(original, ActionSessionManager.getCurrentSession());
        assertEquals("same-session", original.getActionParam("CACHE_owned"));
    }

    @Test
    void executeOwnedSessionCleansUpWhenItsCloseCallbackFails() {
        RuntimeException failure = new IllegalStateException("owned execute close");
        RuntimeException observed = assertThrows(RuntimeException.class, () ->
            ActionSessionManager.execute(args -> {
                ActionSessionManager.getCurrentSessionMust().registerFutureAction(new ASFutureActionBase() {
                    @Override
                    public void commit() {
                        throw failure;
                    }
                });
                return "result";
            }, null, ITransactionalUtil.PROPAGATION_UNKNOWN));

        assertSame(failure, observed);
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void executeFailureRollsBackItsCallbacksThenCleansUpWithoutChangingTheOriginalException() {
        RuntimeException failure = new IllegalArgumentException("owned operation failure");
        AtomicBoolean rolledBack = new AtomicBoolean();
        RuntimeException observed = assertThrows(RuntimeException.class, () ->
            ActionSessionManager.execute(args -> {
                ActionSessionManager.getCurrentSessionMust().registerFutureAction(new ASFutureActionBase() {
                    @Override
                    public void commit() {
                        throw new AssertionError("commit must not run");
                    }

                    @Override
                    public void rollback() {
                        rolledBack.set(true);
                    }
                });
                throw failure;
            }, null, ITransactionalUtil.PROPAGATION_UNKNOWN));

        assertSame(failure, observed);
        assertTrue(rolledBack.get());
        assertNull(ActionSessionManager.getCurrentSession());
    }

    @Test
    void aReusedWorkerDoesNotInheritIdentityOrCachedPermissionAfterFailedClose() throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<ActionSession> first = executor.submit(() -> {
                assertNull(ActionSessionManager.getCurrentSession());
                ActionSession session = ActionSessionManager.openSession("old-request");
                session.setUserContext(user("old-user"));
                session.setAppContext(new AppContext());
                session.getAppContext().set("PSDEVSLNSYS", "old-root");
                session.setIgnoreCheck(true);
                session.setActionParam("CACHE_owned", "old-grant");
                session.registerFutureAction(new ASFutureActionBase() {
                    @Override
                    public void commit() {
                        throw new IllegalStateException("worker close failed");
                    }
                });
                assertThrows(IllegalStateException.class, () -> ActionSessionManager.closeSession(true));
                return session;
            });
            ActionSession previous = first.get(5, TimeUnit.SECONDS);
            Future<Void> second = executor.submit(() -> {
                assertNull(ActionSessionManager.getCurrentSession());
                assertNull(ActionSessionManager.getUserContext());
                assertNull(ActionSessionManager.getAppContext());
                ActionSession session = ActionSessionManager.openSession("new-request");
                try {
                    assertNotSame(previous, session);
                    assertNull(session.getActionParam("CACHE_owned"));
                    assertNull(session.getUserContext(true));
                    assertNull(session.getAppContext(true));
                    assertFalse(session.isIgnoreCheck());
                } finally {
                    ActionSessionManager.closeSession(false);
                }
                return null;
            });
            second.get(5, TimeUnit.SECONDS);
        } finally {
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
        }
    }

    @Test
    void oneThreadsFailedCloseCannotClearAnotherThreadsSession() throws Exception {
        ActionSession main = ActionSessionManager.openSession("main");
        main.setActionParam("CACHE_owned", "main-grant");
        CountDownLatch workerOpened = new CountDownLatch(1);
        CountDownLatch finish = new CountDownLatch(1);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            Future<Void> worker = executor.submit(() -> {
                assertNull(ActionSessionManager.getCurrentSession());
                ActionSession local = ActionSessionManager.openSession("worker");
                try {
                    assertNotSame(main, local);
                    assertNull(local.getActionParam("CACHE_owned"));
                    workerOpened.countDown();
                    assertTrue(finish.await(5, TimeUnit.SECONDS));
                    local.registerFutureAction(new ASFutureActionBase() {
                        @Override
                        public void commit() {
                            throw new IllegalStateException("worker close failed");
                        }
                    });
                    assertThrows(IllegalStateException.class, () -> ActionSessionManager.closeSession(true));
                    assertNull(ActionSessionManager.getCurrentSession());
                    return null;
                } finally {
                    ActionSessionManager.closeSession(false);
                }
            });
            assertTrue(workerOpened.await(5, TimeUnit.SECONDS));
            assertSame(main, ActionSessionManager.getCurrentSession());
            finish.countDown();
            worker.get(5, TimeUnit.SECONDS);
            assertSame(main, ActionSessionManager.getCurrentSession());
            assertEquals("main-grant", main.getActionParam("CACHE_owned"));
        } finally {
            finish.countDown();
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
        }
    }

    private static IUserContext user(String userId) {
        return (IUserContext) Proxy.newProxyInstance(
                ActionSessionManagerCleanupTest.class.getClassLoader(),
                new Class<?>[] {IUserContext.class},
                (proxy, method, args) -> {
                    if ("getUserid".equals(method.getName())) {
                        return userId;
                    }
                    if ("toString".equals(method.getName())) {
                        return userId;
                    }
                    if ("hashCode".equals(method.getName())) {
                        return System.identityHashCode(proxy);
                    }
                    if ("equals".equals(method.getName())) {
                        return proxy == args[0];
                    }
                    if (method.getReturnType() == boolean.class) {
                        return false;
                    }
                    return null;
                });
    }
}
