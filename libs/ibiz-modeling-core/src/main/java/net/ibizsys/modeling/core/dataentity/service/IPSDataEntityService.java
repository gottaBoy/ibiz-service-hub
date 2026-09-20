package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier("PSDATAENTITY")
public interface IPSDataEntityService extends IPSModelDEService<PSDataEntityDTO, ISearchContextDTO> {
    String ACTION_CREATE = "CREATE";
    String ACTION_UPDATE = "UPDATE";
    String ACTION_REMOVE = "REMOVE";
    String ACTION_GET = "GET";
    String ACTION_GETDRAFT = "GETDRAFT";
    String ACTION_ASYNC_AUTOSYNCDEFIELDS = "ASYNC_AUTOSYNCDEFIELDS";
    String ACTION_ASYNC_INITMODEL = "ASYNC_INITMODEL";
    String ACTION_AUTOSYNCDEFIELDS = "AUTOSYNCDEFIELDS";
    String ACTION_CHANGESTORAGE = "CHANGESTORAGE";
    String ACTION_CHECKKEY = "CHECKKEY";
    String ACTION_ENABLEMOB = "ENABLEMOB";
    String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    String ACTION_FIXLANRES = "FIXLANRES";
    String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    String ACTION_INITDEDBTABLES = "INITDEDBTABLES";
    String ACTION_INITDEIMAGE = "INITDEIMAGE";
    String ACTION_INITDEMSVIEWS = "INITDEMSVIEWS";
    String ACTION_INITLANRES = "INITLANRES";
    String ACTION_INITMODEL = "INITMODEL";
    String ACTION_INITVIEWMSGFIELDS = "INITVIEWMSGFIELDS";
    String ACTION_INITWFFIELDS = "INITWFFIELDS";
    String ACTION_SAVE = "SAVE";
    String ACTION_SYNCINHERITDEFIELD = "SYNCINHERITDEFIELD";
    String DATAQUERY_CURSYS = "CURSYS";
    String DATAQUERY_CURSYSMODTAG = "CURSYSMODTAG";
    String DATAQUERY_CURSYSNOTSUBSYSDE = "CURSYSNOTSUBSYSDE";
    String DATAQUERY_CURSYSSUBSYSDE = "CURSYSSUBSYSDE";
    String DATAQUERY_CURSYSSUBSYSDE2 = "CURSYSSUBSYSDE2";
    String DATAQUERY_DEFAULT = "DEFAULT";
    String DATAQUERY_VIEW = "VIEW";
    String DATASET_CURMODULE = "CURMODULE";
    String DATASET_CURSYS = "CURSYS";
    String DATASET_CURSYSAPP = "CURSYSAPP";
    String DATASET_CURSYSMODTAG = "CURSYSMODTAG";
    String DATASET_CURSYSNOTSUBSYSDE = "CURSYSNOTSUBSYSDE";
    String DATASET_CURSYSNOTSUBSYSDE2 = "CURSYSNOTSUBSYSDE2";
    String DATASET_CURSYSSUBSYSDE = "CURSYSSUBSYSDE";
    String DATASET_DEFAULT = "DEFAULT";
    String DATASET_RECENT = "RECENT";

    Object async_AutoSyncDEFields(PSDataEntityDTO entity) throws Throwable;

    Object async_InitModel(PSDataEntityDTO entity) throws Throwable;

    void autoSyncDEFields(PSDataEntityDTO entity) throws Throwable;

    void changeStorage(PSDataEntityDTO entity) throws Throwable;

    void enableMob(PSDataEntityDTO entity) throws Throwable;

    void fixLanRes(PSDataEntityDTO entity) throws Throwable;

    void initDEDBTables(PSDataEntityDTO entity) throws Throwable;

    void initDEImage(PSDataEntityDTO entity) throws Throwable;

    void initDEMSViews(PSDataEntityDTO entity) throws Throwable;

    void initLanRes(PSDataEntityDTO entity) throws Throwable;

    void initViewMsgFields(PSDataEntityDTO entity) throws Throwable;

    void initWFFields(PSDataEntityDTO entity) throws Throwable;

    void syncInheritDEField(PSDataEntityDTO entity) throws Throwable;

    Page<PSDataEntityDTO> fetchCurModule(ISearchContextDTO context) throws Throwable;

    Page<PSDataEntityDTO> fetchCurSys(ISearchContextDTO context) throws Throwable;

    Page<PSDataEntityDTO> fetchCurSysApp(ISearchContextDTO context) throws Throwable;

    Page<PSDataEntityDTO> fetchCurSysModTag(ISearchContextDTO context) throws Throwable;

    Page<PSDataEntityDTO> fetchCurSysNotSubSysDE(ISearchContextDTO context) throws Throwable;

    Page<PSDataEntityDTO> fetchCurSysNotSubSysDE2(ISearchContextDTO context) throws Throwable;

    Page<PSDataEntityDTO> fetchCurSysSubSysDE(ISearchContextDTO context) throws Throwable;

    Page<PSDataEntityDTO> fetchDefault(ISearchContextDTO context) throws Throwable;

    Page<PSDataEntityDTO> fetchRecent(ISearchContextDTO context) throws Throwable;
}