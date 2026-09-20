package net.ibizsys.modeling.core.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PSDevTemplUser extends PSDevSlnUser implements IPSDevTemplUser {

    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private String psDevSlnTemplId;

    @Override
    public String getPSDevSlnTemplId() {
        return psDevSlnTemplId;
    }

    public void setPSDevSlnTemplId(String psDevSlnTemplId) {
        this.psDevSlnTemplId = psDevSlnTemplId;
    }

    @Override
    public String getTargetType() {
        return TARGETTYPE_TEMPL;
    }
}