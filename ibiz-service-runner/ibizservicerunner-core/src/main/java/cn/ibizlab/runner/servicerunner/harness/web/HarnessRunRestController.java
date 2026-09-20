package cn.ibizlab.runner.servicerunner.harness.web;

import cn.ibizlab.runner.servicerunner.harness.HarnessCoordinator;
import cn.ibizlab.runner.servicerunner.harness.HarnessEventReplay;
import cn.ibizlab.runner.servicerunner.harness.HarnessEventReplayCursor;
import cn.ibizlab.runner.servicerunner.harness.HarnessEventReplayService;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunDTO;
import cn.ibizlab.runner.servicerunner.harness.dto.AIRunEventDTO;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.SystemRuntimeHolder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.annotation.PreDestroy;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("")
public class HarnessRunRestController {

    private static final Log log =
            LogFactory.getLog(HarnessRunRestController.class);
    private static final long DEFAULT_STREAM_TIMEOUT_MS = 360000L;
    private static final long DEFAULT_IDLE_TIMEOUT_MS = 300000L;
    private static final long DEFAULT_HEARTBEAT_MS = 15000L;
    private static final long DEFAULT_POLL_INTERVAL_MS = 1000L;
    private static final int MAX_REPLAY_PAGES_PER_POLL = 10;

    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(2, new StreamThreadFactory());

    @Autowired
    private IServiceHub serviceHub;

    @Autowired
    private HarnessCoordinator coordinator;

    @Autowired
    private HarnessEventReplayService replayService;

    @Value("${ibiz.harness.sse.stream-timeout-ms:360000}")
    private long streamTimeoutMs = DEFAULT_STREAM_TIMEOUT_MS;

    @Value("${ibiz.harness.sse.idle-timeout-ms:300000}")
    private long idleTimeoutMs = DEFAULT_IDLE_TIMEOUT_MS;

    @Value("${ibiz.harness.sse.heartbeat-ms:15000}")
    private long heartbeatMs = DEFAULT_HEARTBEAT_MS;

    @Value("${ibiz.harness.sse.poll-interval-ms:1000}")
    private long pollIntervalMs = DEFAULT_POLL_INTERVAL_MS;

