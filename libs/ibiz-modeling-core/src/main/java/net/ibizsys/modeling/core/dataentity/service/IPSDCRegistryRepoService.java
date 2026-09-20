package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCRegistryRepoDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDCREGISTRYREPO")
public interface IPSDCRegistryRepoService
extends IPSModelDEService<PSDCRegistryRepoDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_ASSIGNSLN = "ASSIGNSLN";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDC = "CURDC";
    public static final String DATAQUERY_CURSLN = "CURSLN";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDC = "CURDC";
    public static final String DATASET_CURSLN = "CURSLN";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void assignSln(PSDCRegistryRepoDTO dto) throws Throwable;

    public Page<PSDCRegistryRepoDTO> fetchCurDC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryRepoDTO> fetchCurSln(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDCRegistryRepoDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
