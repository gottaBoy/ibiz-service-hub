package net.ibizsys.modeling.core.sysutil;

import io.jsonwebtoken.lang.Assert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.ibizsys.central.cloud.core.sysutil.SysUtilRuntimeBase;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.sysutil.ISysUtilRuntimeContext;
import net.ibizsys.central.sysutil.SysUtilRuntimeContextProxy;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.modeling.core.addin.IPSModelCloner;
import net.ibizsys.modeling.core.addin.IPSModelDSLTranspiler;
import net.ibizsys.modeling.core.addin.IPSModelInitializer;
import net.ibizsys.modeling.core.addin.IPSModelV2Exchanger;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntime;
import net.ibizsys.modeling.core.sysutil.IModelEnhancerSysUtilRuntimeContext;
import net.ibizsys.modeling.core.sysutil.addin.DefaultPSModelCloner;
import net.ibizsys.modeling.core.sysutil.addin.DefaultPSModelDSLTranspiler;
import net.ibizsys.modeling.core.sysutil.addin.IModelEnhancerSysUtilRTAddin;
import net.ibizsys.modeling.core.sysutil.addin.PSAppDEViewInitializer;
import net.ibizsys.modeling.core.sysutil.addin.PSDEDataQueryDSLTranspiler;
import net.ibizsys.modeling.core.sysutil.addin.PSDEDataQueryInitializer;
import net.ibizsys.modeling.core.sysutil.addin.PSDEFieldInitializer;
import net.ibizsys.modeling.core.sysutil.addin.PSDEFormInitializer;
import net.ibizsys.modeling.core.sysutil.addin.PSDEGridInitializer;
import net.ibizsys.modeling.core.sysutil.addin.PSDELogicDSLTranspiler;
import net.ibizsys.modeling.core.sysutil.addin.PSDELogicInitializer;
import net.ibizsys.modeling.core.sysutil.addin.PSDELogicLinkDSLTranspiler;
import net.ibizsys.modeling.core.sysutil.addin.PSDELogicNodeDSLTranspiler;
import net.ibizsys.modeling.core.sysutil.addin.PSDETableInitializer;
import net.ibizsys.modeling.core.sysutil.addin.PSDEViewBaseV2Exchanger;
import net.ibizsys.modeling.core.sysutil.addin.PSDataEntityInitializer;
import net.ibizsys.modeling.core.sysutil.addin.PSSysDBSchemeV2Exchanger;
import net.ibizsys.modeling.core.sysutil.addin.PSSysRunSessionInitializer;
import net.ibizsys.modeling.core.sysutil.addin.PSWFVersionInitializer;
import net.ibizsys.modeling.core.util.IPSModelDSLNode;
import net.ibizsys.modeling.core.util.PSModelDSLCompileSession;
import net.ibizsys.modeling.core.util.PSModelDSLCompiler;
import net.ibizsys.modeling.core.util.PSModelDSLExportSession;
import net.ibizsys.modeling.core.util.PSModelDSLExporter;
import net.ibizsys.modeling.core.util.PSModelDSLMerger;
import net.ibizsys.modeling.core.util.domain.CompileModelDSLInput;
import net.ibizsys.modeling.core.util.domain.ExportModelDSLInput;
import net.ibizsys.modeling.core.util.domain.MergeModelDSLInput;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import net.ibizsys.runtime.util.IAction;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

