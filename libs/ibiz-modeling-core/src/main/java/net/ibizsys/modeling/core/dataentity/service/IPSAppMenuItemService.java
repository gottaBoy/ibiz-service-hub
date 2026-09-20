package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppMenuItemDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSAPPMENUITEM")
public interface IPSAppMenuItemService
extends IPSModelDEService<PSAppMenuItemDTO, ISearchContextDTO> {
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
    public static final String ACTION_CHANGEAPPFUNC = "CHANGEAPPFUNC";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATETEMPWITHPREVIEW = "CREATETEMPWITHPREVIEW";
    public static final String ACTION_GETTEMPWITHPREVIEW = "GETTEMPWITHPREVIEW";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UPDATETEMPWITHPREVIEW = "UPDATETEMPWITHPREVIEW";
    public static final String DATAQUERY_CURMENUROOTITEM = "CURMENUROOTITEM";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURMENUROOTITEM = "CURMENUROOTITEM";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_MENUITEM = "MENUITEM";

    public void createTempWithPreview(PSAppMenuItemDTO dto) throws Throwable;

    public PSAppMenuItemDTO getTempWithPreview(String value) throws Throwable;

    public void updateTempWithPreview(PSAppMenuItemDTO dto) throws Throwable;

    public Page<PSAppMenuItemDTO> fetchCurMenuRootItem(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSAppMenuItemDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSAppMenuItemDTO> fetchMenuItem(ISearchContextDTO searchContext) throws Throwable;
}
