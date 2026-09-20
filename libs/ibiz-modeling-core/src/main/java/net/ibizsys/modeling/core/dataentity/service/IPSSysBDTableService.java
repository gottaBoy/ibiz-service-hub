package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSBDTABLE")
public interface IPSSysBDTableService
extends IPSModelDEService<PSSysBDTableDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_SYNCDEFIELDS = "SYNCDEFIELDS";
    public static final String DATAQUERY_CURSCHEME = "CURSCHEME";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATASET_CURSCHEME = "CURSCHEME";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void syncDEFields(PSSysBDTableDTO dto) throws Throwable;

    public Page<PSSysBDTableDTO> fetchCurScheme(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysBDTableDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
