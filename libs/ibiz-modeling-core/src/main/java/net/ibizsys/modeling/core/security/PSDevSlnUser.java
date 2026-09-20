package net.ibizsys.modeling.core.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PSDevSlnUser extends PSDevUserBase implements IPSDevSlnUser {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private int accMode;
    @JsonIgnore
    private boolean adminMode;
    @JsonIgnore
    private String psDevSlnId;

    @Override
    public int getAccMode() {
        return accMode;
    }

    public void setAccMode(int accMode) {
        this.accMode = accMode;
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
    public boolean isAdminMode() {
        return adminMode;
    }

    public void setAdminMode(boolean adminMode) {
        this.adminMode = adminMode;
    }

    @Override
    public String getPSDevSlnId() {
        return psDevSlnId;
    }

    public void setPSDevSlnId(String psDevSlnId) {
        this.psDevSlnId = psDevSlnId;
    }

    @Override
    public String getTargetType() {
        return TARGETTYPE_SLN;
    }
}