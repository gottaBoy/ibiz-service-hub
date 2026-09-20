package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PSDEFGroupDTO extends PSNamedModelDTOBase {
    private static final long serialVersionUID = 1L;
    private static final String DTOFIELD_CODENAME = "codename";
    private static final String DTOFIELD_GROUPTYPE = "grouptype";
    private static final String DTOFIELD_PSDEID = "psdeid";

    public PSDEFGroupDTO() {
        super("psdefgroupid", "psdefgroupname");
    }

    @JsonProperty("psdefgroupid")
    public void setPSDEFGroupId(String value) { setRelatedId(value); }
    @JsonIgnore public String getPSDEFGroupId() { return getRelatedId(); }
    @JsonIgnore public boolean isPSDEFGroupIdDirty() { return isRelatedIdDirty(); }
    @JsonIgnore public void resetPSDEFGroupId() { resetRelatedId(); }

    @JsonProperty("psdefgroupname")
    public void setPSDEFGroupName(String value) { setRelatedName(value); }
    @JsonIgnore public String getPSDEFGroupName() { return getRelatedName(); }
    @JsonIgnore public boolean isPSDEFGroupNameDirty() { return isRelatedNameDirty(); }
    @JsonIgnore public void resetPSDEFGroupName() { resetRelatedName(); }

    @JsonProperty("codename")
    public void setCodeName(String value) { _set(DTOFIELD_CODENAME, value); }
    @JsonIgnore public String getCodeName() { return (String) _get(DTOFIELD_CODENAME); }
    @JsonIgnore public boolean isCodeNameDirty() { return _contains(DTOFIELD_CODENAME); }
    @JsonIgnore public void resetCodeName() { _reset(DTOFIELD_CODENAME); }

    @JsonProperty("grouptype")
    public void setGroupType(String value) { _set(DTOFIELD_GROUPTYPE, value); }
    @JsonIgnore public String getGroupType() { return (String) _get(DTOFIELD_GROUPTYPE); }
    @JsonIgnore public boolean isGroupTypeDirty() { return _contains(DTOFIELD_GROUPTYPE); }
    @JsonIgnore public void resetGroupType() { _reset(DTOFIELD_GROUPTYPE); }

    @JsonProperty("psdeid")
    public void setPSDEId(String value) { _set(DTOFIELD_PSDEID, value); }
    @JsonIgnore public String getPSDEId() { return (String) _get(DTOFIELD_PSDEID); }
    @JsonIgnore public boolean isPSDEIdDirty() { return _contains(DTOFIELD_PSDEID); }
    @JsonIgnore public void resetPSDEId() { _reset(DTOFIELD_PSDEID); }
}