package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEFIELD")
public interface IPSDEFieldService
extends IPSModelDEService<PSDEFieldDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_AJAXFILLDVT = "AJAXFILLDVT";
    public static final String ACTION_AJAXFILLDATATYPE = "AJAXFILLDATATYPE";
    public static final String ACTION_AUTOCODENAME = "AUTOCODENAME";
    public static final String ACTION_CHANGEDEFTYPE = "CHANGEDEFTYPE";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEDEFAULTINPUTTIP = "CREATEDEFAULTINPUTTIP";
    public static final String ACTION_CREATEDEFAULTVR = "CREATEDEFAULTVR";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_MAKELINKMODE = "MAKELINKMODE";
    public static final String ACTION_MAKEREALMODE = "MAKEREALMODE";
    public static final String ACTION_RESETREFS = "RESETREFS";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDE = "CURDE";
    public static final String DATAQUERY_CURDERMAJORDE = "CURDERMAJORDE";
    public static final String DATAQUERY_CURDERMINORDE = "CURDERMINORDE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_KEY = "KEY";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURDE = "CURDE";
    public static final String DATASET_CURDERMAJORDE = "CURDERMAJORDE";
    public static final String DATASET_CURDERMINORDE = "CURDERMINORDE";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_KEY = "KEY";

    public void ajaxFillDVT(PSDEFieldDTO dto) throws Throwable;

    public void ajaxFillDataType(PSDEFieldDTO dto) throws Throwable;

    public void autoCodeName(PSDEFieldDTO dto) throws Throwable;

    public void changeDEFType(PSDEFieldDTO dto) throws Throwable;

    public void createDefaultInputTip(PSDEFieldDTO dto) throws Throwable;

    public void createDefaultVR(PSDEFieldDTO dto) throws Throwable;

    public void makeLinkMode(PSDEFieldDTO dto) throws Throwable;

    public void makeRealMode(PSDEFieldDTO dto) throws Throwable;

    public void resetRefs(PSDEFieldDTO dto) throws Throwable;

    public Page<PSDEFieldDTO> fetchCurDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFieldDTO> fetchCurDERMajorDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFieldDTO> fetchCurDERMinorDE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFieldDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFieldDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDEFieldDTO> fetchKey(ISearchContextDTO searchContext) throws Throwable;
}
