package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSSYSPFPLUGIN")
public interface IPSSysPFPluginService
extends IPSModelDEService<PSSysPFPluginDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CALCPLUGINTYPE = "CALCPLUGINTYPE";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_CURSYSACI = "CURSYSACI";
    public static final String DATAQUERY_CURSYSAPPCOUNTER = "CURSYSAPPCOUNTER";
    public static final String DATAQUERY_CURSYSAPPUTIL = "CURSYSAPPUTIL";
    public static final String DATAQUERY_CURSYSAPPVALUERULE = "CURSYSAPPVALUERULE";
    public static final String DATAQUERY_CURSYSCDV = "CURSYSCDV";
    public static final String DATAQUERY_CURSYSCHARTAXIS = "CURSYSCHARTAXIS";
    public static final String DATAQUERY_CURSYSCHARTCS = "CURSYSCHARTCS";
    public static final String DATAQUERY_CURSYSCHARTSERIES = "CURSYSCHARTSERIES";
    public static final String DATAQUERY_CURSYSCUSTOM = "CURSYSCUSTOM";
    public static final String DATAQUERY_CURSYSDCR = "CURSYSDCR";
    public static final String DATAQUERY_CURSYSDEDATAEXPORT = "CURSYSDEDATAEXPORT";
    public static final String DATAQUERY_CURSYSDEDATAIMPORT = "CURSYSDEDATAIMPORT";
    public static final String DATAQUERY_CURSYSDEFVALUERULE = "CURSYSDEFVALUERULE";
    public static final String DATAQUERY_CURSYSDEMETHOD = "CURSYSDEMETHOD";
    public static final String DATAQUERY_CURSYSDEUIACTION = "CURSYSDEUIACTION";
    public static final String DATAQUERY_CURSYSDLR = "CURSYSDLR";
    public static final String DATAQUERY_CURSYSDVI = "CURSYSDVI";
    public static final String DATAQUERY_CURSYSDATAVIEW = "CURSYSDATAVIEW";
    public static final String DATAQUERY_CURSYSECS = "CURSYSECS";
    public static final String DATAQUERY_CURSYSEF = "CURSYSEF";
    public static final String DATAQUERY_CURSYSFUC = "CURSYSFUC";
    public static final String DATAQUERY_CURSYSGCR = "CURSYSGCR";
    public static final String DATAQUERY_CURSYSGRID = "CURSYSGRID";
    public static final String DATAQUERY_CURSYSLIR = "CURSYSLIR";
    public static final String DATAQUERY_CURSYSPC = "CURSYSPC";
    public static final String DATAQUERY_CURSYSPTB = "CURSYSPTB";
    public static final String DATAQUERY_CURSYSSB = "CURSYSSB";
    public static final String DATAQUERY_CURSYSSBI = "CURSYSSBI";
    public static final String DATAQUERY_CURSYSSF = "CURSYSSF";
    public static final String DATAQUERY_CURSYSTB = "CURSYSTB";
    public static final String DATAQUERY_CURSYSTBI = "CURSYSTBI";
    public static final String DATAQUERY_CURSYSTREE = "CURSYSTREE";
    public static final String DATAQUERY_CURSYSTREEEXPBAR = "CURSYSTREEEXPBAR";
    public static final String DATAQUERY_CURSYSUE = "CURSYSUE";
    public static final String DATAQUERY_CURSYSULN = "CURSYSULN";
    public static final String DATAQUERY_CURSYSWITHICON = "CURSYSWITHICON";
    public static final String DATAQUERY_CURSYSWIZARDPANEL = "CURSYSWIZARDPANEL";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SIMPLE = "SIMPLE";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_CURSYSACI = "CURSYSACI";
    public static final String DATASET_CURSYSAPPCOUNTER = "CURSYSAPPCOUNTER";
    public static final String DATASET_CURSYSAPPUTIL = "CURSYSAPPUTIL";
    public static final String DATASET_CURSYSAPPVALUERULE = "CURSYSAPPVALUERULE";
    public static final String DATASET_CURSYSCDV = "CURSYSCDV";
    public static final String DATASET_CURSYSCHARTAXIS = "CURSYSCHARTAXIS";
    public static final String DATASET_CURSYSCHARTCS = "CURSYSCHARTCS";
    public static final String DATASET_CURSYSCHARTSERIES = "CURSYSCHARTSERIES";
    public static final String DATASET_CURSYSCUSTOM = "CURSYSCUSTOM";
    public static final String DATASET_CURSYSDCR = "CURSYSDCR";
    public static final String DATASET_CURSYSDEDATAEXPORT = "CURSYSDEDATAEXPORT";
    public static final String DATASET_CURSYSDEDATAIMPORT = "CURSYSDEDATAIMPORT";
    public static final String DATASET_CURSYSDEFVALUERULE = "CURSYSDEFVALUERULE";
    public static final String DATASET_CURSYSDEMETHOD = "CURSYSDEMETHOD";
    public static final String DATASET_CURSYSDLR = "CURSYSDLR";
    public static final String DATASET_CURSYSDVI = "CURSYSDVI";
    public static final String DATASET_CURSYSDATAVIEW = "CURSYSDATAVIEW";
    public static final String DATASET_CURSYSECS = "CURSYSECS";
    public static final String DATASET_CURSYSEF = "CURSYSEF";
    public static final String DATASET_CURSYSFUC = "CURSYSFUC";
    public static final String DATASET_CURSYSGCR = "CURSYSGCR";
    public static final String DATASET_CURSYSGRID = "CURSYSGRID";
    public static final String DATASET_CURSYSLIR = "CURSYSLIR";
    public static final String DATASET_CURSYSPC = "CURSYSPC";
    public static final String DATASET_CURSYSPTB = "CURSYSPTB";
    public static final String DATASET_CURSYSSB = "CURSYSSB";
    public static final String DATASET_CURSYSSBI = "CURSYSSBI";
    public static final String DATASET_CURSYSSF = "CURSYSSF";
    public static final String DATASET_CURSYSTB = "CURSYSTB";
    public static final String DATASET_CURSYSTBI = "CURSYSTBI";
    public static final String DATASET_CURSYSTREE = "CURSYSTREE";
    public static final String DATASET_CURSYSTREEEXPBAR = "CURSYSTREEEXPBAR";
    public static final String DATASET_CURSYSUE = "CURSYSUE";
    public static final String DATASET_CURSYSULN = "CURSYSULN";
    public static final String DATASET_CURSYSWITHICON = "CURSYSWITHICON";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void calcPluginType(PSSysPFPluginDTO dto) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysACI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysAppCounter(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysAppUtil(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysAppValueRule(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysCDV(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysChartAxis(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysChartCS(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysChartSeries(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysCustom(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysDCR(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysDEDataExport(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysDEDataImport(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysDEFValueRule(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysDEMethod(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysDLR(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysDVI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysDataView(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysECS(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysEF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysFUC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysGCR(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysGrid(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysLIR(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysPC(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysPTB(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysSB(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysSBI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysSF(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysTB(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysTBI(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysTree(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysTreeExpBar(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysUE(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysULN(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchCurSysWithIcon(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSSysPFPluginDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
