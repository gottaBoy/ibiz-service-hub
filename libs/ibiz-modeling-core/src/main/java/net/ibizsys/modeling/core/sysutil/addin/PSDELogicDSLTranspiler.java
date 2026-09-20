package net.ibizsys.modeling.core.sysutil.addin;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.modeling.core.dataentity.IDataEntityRuntime;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicLinkDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicNodeDTO;
import net.ibizsys.modeling.core.sysutil.addin.PSModelDSLTranspilerBase;
import net.ibizsys.modeling.core.util.IPSModelDSLNode;
import net.ibizsys.modeling.core.util.PSModelDSLCompileSession;
import net.ibizsys.modeling.core.util.PSModelDSLExportSession;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class PSDELogicDSLTranspiler
extends PSModelDSLTranspilerBase {
    private IDataEntityRuntime psDELogicNodeDERuntime = null;
    private IDataEntityRuntime psDELogicLinkDERuntime = null;

    @Override
    protected void onInit() throws Exception {
        this.psDELogicNodeDERuntime = (IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime("PSDELOGICNODE");
        this.psDELogicLinkDERuntime = (IDataEntityRuntime)this.getSystemRuntime().getDataEntityRuntime("PSDELOGICLINK");
        super.onInit();
    }

    @Override
    protected void onBeforeCreatePSModel(PSModelDSLCompileSession psModelDSLCompileSession, IPSModelDSLNode iPSModelDSLNode, IEntityDTO iEntityDTO) throws Throwable {
        List<PSDELogicLinkDTO> psDELogicLinkList;
        PSDELogicDTO psDELogic = (PSDELogicDTO)iEntityDTO;
        LinkedHashMap<String, PSDELogicNodeDTO> psDELogicNodeMap = new LinkedHashMap<String, PSDELogicNodeDTO>();
        List<PSDELogicNodeDTO> psDELogicNodeList = psDELogic.getPSDELogicNodes();
        if (!ObjectUtils.isEmpty(psDELogicNodeList)) {
            int nTopPos = 100;
            int nLeftPos = 300;
            for (PSDELogicNodeDTO psDELogicNodeDTO : psDELogicNodeList) {
                if (!psDELogicNodeDTO.isLeftPosDirty()) {
                    psDELogicNodeDTO.setLeftPos(nLeftPos);
                }
                if (!psDELogicNodeDTO.isTopPosDirty()) {
                    psDELogicNodeDTO.setTopPos(nTopPos);
                }
                nTopPos += 150;
                psDELogicNodeMap.put(psDELogicNodeDTO.getPSDELogicNodeId(), psDELogicNodeDTO);
            }
        }
        if (!ObjectUtils.isEmpty(psDELogicLinkList = psDELogic.getPSDELogicLinks())) {
            for (PSDELogicLinkDTO psDELogicLinkDTO : psDELogicLinkList) {
                if (!StringUtils.hasLength((String)psDELogicLinkDTO.getSrcPSDELogicNodeId()) || psDELogicNodeMap.containsKey(psDELogicLinkDTO.getSrcPSDELogicNodeId())) continue;
                psDELogicLinkDTO.setSrcPSDELogicNodeId((String)psDELogicLinkDTO.get("_dslpid"));
                psDELogicLinkDTO.setDefaultLink(10);
            }
        }
        super.onBeforeCreatePSModel(psModelDSLCompileSession, iPSModelDSLNode, iEntityDTO);
    }

    @Override
    protected void onBeforeUpdatePSModel(PSModelDSLCompileSession psModelDSLCompileSession, IPSModelDSLNode iPSModelDSLNode, IEntityDTO iEntityDTO) throws Throwable {
        List<PSDELogicLinkDTO> psDELogicLinkList;
        PSDELogicDTO psDELogic = (PSDELogicDTO)iEntityDTO;
        LinkedHashMap<String, PSDELogicNodeDTO> psDELogicNodeMap = new LinkedHashMap<String, PSDELogicNodeDTO>();
        List<PSDELogicNodeDTO> psDELogicNodeList = psDELogic.getPSDELogicNodes();
        if (!ObjectUtils.isEmpty(psDELogicNodeList)) {
            int nTopPos = 100;
            int nLeftPos = 300;
            for (PSDELogicNodeDTO psDELogicNodeDTO : psDELogicNodeList) {
                if (!psDELogicNodeDTO.isLeftPosDirty()) {
                    psDELogicNodeDTO.setLeftPos(nLeftPos);
                }
                if (!psDELogicNodeDTO.isTopPosDirty()) {
                    psDELogicNodeDTO.setTopPos(nTopPos);
                }
                nTopPos += 150;
                psDELogicNodeMap.put(psDELogicNodeDTO.getPSDELogicNodeId(), psDELogicNodeDTO);
            }
        }
        if (!ObjectUtils.isEmpty(psDELogicLinkList = psDELogic.getPSDELogicLinks())) {
            for (PSDELogicLinkDTO psDELogicLinkDTO : psDELogicLinkList) {
                if (!StringUtils.hasLength((String)psDELogicLinkDTO.getSrcPSDELogicNodeId()) || psDELogicNodeMap.containsKey(psDELogicLinkDTO.getSrcPSDELogicNodeId())) continue;
                psDELogicLinkDTO.setSrcPSDELogicNodeId((String)psDELogicLinkDTO.get("_dslpid"));
                psDELogicLinkDTO.setDefaultLink(10);
            }
        }
        super.onBeforeUpdatePSModel(psModelDSLCompileSession, iPSModelDSLNode, iEntityDTO);
    }

    @Override
    protected void exportPSModelDSLNode(PSModelDSLExportSession psModelDSLExportSession, IEntityDTO iEntityDTO) throws Throwable {
        super.exportPSModelDSLNode(psModelDSLExportSession, iEntityDTO);
    }

    @Override
    protected void exportNestedPSModelDSLNodes(PSModelDSLExportSession psModelDSLExportSession, IPSDERBase iPSDERBase, List<? extends IEntityDTO> list) throws Throwable {
        LinkedHashMap<String, PSDELogicNodeDTO> subCallPSDELogicNodeMap;
        PSDELogicDTO psDELogic = (PSDELogicDTO)psModelDSLExportSession.getParent().getReal();
        if ("PSDELOGICNODE".equals(iPSDERBase.getMinorPSDataEntityMust().getName()) && !ObjectUtils.isEmpty(psDELogic.getPSDELogicNodes()) && !ObjectUtils.isEmpty(psDELogic.getPSDELogicLinks())) {
            subCallPSDELogicNodeMap = new LinkedHashMap<String, PSDELogicNodeDTO>();
            for (PSDELogicNodeDTO psDELogicNode : psDELogic.getPSDELogicNodes()) {
                if (!PSModelEnums.LogicNodeType.LOOPSUBCALL.value.equals(psDELogicNode.getLogicNodeType())) continue;
                this.fillLoopSubCallPSDELogicNodeMap(psDELogicNode.getPSDELogicNodeId(), subCallPSDELogicNodeMap, psDELogic, true);
            }
            if (!ObjectUtils.isEmpty(subCallPSDELogicNodeMap)) {
                ArrayList<IEntityDTO> list2 = new ArrayList<IEntityDTO>();
                for (PSDELogicNodeDTO psDELogicNode : psDELogic.getPSDELogicNodes()) {
                    if (PSModelEnums.LogicNodeType.LOOPSUBCALL.value.equals(psDELogicNode.getLogicNodeType())) {
                        list2.add(psDELogicNode);
                        continue;
                    }
                    if (subCallPSDELogicNodeMap.containsKey(psDELogicNode.getPSDELogicNodeId())) continue;
                    list2.add(psDELogicNode);
                }
                list = list2;
            }
        }
        if ("PSDELOGICLINK".equals(iPSDERBase.getMinorPSDataEntityMust().getName()) && !ObjectUtils.isEmpty(psDELogic.getPSDELogicNodes()) && !ObjectUtils.isEmpty(psDELogic.getPSDELogicLinks())) {
            subCallPSDELogicNodeMap = new LinkedHashMap<String, PSDELogicNodeDTO>();
            LinkedHashMap<String, PSDELogicNodeDTO> subCallPSDELogicNodeMap2 = new LinkedHashMap<String, PSDELogicNodeDTO>();
            for (PSDELogicNodeDTO psDELogicNode : psDELogic.getPSDELogicNodes()) {
                if (!PSModelEnums.LogicNodeType.LOOPSUBCALL.value.equals(psDELogicNode.getLogicNodeType())) continue;
                subCallPSDELogicNodeMap2.put(psDELogicNode.getPSDELogicNodeId(), psDELogicNode);
                this.fillLoopSubCallPSDELogicNodeMap(psDELogicNode.getPSDELogicNodeId(), subCallPSDELogicNodeMap, psDELogic, true);
            }
            if (!ObjectUtils.isEmpty(subCallPSDELogicNodeMap)) {
                ArrayList<IEntityDTO> list2 = new ArrayList<IEntityDTO>();
                for (PSDELogicLinkDTO psDELogicLink : psDELogic.getPSDELogicLinks()) {
                    if (subCallPSDELogicNodeMap2.containsKey(psDELogicLink.getSrcPSDELogicNodeId()) ? DataTypeUtils.asInteger((Object)psDELogicLink.getDefaultLink(), (Integer)0) == 10 && (subCallPSDELogicNodeMap.containsKey(psDELogicLink.getSrcPSDELogicNodeId()) || subCallPSDELogicNodeMap.containsKey(psDELogicLink.getDstPSDELogicNodeId())) : !subCallPSDELogicNodeMap2.containsKey(psDELogicLink.getDstPSDELogicNodeId()) && (subCallPSDELogicNodeMap.containsKey(psDELogicLink.getSrcPSDELogicNodeId()) || subCallPSDELogicNodeMap.containsKey(psDELogicLink.getDstPSDELogicNodeId()))) continue;
                    list2.add((IEntityDTO)psDELogicLink);
                }
                list = list2;
            }
        }
        super.exportNestedPSModelDSLNodes(psModelDSLExportSession, iPSDERBase, list);
        if ("PSDELOGICNODE".equals(iPSDERBase.getMinorPSDataEntityMust().getName()) && !ObjectUtils.isEmpty(psDELogic.getPSDELogicNodes()) && !ObjectUtils.isEmpty(psDELogic.getPSDELogicLinks())) {
            for (PSDELogicNodeDTO psDELogicNode : psDELogic.getPSDELogicNodes()) {
                if (!PSModelEnums.LogicNodeType.LOOPSUBCALL.value.equals(psDELogicNode.getLogicNodeType())) continue;
                LinkedHashMap<String, PSDELogicNodeDTO> subCallPSDELogicNodeMap2 = new LinkedHashMap<String, PSDELogicNodeDTO>();
                this.fillLoopSubCallPSDELogicNodeMap(psDELogicNode.getPSDELogicNodeId(), subCallPSDELogicNodeMap2, psDELogic, true);
                if (ObjectUtils.isEmpty(subCallPSDELogicNodeMap2)) continue;
                ArrayList<PSDELogicNodeDTO> list2 = new ArrayList<PSDELogicNodeDTO>();
                PSDELogicNodeDTO beginPSDELogicNodeDTO = (PSDELogicNodeDTO)this.psDELogicNodeDERuntime.createEntity();
                beginPSDELogicNodeDTO.setPSDELogicNodeName(String.format("%1$s\uff08\u5185\u90e8\u5f00\u59cb\uff09", psDELogicNode.getPSDELogicNodeName()));
                beginPSDELogicNodeDTO.setCodeName(String.format("%1$s_Begin", psDELogicNode.getCodeName()));
                beginPSDELogicNodeDTO.setPSDELogicNodeId(beginPSDELogicNodeDTO.getCodeName());
                beginPSDELogicNodeDTO.setLogicNodeType("BEGIN");
                list2.add(beginPSDELogicNodeDTO);
                for (PSDELogicNodeDTO pSDELogicNodeDTO : psDELogic.getPSDELogicNodes()) {
                    if (psDELogicNode.getPSDELogicNodeId().equals(pSDELogicNodeDTO.getPSDELogicNodeId()) || !subCallPSDELogicNodeMap2.containsKey(pSDELogicNodeDTO.getPSDELogicNodeId())) continue;
                    list2.add(pSDELogicNodeDTO);
                }
                ArrayList<PSDELogicLinkDTO> list3 = new ArrayList<PSDELogicLinkDTO>();
                for (PSDELogicLinkDTO psDELogicLink2 : psDELogic.getPSDELogicLinks()) {
                    String srcPSDELogicNodeId = psModelDSLExportSession.getNestedPSModelDSLId("PSDELOGICNODE", psDELogicLink2.getSrcPSDELogicNodeId(), true);
                    if (!StringUtils.hasLength((String)srcPSDELogicNodeId)) {
                        srcPSDELogicNodeId = psDELogicLink2.getSrcPSDELogicNodeId();
                    }
                    if (psDELogicNode.getPSDELogicNodeId().equals(srcPSDELogicNodeId)) {
                        if (DataTypeUtils.asInteger((Object)psDELogicLink2.getDefaultLink(), (Integer)0) != 10) continue;
                        PSDELogicLinkDTO psDELogicLink3 = (PSDELogicLinkDTO)this.psDELogicLinkDERuntime.createEntity();
                        psDELogicLink2.copyTo((IEntity)psDELogicLink3, true);
                        psDELogicLink3.setSrcPSDELogicNodeId(beginPSDELogicNodeDTO.getPSDELogicNodeId());
                        psDELogicLink2 = psDELogicLink3;
                    } else if (!subCallPSDELogicNodeMap2.containsKey(psDELogicLink2.getSrcPSDELogicNodeId()) || !subCallPSDELogicNodeMap2.containsKey(psDELogicLink2.getDstPSDELogicNodeId())) continue;
                    list3.add(psDELogicLink2);
                }
                IPSModelDSLNode iPSModelDSLNode = psModelDSLExportSession.getParent();
                IPSModelDSLNode parent2 = null;
                if (!ObjectUtils.isEmpty(iPSModelDSLNode.getChildren())) {
                    for (IPSModelDSLNode node : iPSModelDSLNode.getChildren()) {
                        if (!node.getPSModelName().equals("PSDELOGICNODE") || !psDELogicNode.getPSDELogicNodeId().equals(node.getRealId())) continue;
                        parent2 = node;
                        break;
                    }
                }
                if (parent2 == null) continue;
                try {
                    psModelDSLExportSession.pushParent(parent2);
                    this.getSysUtilRuntime().exportPSModelDSLNodes("PSDELOGICNODE", psModelDSLExportSession, list2);
                    this.getSysUtilRuntime().exportPSModelDSLNodes("PSDELOGICLINK", psModelDSLExportSession, list3);
                }
                finally {
                    psModelDSLExportSession.pollParent();
                }
            }
        }
    }

    protected void fillLoopSubCallPSDELogicNodeMap(String strPSDELogicNodeId, Map<String, PSDELogicNodeDTO> subCallPSDELogicNodeMap, PSDELogicDTO psDELogic, boolean bFirstNode) throws Exception {
        if (subCallPSDELogicNodeMap.containsKey(strPSDELogicNodeId)) {
            return;
        }
        subCallPSDELogicNodeMap.put(strPSDELogicNodeId, null);
        int nSubLoopCallCnt = 0;
        for (PSDELogicLinkDTO link : psDELogic.getPSDELogicLinks()) {
            if (!link.getSrcPSDELogicNodeId().equals(strPSDELogicNodeId) || DataTypeUtils.asInteger((Object)link.getDefaultLink(), (Integer)0) != 10) continue;
            ++nSubLoopCallCnt;
        }
        if (bFirstNode) {
            if (nSubLoopCallCnt > 1) {
                throw new Exception("\u5faa\u73af\u5b50\u8c03\u7528\u4e0d\u5141\u8bb8\u5b58\u5728\u591a\u4e2a\u5b50\u8c03\u7528\u8fde\u63a5");
            }
        } else if (nSubLoopCallCnt > 0) {
            throw new Exception("\u5faa\u73af\u5b50\u8c03\u7528\u4e0d\u5141\u8bb8\u5faa\u73af\u5b50\u8c03\u7528");
        }
        for (PSDELogicLinkDTO link : psDELogic.getPSDELogicLinks()) {
            if (!link.getSrcPSDELogicNodeId().equals(strPSDELogicNodeId) || bFirstNode && DataTypeUtils.asInteger((Object)link.getDefaultLink(), (Integer)0) != 10) continue;
            this.fillLoopSubCallPSDELogicNodeMap(link.getDstPSDELogicNodeId(), subCallPSDELogicNodeMap, psDELogic, false);
        }
    }
}