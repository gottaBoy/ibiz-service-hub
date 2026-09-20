package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQJoinDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEDQJOIN")
public interface IPSDEDQJoinService
extends IPSModelDEService<PSDEDQJoinDTO, ISearchContextDTO> {
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
    public static final String ACTION_CALCJOINPSDEID = "CALCJOINPSDEID";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEWITHMODEL = "CREATEWITHMODEL";
    public static final String ACTION_GETWITHMODEL = "GETWITHMODEL";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UPDATEWITHMODEL = "UPDATEWITHMODEL";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_ROOTJOIN = "ROOTJOIN";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_ROOTJOIN = "ROOTJOIN";

    public void calcJoinPSDEId(PSDEDQJoinDTO dto) throws Throwable;

    public void createWithModel(PSDEDQJoinDTO dto) throws Throwable;

    public PSDEDQJoinDTO getWithModel(String value) throws Throwable;

    public void updateWithModel(PSDEDQJoinDTO dto) throws Throwable;

    public Page<PSDEDQJoinDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEDQJoinDTO> fetchRootJoin(ISearchContextDTO searchContext) throws Throwable;
}
