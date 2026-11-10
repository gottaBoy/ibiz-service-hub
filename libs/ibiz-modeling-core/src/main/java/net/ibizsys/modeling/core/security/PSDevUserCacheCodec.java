package net.ibizsys.modeling.core.security;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import java.util.Locale;
import java.util.Objects;

/**
 * Internal cache representation; public user classes retain their JSON exclusions.
 * Decoding preserves grant values but does not replace authorization checks.
 */
public final class PSDevUserCacheCodec {
    public static final int SCHEMA_VERSION = 1;
    public static final String CACHE_KEY_SUFFIX = ":auth-json-v1";

    private PSDevUserCacheCodec() {
    }

    public static String cacheKey(String legacyKey) {
        if (legacyKey == null || legacyKey.isEmpty()) {
            throw new IllegalArgumentException("Missing authorization cache key");
        }
        return legacyKey + CACHE_KEY_SUFFIX;
    }

    public static Entry encode(IPSDevUserBase user) {
        Objects.requireNonNull(user, "user");
        String type;
        int mode;
        boolean admin;
        if (user instanceof IPSDevSysUser) {
            type = IPSDevUserBase.TARGETTYPE_SYS;
            mode = ((IPSDevSysUser) user).getAccMode();
            admin = ((IPSDevSysUser) user).isAdminMode();
        } else if (user instanceof IPSDevSlnUser) {
            type = IPSDevUserBase.TARGETTYPE_SLN;
            mode = ((IPSDevSlnUser) user).getAccMode();
            admin = ((IPSDevSlnUser) user).isAdminMode();
        } else if (user instanceof IPSDevUser) {
            type = IPSDevUserBase.TARGETTYPE_CENTER;
            mode = ((IPSDevUser) user).getAccMode();
            admin = ((IPSDevUser) user).isAdminMode();
        } else {
            throw new IllegalArgumentException("Unsupported authorization user");
        }
        if (!type.equals(user.getTargetType())) {
            throw new IllegalArgumentException("Authorization user type mismatch");
        }
        Timestamp expiry = user.getExpiredTime();
        Entry entry = new Entry(SCHEMA_VERSION, type, mode, admin,
                expiry == null ? null : expiry.getTime(),
                expiry == null ? null : expiry.getNanos());
        entry.psDevCenterId = user.getPSDevCenterId();
        entry.psDevCenterName = user.getPSDevCenterName();
        entry.psDevUserId = user.getPSDevUserId();
        entry.psDevUserName = user.getPSDevUserName();
        entry.taskServerUrl = user.getTaskServerUrl();
        entry.userTag = user.getUserTag();
        entry.userTag2 = user.getUserTag2();
        entry.userTag3 = user.getUserTag3();
        entry.userTag4 = user.getUserTag4();
        entry.studioVer = user.getStudioVer();
        entry.studioTag = user.getStudioTag();
        entry.studioTag2 = user.getStudioTag2();
        entry.retInfo = user.getRetInfo();
        entry.loginName = user.getLoginName();
        entry.studioConsoleId = user.getStudioConsoleId();
        if (user instanceof IPSDevUser) {
            IPSDevUser center = (IPSDevUser) user;
            entry.psdcInstId = center.getPSDCInstId();
            entry.defaultMode = center.isDefaultMode();
            entry.psdcType = center.getPSDCType();
            entry.psdcLevel = center.getPSDCLevel();
        }
        if (user instanceof IPSDevSlnUser) {
            entry.psDevSlnId = ((IPSDevSlnUser) user).getPSDevSlnId();
        }
        if (user instanceof IPSDevSysUser) {
            IPSDevSysUser system = (IPSDevSysUser) user;
            entry.psDevSlnSysId = system.getPSDevSlnSysId();
            entry.psDevSlnSysName = system.getPSDevSlnSysName();
            entry.psDevSlnSysCodeName = system.getPSDevSlnSysCodeName();
            entry.psDevSlnSysLogicName = system.getPSDevSlnSysLogicName();
            entry.psSystemId = system.getPSSystemId();
            entry.psSystemName = system.getPSSystemName();
            entry.psSysModelInstId = system.getPSSysModelInstId();
            entry.curSysModelInstVer = system.getCurSysModelInstVer();
            entry.activeSysModelInstVer = system.getActiveSysModelInstVer();
            entry.devSysState = system.getDevSysState();
        }
        return entry;
    }

