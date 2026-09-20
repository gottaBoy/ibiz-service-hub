package net.ibizsys.modeling.core.util;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.central.util.EntityDTO;

/**
 * Common DTO fields shared by modeling-service entities.
 */
public abstract class PSModelDTOBase extends EntityDTO {
    private static final long serialVersionUID = -5705849183302473224L;

    public static final String FIELD_PSSYSTEMID = "pssystemid";
    protected static final String DTOFIELD_PSSYSTEMID = "pssystemid";
    public static final String FIELD_PSSYSTEMNAME = "pssystemname";
    protected static final String DTOFIELD_PSSYSTEMNAME = "pssystemname";

    @JsonIgnore
    public void setPSSystemId(String value) {
        _set(DTOFIELD_PSSYSTEMID, value);
    }

    @JsonIgnore
    public String getPSSystemId() {
        return (String) _get(DTOFIELD_PSSYSTEMID);
    }

    @JsonIgnore
    public boolean isPSSystemIdDirty() {
        return _contains(DTOFIELD_PSSYSTEMID);
    }

    @JsonIgnore
    public void resetPSSystemId() {
        _reset(DTOFIELD_PSSYSTEMID);
    }

    @JsonIgnore
    public void setPSSystemName(String value) {
        _set(DTOFIELD_PSSYSTEMNAME, value);
    }

    @JsonIgnore
    public String getPSSystemName() {
        return (String) _get(DTOFIELD_PSSYSTEMNAME);
    }

    @JsonIgnore
    public boolean isPSSystemNameDirty() {
        return _contains(DTOFIELD_PSSYSTEMNAME);
    }

    @JsonIgnore
    public void resetPSSystemName() {
        _reset(DTOFIELD_PSSYSTEMNAME);
    }
}