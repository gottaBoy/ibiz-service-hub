package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import java.util.List;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSWFProcessDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFVersionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWorkflowDTO;
import net.ibizsys.modeling.core.dataentity.service.IPSWFVersionService;
import net.ibizsys.modeling.core.dataentity.service.IPSWorkflowService;
import net.ibizsys.modeling.core.sysutil.addin.PSModelInitializerBase;
import net.ibizsys.runtime.util.DataTypeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class PSWFVersionInitializer
extends PSModelInitializerBase {
    @Autowired
    private IPSWFVersionService iPSWFVersionService = null;
    @Autowired
    private IPSWorkflowService iPSWorkflowService = null;

    @Override
    protected boolean onPrepare(IEntityDTO iEntityDTO, Object[] args, boolean bDraftMode) throws Throwable {
        PSWFVersionDTO et = (PSWFVersionDTO)iEntityDTO;
        if (bDraftMode) {
            this.initWFVersion(et);
        } else {
            String workflowId = et.getPSWFId();
            PSWorkflowDTO workflowDTO = new PSWorkflowDTO();
            if (!ObjectUtils.isEmpty((Object)workflowId)) {
                workflowDTO.setPSWorkflowId(workflowId);
                this.iPSWorkflowService.select(workflowDTO, true);
            }
            if (DataTypeUtils.getIntegerValue((Object)workflowDTO.getWFProxyMode(), (Integer)0) == 1) {
                throw new Exception(String.format("\u5de5\u4f5c\u6d41[%1$s]\u542f\u52a8\u5916\u90e8\u4ee3\u7406\u6a21\u5f0f\uff0c\u4e0d\u5141\u8bb8\u6dfb\u52a0\u6d41\u7a0b\u7248\u672c", workflowDTO.getPSWorkflowName()));
            }
            et.setPSWFVersionName(this.calculatePSWFVersionName(et));
        }
        return super.onPrepare(iEntityDTO, args, bDraftMode);
    }

    protected void initWFVersion(PSWFVersionDTO et) throws Throwable {
        String strOriginPSWFId;
        if (et.getWFVersion() == null && StringUtils.hasLength((String)(strOriginPSWFId = et.getPSWFId()))) {
            int nLastVersion = 0;
            ISearchContextDTO searchContextDTO = this.iPSWFVersionService.getDataEntityRuntime().createSearchContext();
            searchContextDTO.eq("PSWFID", (Object)strOriginPSWFId);
            searchContextDTO.sort("wfversion,desc");
            searchContextDTO.limit(1);
            List list = this.iPSWFVersionService.select(searchContextDTO);
            if (list.size() > 0) {
                nLastVersion = DataTypeUtils.getIntegerValue((Object)((PSWFVersionDTO)((Object)list.get(0))).getWFVersion(), (Integer)0) + 1;
            }
            et.setWFVersion(nLastVersion);
        }
        PSWorkflowDTO workflowDTO = new PSWorkflowDTO();
        workflowDTO.setPSWorkflowId(et.getPSWFId());
        this.iPSWorkflowService.select(workflowDTO, false);
        if (DataTypeUtils.compare((String)workflowDTO.getWFEngineType(), (String)PSModelEnums.WFEngineType.ACTIVITI.value, (boolean)false) == 0L) {
            return;
        }
        ArrayList<PSWFProcessDTO> wfProcessDTOList = new ArrayList<PSWFProcessDTO>();
        PSWFProcessDTO psWFProcess = new PSWFProcessDTO();
        psWFProcess.setWFProcessType(PSModelEnums.WFProcessType.START.value);
        psWFProcess.setPSWFProcessName("\u5f00\u59cb\u6d41\u7a0b");
        psWFProcess.setCodeName("Start");
        psWFProcess.setPSWFVersionId(et.getPSWFVersionId());
        psWFProcess.setLeftPos(200);
        psWFProcess.setTopPos(200);
        psWFProcess.setPSSystemId(et.getPSSystemId());
        wfProcessDTOList.add(psWFProcess);
        psWFProcess = new PSWFProcessDTO();
        psWFProcess.setWFProcessType(PSModelEnums.WFProcessType.END.value);
        psWFProcess.setPSWFProcessName("\u7ed3\u675f");
        psWFProcess.setCodeName("End");
        psWFProcess.setPSWFVersionId(et.getPSWFVersionId());
        psWFProcess.setLeftPos(400);
        psWFProcess.setTopPos(400);
        psWFProcess.setPSSystemId(et.getPSSystemId());
        wfProcessDTOList.add(psWFProcess);
        et.setPSWFProcesses(wfProcessDTOList);
    }

    protected String calculatePSWFVersionName(PSWFVersionDTO et) {
        if (!StringUtils.hasLength((String)et.getPSWFName())) {
            return et.getPSWFVersionName();
        }
        if (DataTypeUtils.getBooleanValue((Object)et.getEnableDynaSys(), (Boolean)false).booleanValue()) {
            return String.format("%1$s", et.getPSWFName());
        }
        if (et.isWFVersionDirty() && et.getWFVersion() != null) {
            return String.format("%1$s v%2$s", et.getPSWFName(), et.getWFVersion());
        }
        if (et.isDynaWFVerDirty() && et.getDynaWFVer() != null) {
            return String.format("%1$s v%2$s", et.getPSWFName(), et.getDynaWFVer());
        }
        return et.getPSWFVersionName();
    }
}
