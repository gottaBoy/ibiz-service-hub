package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESARSDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDESARS")
public interface IPSDESARSService
extends IPSModelDEService<PSDESARSDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEEX = "CREATEEX";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDESAMAJOR = "CURDESAMAJOR";
    public static final String DATAQUERY_CURDESAMINOR = "CURDESAMINOR";
    public static final String DATAQUERY_CURSYSAPI = "CURSYSAPI";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDESAMAJOR = "CURDESAMAJOR";
    public static final String DATASET_CURDESAMINOR = "CURDESAMINOR";
    public static final String DATASET_CURSYSAPI = "CURSYSAPI";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void createEx(PSDESARSDTO dto) throws Throwable;

    public Page<PSDESARSDTO> fetchCurDESAMajor(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDESARSDTO> fetchCurDESAMinor(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDESARSDTO> fetchCurSysAPI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDESARSDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