public abstract class ModelEnhancerSysUtilRuntimeBase
extends SysUtilRuntimeBase
implements IModelEnhancerSysUtilRuntime {
    private static final Log log = LogFactory.getLog(ModelEnhancerSysUtilRuntimeBase.class);
    public static final String PSMODEL_DEFAULT = "DEFAULT";
    private Map<String, IPSModelInitializer> psModelInitializerMap = null;
    private Map<String, List<IPSModelInitializer>> psModelInitializerMap2 = new HashMap<String, List<IPSModelInitializer>>();
    private Map<String, IPSModelV2Exchanger> psModelV2ExchangerMap = null;
    private Map<String, List<IPSModelV2Exchanger>> psModelV2ExchangerMap2 = new HashMap<String, List<IPSModelV2Exchanger>>();
    private Map<String, IPSModelCloner> psModelClonerMap = null;
    private Map<String, List<IPSModelCloner>> psModelClonerMap2 = new HashMap<String, List<IPSModelCloner>>();
    private Map<String, IPSModelDSLTranspiler> psModelDSLTranspilerMap = null;
    private Map<String, List<IPSModelDSLTranspiler>> psModelDSLTranspilerMap2 = new HashMap<String, List<IPSModelDSLTranspiler>>();
    private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();

    protected ISysUtilRuntimeContext createModelRuntimeContext() {
        return new ModelEnhancerSysUtilRuntimeContextBase<IModelEnhancerSysUtilRuntime, ISysUtilRuntimeContext>(super.createModelRuntimeContext()){

            @Override
            public IModelEnhancerSysUtilRuntime getModelRuntime() {
                return ModelEnhancerSysUtilRuntimeBase.this.getSelf();
            }
        };
    }

    protected IModelEnhancerSysUtilRuntimeContext getModelRuntimeContext() {
        return (IModelEnhancerSysUtilRuntimeContext)super.getModelRuntimeContext();
    }

    private ModelEnhancerSysUtilRuntimeBase getSelf() {
        return this;
    }

    protected void onInit() throws Exception {
        this.deMethodPluginRuntimeRepo.init(this.getSystemRuntime(), true);
        super.onInit();
    }

    protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
        return this.deMethodPluginRuntimeRepo;
    }

    protected void prepareAddinRepo() throws Exception {
        this.prepareAddinRepo((IModelRuntimeContext)this.getModelRuntimeContext(), IModelEnhancerSysUtilRTAddin.class, null);
    }

    protected void onInstall() throws Exception {
        super.onInstall();
        this.psModelInitializerMap = this.getAddins(IPSModelInitializer.class, "INITIALIZER:");
        this.psModelV2ExchangerMap = this.getAddins(IPSModelV2Exchanger.class, "V2EXCHANGER:");
        this.psModelClonerMap = this.getAddins(IPSModelCloner.class, "CLONER:");
        this.psModelDSLTranspilerMap = this.getAddins(IPSModelDSLTranspiler.class, "DSLTRANSPILER:");
        this.onRegisterDEMethodPluginRuntimes();
    }

    protected void onRegisterDEMethodPluginRuntimes() throws Exception {
    }

    protected void onUninstall() throws Throwable {
        this.getDEMethodPluginRuntimeRepo().shutdown();
        if (!ObjectUtils.isEmpty(this.psModelInitializerMap)) {
            this.psModelInitializerMap.clear();
        }
        if (!ObjectUtils.isEmpty(this.psModelInitializerMap2)) {
            this.psModelInitializerMap2.clear();
        }
        if (!ObjectUtils.isEmpty(this.psModelV2ExchangerMap)) {
            this.psModelV2ExchangerMap.clear();
        }
        if (!ObjectUtils.isEmpty(this.psModelV2ExchangerMap2)) {
            this.psModelV2ExchangerMap2.clear();
        }
        if (!ObjectUtils.isEmpty(this.psModelClonerMap)) {
            this.psModelClonerMap.clear();
        }
        if (!ObjectUtils.isEmpty(this.psModelClonerMap2)) {
            this.psModelClonerMap2.clear();
        }
        if (!ObjectUtils.isEmpty(this.psModelDSLTranspilerMap)) {
            this.psModelDSLTranspilerMap.clear();
        }
        if (!ObjectUtils.isEmpty(this.psModelDSLTranspilerMap2)) {
            this.psModelDSLTranspilerMap2.clear();
        }
        super.onUninstall();
    }

    @Override
    public void preparePSModel(String strPSModelName, Object[] args, int nPrepareMode) {
        IPSModelInitializer iPSModelInitializer;
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelInitializer> list = this.psModelInitializerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            for (IPSModelInitializer iPSModelInitializer2 : list) {
                if (!iPSModelInitializer2.prepare(args, nPrepareMode)) continue;
                return;
            }
        }
        if ((iPSModelInitializer = this.psModelInitializerMap.get(strPSModelName)) != null && iPSModelInitializer.prepare(args, nPrepareMode)) {
            return;
        }
    }

    @Override
    public void initializePSModel(String strPSModelName, Object[] args) {
        IPSModelInitializer iPSModelInitializer;
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelInitializer> list = this.psModelInitializerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            for (IPSModelInitializer iPSModelInitializer2 : list) {
                if (!iPSModelInitializer2.initialize(args)) continue;
                return;
            }
        }
        if ((iPSModelInitializer = this.psModelInitializerMap.get(strPSModelName)) != null && iPSModelInitializer.initialize(args)) {
            return;
        }
    }

    @Override
    public boolean containsPSModelInitializer(String strPSModelName) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelInitializer> list = this.psModelInitializerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            return true;
        }
        IPSModelInitializer iPSModelInitializer = this.psModelInitializerMap.get(strPSModelName);
        return iPSModelInitializer != null;
    }

    @Override
    public void registerPSModelInitializer(String strPSModelName, IPSModelInitializer iPSModelInitializer) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)iPSModelInitializer, (String)"\u672a\u4f20\u5165\u6a21\u578b\u521d\u59cb\u5316\u5bf9\u8c61");
        strPSModelName = strPSModelName.toUpperCase();
        Map<String, List<IPSModelInitializer>> map = this.psModelInitializerMap2;
        synchronized (map) {
            List<IPSModelInitializer> last = this.psModelInitializerMap2.get(strPSModelName);
            ArrayList<IPSModelInitializer> list = new ArrayList<IPSModelInitializer>();
            if (last != null) {
                list.addAll(last);
            }
            if (!list.contains(iPSModelInitializer)) {
                list.add(iPSModelInitializer);
                Collections.sort(list, new Comparator<IPSModelInitializer>(){

                    @Override
                    public int compare(IPSModelInitializer o1, IPSModelInitializer o2) {
                        return Integer.compare(o1.getPriority(), o2.getPriority());
                    }
                });
            }
            this.psModelInitializerMap2.put(strPSModelName, list);
        }
    }

    @Override
    public boolean unregisterPSModelInitializer(String strPSModelName, IPSModelInitializer iPSModelInitializer) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)iPSModelInitializer, (String)"\u672a\u4f20\u5165\u6a21\u578b\u521d\u59cb\u5316\u5bf9\u8c61");
        strPSModelName = strPSModelName.toUpperCase();
        Map<String, List<IPSModelInitializer>> map = this.psModelInitializerMap2;
        synchronized (map) {
            List<IPSModelInitializer> last = this.psModelInitializerMap2.get(strPSModelName);
            ArrayList<IPSModelInitializer> list = new ArrayList<IPSModelInitializer>();
            if (last != null) {
                list.addAll(last);
            }
            if (list.contains(iPSModelInitializer)) {
                list.remove(iPSModelInitializer);
                this.psModelInitializerMap2.put(strPSModelName, list);
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean containsPSModelV2Exchanger(String strPSModelName) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelV2Exchanger> list = this.psModelV2ExchangerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            return true;
        }
        IPSModelV2Exchanger iPSModelV2Exchanger = this.psModelV2ExchangerMap.get(strPSModelName);
        return iPSModelV2Exchanger != null;
    }

    @Override
    public void registerPSModelV2Exchanger(String strPSModelName, IPSModelV2Exchanger iPSModelV2Exchanger) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)iPSModelV2Exchanger, (String)"\u672a\u4f20\u5165\u6a21\u578b\u4ea4\u4e92\u5668\u5bf9\u8c61");
        strPSModelName = strPSModelName.toUpperCase();
        Map<String, List<IPSModelV2Exchanger>> map = this.psModelV2ExchangerMap2;
        synchronized (map) {
            List<IPSModelV2Exchanger> last = this.psModelV2ExchangerMap2.get(strPSModelName);
            ArrayList<IPSModelV2Exchanger> list = new ArrayList<IPSModelV2Exchanger>();
            if (last != null) {
                list.addAll(last);
            }
            if (!list.contains(iPSModelV2Exchanger)) {
                list.add(iPSModelV2Exchanger);
                Collections.sort(list, new Comparator<IPSModelV2Exchanger>(){

                    @Override
                    public int compare(IPSModelV2Exchanger o1, IPSModelV2Exchanger o2) {
                        return Integer.compare(o1.getPriority(), o2.getPriority());
                    }
                });
            }
            this.psModelV2ExchangerMap2.put(strPSModelName, list);
        }
    }

    @Override
    public boolean unregisterPSModelV2Exchanger(String strPSModelName, IPSModelV2Exchanger iPSModelV2Exchanger) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)iPSModelV2Exchanger, (String)"\u672a\u4f20\u5165\u6a21\u578b\u4ea4\u4e92\u5668\u5bf9\u8c61");
        strPSModelName = strPSModelName.toUpperCase();
        Map<String, List<IPSModelV2Exchanger>> map = this.psModelV2ExchangerMap2;
        synchronized (map) {
            List<IPSModelV2Exchanger> last = this.psModelV2ExchangerMap2.get(strPSModelName);
            ArrayList<IPSModelV2Exchanger> list = new ArrayList<IPSModelV2Exchanger>();
            if (last != null) {
                list.addAll(last);
            }
            if (list.contains(iPSModelV2Exchanger)) {
                list.remove(iPSModelV2Exchanger);
                this.psModelV2ExchangerMap2.put(strPSModelName, list);
                return true;
            }
            return false;
        }
    }

    @Override
    public void prepareImportPSModelV2(String strPSModelName, Object[] args) {
        IPSModelV2Exchanger iPSModelV2Exchanger;
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelV2Exchanger> list = this.psModelV2ExchangerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            for (IPSModelV2Exchanger iPSModelV2Exchanger2 : list) {
                if (!iPSModelV2Exchanger2.prepareImport(args)) continue;
                return;
            }
        }
        if ((iPSModelV2Exchanger = this.psModelV2ExchangerMap.get(strPSModelName)) != null && iPSModelV2Exchanger.prepareImport(args)) {
            return;
        }
    }

    @Override
    public void finishImportPSModelV2(String strPSModelName, Object[] args, Object ret) {
        IPSModelV2Exchanger iPSModelV2Exchanger;
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelV2Exchanger> list = this.psModelV2ExchangerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            for (IPSModelV2Exchanger iPSModelV2Exchanger2 : list) {
                if (!iPSModelV2Exchanger2.finishImport(args, ret)) continue;
                return;
            }
        }
        if ((iPSModelV2Exchanger = this.psModelV2ExchangerMap.get(strPSModelName)) != null && iPSModelV2Exchanger.finishImport(args, ret)) {
            return;
        }
    }

    @Override
    public void prepareExportPSModelV2(String strPSModelName, Object[] args) {
        IPSModelV2Exchanger iPSModelV2Exchanger;
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelV2Exchanger> list = this.psModelV2ExchangerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            for (IPSModelV2Exchanger iPSModelV2Exchanger2 : list) {
                if (!iPSModelV2Exchanger2.prepareExport(args)) continue;
                return;
            }
        }
        if ((iPSModelV2Exchanger = this.psModelV2ExchangerMap.get(strPSModelName)) != null && iPSModelV2Exchanger.prepareExport(args)) {
            return;
        }
    }

    @Override
    public void finishExportPSModelV2(String strPSModelName, Object[] args, Object ret) {
        IPSModelV2Exchanger iPSModelV2Exchanger;
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelV2Exchanger> list = this.psModelV2ExchangerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            for (IPSModelV2Exchanger iPSModelV2Exchanger2 : list) {
                if (!iPSModelV2Exchanger2.finishExport(args, ret)) continue;
                return;
            }
        }
        if ((iPSModelV2Exchanger = this.psModelV2ExchangerMap.get(strPSModelName)) != null && iPSModelV2Exchanger.finishExport(args, ret)) {
            return;
        }
    }

    @Override
    public boolean containsPSModelCloner(String strPSModelName) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelCloner> list = this.psModelClonerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            return true;
        }
        IPSModelCloner iPSModelCloner = this.psModelClonerMap.get(strPSModelName);
        return iPSModelCloner != null;
    }

    @Override
    public void registerPSModelCloner(String strPSModelName, IPSModelCloner iPSModelCloner) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)iPSModelCloner, (String)"\u672a\u4f20\u5165\u6a21\u578b\u514b\u9686\u5bf9\u8c61");
        strPSModelName = strPSModelName.toUpperCase();
        Map<String, List<IPSModelCloner>> map = this.psModelClonerMap2;
        synchronized (map) {
            List<IPSModelCloner> last = this.psModelClonerMap2.get(strPSModelName);
            ArrayList<IPSModelCloner> list = new ArrayList<IPSModelCloner>();
            if (last != null) {
                list.addAll(last);
            }
            if (!list.contains(iPSModelCloner)) {
                list.add(iPSModelCloner);
                Collections.sort(list, new Comparator<IPSModelCloner>(){

                    @Override
                    public int compare(IPSModelCloner o1, IPSModelCloner o2) {
                        return Integer.compare(o1.getPriority(), o2.getPriority());
                    }
                });
            }
            this.psModelClonerMap2.put(strPSModelName, list);
        }
    }

    @Override
    public boolean unregisterPSModelCloner(String strPSModelName, IPSModelCloner iPSModelCloner) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)iPSModelCloner, (String)"\u672a\u4f20\u5165\u6a21\u578b\u514b\u9686\u5bf9\u8c61");
        strPSModelName = strPSModelName.toUpperCase();
        Map<String, List<IPSModelCloner>> map = this.psModelClonerMap2;
        synchronized (map) {
            List<IPSModelCloner> last = this.psModelClonerMap2.get(strPSModelName);
            ArrayList<IPSModelCloner> list = new ArrayList<IPSModelCloner>();
            if (last != null) {
                list.addAll(last);
            }
            if (list.contains(iPSModelCloner)) {
                list.remove(iPSModelCloner);
                this.psModelClonerMap2.put(strPSModelName, list);
                return true;
            }
            return false;
        }
    }

    @Override
    public Object copyPSModel(final String strPSModelName, final Object[] args) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        return this.executeAction("\u62f7\u8d1d\u6a21\u578b", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                return ModelEnhancerSysUtilRuntimeBase.this.onCopyPSModel(strPSModelName.toUpperCase(), args);
            }
        }, null);
    }

    protected Object onCopyPSModel(String strPSModelName, Object[] args) throws Throwable {
        IPSModelCloner iPSModelCloner;
        List<IPSModelCloner> list = this.psModelClonerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            for (IPSModelCloner iPSModelCloner2 : list) {
                if (!iPSModelCloner2.isValid(args)) continue;
                return iPSModelCloner2.copy(args);
            }
        }
        if ((iPSModelCloner = this.psModelClonerMap.get(strPSModelName)) != null && iPSModelCloner.isValid(args)) {
            return iPSModelCloner.copy(args);
        }
        if (!strPSModelName.equalsIgnoreCase(PSMODEL_DEFAULT)) {
            return this.onCopyPSModel(PSMODEL_DEFAULT, args);
        }
        throw new Exception(String.format("\u672a\u652f\u6301\u62f7\u8d1d\u6307\u5b9a\u6a21\u578b[%1$s]\u6570\u636e", strPSModelName));
    }

    @Override
    public Object pastePSModel(final String strPSModelName, final Object[] args) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        return this.executeAction("\u7c98\u8d34\u6a21\u578b", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                return ModelEnhancerSysUtilRuntimeBase.this.onPastePSModel(strPSModelName.toUpperCase(), args);
            }
        }, null);
    }

    protected Object onPastePSModel(String strPSModelName, Object[] args) throws Throwable {
        IPSModelCloner iPSModelCloner;
        List<IPSModelCloner> list = this.psModelClonerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            for (IPSModelCloner iPSModelCloner2 : list) {
                if (!iPSModelCloner2.isValid(args)) continue;
                return iPSModelCloner2.paste(args);
            }
        }
        if ((iPSModelCloner = this.psModelClonerMap.get(strPSModelName)) != null && iPSModelCloner.isValid(args)) {
            return iPSModelCloner.paste(args);
        }
        if (!strPSModelName.equalsIgnoreCase(PSMODEL_DEFAULT)) {
            return this.onPastePSModel(PSMODEL_DEFAULT, args);
        }
        throw new Exception(String.format("\u672a\u652f\u6301\u7c98\u8d34\u6307\u5b9a\u6a21\u578b[%1$s]\u6570\u636e", strPSModelName));
    }

    @Override
    public boolean containsPSModelDSLTranspiler(String strPSModelName) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        strPSModelName = strPSModelName.toUpperCase();
        List<IPSModelDSLTranspiler> list = this.psModelDSLTranspilerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list)) {
            return true;
        }
        IPSModelDSLTranspiler iPSModelDSLTranspiler = this.psModelDSLTranspilerMap.get(strPSModelName);
        return iPSModelDSLTranspiler != null;
    }

    @Override
    public void registerPSModelDSLTranspiler(String strPSModelName, IPSModelDSLTranspiler iPSModelDSLTranspiler) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)iPSModelDSLTranspiler, (String)"\u672a\u4f20\u5165\u6a21\u578bDSL\u8f6c\u6362\u5668\u5bf9\u8c61");
        strPSModelName = strPSModelName.toUpperCase();
        Map<String, List<IPSModelDSLTranspiler>> map = this.psModelDSLTranspilerMap2;
        synchronized (map) {
            List<IPSModelDSLTranspiler> last = this.psModelDSLTranspilerMap2.get(strPSModelName);
            ArrayList<IPSModelDSLTranspiler> list = new ArrayList<IPSModelDSLTranspiler>();
            if (last != null) {
                list.addAll(last);
            }
            if (!list.contains(iPSModelDSLTranspiler)) {
                list.add(iPSModelDSLTranspiler);
                Collections.sort(list, new Comparator<IPSModelDSLTranspiler>(){

                    @Override
                    public int compare(IPSModelDSLTranspiler o1, IPSModelDSLTranspiler o2) {
                        return Integer.compare(o1.getPriority(), o2.getPriority());
                    }
                });
            }
            this.psModelDSLTranspilerMap2.put(strPSModelName, list);
        }
    }

    @Override
    public boolean unregisterPSModelDSLTranspiler(String strPSModelName, IPSModelDSLTranspiler iPSModelDSLTranspiler) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)iPSModelDSLTranspiler, (String)"\u672a\u4f20\u5165\u6a21\u578bDSL\u8f6c\u6362\u5668\u5bf9\u8c61");
        strPSModelName = strPSModelName.toUpperCase();
        Map<String, List<IPSModelDSLTranspiler>> map = this.psModelDSLTranspilerMap2;
        synchronized (map) {
            List<IPSModelDSLTranspiler> last = this.psModelDSLTranspilerMap2.get(strPSModelName);
            ArrayList<IPSModelDSLTranspiler> list = new ArrayList<IPSModelDSLTranspiler>();
            if (last != null) {
                list.addAll(last);
            }
            if (list.contains(iPSModelDSLTranspiler)) {
                list.remove(iPSModelDSLTranspiler);
                this.psModelDSLTranspilerMap2.put(strPSModelName, list);
                return true;
            }
            return false;
        }
    }

    @Override
    public Object compilePSModelDSL(final String strPSModelName, final Object[] args) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        return this.executeAction("\u7f16\u8bd1\u6a21\u578bDSL", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                return ModelEnhancerSysUtilRuntimeBase.this.onCompilePSModelDSL(strPSModelName.toUpperCase(), args);
            }
        }, null);
    }

    protected Object onCompilePSModelDSL(String strPSModelName, Object[] args) throws Throwable {
        if (!(args[0] instanceof CompileModelDSLInput)) {
            throw new Exception(String.format("\u65e0\u6cd5\u8bc6\u522b\u7684\u4f20\u5165\u53c2\u6570[%1$s]", args));
        }
        CompileModelDSLInput compileModelDSLInput = (CompileModelDSLInput)((Object)args[0]);
        PSModelDSLCompiler psModelDSLCompiler = new PSModelDSLCompiler(this);
        return psModelDSLCompiler.compile(compileModelDSLInput);
    }

    @Override
    public void compilePSModelDSLNode(final String strPSModelName, final PSModelDSLCompileSession psModelDSLCompileSession, final IPSModelDSLNode iPSModelDSLNode) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)psModelDSLCompileSession, (String)"\u672a\u4f20\u5165\u7f16\u8bd1\u4f1a\u8bdd\u5bf9\u8c61");
        Assert.notNull((Object)iPSModelDSLNode, (String)"\u672a\u4f20\u5165ModelDSL\u8282\u70b9");
        this.executeAction("\u7f16\u8bd1\u6a21\u578bDSL\u8282\u70b9", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                ModelEnhancerSysUtilRuntimeBase.this.onCompilePSModelDSLNode(strPSModelName.toUpperCase(), psModelDSLCompileSession, iPSModelDSLNode);
                return null;
            }
        }, null);
    }

    protected void onCompilePSModelDSLNode(String strPSModelName, PSModelDSLCompileSession psModelDSLCompileSession, IPSModelDSLNode iPSModelDSLNode) throws Throwable {
        Iterator<IPSModelDSLTranspiler> iterator;
        List<IPSModelDSLTranspiler> list = this.psModelDSLTranspilerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list) && (iterator = list.iterator()).hasNext()) {
            IPSModelDSLTranspiler iPSModelDSLTranspiler = iterator.next();
            iPSModelDSLTranspiler.compilePSModelDSLNode(psModelDSLCompileSession, iPSModelDSLNode);
            return;
        }
        IPSModelDSLTranspiler iPSModelDSLTranspiler = this.psModelDSLTranspilerMap.get(strPSModelName);
        if (iPSModelDSLTranspiler == null) {
            iPSModelDSLTranspiler = new DefaultPSModelDSLTranspiler();
            try {
                iPSModelDSLTranspiler.init((IModelRuntimeContext)this.getModelRuntimeContext(), strPSModelName);
                this.psModelDSLTranspilerMap.put(strPSModelName, iPSModelDSLTranspiler);
            }
            catch (Throwable ex) {
                throw new Exception(String.format("\u521d\u59cb\u5316\u6a21\u578bDSL\u8f6c\u6362\u5668\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
            }
        }
        iPSModelDSLTranspiler.compilePSModelDSLNode(psModelDSLCompileSession, iPSModelDSLNode);
    }

    @Override
    public void prepareCompilePSModelDSLNode(final String strPSModelName, final PSModelDSLCompileSession psModelDSLCompileSession, final IPSModelDSLNode iPSModelDSLNode) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)psModelDSLCompileSession, (String)"\u672a\u4f20\u5165\u7f16\u8bd1\u4f1a\u8bdd\u5bf9\u8c61");
        Assert.notNull((Object)iPSModelDSLNode, (String)"\u672a\u4f20\u5165ModelDSL\u8282\u70b9");
        this.executeAction("\u51c6\u5907\u7f16\u8bd1\u6a21\u578bDSL\u8282\u70b9", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                ModelEnhancerSysUtilRuntimeBase.this.onPrepareCompilePSModelDSLNode(strPSModelName.toUpperCase(), psModelDSLCompileSession, iPSModelDSLNode);
                return null;
            }
        }, null);
    }

    protected void onPrepareCompilePSModelDSLNode(String strPSModelName, PSModelDSLCompileSession psModelDSLCompileSession, IPSModelDSLNode iPSModelDSLNode) throws Throwable {
        Iterator<IPSModelDSLTranspiler> iterator;
        List<IPSModelDSLTranspiler> list = this.psModelDSLTranspilerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list) && (iterator = list.iterator()).hasNext()) {
            IPSModelDSLTranspiler iPSModelDSLTranspiler = iterator.next();
            iPSModelDSLTranspiler.prepareCompilePSModelDSLNode(psModelDSLCompileSession, iPSModelDSLNode);
            return;
        }
        IPSModelDSLTranspiler iPSModelDSLTranspiler = this.psModelDSLTranspilerMap.get(strPSModelName);
        if (iPSModelDSLTranspiler == null) {
            iPSModelDSLTranspiler = new DefaultPSModelDSLTranspiler();
            try {
                iPSModelDSLTranspiler.init((IModelRuntimeContext)this.getModelRuntimeContext(), strPSModelName);
                this.psModelDSLTranspilerMap.put(strPSModelName, iPSModelDSLTranspiler);
            }
            catch (Throwable ex) {
                throw new Exception(String.format("\u521d\u59cb\u5316\u6a21\u578bDSL\u8f6c\u6362\u5668\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
            }
        }
        iPSModelDSLTranspiler.prepareCompilePSModelDSLNode(psModelDSLCompileSession, iPSModelDSLNode);
    }

    @Override
    public Object exportPSModelDSL(final String strPSModelName, final Object[] args) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        return this.executeAction("\u5bfc\u51fa\u6a21\u578bDSL", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                return ModelEnhancerSysUtilRuntimeBase.this.onExportPSModelDSL(strPSModelName.toUpperCase(), args);
            }
        }, null);
    }

    protected Object onExportPSModelDSL(String strPSModelName, Object[] args) throws Throwable {
        if (!(args[0] instanceof ExportModelDSLInput)) {
            throw new Exception(String.format("\u65e0\u6cd5\u8bc6\u522b\u7684\u4f20\u5165\u53c2\u6570[%1$s]", args));
        }
        ExportModelDSLInput exportModelDSLInput = (ExportModelDSLInput)((Object)args[0]);
        PSModelDSLExporter psModelDSLExporter = new PSModelDSLExporter(this);
        return psModelDSLExporter.export(exportModelDSLInput);
    }

    @Override
    public void exportPSModelDSLNodes(final String strPSModelName, final PSModelDSLExportSession psModelDSLExportSession, final List<? extends IEntityDTO> list) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)psModelDSLExportSession, (String)"\u672a\u4f20\u5165\u5bfc\u51fa\u4f1a\u8bdd\u5bf9\u8c61");
        Assert.notEmpty(list, (String)"\u672a\u4f20\u5165\u5bfc\u51fa\u6570\u636e");
        this.executeAction("\u5bfc\u51fa\u6a21\u578bDSL\u8282\u70b9", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                ModelEnhancerSysUtilRuntimeBase.this.onExportPSModelDSLNodes(strPSModelName.toUpperCase(), psModelDSLExportSession, list);
                return null;
            }
        }, null);
    }

    protected void onExportPSModelDSLNodes(String strPSModelName, PSModelDSLExportSession psModelDSLExportSession, List<? extends IEntityDTO> data) throws Throwable {
        Iterator<IPSModelDSLTranspiler> iterator;
        List<IPSModelDSLTranspiler> list = this.psModelDSLTranspilerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list) && (iterator = list.iterator()).hasNext()) {
            IPSModelDSLTranspiler iPSModelDSLTranspiler = iterator.next();
            iPSModelDSLTranspiler.exportPSModelDSLNodes(psModelDSLExportSession, data);
            return;
        }
        IPSModelDSLTranspiler iPSModelDSLTranspiler = this.psModelDSLTranspilerMap.get(strPSModelName);
        if (iPSModelDSLTranspiler == null) {
            iPSModelDSLTranspiler = new DefaultPSModelDSLTranspiler();
            try {
                iPSModelDSLTranspiler.init((IModelRuntimeContext)this.getModelRuntimeContext(), strPSModelName);
                this.psModelDSLTranspilerMap.put(strPSModelName, iPSModelDSLTranspiler);
            }
            catch (Throwable ex) {
                throw new Exception(String.format("\u521d\u59cb\u5316\u6a21\u578bDSL\u8f6c\u6362\u5668\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
            }
        }
        iPSModelDSLTranspiler.exportPSModelDSLNodes(psModelDSLExportSession, data);
    }

    @Override
    public IPSModelDSLNode createPSModelDSLNode(final String strPSModelDSLNodeName, final Object data, final IPSModelDSLNode parent) {
        Assert.hasLength((String)strPSModelDSLNodeName, (String)"\u672a\u4f20\u5165\u6a21\u578bDSL\u8282\u70b9\u540d\u79f0");
        return (IPSModelDSLNode)this.executeAction("\u5efa\u7acb\u6a21\u578bDSL\u8282\u70b9", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                return ModelEnhancerSysUtilRuntimeBase.this.onCreatePSModelDSLNode(strPSModelDSLNodeName.toUpperCase(), data, parent);
            }
        }, null);
    }

    protected IPSModelDSLNode onCreatePSModelDSLNode(String strPSModelDSLNodeName, Object data, IPSModelDSLNode parent) throws Throwable {
        Iterator<IPSModelDSLTranspiler> iterator;
        List<IPSModelDSLTranspiler> list = this.psModelDSLTranspilerMap2.get(strPSModelDSLNodeName);
        if (!ObjectUtils.isEmpty(list) && (iterator = list.iterator()).hasNext()) {
            IPSModelDSLTranspiler iPSModelDSLTranspiler = iterator.next();
            return iPSModelDSLTranspiler.createPSModelDSLNode(data, parent);
        }
        IPSModelDSLTranspiler iPSModelDSLTranspiler = this.psModelDSLTranspilerMap.get(strPSModelDSLNodeName);
        if (iPSModelDSLTranspiler == null) {
            iPSModelDSLTranspiler = new DefaultPSModelDSLTranspiler();
            try {
                iPSModelDSLTranspiler.init((IModelRuntimeContext)this.getModelRuntimeContext(), strPSModelDSLNodeName);
                this.psModelDSLTranspilerMap.put(strPSModelDSLNodeName, iPSModelDSLTranspiler);
            }
            catch (Throwable ex) {
                throw new Exception(String.format("\u521d\u59cb\u5316\u6a21\u578bDSL\u8f6c\u6362\u5668\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
            }
        }
        return iPSModelDSLTranspiler.createPSModelDSLNode(data, parent);
    }

    @Override
    public void prepareExportPSModelDSLNodes(final String strPSModelName, final PSModelDSLExportSession psModelDSLExportSession, final List<? extends IEntityDTO> list) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        Assert.notNull((Object)psModelDSLExportSession, (String)"\u672a\u4f20\u5165\u5bfc\u51fa\u4f1a\u8bdd\u5bf9\u8c61");
        Assert.notEmpty(list, (String)"\u672a\u4f20\u5165\u5bfc\u51fa\u6570\u636e");
        this.executeAction("\u51c6\u5907\u5bfc\u51fa\u6a21\u578bDSL\u8282\u70b9", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                ModelEnhancerSysUtilRuntimeBase.this.onPrepareExportPSModelDSLNodes(strPSModelName.toUpperCase(), psModelDSLExportSession, list);
                return null;
            }
        }, null);
    }

    protected void onPrepareExportPSModelDSLNodes(String strPSModelName, PSModelDSLExportSession psModelDSLExportSession, List<? extends IEntityDTO> data) throws Throwable {
        Iterator<IPSModelDSLTranspiler> iterator;
        List<IPSModelDSLTranspiler> list = this.psModelDSLTranspilerMap2.get(strPSModelName);
        if (!ObjectUtils.isEmpty(list) && (iterator = list.iterator()).hasNext()) {
            IPSModelDSLTranspiler iPSModelDSLTranspiler = iterator.next();
            iPSModelDSLTranspiler.prepareExportPSModelDSLNodes(psModelDSLExportSession, data);
            return;
        }
        IPSModelDSLTranspiler iPSModelDSLTranspiler = this.psModelDSLTranspilerMap.get(strPSModelName);
        if (iPSModelDSLTranspiler == null) {
            iPSModelDSLTranspiler = new DefaultPSModelDSLTranspiler();
            try {
                iPSModelDSLTranspiler.init((IModelRuntimeContext)this.getModelRuntimeContext(), strPSModelName);
                this.psModelDSLTranspilerMap.put(strPSModelName, iPSModelDSLTranspiler);
            }
            catch (Throwable ex) {
                throw new Exception(String.format("\u521d\u59cb\u5316\u6a21\u578bDSL\u8f6c\u6362\u5668\u53d1\u751f\u5f02\u5e38\uff0c%1$s", ex.getMessage()), ex);
            }
        }
        iPSModelDSLTranspiler.prepareExportPSModelDSLNodes(psModelDSLExportSession, data);
    }

    @Override
    public Object mergePSModelDSL(final String strPSModelName, final Object[] args) {
        Assert.hasLength((String)strPSModelName, (String)"\u672a\u4f20\u5165\u6a21\u578b\u540d\u79f0");
        return this.executeAction("\u5408\u5e76\u6a21\u578bDSL", new IAction(){

            public Object execute(Object[] none) throws Throwable {
                return ModelEnhancerSysUtilRuntimeBase.this.onMergePSModelDSL(strPSModelName.toUpperCase(), args);
            }
        }, null);
    }

    protected Object onMergePSModelDSL(String strPSModelName, Object[] args) throws Throwable {
        if (!(args[0] instanceof MergeModelDSLInput)) {
            throw new Exception(String.format("\u65e0\u6cd5\u8bc6\u522b\u7684\u4f20\u5165\u53c2\u6570[%1$s]", args));
        }
        MergeModelDSLInput mergeModelDSLInput = (MergeModelDSLInput)((Object)args[0]);
        PSModelDSLMerger psModelDSLMerger = new PSModelDSLMerger(this);
        return psModelDSLMerger.merge(mergeModelDSLInput);
    }

    static {
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSDATAENTITY", PSDataEntityInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSAPPDEVIEW", PSAppDEViewInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSSYSRUNSESSION", PSSysRunSessionInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSDEDATAQUERY", PSDEDataQueryInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSDEFORM", PSDEFormInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSDEGRID", PSDEGridInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSDEFIELD", PSDEFieldInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSDELOGIC", PSDELogicInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSDETABLE", PSDETableInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "INITIALIZER:PSWFVERSION", PSWFVersionInitializer.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "V2EXCHANGER:PSSYSDBSCHEME", PSSysDBSchemeV2Exchanger.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "V2EXCHANGER:PSDEVIEWBASE", PSDEViewBaseV2Exchanger.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "DSLTRANSPILER:PSDELOGIC", PSDELogicDSLTranspiler.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "DSLTRANSPILER:PSDELOGICNODE", PSDELogicNodeDSLTranspiler.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "DSLTRANSPILER:PSDELOGICLINK", PSDELogicLinkDSLTranspiler.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "DSLTRANSPILER:PSDEDATAQUERY", PSDEDataQueryDSLTranspiler.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(IModelEnhancerSysUtilRTAddin.class, "CLONER:DEFAULT", DefaultPSModelCloner.class);
    }

    public static abstract class ModelEnhancerSysUtilRuntimeContextBase<M extends IModelEnhancerSysUtilRuntime, C extends ISysUtilRuntimeContext>
    extends SysUtilRuntimeContextProxy<M, C>
    implements IModelEnhancerSysUtilRuntimeContext {
        public ModelEnhancerSysUtilRuntimeContextBase(C superContext) {
            super(superContext);
        }
    }
}
