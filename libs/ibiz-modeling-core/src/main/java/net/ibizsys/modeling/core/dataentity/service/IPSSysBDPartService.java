package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDPartDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSBDPART")
public interface IPSSysBDPartService
extends IPSModelDEService<PSSysBDPartDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURBDS = "CURBDS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATASET_CURBDS = "CURBDS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSSysBDPartDTO> fetchCurBDS(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysBDPartDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
