package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.modeling.core.util.PSModelDTOBase;

/**
 * Small common base for related modeling DTOs whose public contract is an ID
 * and a display name.
 */
public abstract class PSNamedModelDTOBase extends PSModelDTOBase {
    private static final long serialVersionUID = 1L;

    private final String idField;
    private final String nameField;

    protected PSNamedModelDTOBase(String idField, String nameField) {
        this.idField = idField;
        this.nameField = nameField;
    }

    protected final void setRelatedId(String value) {
        _set(idField, value);
    }

    protected final String getRelatedId() {
        return (String) _get(idField);
    }

    protected final boolean isRelatedIdDirty() {
        return _contains(idField);
    }

    protected final void resetRelatedId() {
        _reset(idField);
    }

    protected final void setRelatedName(String value) {
        _set(nameField, value);
    }

    protected final String getRelatedName() {
        return (String) _get(nameField);
    }

    protected final boolean isRelatedNameDirty() {
        return _contains(nameField);
    }

    protected final void resetRelatedName() {
        _reset(nameField);
    }

    @JsonIgnore
    public String getId() {
        return getRelatedId();
    }

    @JsonIgnore
    public void setId(String value) {
        setRelatedId(value);
    }

    @JsonIgnore
    public String getName() {
        return getRelatedName();
    }

    @JsonIgnore
    public void setName(String value) {
        setRelatedName(value);
    }
}