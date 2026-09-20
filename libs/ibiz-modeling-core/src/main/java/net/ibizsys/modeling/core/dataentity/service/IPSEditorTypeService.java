package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSEditorTypeDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSEDITORTYPE")
public interface IPSEditorTypeService
extends IPSModelDEService<PSEditorTypeDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_MOB = "MOB";
    public static final String DATAQUERY_SB = "SB";
    public static final String DATAQUERY_VALID = "VALID";
    public static final String DATAQUERY_VALIDMOB = "VALIDMOB";
    public static final String DATAQUERY_VALIDWEB = "VALIDWEB";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_SB = "SB";
    public static final String DATASET_VALID = "VALID";
    public static final String DATASET_VALIDMOB = "VALIDMOB";
    public static final String DATASET_VALIDWEB = "VALIDWEB";

    public Page<PSEditorTypeDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSEditorTypeDTO> fetchSB(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSEditorTypeDTO> fetchValid(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSEditorTypeDTO> fetchValidMob(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSEditorTypeDTO> fetchValidWeb(ISearchContextDTO searchContext) throws Throwable;
}
