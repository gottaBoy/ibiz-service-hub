package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFVersionDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSWFVERSION")
public interface IPSWFVersionService
extends IPSModelDEService<PSWFVersionDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_CREATETEMP = "CREATETEMP";
    public static final String ACTION_CREATETEMPMAJOR = "CREATETEMPMAJOR";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_UPDATETEMP = "UPDATETEMP";
    public static final String ACTION_UPDATETEMPMAJOR = "UPDATETEMPMAJOR";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_REMOVETEMP = "REMOVETEMP";
    public static final String ACTION_REMOVETEMPMAJOR = "REMOVETEMPMAJOR";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETTEMP = "GETTEMP";
    public static final String ACTION_GETTEMPMAJOR = "GETTEMPMAJOR";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_GETDRAFTTEMP = "GETDRAFTTEMP";
    public static final String ACTION_GETDRAFTTEMPMAJOR = "GETDRAFTTEMPMAJOR";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_INITMODEL = "INITMODEL";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURINST = "CURINST";
    public static final String DATAQUERY_CURWF = "CURWF";
    public static final String DATAQUERY_CURWFPART = "CURWFPART";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_DYNAWFVERCNT = "DYNAWFVERCNT";
    public static final String DATASET_CURINST = "CURINST";
    public static final String DATASET_CURWF = "CURWF";
    public static final String DATASET_CURWFPART = "CURWFPART";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSWFVersionDTO> fetchCurInst(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSWFVersionDTO> fetchCurWF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSWFVersionDTO> fetchCurWFPart(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSWFVersionDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
