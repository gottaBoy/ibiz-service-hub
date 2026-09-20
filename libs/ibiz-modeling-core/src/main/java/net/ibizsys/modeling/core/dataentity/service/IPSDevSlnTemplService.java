package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnTemplDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVSLNTEMPL")
public interface IPSDevSlnTemplService
extends IPSModelDEService<PSDevSlnTemplDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_GETTEMPLREPOURL = "GETTEMPLREPOURL";
    public static final String ACTION_PUBTEMPL = "PUBTEMPL";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSLN = "CURSLN";
    public static final String DATASET_CURUSER = "CURUSER";
    public static final String DATASET_CURUSER3 = "CURUSER3";
    public static final String DATASET_CURUSER4 = "CURUSER4";
    public static final String DATASET_CURUSERALL = "CURUSERALL";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public Page<PSDevSlnTemplDTO> fetchCurSln(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnTemplDTO> fetchCurUser(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnTemplDTO> fetchCurUser3(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnTemplDTO> fetchCurUser4(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnTemplDTO> fetchCurUserAll(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnTemplDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