    @GetMapping(
            value = "/{systemId}/harness/runs/{runId}/events",
            produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter streamEvents(
            @PathVariable("systemId") String systemId,
            @PathVariable("runId") String runId,
            @RequestParam(
                    value = "after_cursor",
                    required = false) String afterCursor,
            @RequestParam(
                    value = "limit",
                    defaultValue = "100") int limit,
            @RequestHeader(
                    value = "Last-Event-ID",
                    required = false) String lastEventId) throws Throwable {
        ISystemRuntime systemRuntime =
                serviceHub.getLoadedSystemRuntime(systemId);
        String initialCursor = resolveInitialCursor(
                runId, afterCursor, lastEventId);
        withSystemRuntime(
                systemRuntime,
                () -> replayService.getRun(systemRuntime, runId));

        SseEmitter emitter = new SseEmitter(positive(
                streamTimeoutMs, DEFAULT_STREAM_TIMEOUT_MS));
        StreamConnection connection = new StreamConnection(
                systemRuntime,
                runId,
                initialCursor,
                limit,
                emitter);
        emitter.onCompletion(connection::close);
        emitter.onTimeout(connection::complete);
        emitter.onError(error -> connection.close());
        connection.start();
        return emitter;
    }

    @PostMapping("/{systemId}/harness/runs/{runId}/cancel")
    public AIRunDTO cancelRun(
            @PathVariable("systemId") String systemId,
            @PathVariable("runId") String runId) throws Throwable {
        ISystemRuntime systemRuntime =
                serviceHub.getLoadedSystemRuntime(systemId);
        return withSystemRuntime(
                systemRuntime,
                () -> coordinator.requestCancel(
                        systemRuntime, runId, currentActorId()));
    }

    @PreDestroy
    public void shutdown() {
        scheduler.shutdownNow();
    }

    static String resolveInitialCursor(String runId,
                                       String afterCursor,
                                       String lastEventId) {
        if (afterCursor != null && !afterCursor.trim().isEmpty()) {
            HarnessEventReplayCursor cursor =
                    HarnessEventReplayCursor.decode(afterCursor);
            if (!runId.equals(cursor.getRunId())) {
                throw new IllegalArgumentException(
                        "after_cursor belongs to another Run");
            }
            return afterCursor.trim();
        }
        if (lastEventId == null || lastEventId.trim().isEmpty()) {
            return null;
        }
        String value = lastEventId.trim();
        try {
            long sequence = Long.parseLong(value);
            return HarnessEventReplayCursor.encode(runId, sequence);
        } catch (NumberFormatException ex) {
            HarnessEventReplayCursor cursor =
                    HarnessEventReplayCursor.decode(value);
            if (!runId.equals(cursor.getRunId())) {
                throw new IllegalArgumentException(
                        "Last-Event-ID belongs to another Run");
            }
            return value;
        }
    }

    static boolean isTerminalStatus(String status) {
        return "completed".equalsIgnoreCase(status)
                || "failed".equalsIgnoreCase(status)
                || "cancelled".equalsIgnoreCase(status);
    }

    private String currentActorId() {
        IUserContext context = UserContext.getCurrent();
        if (context == null || context.getUserid() == null) {
            return null;
        }
        String userId = context.getUserid().trim();
        return userId.isEmpty() ? null : userId;
    }

    private long positive(long value, long fallback) {
        return value > 0L ? value : fallback;
    }

    private <T> T withSystemRuntime(
            ISystemRuntime systemRuntime,
            ThrowableSupplier<T> supplier) throws Throwable {
        SystemRuntimeHolder.push(systemRuntime);
        try {
            return supplier.get();
        } finally {
            SystemRuntimeHolder.poll();
        }
    }

    private final class StreamConnection {

        private final ISystemRuntime systemRuntime;
        private final String runId;
        private final int limit;
        private final SseEmitter emitter;
        private final AtomicBoolean closed = new AtomicBoolean();
        private final AtomicReference<ScheduledFuture<?>> future =
                new AtomicReference<ScheduledFuture<?>>();

        private volatile String cursor;
        private volatile long lastDataAt = System.currentTimeMillis();
        private volatile long lastHeartbeatAt = System.currentTimeMillis();

        private StreamConnection(ISystemRuntime systemRuntime,
                                 String runId,
                                 String cursor,
                                 int limit,
                                 SseEmitter emitter) {
            this.systemRuntime = systemRuntime;
            this.runId = runId;
            this.cursor = cursor;
            this.limit = limit;
            this.emitter = emitter;
        }

        private void start() {
            long interval = positive(
                    pollIntervalMs, DEFAULT_POLL_INTERVAL_MS);
            ScheduledFuture<?> scheduled = scheduler.scheduleWithFixedDelay(
                    this::pollSafely, 0L, interval, TimeUnit.MILLISECONDS);
            if (!future.compareAndSet(null, scheduled)) {
                scheduled.cancel(false);
            }
            if (closed.get()) {
                cancelFuture();
            }
        }

        private void pollSafely() {
            if (closed.get()) {
                return;
            }
            SystemRuntimeHolder.push(systemRuntime);
            try {
                poll();
            } catch (IOException ex) {
                close();
            } catch (Throwable ex) {
                if (closed.compareAndSet(false, true)) {
                    cancelFuture();
                    emitter.completeWithError(ex);
                }
                log.warn(String.format(
                        "[HARNESS-SSE] run=%1$s stream failed: %2$s",
                        runId, ex.getMessage()), ex);
            } finally {
                SystemRuntimeHolder.poll();
            }
        }

        private void poll() throws Throwable {
            int page = 0;
            boolean sentData = false;
            HarnessEventReplay replay;
            do {
                replay = replayService.replay(
                        systemRuntime, runId, cursor, limit);
                for (AIRunEventDTO event : replay.getEvents()) {
                    emitter.send(SseEmitter.event()
                            .id(String.valueOf(event.getSequence()))
                            .name(event.getEventType())
                            .data(event));
                    sentData = true;
                }
                cursor = replay.getNextCursor();
                page++;
            } while (replay.isHasMore()
                    && page < MAX_REPLAY_PAGES_PER_POLL
                    && !closed.get());

            long currentTime = System.currentTimeMillis();
            if (sentData) {
                lastDataAt = currentTime;
            }
            AIRunDTO run = replayService.getRun(systemRuntime, runId);
            if (isTerminalStatus(run.getStatus())) {
                sendEnd(run, replay.getLastSequence());
                complete();
                return;
            }
            if (currentTime - lastDataAt >= positive(
                    idleTimeoutMs, DEFAULT_IDLE_TIMEOUT_MS)) {
                sendIdleTimeout(replay.getLastSequence());
                complete();
                return;
            }
            if (currentTime - lastHeartbeatAt >= positive(
                    heartbeatMs, DEFAULT_HEARTBEAT_MS)) {
                emitter.send(SseEmitter.event()
                        .name("heartbeat")
                        .data(heartbeatData(replay.getLastSequence())));
                lastHeartbeatAt = currentTime;
            }
        }

        private void sendEnd(AIRunDTO run, long lastSequence)
                throws IOException {
            Map<String, Object> data = new LinkedHashMap<String, Object>();
            data.put("run_id", runId);
            data.put("status", run.getStatus());
            data.put("last_sequence", lastSequence);
            emitter.send(SseEmitter.event()
                    .id(String.valueOf(lastSequence))
                    .name("run.end")
                    .data(data));
        }

        private void sendIdleTimeout(long lastSequence)
                throws IOException {
            Map<String, Object> data = new LinkedHashMap<String, Object>();
            data.put("run_id", runId);
            data.put("last_sequence", lastSequence);
            emitter.send(SseEmitter.event()
                    .name("stream.idle_timeout")
                    .data(data));
        }

        private Map<String, Object> heartbeatData(long lastSequence) {
            Map<String, Object> data = new LinkedHashMap<String, Object>();
            data.put("run_id", runId);
            data.put("last_sequence", lastSequence);
            return data;
        }

        private void complete() {
            if (closed.compareAndSet(false, true)) {
                cancelFuture();
                emitter.complete();
            }
        }

        private void close() {
            if (closed.compareAndSet(false, true)) {
                cancelFuture();
            }
        }

        private void cancelFuture() {
            ScheduledFuture<?> scheduled = future.get();
            if (scheduled != null) {
                scheduled.cancel(false);
            }
        }
    }

    private interface ThrowableSupplier<T> {
        T get() throws Throwable;
    }

    private static final class StreamThreadFactory
            implements ThreadFactory {

        private final AtomicInteger sequence = new AtomicInteger();

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(
                    runnable,
                    "harness-sse-" + sequence.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }
}
