package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDBCfgDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSTEMDBCFG")
public interface IPSSystemDBCfgService
extends IPSModelDEService<PSSystemDBCfgDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_X_ADDPUBSYSDBMODELTASK = "X_ADDPUBSYSDBMODELTASK";
    public static final String ACTION_X_ADDSYNCSUBSYSDBMODELTASK = "X_ADDSYNCSUBSYSDBMODELTASK";
    public static final String ACTION_X_ADDSYNCSYSDBMODELTASK = "X_ADDSYNCSYSDBMODELTASK";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_OPENDBTOOL = "OPENDBTOOL";
    public static final String ACTION_OPENJITDBTOOL = "OPENJITDBTOOL";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYS2 = "CURSYS2";
    public static final String DATAQUERY_CURSYS3 = "CURSYS3";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYS2 = "CURSYS2";
    public static final String DATASET_CURSYS3 = "CURSYS3";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void addPubSysDBModelTask(PSSystemDBCfgDTO dto) throws Throwable;

    public void addSyncSubSysDBModelTask(PSSystemDBCfgDTO dto) throws Throwable;

    public void addSyncSysDBModelTask(PSSystemDBCfgDTO dto) throws Throwable;

    public void openDBTool(PSSystemDBCfgDTO dto) throws Throwable;

    public void openJITDBTool(PSSystemDBCfgDTO dto) throws Throwable;

    public Page<PSSystemDBCfgDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSystemDBCfgDTO> fetchCurSys2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSystemDBCfgDTO> fetchCurSys3(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSystemDBCfgDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
