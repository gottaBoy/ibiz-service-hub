package net.ibizsys.modeling.core.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.model.dataentity.action.IPSDEAction;

/**
 * Runtime contract for invoking the V5 core API.
 */
@Qualifier("V5COREAPI")
public interface IV5CoreAPIClientRuntime extends ISubSysServiceAPIRuntime {

    Object invokeDEMethod(IDataEntityRuntime dataEntityRuntime,
            IPSDEAction action, Object[] args) throws Throwable;

    Object invokeDEMethod(Map<String, Object> context,
            IDataEntityRuntime dataEntityRuntime,
            IPSDEAction action, Object[] args) throws Throwable;

    Map<String, String> fillUserInfoUrlParams(Map<String, String> params);
}