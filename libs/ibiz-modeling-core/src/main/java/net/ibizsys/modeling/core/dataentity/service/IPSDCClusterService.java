package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCClusterDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDCCLUSTER")
public interface IPSDCClusterService
extends IPSModelDEService<PSDCClusterDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_TEST = "TEST";
    public static final String ACTION_TEST2 = "TEST2";
    public static final String DATAQUERY_CURDC = "CURDC";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDC = "CURDC";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void test(PSDCClusterDTO dto) throws Throwable;

    public void test2(PSDCClusterDTO dto) throws Throwable;

    public Page<PSDCClusterDTO> fetchCurDC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCClusterDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
