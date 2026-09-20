package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVSLNSYS")
public interface IPSDevSlnSysService
extends IPSModelDEService<PSDevSlnSysDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSLN = "CURSLN";
    public static final String DATAQUERY_CURSLNTRUNK = "CURSLNTRUNK";
    public static final String DATAQUERY_CURSYSBRANCH = "CURSYSBRANCH";
    public static final String DATAQUERY_CURUSER = "CURUSER";
    public static final String DATAQUERY_CURUSER2 = "CURUSER2";
    public static final String DATAQUERY_CURUSER3 = "CURUSER3";
    public static final String DATAQUERY_CURUSER4 = "CURUSER4";
    public static final String DATAQUERY_CURUSERTRUNK = "CURUSERTRUNK";
    public static final String DATAQUERY_CURUSERTRUNK2 = "CURUSERTRUNK2";
    public static final String DATAQUERY_CURUSERTRUNK3 = "CURUSERTRUNK3";
    public static final String DATAQUERY_CURUSERTRUNK4 = "CURUSERTRUNK4";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_ONLINE = "ONLINE";
    public static final String DATAQUERY_TRUNK = "TRUNK";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSLN = "CURSLN";
    public static final String DATASET_CURSLNTRUNK = "CURSLNTRUNK";
    public static final String DATASET_CURSYSBRANCH = "CURSYSBRANCH";
    public static final String DATASET_CURUSER = "CURUSER";
    public static final String DATASET_CURUSERTRUNK = "CURUSERTRUNK";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_ONLINE = "ONLINE";
    public static final String DATASET_TRUNK = "TRUNK";

    public Page<PSDevSlnSysDTO> fetchCurSln(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnSysDTO> fetchCurSlnTrunk(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnSysDTO> fetchCurSysBranch(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnSysDTO> fetchCurUser(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnSysDTO> fetchCurUserTrunk(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnSysDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnSysDTO> fetchOnline(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnSysDTO> fetchTrunk(ISearchContextDTO searchContext) throws Throwable;
}
