package cn.ibizlab.runner.servicerunner.harness;

import cn.ibizlab.runner.servicerunner.harness.dto.AIRunEventDTO;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HarnessEventReplay {

    private final List<AIRunEventDTO> events;
    private final String nextCursor;
    private final long lastSequence;
    private final boolean hasMore;

    public HarnessEventReplay(List<AIRunEventDTO> events,
                              String nextCursor,
                              long lastSequence,
                              boolean hasMore) {
        this.events = Collections.unmodifiableList(
                new ArrayList<AIRunEventDTO>(events));
        this.nextCursor = nextCursor;
        this.lastSequence = lastSequence;
        this.hasMore = hasMore;
    }

    public List<AIRunEventDTO> getEvents() {
        return events;
    }

    @JsonProperty("next_cursor")
    public String getNextCursor() {
        return nextCursor;
    }

    @JsonProperty("last_sequence")
    public long getLastSequence() {
        return lastSequence;
    }

    @JsonProperty("has_more")
    public boolean isHasMore() {
        return hasMore;
    }
}
