package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPanelItemLogicDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSPANELITEMLOGIC")
public interface IPSPanelItemLogicService
extends IPSModelDEService<PSPanelItemLogicDTO, ISearchContextDTO> {
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
    public static final String ACTION_GETBLANKDRAFT = "GETBLANKDRAFT";
    public static final String ACTION_GETENABLEDRAFT = "GETENABLEDRAFT";
    public static final String ACTION_GETVISIBLEDRAFT = "GETVISIBLEDRAFT";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_BLANK = "BLANK";
    public static final String DATAQUERY_CURPLROOTLOGIC = "CURPLROOTLOGIC";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_ENABLE = "ENABLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATAQUERY_VISIBLE = "VISIBLE";
    public static final String DATASET_BLANK = "BLANK";
    public static final String DATASET_CURPLROOTLOGIC = "CURPLROOTLOGIC";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_ENABLE = "ENABLE";
    public static final String DATASET_VISIBLE = "VISIBLE";

    public Page<PSPanelItemLogicDTO> fetchCurPLRootLogic(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPanelItemLogicDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
