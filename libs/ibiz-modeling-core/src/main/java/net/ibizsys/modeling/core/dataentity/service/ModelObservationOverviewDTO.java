package net.ibizsys.modeling.core.dataentity.service;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The complete overview projection. No input or system configuration is returned.
 */
public final class ModelObservationOverviewDTO {
    private final long sysAppCnt;
    private final long sysDECnt;
    private final long serviceAPICnt;
    private final long pfPluginCnt;
    private final long sfPluginCnt;

    ModelObservationOverviewDTO(long[] counts) {
        if (counts.length != 5) {
            throw new IllegalArgumentException("Five overview counts are required");
        }
        for (long count : counts) {
            if (count < 0) {
                throw new IllegalArgumentException("Overview counts cannot be negative");
            }
        }
        sysAppCnt = counts[0];
        sysDECnt = counts[1];
        serviceAPICnt = counts[2];
        pfPluginCnt = counts[3];
        sfPluginCnt = counts[4];
    }

    @JsonProperty("sysappcnt")
    public long getSysAppCnt() {
        return sysAppCnt;
    }

    @JsonProperty("sysdecnt")
    public long getSysDECnt() {
        return sysDECnt;
    }

    @JsonProperty("serviceapicnt")
    public long getServiceAPICnt() {
        return serviceAPICnt;
    }

    @JsonProperty("pfplugincnt")
    public long getPFPluginCnt() {
        return pfPluginCnt;
    }

    @JsonProperty("sfplugincnt")
    public long getSFPluginCnt() {
        return sfPluginCnt;
    }
}
