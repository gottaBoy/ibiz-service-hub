package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.PSDELogicImpl;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.psmodel.core.domain.PSDELogic;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDELogicFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public class PSDELogicRTService extends net.ibizsys.psmodel.runtime.service.PSDELogicRTService {

	private static final Log log = LogFactory.getLog(PSDELogicRTService.class);

	/**
	 * 行为：应用指定扩展逻辑
	 */
	final public static String METHOD_APPLY = "APPLY";

	/**
	 * 行为：启用指定扩展逻辑
	 */
	final public static String METHOD_ENABLE = "ENABLE";

	/**
	 * 行为：禁用指定扩展逻辑
	 */
	final public static String METHOD_DISABLE = "DISABLE";

	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {

		if (METHOD_APPLY.equalsIgnoreCase(methodName)) {
			PSDELogic domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.apply(domain);
		}

		if (METHOD_ENABLE.equalsIgnoreCase(methodName)) {
			PSDELogic domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.enable(domain);
		}

		if (METHOD_DISABLE.equalsIgnoreCase(methodName)) {
			PSDELogic domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.disable(domain);
		}

		return super.doInvoke(methodName, key, params);
	}

	@Override
	protected PSDELogic doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSDEId = getParentId(key);

			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			if (strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionLogic.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
				searchContextDTO.eq(V2SystemExtensionLogic.FIELD_DATA_ENTITY_TAG, strPSDEId);
			} else {
				searchContextDTO.eq(V2SystemExtensionLogic.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
				searchContextDTO.eq(V2SystemExtensionLogic.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			}
			searchContextDTO.eq(V2SystemExtensionLogic.FIELD_SCOPE_TAG, strPSDEId);
			searchContextDTO.eq(V2SystemExtensionLogic.FIELD_LOGIC_TAG, key);

			Page<V2SystemExtensionLogic> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionLogics(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDELogic> psDELogicList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionLogic.FIELD_LOGIC_TAG, PSDELogic.class);
				if (!ObjectUtils.isEmpty(psDELogicList)) {
					return psDELogicList.get(0);
				}
			}

			// 没有找到，尝试
			if (key.indexOf("@") != -1) {
				// 取默认
				PSDELogic psDELogic = this.doGet(key.split("[@]")[1], tryMode);
				if (psDELogic != null) {
					return createDynamicPSDELogicDomain(key, psDELogic);
				}
			}
		}
		return super.doGet(key, tryMode);
	}

	@Override
	protected IPSModelObject getPSModelObject(String key, boolean tryMode) throws Exception {
		if (!StringUtils.hasLength(key)) {
			if (tryMode) {
				return null;
			}
			throw new Exception("未指定模型对象标识");
		}

		// Dynamic extension keys use the instance id before '@' and the
		// static model tag after it. Resolve the latter from the model tree,
		// then expose the template with the dynamic id expected by callers.
		boolean bDynamicKey = key.indexOf("@") != -1;
		String strModelKey = bDynamicKey ? key.substring(key.indexOf("@") + 1) : key;
		String strPSDEId = getParentId(strModelKey);
		IPSDataEntity iPSDataEntity = resolvePSDataEntity(strPSDEId);
		if (iPSDataEntity != null) {
			IPSDELogic iPSDELogic = resolvePSDELogic(iPSDataEntity, getSimpleModelTag(strModelKey));
			if (iPSDELogic != null) {
				if (bDynamicKey) {
					return createDynamicPSDELogic(key, iPSDELogic);
				}
				return iPSDELogic;
			}
		}

		if (tryMode) {
			return null;
		}
		throw new Exception(String.format("无法获取指定模型对象[%1$s]", key));
	}

	protected IPSDELogic createDynamicPSDELogic(String key, IPSDELogic template) throws Exception {
		return createDynamicPSDELogic(key, template == null ? null : template.getObjectNode());
	}

	protected PSDELogic createDynamicPSDELogicDomain(String key, PSDELogic template) {
		if (template == null) {
			return null;
		}

		PSDELogic dynamic = new PSDELogic();
		template.copyTo(dynamic);
		dynamic.set(ExtensionUtils.FIELD_PSDYNAINSTID, ExtensionUtils.DYNAINSTID_PARENT);
		dynamic.setPSDELogicId(key);
		dynamic.setPSDEId(getParentId(key));
		return dynamic;
	}

	protected IPSDELogic createDynamicPSDELogic(String key, ObjectNode templateObjectNode) throws Exception {
		IPSDataEntity iPSDataEntity = resolvePSDataEntity(getParentId(key));
		if (iPSDataEntity == null || templateObjectNode == null) {
			return null;
		}

		ObjectNode dynamicObjectNode = templateObjectNode.deepCopy();
		dynamicObjectNode.put("id", key);
		dynamicObjectNode.put(ExtensionUtils.FIELD_PSDYNAINSTID, ExtensionUtils.DYNAINSTID_PARENT);
		dynamicObjectNode.put("psdeid", getParentId(key));
		return this.getPSSystemService().createAndInitPSModelObject(
				(IPSModelObjectRuntime) iPSDataEntity, IPSDELogic.class, dynamicObjectNode);
	}

	/**
	 * Resolve one logic model from lightweight entity references.
	 * Calling getAllPSDELogics() here instantiates every logic under the entity.
	 */
	protected IPSDELogic resolvePSDELogic(IPSDataEntity iPSDataEntity, String strLogicTag) throws Exception {
		if (iPSDataEntity == null || !StringUtils.hasLength(strLogicTag)) {
			return null;
		}

		JsonNode value = iPSDataEntity.getObjectNode().get("getAllPSDELogics");
		if (value != null && value.isArray()) {
			for (JsonNode item : value) {
				if (!item.isObject()) {
					continue;
				}

				ObjectNode logicNode = (ObjectNode) item;
				String strModelPath = null;
				JsonNode modelRefNode = logicNode.get("modelref");
				if (modelRefNode != null && modelRefNode.asBoolean(false)) {
					strModelPath = getNodeText(logicNode, "path");
				}
				if (!StringUtils.hasLength(strModelPath)) {
					strModelPath = getNodeText(logicNode, "dynaModelFilePath");
				}

				if (!isSameModelTag(strLogicTag, getSimpleModelTag(getNodeText(logicNode, "codeName")))
						&& !isSameModelTag(strLogicTag, getSimpleModelTag(strModelPath))
						&& !isSameModelTag(strLogicTag, getSimpleModelTag(getNodeText(logicNode, "id")))) {
					continue;
				}

				if (StringUtils.hasLength(strModelPath)) {
					return this.getPSSystemService().getPSModelObject(IPSDELogic.class, strModelPath);
				}

				return this.getPSSystemService().createAndInitPSModelObject(
						(IPSModelObjectRuntime) iPSDataEntity, IPSDELogic.class, logicNode);
			}
		}

		// Some model variants omit the child reference from the entity JSON.
		// Derive the conventional logic path without materializing all siblings.
		String strEntityModelPath = iPSDataEntity.getDynaModelFilePath();
		if (StringUtils.hasLength(strEntityModelPath)) {
			int nPos = strEntityModelPath.lastIndexOf('.');
			if (nPos > 0) {
				String strModelPath = String.format("%1$s/PSDELOGICS/%2$s.json",
						strEntityModelPath.substring(0, nPos), strLogicTag);
				try {
					return this.getPSSystemService().getPSModelObject(IPSDELogic.class, strModelPath);
				} catch (Exception ex) {
					log.debug(String.format("按约定路径加载实体逻辑[%1$s]失败", strModelPath), ex);
				}
			}
		}
		return null;
	}

	protected String getNodeText(ObjectNode objectNode, String strFieldName) {
		JsonNode value = objectNode.get(strFieldName);
		return value == null || value.isNull() ? null : value.asText();
	}

	protected IPSDataEntity resolvePSDataEntity(String strPSDEId) throws Exception {
		IPSDataEntity iPSDataEntity = this.getPSSystemService().getPSDataEntity(strPSDEId, true);
		if (iPSDataEntity != null) {
			return iPSDataEntity;
		}

		// The model service cache also indexes entities by their display name.
		int nPos = strPSDEId == null ? -1 : strPSDEId.lastIndexOf('.');
		if (nPos != -1 && nPos < strPSDEId.length() - 1) {
			iPSDataEntity = this.getPSSystemService().getPSDataEntity(strPSDEId.substring(nPos + 1), true);
			if (iPSDataEntity != null) {
				return iPSDataEntity;
			}
		}

		// Some model loaders expose the entity only through the system model list.
		// Resolve that list by the canonical module.codeName tag.
		List<IPSDataEntity> psDataEntityList = this.getPSSystemService().getPSSystem().getAllPSDataEntities();
		if (psDataEntityList != null) {
			for (IPSDataEntity item : psDataEntityList) {
				String strModelTag = PSModelUtils.calcUniqueTag(item.getPSSystemModule(), item.getCodeName());
				if (isSameModelTag(strPSDEId, strModelTag)) {
					return item;
				}
			}
		}
		return null;
	}

	protected String getSimpleModelTag(String value) {
		if (!StringUtils.hasLength(value)) {
			return null;
		}

		String strTag = value;
		if (strTag.toLowerCase().endsWith(".json")) {
			strTag = strTag.substring(0, strTag.length() - 5);
		}

		int nPos = Math.max(strTag.lastIndexOf('/'), strTag.lastIndexOf('\\'));
		if (nPos != -1) {
			strTag = strTag.substring(nPos + 1);
		}

		nPos = strTag.lastIndexOf('.');
		if (nPos != -1) {
			strTag = strTag.substring(nPos + 1);
		}
		return strTag;
	}

	protected boolean isSameModelTag(String left, String right) {
		return StringUtils.hasLength(left) && StringUtils.hasLength(right) && left.equalsIgnoreCase(right);
	}

	@Override
	protected void onBeforeCreate(PSDELogic m) throws Exception {
		m.reset("psdynainstid");
		super.onBeforeCreate(m);
	}

	@Override
	protected void doCreate(PSDELogic m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}

		PSDataEntity psDataEntity = (PSDataEntity) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, m.getPSDEId());

		V2SystemExtensionLogic v2SystemExtensionLogic = new V2SystemExtensionLogic();
		if (m.getPSDEId().indexOf("@") == -1) {
			v2SystemExtensionLogic.setScopeType(V2SystemExtensionScopeType.DATAENTITY.value);
		} else {
			v2SystemExtensionLogic.setScopeType(V2SystemExtensionScopeType.DATA.value);
		}
		v2SystemExtensionLogic.setScopeTag(m.getPSDEId());
		v2SystemExtensionLogic.setLogicTag(m.getId());
		v2SystemExtensionLogic.setDataEntityTag(psDataEntity.getPSDataEntityId());
		v2SystemExtensionLogic.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionLogic.setApplyFlag(0);
		v2SystemExtensionLogic.setName(m.getName());

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemExtensionLogic(iExtensionPSModelRTServiceSession.getExtensionId(), v2SystemExtensionLogic);
		m.set("applyflag", 0);
	}

	@Override
	protected List<PSDELogic> getDomainList(String strDataSetName, PSDELogicFilter f) throws Exception {
		List<PSDELogic> list = super.getDomainList(strDataSetName, f);
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}

		Object objPSDEId = f.getFieldCond(PSDELogic.FIELD_PSDEID, IPSModelFilter.EQ);
		if (ObjectUtils.isEmpty(objPSDEId)) {
			return list;
		}

		String strPSDEId = objPSDEId.toString();

		if (true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionLogic.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
			if (strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionLogic.FIELD_DATA_ENTITY_TAG, strPSDEId);
				searchContextDTO.eq(V2SystemExtensionLogic.FIELD_SCOPE_TAG, strPSDEId);
			} else {
				searchContextDTO.eq(V2SystemExtensionLogic.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
				searchContextDTO.eq(V2SystemExtensionLogic.FIELD_SCOPE_TAG, strPSDEId.split("[@]")[1]);
			}
			Page<V2SystemExtensionLogic> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionLogics(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDELogic> psDELogicList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionLogic.FIELD_LOGIC_TAG, PSDELogic.class);
				list = ExtensionUtils.replacePSModelList(list, psDELogicList, PSDELogic.class);
			}
		}

		if (strPSDEId.indexOf("@") != -1) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionLogic.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
			searchContextDTO.eq(V2SystemExtensionLogic.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			searchContextDTO.eq(V2SystemExtensionLogic.FIELD_SCOPE_TAG, strPSDEId);

			Page<V2SystemExtensionLogic> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionLogics(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDELogic> psDELogicList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionLogic.FIELD_LOGIC_TAG, PSDELogic.class);
				list = ExtensionUtils.replacePSModelList(list, psDELogicList, PSDELogic.class);
			}
		}

		return this.filterDomainList(list, strDataSetName, f);
	}

	@Override
	protected PSDELogic getLast(PSDELogic m) throws Exception {
		return this.get(m.getId(), false);
	}

	@Override
	protected void doMergeLast(PSDELogic m, PSDELogic last) throws Exception {
		m.resetPSDEId();
		m.resetPSDEName();
		m.resetCodeName();
		m.reset("psdynainstid");
		m.resetLogicSubType();
		m.reset("attachtopsdeactionid");
		m.reset("attachtopsdeactionname");
		m.reset("attachtopsdedatasetid");
		m.reset("attachtopsdedatasetname");
		super.doMergeLast(m, last);
	}

	@Override
	protected void doUpdate(PSDELogic m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();

		String strPSDynaInstId = (String) m.get(ExtensionUtils.FIELD_PSDYNAINSTID);
		if (!StringUtils.hasLength(strPSDynaInstId) || ExtensionUtils.DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			this.doCreate(m);
			return;
		}

		V2SystemExtensionLogic v2SystemExtensionLogic = new V2SystemExtensionLogic();
		v2SystemExtensionLogic.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionLogic.setApplyFlag(0);
		v2SystemExtensionLogic.setName(m.getName());

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionLogic(strExtensionId, strPSDynaInstId, v2SystemExtensionLogic);
		m.set("applyflag", 0);
	}

	@Override
	protected List<PSDELogic> filterDomainList(List<PSDELogic> domainList, String strDataSetName, PSDELogicFilter f) throws Exception {

		return super.filterDomainList(domainList, strDataSetName, f);
	}

	@Override
	protected void onBeforeRemove(PSDELogic m) throws Exception {
		// TODO Auto-generated method stub
		super.onBeforeRemove(m);
	}

	@Override
	protected void doRemove(PSDELogic m) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();

		String strPSDynaInstId = (String) m.get(ExtensionUtils.FIELD_PSDYNAINSTID);
		if (!StringUtils.hasLength(strPSDynaInstId) || ExtensionUtils.DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			throw new Exception(String.format("无法删除默认数据"));
		}
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().removeSystemExtensionLogic(strExtensionId, strPSDynaInstId);
		// 通知
		ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
	}

	public Object apply(PSDELogic m) throws Exception {
		return this.doApply(m, null);
	}

	protected Object doApply(PSDELogic m, Boolean enable) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		PSDELogic psDELogic = this.get(m.getId(), false);
		String strPSDynaInstId = ExtensionUtils.getApplyPSDynaInstId(psDELogic, false);

		// 获取默认配置
		PSDELogic orginPSDELogic = super.doGet(m.getId(), true);
		if (orginPSDELogic != null) {
			// 放入默认配置
			psDELogic.setPSSysSFPluginId(orginPSDELogic.getPSSysSFPluginId());
			psDELogic.setPSSysSFPluginName(orginPSDELogic.getPSSysSFPluginName());
		}
		
		//设置有效标记
		if(enable!=null) {
			psDELogic.set("validflag", enable?1:0);
		}

		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSDELogic.class, false).compile(iExtensionPSModelRTServiceSession, psDELogic, null);
		objectNode.put(PSDELogicImpl.ATTR_GETLOGICCONTEXTID, KeyValueUtils.genUniqueId(m.getId()));

		IPSModelRTService iPSDataEntityService = (IPSModelRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSDATAENTITY);
		IPSDataEntity iPSDataEntity = (IPSDataEntity) iPSDataEntityService.getPSModelObject(psDELogic.getPSDEId(), IPSDataEntity.class, false);
		IPSDELogic iPSDELogic = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSDataEntity, IPSDELogic.class, objectNode);
		// 验证模型
		PSModelMergeUtils.verify(iPSDELogic, true);

		// 获取当前模型
		// V2SystemExtensionField lastV2SystemExtensionField =
		// iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(),
		// strPSDynaInstId);

		V2SystemExtensionLogic v2SystemExtensionLogic = new V2SystemExtensionLogic();
		v2SystemExtensionLogic.setExtensionModel(ExtensionUtils.toExtensionModel(psDELogic));
		v2SystemExtensionLogic.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionLogic.setPendingExtensionModel(null);
		v2SystemExtensionLogic.setApplyFlag(1);
		v2SystemExtensionLogic.setName(psDELogic.getName());
		
		if(enable!=null) {
			v2SystemExtensionLogic.setValidFlag(enable?1:0);
		}

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if (iEmployeeContext != null) {
			v2SystemExtensionLogic.setExtensionTag(iEmployeeContext.getDcsystemid());
			v2SystemExtensionLogic.setExtensionTag2(iEmployeeContext.getTenant());
		}

		v2SystemExtensionLogic.setExtensionTag4(iPSDELogic.getLogicSubType());
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionLogic(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionLogic);

		ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
		return null;
	}

	public Object enable(PSDELogic m) throws Exception {
		return this.doEnable(m);
	}

	protected Object doEnable(PSDELogic m) throws Exception {
		return this.doApply(m, true);
	}

	public Object disable(PSDELogic m) throws Exception {
		return this.doDisable(m);
	}

	protected Object doDisable(PSDELogic m) throws Exception {
		return this.doApply(m, false);
	}
	
}
