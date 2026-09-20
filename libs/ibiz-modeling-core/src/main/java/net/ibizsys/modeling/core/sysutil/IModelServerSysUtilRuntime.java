package net.ibizsys.modeling.core.sysutil;

import java.util.Map;
import net.ibizsys.central.cloud.core.sysutil.ISysUtilRuntime;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="MODELSERVERUTIL")
public interface IModelServerSysUtilRuntime
extends ISysUtilRuntime {
    public static final String DEVCALLBACKACTION_STARTX = "STARTX";
    public static final String DEVCALLBACKACTION_PUBCODE = "PUBCODE";
    public static final String DEVCALLBACKACTION_PACKVER = "PACKVER";
    public static final String DEVCALLBACKACTION_PACKMOBAPP = "PACKMOBAPP";
    public static final String DEVCALLBACKACTION_STARTMSAPI = "STARTMSAPI";
    public static final String DEVCALLBACKACTION_STARTMSAPP = "STARTMSAPP";
    public static final String DEVCALLBACKACTION_DEPLOYPKG = "DEPLOYPKG";
    public static final String DEVCALLBACKACTION_STARTMSFUNC = "STARTMSFUNC";
    public static final String DEVCALLBACKACTION_PUBCODE2 = "PUBCODE2";
    public static final String DEVCALLBACKACTION_PUBDOC = "PUBDOC";
    public static final String DEVCALLBACKACTION_PUBMODEL = "PUBMODEL";

    public Object executeDevCallback(String var1, String var2, String var3, String var4, Map<String, Object> var5);
}