    public static IPSDevUserBase decode(
            Entry entry, String expectedType, String expectedObjectId) {
        String type = normalizeType(expectedType);
        if (!IPSDevUserBase.TARGETTYPE_CENTER.equals(type)
                && (expectedObjectId == null || expectedObjectId.isEmpty())) {
            throw new IllegalArgumentException("Missing authorization cache root");
        }
        if (entry == null) {
            return null;
        }
        if (!Integer.valueOf(SCHEMA_VERSION).equals(entry.schemaVersion)
                || !type.equals(entry.targetType)
                || entry.accMode == null || entry.adminMode == null) {
            throw new IllegalArgumentException("Invalid authorization cache header");
        }
        Timestamp expiry = decodeExpiry(entry);
        PSDevUserBase user;
        String objectId;
        if (IPSDevUserBase.TARGETTYPE_SYS.equals(type)) {
            if (entry.curSysModelInstVer == null || entry.activeSysModelInstVer == null
                    || entry.devSysState == null) {
                throw new IllegalArgumentException("Missing cached system metadata");
            }
            PSDevSysUser system = new PSDevSysUser();
            system.setPSDevSlnSysId(entry.psDevSlnSysId);
            system.setPSDevSlnSysName(entry.psDevSlnSysName);
            system.setPSDevSlnSysCodeName(entry.psDevSlnSysCodeName);
            system.setPSDevSlnSysLogicName(entry.psDevSlnSysLogicName);
            system.setPSSystemId(entry.psSystemId);
            system.setPSSystemName(entry.psSystemName);
            system.setPSSysModelInstId(entry.psSysModelInstId);
            system.setCurSysModelInstVer(entry.curSysModelInstVer);
            system.setActiveSysModelInstVer(entry.activeSysModelInstVer);
            system.setDevSysState(entry.devSysState);
            user = system;
            objectId = entry.psDevSlnSysId;
        } else if (IPSDevUserBase.TARGETTYPE_SLN.equals(type)) {
            user = new PSDevSlnUser();
            objectId = entry.psDevSlnId;
        } else {
            if (entry.defaultMode == null || entry.psdcLevel == null) {
                throw new IllegalArgumentException("Missing cached center metadata");
            }
            PSDevUser center = new PSDevUser();
            center.setAccMode(entry.accMode);
            center.setAdminMode(entry.adminMode);
            center.setPSDCInstId(entry.psdcInstId);
            center.setDefaultMode(entry.defaultMode);
            center.setPSDCType(entry.psdcType);
            center.setPSDCLevel(entry.psdcLevel);
            user = center;
            objectId = entry.psDevCenterId;
        }
        if (expectedObjectId != null
                && (objectId == null || !expectedObjectId.equalsIgnoreCase(objectId))) {
            throw new IllegalArgumentException("Authorization cache root mismatch");
        }
        if (user instanceof PSDevSlnUser) {
            PSDevSlnUser scheme = (PSDevSlnUser) user;
            scheme.setPSDevSlnId(entry.psDevSlnId);
            scheme.setAccMode(entry.accMode);
            scheme.setAdminMode(entry.adminMode);
        }
        user.setPSDevCenterId(entry.psDevCenterId);
        user.setPSDevCenterName(entry.psDevCenterName);
        user.setPSDevUserId(entry.psDevUserId);
        user.setPSDevUserName(entry.psDevUserName);
        // The setter removes one trailing slash; cached values are already normalized.
        user.setTaskServerUrl(entry.taskServerUrl != null && entry.taskServerUrl.endsWith("/")
                ? entry.taskServerUrl + "/" : entry.taskServerUrl);
        user.setExpiredTime(expiry);
        user.setUserTag(entry.userTag);
        user.setUserTag2(entry.userTag2);
        user.setUserTag3(entry.userTag3);
        user.setUserTag4(entry.userTag4);
        user.setStudioVer(entry.studioVer);
        user.setStudioTag(entry.studioTag);
        user.setStudioTag2(entry.studioTag2);
        user.setRetInfo(entry.retInfo);
        user.setLoginName(entry.loginName);
        user.setStudioConsoleId(entry.studioConsoleId);
        return user;
    }

