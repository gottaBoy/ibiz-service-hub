package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEFORM")
public interface IPSDEFormService
extends IPSModelDEService<PSDEFormDTO, ISearchContextDTO> {
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
    public static final String ACTION_APPLY = "APPLY";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_COPYMODEL = "COPYMODEL";
    public static final String ACTION_CREATEWITHMODEL = "CREATEWITHMODEL";
    public static final String ACTION_CREATEDAPPLOCAL = "CREATEDAPPLOCAL";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_GETAPPLOCAL = "GETAPPLOCAL";
    public static final String ACTION_GETDRAFTFROMWITHMODEL = "GETDRAFTFROMWITHMODEL";
    public static final String ACTION_GETDRAFTLOCAL = "GETDRAFTLOCAL";
    public static final String ACTION_GETDRAFTWITHMODEL = "GETDRAFTWITHMODEL";
    public static final String ACTION_GETWITHMODEL = "GETWITHMODEL";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_JITPREVIEW = "JITPREVIEW";
    public static final String ACTION_PASTEMODEL = "PASTEMODEL";
    public static final String ACTION_PREVIEWSAVE = "PREVIEWSAVE";
    public static final String ACTION_REMOVEAPPLOCAL = "REMOVEAPPLOCAL";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_SELECTAPPLOCAL = "SELECTAPPLOCAL";
    public static final String ACTION_UPDATEAPPLOCAL = "UPDATEAPPLOCAL";
    public static final String ACTION_UPDATEWITHMODEL = "UPDATEWITHMODEL";
    public static final String DATAQUERY_CURAPPEDITMODE = "CURAPPEDITMODE";
    public static final String DATAQUERY_CURAPPSEARCHMODE = "CURAPPSEARCHMODE";
    public static final String DATAQUERY_CURDEEDITMODE = "CURDEEDITMODE";
    public static final String DATAQUERY_CURDESEARCHMODE = "CURDESEARCHMODE";
    public static final String DATAQUERY_CURDEWIZARDMODE = "CURDEWIZARDMODE";
    public static final String DATAQUERY_CURSYSEDITMODE = "CURSYSEDITMODE";
    public static final String DATAQUERY_CURSYSSEARCHMODE = "CURSYSSEARCHMODE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_EDITMODE = "EDITMODE";
    public static final String DATAQUERY_SEARCHMODE = "SEARCHMODE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPPEDITMODE = "CURAPPEDITMODE";
    public static final String DATASET_CURAPPSEARCHMODE = "CURAPPSEARCHMODE";
    public static final String DATASET_CURDEEDITMODE = "CURDEEDITMODE";
    public static final String DATASET_CURDESEARCHMODE = "CURDESEARCHMODE";
    public static final String DATASET_CURDEWIZARDMODE = "CURDEWIZARDMODE";
    public static final String DATASET_CURSYSEDITMODE = "CURSYSEDITMODE";
    public static final String DATASET_CURSYSSEARCHMODE = "CURSYSSEARCHMODE";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_EDITMODE = "EDITMODE";
    public static final String DATASET_FORMTYPE = "FORMTYPE";
    public static final String DATASET_SEARCHMODE = "SEARCHMODE";

    public void apply(PSDEFormDTO dto) throws Throwable;

    public void createWithModel(PSDEFormDTO dto) throws Throwable;

    public PSDEFormDTO getDraftFromWithModel(PSDEFormDTO dto) throws Throwable;

    public PSDEFormDTO getDraftWithModel(PSDEFormDTO dto) throws Throwable;

    public PSDEFormDTO getWithModel(String value) throws Throwable;

    public void jITPreview(PSDEFormDTO dto) throws Throwable;

    public void previewSave(PSDEFormDTO dto) throws Throwable;

    public void updateWithModel(PSDEFormDTO dto) throws Throwable;

    public Page<PSDEFormDTO> fetchCurAppEditMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchCurAppSearchMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchCurDEEditMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchCurDESearchMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchCurDEWizardMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchCurSysEditMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchCurSysSearchMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchEditMode(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchFormType(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDTO> fetchSearchMode(ISearchContextDTO searchContext) throws Throwable;
}
