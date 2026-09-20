package net.ibizsys.modeling.core.util.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.ibizsys.central.dataentity.service.IDEMethodDTORuntime;

public class ExportModelV2Input extends ModelActionDTOBase {
    private static final long serialVersionUID = 1L;

    @Override
    public void init(IDEMethodDTORuntime runtime, Object dtoData, boolean dtoDataMode, boolean in) throws Exception {
        normalizeKey(runtime, dtoData);
        super.init(runtime, dtoData, dtoDataMode, in);
    }

    @JsonIgnore
    public String getKey() {
        return runtimeKey("srfkey");
    }
}