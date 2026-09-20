package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPFStyleDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSPFSTYLE")
public interface IPSPFStyleService
extends IPSModelDEService<PSPFStyleDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDC = "CURDC";
    public static final String DATAQUERY_CURDCPF = "CURDCPF";
    public static final String DATAQUERY_CURDCPF2 = "CURDCPF2";
    public static final String DATAQUERY_CURDCPF3 = "CURDCPF3";
    public static final String DATAQUERY_CURDCPF4 = "CURDCPF4";
    public static final String DATAQUERY_CURPF = "CURPF";
    public static final String DATAQUERY_CURPF2 = "CURPF2";
    public static final String DATAQUERY_CURPF3 = "CURPF3";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDC = "CURDC";
    public static final String DATASET_CURDCOPENWEB = "CURDCOPENWEB";
    public static final String DATASET_CURDCPF = "CURDCPF";
    public static final String DATASET_CURDCPF2 = "CURDCPF2";
    public static final String DATASET_CURDCPF3 = "CURDCPF3";
    public static final String DATASET_CURDCPFALL = "CURDCPFALL";
    public static final String DATASET_CURDCPFALL2 = "CURDCPFALL2";
    public static final String DATASET_CURPF = "CURPF";
    public static final String DATASET_CURPF3 = "CURPF3";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSPFStyleDTO> fetchCurDC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPFStyleDTO> fetchCurDCOpenWeb(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPFStyleDTO> fetchCurDCPF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPFStyleDTO> fetchCurDCPF2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPFStyleDTO> fetchCurDCPF3(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPFStyleDTO> fetchCurDCPFAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPFStyleDTO> fetchCurDCPFAll2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPFStyleDTO> fetchCurPF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPFStyleDTO> fetchCurPF3(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSPFStyleDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
