package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier("PSSYSTEM")
public interface IPSSystemService extends IPSModelDEService<PSSystemDTO, ISearchContextDTO> {
    String ACTION_CREATE = "CREATE";
    String ACTION_UPDATE = "UPDATE";
    String ACTION_REMOVE = "REMOVE";
    String ACTION_GET = "GET";
    String ACTION_GETDRAFT = "GETDRAFT";
    String ACTION_CHECKKEY = "CHECKKEY";
    String ACTION_DECREASEDECNT = "DECREASEDECNT";
    String ACTION_FILLTREENODECOND = "FILLTREENODECOND";
    String ACTION_INCREASEDECNT = "INCREASEDECNT";
    String ACTION_SAVE = "SAVE";
    String DATAQUERY_DEFAULT = "DEFAULT";
    String DATAQUERY_VIEW = "VIEW";
    String DATASET_CURDC = "CURDC";
    String DATASET_DEFAULT = "DEFAULT";

    void decreaseDECnt(PSSystemDTO entity) throws Throwable;

    void fillTreeNodeCond(PSSystemDTO entity) throws Throwable;

    void increaseDECnt(PSSystemDTO entity) throws Throwable;

    Page<PSSystemDTO> fetchCurDC(ISearchContextDTO context) throws Throwable;

    Page<PSSystemDTO> fetchDefault(ISearchContextDTO context) throws Throwable;
}