    private static String normalizeType(String type) {
        String normalized = type == null ? "" : type.toUpperCase(Locale.ROOT);
        if (!IPSDevUserBase.TARGETTYPE_CENTER.equals(normalized)
                && !IPSDevUserBase.TARGETTYPE_SLN.equals(normalized)
                && !IPSDevUserBase.TARGETTYPE_SYS.equals(normalized)) {
            throw new IllegalArgumentException("Unsupported authorization cache type");
        }
        return normalized;
    }

    private static Timestamp decodeExpiry(Entry entry) {
        if (entry.expiredTimeMillis == null && entry.expiredTimeNanos == null) {
            return null;
        }
        if (entry.expiredTimeMillis == null || entry.expiredTimeNanos == null
                || entry.expiredTimeNanos < 0 || entry.expiredTimeNanos >= 1_000_000_000) {
            throw new IllegalArgumentException("Invalid authorization cache expiry");
        }
        Timestamp expiry = new Timestamp(entry.expiredTimeMillis);
        expiry.setNanos(entry.expiredTimeNanos);
        if (expiry.getTime() != entry.expiredTimeMillis) {
            throw new IllegalArgumentException("Inconsistent authorization cache expiry");
        }
        return expiry;
    }

    @JsonInclude(JsonInclude.Include.ALWAYS)
    public static final class Entry {
        public final Integer schemaVersion;
        public final String targetType;
        public final Integer accMode;
        public final Boolean adminMode;
        public final Long expiredTimeMillis;
        public final Integer expiredTimeNanos;
        public String psDevCenterId;
        public String psDevCenterName;
        public String psDevUserId;
        public String psDevUserName;
        public String taskServerUrl;
        public String userTag;
        public String userTag2;
        public Object userTag3;
        public Object userTag4;
        public String studioVer;
        public String studioTag;
        public String studioTag2;
        public String retInfo;
        public String loginName;
        public String studioConsoleId;
        public String psdcInstId;
        public Boolean defaultMode;
        public String psdcType;
        public Integer psdcLevel;
        public String psDevSlnId;
        public String psDevSlnSysId;
        public String psDevSlnSysName;
        public String psDevSlnSysCodeName;
        public String psDevSlnSysLogicName;
        public String psSystemId;
        public String psSystemName;
        public String psSysModelInstId;
        public Integer curSysModelInstVer;
        public Integer activeSysModelInstVer;
        public Integer devSysState;

        @JsonCreator
        public Entry(
                @JsonProperty(value = "schemaVersion", required = true) Integer schemaVersion,
                @JsonProperty(value = "targetType", required = true) String targetType,
                @JsonProperty(value = "accMode", required = true) Integer accMode,
                @JsonProperty(value = "adminMode", required = true) Boolean adminMode,
                @JsonProperty(value = "expiredTimeMillis", required = true) Long expiredTimeMillis,
                @JsonProperty(value = "expiredTimeNanos", required = true) Integer expiredTimeNanos) {
            this.schemaVersion = schemaVersion;
            this.targetType = targetType;
            this.accMode = accMode;
            this.adminMode = adminMode;
            this.expiredTimeMillis = expiredTimeMillis;
            this.expiredTimeNanos = expiredTimeNanos;
        }

        @JsonAnySetter
        public void rejectUnknownField(String name, Object value) {
            throw new IllegalArgumentException("Unknown authorization cache field: " + name);
        }
    }
}
