package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelItemDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSVIEWPANELITEM")
public interface IPSSysViewPanelItemService
extends IPSModelDEService<PSSysViewPanelItemDTO, ISearchContextDTO> {
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
    public static final String ACTION_CALCICONSTYLE = "CALCICONSTYLE";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATETEMPWITHPREVIEW = "CREATETEMPWITHPREVIEW";
    public static final String ACTION_CREATEWITHMODEL = "CREATEWITHMODEL";
    public static final String ACTION_GETTEMPWITHPREVIEW = "GETTEMPWITHPREVIEW";
    public static final String ACTION_GETWITHMODEL = "GETWITHMODEL";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UPDATETEMPWITHPREVIEW = "UPDATETEMPWITHPREVIEW";
    public static final String ACTION_UPDATEWITHMODEL = "UPDATEWITHMODEL";
    public static final String DATAQUERY_CURPANEL = "CURPANEL";
    public static final String DATAQUERY_CURPANELCTRL = "CURPANELCTRL";
    public static final String DATAQUERY_CURPANELFIELD = "CURPANELFIELD";
    public static final String DATAQUERY_CURPANELROOT = "CURPANELROOT";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURPANEL = "CURPANEL";
    public static final String DATASET_CURPANELCTRL = "CURPANELCTRL";
    public static final String DATASET_CURPANELFIELD = "CURPANELFIELD";
    public static final String DATASET_CURPANELROOT = "CURPANELROOT";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void createTempWithPreview(PSSysViewPanelItemDTO dto) throws Throwable;

    public void createWithModel(PSSysViewPanelItemDTO dto) throws Throwable;

    public PSSysViewPanelItemDTO getTempWithPreview(String value) throws Throwable;

    public PSSysViewPanelItemDTO getWithModel(String value) throws Throwable;

    public void updateTempWithPreview(PSSysViewPanelItemDTO dto) throws Throwable;

    public void updateWithModel(PSSysViewPanelItemDTO dto) throws Throwable;

    public Page<PSSysViewPanelItemDTO> fetchCurPanel(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysViewPanelItemDTO> fetchCurPanelCtrl(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysViewPanelItemDTO> fetchCurPanelField(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysViewPanelItemDTO> fetchCurPanelRoot(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysViewPanelItemDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
