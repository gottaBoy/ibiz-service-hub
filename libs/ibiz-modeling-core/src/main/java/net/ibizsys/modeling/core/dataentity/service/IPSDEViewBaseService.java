package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVIEWBASE")
public interface IPSDEViewBaseService
extends IPSModelDEService<PSDEViewBaseDTO, ISearchContextDTO> {
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
    public static final String ACTION_COPYMODEL = "COPYMODEL";
    public static final String ACTION_CREATEWITHMODEL = "CREATEWITHMODEL";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_GETDRAFTFROMWITHMODEL = "GETDRAFTFROMWITHMODEL";
    public static final String ACTION_GETDRAFTWITHMODEL = "GETDRAFTWITHMODEL";
    public static final String ACTION_GETWITHMODEL = "GETWITHMODEL";
    public static final String ACTION_GETWITHPANEL = "GETWITHPANEL";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_PASTEMODEL = "PASTEMODEL";
    public static final String ACTION_PREVIEWSAVE = "PREVIEWSAVE";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_SWITCHPANELTEMP = "SWITCHPANELTEMP";
    public static final String ACTION_UPDATEPANELITEM = "UPDATEPANELITEM";
    public static final String ACTION_UPDATETEMPANDSAVE = "UPDATETEMPANDSAVE";
    public static final String ACTION_UPDATEWITHMODEL = "UPDATEWITHMODEL";
    public static final String ACTION_UPDATEWITHPANEL = "UPDATEWITHPANEL";
    public static final String DATAQUERY_APPADD = "APPADD";
    public static final String DATAQUERY_APPNOTADD = "APPNOTADD";
    public static final String DATAQUERY_BYTYPE = "BYTYPE";
    public static final String DATAQUERY_CURAPP = "CURAPP";
    public static final String DATAQUERY_CURAPPADD = "CURAPPADD";
    public static final String DATAQUERY_CURAPPNOTADD = "CURAPPNOTADD";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURDE2 = "CURDE2";
    public static final String DATAQUERY_CURDEMOB = "CURDEMOB";
    public static final String DATAQUERY_CURDEWEB = "CURDEWEB";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURWF2 = "CURWF2";
    public static final String DATAQUERY_CURWFVER = "CURWFVER";
    public static final String DATAQUERY_DEPDT = "DEPDT";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_MOB = "MOB";
    public static final String DATAQUERY_PDTCNT = "PDTCNT";
    public static final String DATAQUERY_PDTCNT2 = "PDTCNT2";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATAQUERY_WF = "WF";
    public static final String DATAQUERY_WEB = "WEB";
    public static final String DATASET_APPADD = "APPADD";
    public static final String DATASET_APPNOTADD = "APPNOTADD";
    public static final String DATASET_BYTYPE = "BYTYPE";
    public static final String DATASET_CURAPP = "CURAPP";
    public static final String DATASET_CURAPPADD = "CURAPPADD";
    public static final String DATASET_CURAPPNOTADD = "CURAPPNOTADD";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURDE2 = "CURDE2";
    public static final String DATASET_CURDEMOB = "CURDEMOB";
    public static final String DATASET_CURDEWEB = "CURDEWEB";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURWF2 = "CURWF2";
    public static final String DATASET_CURWFVER = "CURWFVER";
    public static final String DATASET_DEPDT = "DEPDT";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_FORMTYPE = "FORMTYPE";
    public static final String DATASET_MOB = "MOB";
    public static final String DATASET_WF = "WF";
    public static final String DATASET_WEB = "WEB";

    public void createWithModel(PSDEViewBaseDTO dto) throws Throwable;

    public PSDEViewBaseDTO getDraftFromWithModel(PSDEViewBaseDTO dto) throws Throwable;

    public PSDEViewBaseDTO getDraftWithModel(PSDEViewBaseDTO dto) throws Throwable;

    public PSDEViewBaseDTO getWithModel(String value) throws Throwable;

    public PSDEViewBaseDTO getWithPanel(String value) throws Throwable;

    public void previewSave(PSDEViewBaseDTO dto) throws Throwable;

    public void switchPanelTemp(PSDEViewBaseDTO dto) throws Throwable;

    public void updatePanelItem(PSDEViewBaseDTO dto) throws Throwable;

    public void updateWithModel(PSDEViewBaseDTO dto) throws Throwable;

    public void updateWithPanel(PSDEViewBaseDTO dto) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchAppAdd(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchAppNotAdd(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchByType(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurAppAdd(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurAppNotAdd(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurDE2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurDEMob(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurDEWeb(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurWF2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchCurWFVer(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchDEPDT(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchFormType(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchMob(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchWF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEViewBaseDTO> fetchWeb(ISearchContextDTO searchContext) throws Throwable;
}
