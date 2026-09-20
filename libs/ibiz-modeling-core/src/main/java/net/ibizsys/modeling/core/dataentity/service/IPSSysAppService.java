package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSAPP")
public interface IPSSysAppService
extends IPSModelDEService<PSSysAppDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_BATADDDATAENTITIES = "BATADDDATAENTITIES";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_GETCUR = "GETCUR";
    public static final String ACTION_GETQUICKAPPDEVIEW = "GETQUICKAPPDEVIEW";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_INITMODEL = "INITMODEL";
    public static final String ACTION_INITPSAPPMODULES = "INITPSAPPMODULES";
    public static final String ACTION_OPENQUICKAPP = "OPENQUICKAPP";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSMOBAPP = "CURSYSMOBAPP";
    public static final String DATAQUERY_CURSYSMOBWFAPP = "CURSYSMOBWFAPP";
    public static final String DATAQUERY_CURSYSWFAPP = "CURSYSWFAPP";
    public static final String DATAQUERY_CURSYSWEBAPP = "CURSYSWEBAPP";
    public static final String DATAQUERY_CURSYSWEBWFAPP = "CURSYSWEBWFAPP";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_MOBAPP = "MOBAPP";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATAQUERY_WEBAPP = "WEBAPP";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSMOBAPP = "CURSYSMOBAPP";
    public static final String DATASET_CURSYSMOBWFAPP = "CURSYSMOBWFAPP";
    public static final String DATASET_CURSYSWFAPP = "CURSYSWFAPP";
    public static final String DATASET_CURSYSWEBAPP = "CURSYSWEBAPP";
    public static final String DATASET_CURSYSWEBWFAPP = "CURSYSWEBWFAPP";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_FORMTYPE = "FORMTYPE";
    public static final String DATASET_MOBAPP = "MOBAPP";
    public static final String DATASET_WEBAPP = "WEBAPP";

    public void batAddDataEntities(PSSysAppDTO dto) throws Throwable;

    public PSSysAppDTO getCur(String value) throws Throwable;

    public PSSysAppDTO getQuickAppDEView(String value) throws Throwable;

    public void initPSAppModules(PSSysAppDTO dto) throws Throwable;

    public void openQuickApp(PSSysAppDTO dto) throws Throwable;

    public Page<PSSysAppDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysAppDTO> fetchCurSysMobApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysAppDTO> fetchCurSysMobWFApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysAppDTO> fetchCurSysWFApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysAppDTO> fetchCurSysWebApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysAppDTO> fetchCurSysWebWFApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysAppDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysAppDTO> fetchFormType(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysAppDTO> fetchMobApp(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysAppDTO> fetchWebApp(ISearchContextDTO searchContext) throws Throwable;
}
