package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppDEViewDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSAPPDEVIEW")
public interface IPSAppDEViewService
extends IPSModelDEService<PSAppDEViewDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_JITPREVIEW = "JITPREVIEW";
    public static final String ACTION_JITPREVIEW2 = "JITPREVIEW2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURAPP = "CURAPP";
    public static final String DATAQUERY_CURMOD = "CURMOD";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURAPP = "CURAPP";
    public static final String DATASET_CURMOD = "CURMOD";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSAppDEViewDTO> fetchCurApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSAppDEViewDTO> fetchCurMod(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSAppDEViewDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
