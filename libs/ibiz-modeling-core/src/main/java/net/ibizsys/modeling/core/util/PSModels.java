package net.ibizsys.modeling.core.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Stable names used by the modeling service data-entity layer.
 *
 * <p>This source milestone contains the names required by the core security,
 * service, and model-instance paths. The remaining generated model names will
 * be added alongside their hand-written DTOs instead of being copied from the
 * CFR output wholesale.</p>
 */
public final class PSModels {

    public static final String PSSYSTEM = "PSSYSTEM";
    public static final String PSMODULE = "PSMODULE";
    public static final String PSDATAENTITY = "PSDATAENTITY";
    public static final String PSDEFIELD = "PSDEFIELD";
    public static final String PSDER = "PSDER";
    public static final String PSAPPDERS = "PSAPPDERS";
    public static final String PSAPPDEVIEW = "PSAPPDEVIEW";
    public static final String PSAPPFUNC = "PSAPPFUNC";
    public static final String PSAPPLOGIC = "PSAPPLOGIC";
    public static final String PSAPPMENU = "PSAPPMENU";
    public static final String PSAPPMENUITEM = "PSAPPMENUITEM";
    public static final String PSAPPMODULE = "PSAPPMODULE";
    public static final String PSAPPVIEW = "PSAPPVIEW";
    public static final String PSAPPWF = "PSAPPWF";
    public static final String PSCODELIST = "PSCODELIST";
    public static final String PSCODEITEM = "PSCODEITEM";
    public static final String PSDBTYPE = "PSDBTYPE";
    public static final String PSDBVALUEOP = "PSDBVALUEOP";

    public static final String PSDCDEPLOYCENTER = "PSDCDEPLOYCENTER";
    public static final String PSDCMSPLATFORM = "PSDCMSPLATFORM";
    public static final String PSDCMSPLATFORMNODE = "PSDCMSPLATFORMNODE";
    public static final String PSDCWORKSPACE = "PSDCWORKSPACE";
    public static final String PSDEVCENTER = "PSDEVCENTER";
    public static final String PSDEVCENTERDBINST = "PSDEVCENTERDBINST";
    public static final String PSDEVCENTERSVN = "PSDEVCENTERSVN";
    public static final String PSDEVSLN = "PSDEVSLN";
    public static final String PSDEVSLNMSDEPAPI = "PSDEVSLNMSDEPAPI";
    public static final String PSDEVSLNMSDEPAPP = "PSDEVSLNMSDEPAPP";
    public static final String PSDEVSLNMSDEPFUNC = "PSDEVSLNMSDEPFUNC";
    public static final String PSDEVSLNMSDEPLOY = "PSDEVSLNMSDEPLOY";
    public static final String PSDEVSLNPIPELINE = "PSDEVSLNPIPELINE";
    public static final String PSDEVSLNPIPELINELOG = "PSDEVSLNPIPELINELOG";
    public static final String PSDEVSLNPIPELINESTAGE = "PSDEVSLNPIPELINESTAGE";
    public static final String PSDEVSLNPIPELINESTEP = "PSDEVSLNPIPELINESTEP";
    public static final String PSDEVSLNRES = "PSDEVSLNRES";
    public static final String PSDEVSLNSYS = "PSDEVSLNSYS";
    public static final String PSDEVSLNSYSAPI = "PSDEVSLNSYSAPI";
    public static final String PSDEVSLNSYSAPP = "PSDEVSLNSYSAPP";
    public static final String PSDEVSLNSYSBAK = "PSDEVSLNSYSBAK";
    public static final String PSDEVSLNSYSDEPINST = "PSDEVSLNSYSDEPINST";
    public static final String PSDEVSLNSYSDYNAINST = "PSDEVSLNSYSDYNAINST";
    public static final String PSDEVSLNSYSREF = "PSDEVSLNSYSREF";
    public static final String PSDEVSLNSYSSRV = "PSDEVSLNSYSSRV";
    public static final String PSDEVSLNTEMPL = "PSDEVSLNTEMPL";
    public static final String PSDEVSLNUSER = "PSDEVSLNUSER";
    public static final String PSDEVUSER = "PSDEVUSER";
    public static final String PSDEVUSEROBJ = "PSDEVUSEROBJ";

