package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDetailDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEFORMDETAIL")
public interface IPSDEFormDetailService
extends IPSModelDEService<PSDEFormDetailDTO, ISearchContextDTO> {
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
    public static final String ACTION_AJAXFILLCREATEDVT = "AJAXFILLCREATEDVT";
    public static final String ACTION_AJAXFILLUPDATEDVT = "AJAXFILLUPDATEDVT";
    public static final String ACTION_CALCREFPSDEFORMID = "CALCREFPSDEFORMID";
    public static final String ACTION_CHANGEDRITEM = "CHANGEDRITEM";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATETEMPWITHPREVIEW = "CREATETEMPWITHPREVIEW";
    public static final String ACTION_CREATEWITHMODEL = "CREATEWITHMODEL";
    public static final String ACTION_CREATEDAPPTEMP = "CREATEDAPPTEMP";
    public static final String ACTION_GETAPPTEMP = "GETAPPTEMP";
    public static final String ACTION_GETTEMPWITHPREVIEW = "GETTEMPWITHPREVIEW";
    public static final String ACTION_GETWITHMODEL = "GETWITHMODEL";
    public static final String ACTION_REMOVEAPPTEMP = "REMOVEAPPTEMP";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_SELECTAPPTEMP = "SELECTAPPTEMP";
    public static final String ACTION_UPDATEAPPTEMP = "UPDATEAPPTEMP";
    public static final String ACTION_UPDATETEMPWITHPREVIEW = "UPDATETEMPWITHPREVIEW";
    public static final String ACTION_UPDATEWITHMODEL = "UPDATEWITHMODEL";
    public static final String DATAQUERY_CURFORMFDFI = "CURFORMFDFI";
    public static final String DATAQUERY_CURFORMFI = "CURFORMFI";
    public static final String DATAQUERY_CURFORMROOTFI = "CURFORMROOTFI";
    public static final String DATAQUERY_CURFROMFDREFFI = "CURFROMFDREFFI";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_FI = "FI";
    public static final String DATAQUERY_FORMFI = "FORMFI";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURFORMFDFI = "CURFORMFDFI";
    public static final String DATASET_CURFORMFI = "CURFORMFI";
    public static final String DATASET_CURFORMROOTFI = "CURFORMROOTFI";
    public static final String DATASET_CURFROMFDREFFI = "CURFROMFDREFFI";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_FI = "FI";
    public static final String DATASET_FORMFI = "FORMFI";

    public void ajaxFillCreateDVT(PSDEFormDetailDTO dto) throws Throwable;

    public void ajaxFillUpdateDVT(PSDEFormDetailDTO dto) throws Throwable;

    public void changeDRItem(PSDEFormDetailDTO dto) throws Throwable;

    public void createTempWithPreview(PSDEFormDetailDTO dto) throws Throwable;

    public void createWithModel(PSDEFormDetailDTO dto) throws Throwable;

    public PSDEFormDetailDTO getTempWithPreview(String value) throws Throwable;

    public PSDEFormDetailDTO getWithModel(String value) throws Throwable;

    public void updateTempWithPreview(PSDEFormDetailDTO dto) throws Throwable;

    public void updateWithModel(PSDEFormDetailDTO dto) throws Throwable;

    public Page<PSDEFormDetailDTO> fetchCurFormFDFI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDetailDTO> fetchCurFormFI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDetailDTO> fetchCurFormRootFI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDetailDTO> fetchCurFromFDRefFI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDetailDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDetailDTO> fetchFI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFormDetailDTO> fetchFormItem(ISearchContextDTO searchContext) throws Throwable;
}
