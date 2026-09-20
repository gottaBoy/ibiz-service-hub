package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysAPIDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEVSLNSYSAPI")
public interface IPSDevSlnSysAPIService
extends IPSModelDEService<PSDevSlnSysAPIDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_INITTESTPROJECTS = "INITTESTPROJECTS";
    public static final String ACTION_RUNMODELTESTPROJECT = "RUNMODELTESTPROJECT";
    public static final String ACTION_RUNUNITTESTPROJECT = "RUNUNITTESTPROJECT";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURUSER = "CURUSER";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void initTestProjects(PSDevSlnSysAPIDTO dto) throws Throwable;

    public void runModelTestProject(PSDevSlnSysAPIDTO dto) throws Throwable;

    public void runUnitTestProject(PSDevSlnSysAPIDTO dto) throws Throwable;

    public Page<PSDevSlnSysAPIDTO> fetchCurUser(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDevSlnSysAPIDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