    public static final String PSDEACTION = "PSDEACTION";
    public static final String PSDEACTIONGROUP = "PSDEACTIONGROUP";
    public static final String PSDEACTIONLOGIC = "PSDEACTIONLOGIC";
    public static final String PSDEACTIONPARAM = "PSDEACTIONPARAM";
    public static final String PSDEACTIONVR = "PSDEACTIONVR";
    public static final String PSDECHART = "PSDECHART";
    public static final String PSDEDBCFG = "PSDEDBCFG";
    public static final String PSDEDBINDEX = "PSDEDBINDEX";
    public static final String PSDEDBTABLE = "PSDETABLE";
    public static final String PSDEDQCODE = "PSDEDQCODE";
    public static final String PSDEDQCOND = "PSDEDQCOND";
    public static final String PSDEDQJOIN = "PSDEDQJOIN";
    public static final String PSDEFORM = "PSDEFORM";
    public static final String PSDEFORMDETAIL = "PSDEFORMDETAIL";
    public static final String PSDEFORMLOGIC = "PSDEFORMLOGIC";
    public static final String PSDEGRID = "PSDEGRID";
    public static final String PSDEGRIDCOL = "PSDEGRIDCOL";
    public static final String PSDEGRIDLOGIC = "PSDEGRIDLOGIC";
    public static final String PSDELIST = "PSDELIST";
    public static final String PSDELISTITEM = "PSDELISTITEM";
    public static final String PSDELISTLOGIC = "PSDELISTLOGIC";
    public static final String PSDELOGIC = "PSDELOGIC";
    public static final String PSDEMAP = "PSDEMAP";
    public static final String PSDENOTIFY = "PSDENOTIFY";
    public static final String PSDEOPPRIV = "PSDEOPPRIV";
    public static final String PSDESERVICEAPI = "PSDESERVICEAPI";
    public static final String PSDETOOLBAR = "PSDETOOLBAR";
    public static final String PSDETOOLBARLOGIC = "PSDETOOLBARLOGIC";
    public static final String PSDETREEVIEW = "PSDETREEVIEW";
    public static final String PSDETREELOGIC = "PSDETREELOGIC";
    public static final String PSDEVIEWBASE = "PSDEVIEWBASE";
    public static final String PSDEWIZARD = "PSDEWIZARD";
    public static final String PSDEWIZARDLOGIC = "PSDEWIZARDLOGIC";

    public static final String PSMODELRT = "PSMODELRT";
    public static final String PSMODELRTCFG = "PSMODELRTCFG";
    public static final String PSSYSAPP = "PSSYSAPP";
    public static final String PSSYSBACKSERVICE = "PSSYSBACKSERVICE";
    public static final String PSSYSDBSCHEME = "PSSYSDBSCHEME";
    public static final String PSSYSDBTABLE = "PSSYSDBTABLE";
    public static final String PSSYSMODELCHGLOG = "PSSYSDBCHGLOG";
    public static final String PSSYSMODELFOLDER = "PSSYSMODELFOLDER";
    public static final String PSSYSMODELFOLDERITEM = "PSSYSMODELFOLDERITEM";
    public static final String PSSYSMODELINST = "PSSYSMODELINST";
    public static final String PSSYSMODELLOG = "PSSYSMODELLOG";
    public static final String PSSYSRUNSESSION = "PSSYSRUNSESSION";
    public static final String PSSYSVALUERULE = "PSSYSVALUERULE";
    public static final String PSSYSVIEWPANELMODEL = "PSSYSVIEWPANELMODEL";
    public static final String PSWORKFLOW = "PSWORKFLOW";

    private static final Map<String, String> MODEL_INSTANCE_DATA_ENTITIES = new HashMap<>();
    private static final Map<String, String> CONFIG_INSTANCE_DATA_ENTITIES = new HashMap<>();

    static {
        registerModel(PSDEACTION);
        registerModel(PSDEACTIONPARAM);
        registerModel(PSDEACTIONVR);
        registerModel(PSDEDBINDEX);
        registerModel(PSDEFORM);
        registerModel(PSDEFORMDETAIL);
        registerModel(PSDEGRID);
        registerModel(PSDEGRIDCOL);
        registerModel(PSDELIST);
        registerModel(PSDELISTITEM);
        registerModel(PSDETOOLBAR);
        registerModel(PSDEVIEWBASE);
        registerModel(PSDEVSLNSYS);
        registerModel(PSDEVSLNSYSAPI);
        registerModel(PSDEVSLNSYSAPP);
        registerModel(PSDEVCENTER);
        registerModel(PSMODELRT);
        registerModel(PSSYSMODELINST);
        registerModel(PSSYSRUNSESSION);

        registerConfig(PSDBTYPE);
        registerConfig(PSDBVALUEOP);
        registerConfig(PSDEDBCFG);
        registerConfig(PSDEDBTABLE);
        registerConfig(PSDEVCENTERDBINST);
    }

    private PSModels() {
    }

    public static boolean isModelInstDataEntity(String dataEntityName) {
        return MODEL_INSTANCE_DATA_ENTITIES.containsKey(dataEntityName);
    }

    public static boolean isConfigInstDataEntity(String dataEntityName) {
        return CONFIG_INSTANCE_DATA_ENTITIES.containsKey(dataEntityName);
    }

    public static List<String> getModelInstDataEntities() {
        return Collections.unmodifiableList(new ArrayList<>(MODEL_INSTANCE_DATA_ENTITIES.keySet()));
    }

    public static String getModelInstDataEntityTable(String dataEntityName) {
        return MODEL_INSTANCE_DATA_ENTITIES.get(dataEntityName);
    }

    public static String getConfigInstDataEntityTable(String dataEntityName) {
        return CONFIG_INSTANCE_DATA_ENTITIES.get(dataEntityName);
    }

    private static void registerModel(String dataEntityName) {
        MODEL_INSTANCE_DATA_ENTITIES.put(dataEntityName, "T_SRF" + dataEntityName);
    }

    private static void registerConfig(String dataEntityName) {
        CONFIG_INSTANCE_DATA_ENTITIES.put(dataEntityName, "T_SRF" + dataEntityName);
    }
}