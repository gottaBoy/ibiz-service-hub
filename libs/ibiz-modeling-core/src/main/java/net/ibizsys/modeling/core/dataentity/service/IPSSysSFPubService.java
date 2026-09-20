package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPubDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSSFPUB")
public interface IPSSysSFPubService
extends IPSModelDEService<PSSysSFPubDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYS2 = "CURSYS2";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYS2 = "CURSYS2";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSSysSFPubDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysSFPubDTO> fetchCurSys2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysSFPubDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
