package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppUtilViewDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSAPPUTILVIEW")
public interface IPSAppUtilViewService
extends IPSModelDEService<PSAppUtilViewDTO, ISearchContextDTO> {
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
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_SWITCHPANELTEMP = "SWITCHPANELTEMP";
    public static final String ACTION_UPDATETEMPANDSAVE = "UPDATETEMPANDSAVE";
    public static final String DATAQUERY_CURAPP = "CURAPP";
    public static final String DATAQUERY_CURAPPFUNC = "CURAPPFUNC";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPP = "CURAPP";
    public static final String DATASET_CURAPPFUNC = "CURAPPFUNC";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void switchPanelTemp(PSAppUtilViewDTO dto) throws Throwable;

    public void updateTempAndSave(PSAppUtilViewDTO dto) throws Throwable;

    public Page<PSAppUtilViewDTO> fetchCurApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSAppUtilViewDTO> fetchCurAppFunc(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSAppUtilViewDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
