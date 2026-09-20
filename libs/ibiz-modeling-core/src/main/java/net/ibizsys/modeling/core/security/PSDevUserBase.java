package net.ibizsys.modeling.core.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.sql.Timestamp;

public abstract class PSDevUserBase implements IPSDevUserBase {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private String psDevCenterId;
    @JsonIgnore
    private String psDevCenterName;
    @JsonIgnore
    private String psDevUserId;
    @JsonIgnore
    private String taskServerUrl;
    @JsonIgnore
    private Timestamp expiredTime;
    @JsonIgnore
    private String userTag;
    @JsonIgnore
    private String userTag2;
    @JsonIgnore
    private Object userTag3;
    @JsonIgnore
    private Object userTag4;
    @JsonIgnore
    private String studioVer;
    @JsonIgnore
    private String studioTag;
    @JsonIgnore
    private String studioTag2;
    @JsonIgnore
    private String psDevUserName;
    @JsonIgnore
    private String retInfo;
    @JsonIgnore
    private String loginName;
    @JsonIgnore
    private String studioConsoleId;

    @Override
    public String getPSDevCenterId() {
        return psDevCenterId;
    }

    public void setPSDevCenterId(String psDevCenterId) {
        this.psDevCenterId = psDevCenterId;
    }

    @Override
    public String getPSDevCenterName() {
        return psDevCenterName;
    }

    public void setPSDevCenterName(String psDevCenterName) {
        this.psDevCenterName = psDevCenterName;
    }

    @Override
    public String getPSDevUserId() {
        return psDevUserId;
    }

    public void setPSDevUserId(String psDevUserId) {
        this.psDevUserId = psDevUserId;
    }

    @Override
    public String getTaskServerUrl() {
        return taskServerUrl;
    }

    public void setTaskServerUrl(String taskServerUrl) {
        if (taskServerUrl != null && !taskServerUrl.isEmpty()
                && taskServerUrl.endsWith("/")) {
            this.taskServerUrl = taskServerUrl.substring(0, taskServerUrl.length() - 1);
        } else {
            this.taskServerUrl = taskServerUrl;
        }
    }

    @Override
    public Timestamp getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Timestamp expiredTime) {
        this.expiredTime = expiredTime;
    }

    @Override
    public boolean isExpired() {
        return expiredTime != null && expiredTime.getTime() < System.currentTimeMillis();
    }

    @Override
    public String getUserTag() {
        return userTag;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag;
    }

    @Override
    public String getUserTag2() {
        return userTag2;
    }

    public void setUserTag2(String userTag2) {
        this.userTag2 = userTag2;
    }

    @Override
    public Object getUserTag3() {
        return userTag3;
    }

    public void setUserTag3(Object userTag3) {
        this.userTag3 = userTag3;
    }

    @Override
    public Object getUserTag4() {
        return userTag4;
    }

    public void setUserTag4(Object userTag4) {
        this.userTag4 = userTag4;
    }

    @Override
    public String getStudioVer() {
        return studioVer;
    }

    public void setStudioVer(String studioVer) {
        this.studioVer = studioVer;
    }

    @Override
    public String getStudioTag() {
        return studioTag;
    }

    public void setStudioTag(String studioTag) {
        this.studioTag = studioTag;
    }

    @Override
    public String getStudioTag2() {
        return studioTag2;
    }

    public void setStudioTag2(String studioTag2) {
        this.studioTag2 = studioTag2;
    }

    @Override
    public String getPSDevUserName() {
        return psDevUserName;
    }

    public void setPSDevUserName(String psDevUserName) {
        this.psDevUserName = psDevUserName;
    }

    @Override
    public String getRetInfo() {
        return retInfo;
    }

    public void setRetInfo(String retInfo) {
        this.retInfo = retInfo;
    }

    @Override
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String getStudioConsoleId() {
        return studioConsoleId;
    }

    public void setStudioConsoleId(String studioConsoleId) {
        this.studioConsoleId = studioConsoleId;
    }
}