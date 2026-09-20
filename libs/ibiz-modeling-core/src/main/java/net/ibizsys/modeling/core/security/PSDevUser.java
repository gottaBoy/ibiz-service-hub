package net.ibizsys.modeling.core.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PSDevUser extends PSDevUserBase implements IPSDevUser {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private int accMode;
    @JsonIgnore
    private String psdcInstId;
    @JsonIgnore
    private boolean defaultMode;
    @JsonIgnore
    private boolean adminMode;
    @JsonIgnore
    private String psdcType;
    @JsonIgnore
    private int psdcLevel;

    @Override
    public int getAccMode() {
        return accMode;
    }

    public void setAccMode(int accMode) {
        this.accMode = accMode;
    }

    @Override
    public String getPSDCInstId() {
        return psdcInstId;
    }

    public void setPSDCInstId(String psdcInstId) {
        this.psdcInstId = psdcInstId;
    }

    @Override
    public boolean isShareAccMode() {
        return (accMode & ACCMODE_SHARE) == ACCMODE_SHARE;
    }

    @Override
    public boolean isMaintainAccMode() {
        return (accMode & ACCMODE_MAINTAIN) == ACCMODE_MAINTAIN;
    }

    @Override
    public boolean isDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(boolean defaultMode) {
        this.defaultMode = defaultMode;
    }

    @Override
    public boolean isAdminMode() {
        return adminMode;
    }

    public void setAdminMode(boolean adminMode) {
        this.adminMode = adminMode;
    }

    @Override
    public String getPSDCType() {
        return psdcType;
    }

    public void setPSDCType(String psdcType) {
        this.psdcType = psdcType;
    }

    @Override
    public int getPSDCLevel() {
        return psdcLevel;
    }

    public void setPSDCLevel(int psdcLevel) {
        this.psdcLevel = psdcLevel;
    }

    @Override
    public String getTargetType() {
        return TARGETTYPE_CENTER;
    }
}