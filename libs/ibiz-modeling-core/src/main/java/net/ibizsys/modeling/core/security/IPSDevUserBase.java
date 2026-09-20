package net.ibizsys.modeling.core.security;

import java.io.Serializable;
import java.sql.Timestamp;

public interface IPSDevUserBase extends Serializable {

    int ACCMODE_NONE = 0;
    int ACCMODE_READ = 1;
    int ACCMODE_WRITE = 2;
    int ACCMODE_SHARE = 5;
    int ACCMODE_ALL = 3;
    int ACCMODE_MAINTAIN = 11;
    int ACCMODE_OWNER = 19;

    String STUDIOVER_S0500 = "S0500";
    String STUDIOVER_S0600 = "S0600";
    String STUDIOVER_S0600M1 = "S0600M1";

    String TARGETTYPE_CENTER = "CENTER";
    String TARGETTYPE_SLN = "SLN";
    String TARGETTYPE_SYS = "SYS";
    String TARGETTYPE_TEMPL = "TEMPL";

    String getPSDevCenterId();

    String getPSDevCenterName();

    String getPSDevUserId();

    String getTaskServerUrl();

    Timestamp getExpiredTime();

    boolean isExpired();

    String getUserTag();

    String getUserTag2();

    Object getUserTag3();

    Object getUserTag4();

    String getStudioVer();

    String getStudioTag();

    String getStudioTag2();

    String getPSDevUserName();

    String getRetInfo();

    String getLoginName();

    String getStudioConsoleId();

    String getTargetType();
}