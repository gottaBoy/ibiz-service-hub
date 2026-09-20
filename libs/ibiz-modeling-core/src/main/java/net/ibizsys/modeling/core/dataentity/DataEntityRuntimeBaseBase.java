package net.ibizsys.modeling.core.dataentity;

import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSACHandlerActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSACHandlerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppDERSDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppDEViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppDynaDEViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppFuncDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppIndexViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppLanDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppMenuDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppMenuItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppMenuLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppPDTViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppPVPartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppPanelViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppPkgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppPortalViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppPortletDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppResourceDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppSBItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppSBItemRSDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppStoryBoardDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppTitleBarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppUIStyleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppUIThemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppUserModeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppUtilDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppUtilPageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppUtilViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppWFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSAppWFVerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCodePreviewActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCodeServerActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCredentialDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlLogicGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlLogicGrpDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlMsgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSCtrlMsgItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDBTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDBValueOPDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCBKTaskDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCClusterDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCCodeSnippetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCDETemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCDeployCenterDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCFileDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformFuncDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMSPlatformNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCMTDEFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCModelTemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCRegistryItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCRegistryRepoDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCRegistryServerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCSysModelRepoDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDCWorkspaceDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEACModeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEACModeItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEAGDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionTemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEActionVRDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEChartAxesDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEChartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEChartLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEChartParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDBCfgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDBIdxFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDBIndexDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDBTableDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQCodeCondDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQCodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQCodeExpDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQCondDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDQJoinDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDRDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDRGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDRItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDSDQDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDSGrpParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDSParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDTSQueueDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataExpDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataImpDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataImpItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataQueryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataRelationDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataSyncDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEDataViewLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFDLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFDTColDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFDataTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFGroupDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFIUDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFIUpdateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFIVRDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFInputTipDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFInputTipSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFSFItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFUIModeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFVRCondDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFValueRuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEFormRFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGEIUDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGEIUpdateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGEIVRDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGridColDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGridDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGridLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEGroupDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEJoinTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELLCondDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELNParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEListDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEListItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEListLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicLinkDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDELogicParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMSActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMSFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMSOPPrivDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMainStateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMainStateRSDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMapActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMapDQDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMapDSDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMapDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEMapDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDENotifyDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDENotifyTargetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEOPPrivRoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEPrintDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDEFMapDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERGroupDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERepItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEReportDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESADetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESADetailParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESARSDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESAVRDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDESampleDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETBItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETEIUDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETEIUpdateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEToolbarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEToolbarLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETreeColDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETreeLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETreeNodeColDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETreeNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETreeNodeRSDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETreeNodeRVDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDETreeViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUAGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUAGroupDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUIActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUserRoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEUtilDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEVRGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEVRGrpDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewBaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewCtrlDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewEngineDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEViewRVDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEWizardDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEWizardFormDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEWizardLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEWizardStepDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDataEntityDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevCenterDBInstDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevCenterDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevCenterSVNDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDepFuncDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnMSDeployDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineLogDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineStageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnPipelineStepDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysBakDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDepInstDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysDynaInstDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysRefDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnSysSrvDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnTemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevSlnUserDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevUserDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDevUserObjDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSEditorTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSGitUserDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSMobAppPackDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSMobAppStartPageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModelRTCfgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModelRTDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPFPreviewActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPFStyleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPanelEngineDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSPanelItemLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSFPreviewActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSFStyleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSVNServerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysSADEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysSADEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysSADERSDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysSADetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysSADetailParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubSysServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSubViewTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIChatAgentDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIFactoryDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIPipelineAgentDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIPipelineJobDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIPipelineWorkerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAIWorkerAgentDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysActorDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDColSetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDColumnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDInstCfgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDPartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDSchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBDTableRSDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIAggColumnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIAggTableDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeDimensionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeLevelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBICubeMeasureDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIDimensionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIHierarchyDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBILevelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIReportDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBIReportItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBISchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysBackServiceDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarItemRVDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCalendarLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCanvasDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCanvasModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysChartThemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCodeSnippetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysConsoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysContentCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysContentDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCounterDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCounterItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBColumnDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBPartDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBProcDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBProcParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBSchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBTableDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBVFCodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDBVFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDEFTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDELogicNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDMItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDMItemLogDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDMVerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDashboardDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDashboardLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDataSyncAgentDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDevBKTaskDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDictCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelAttrDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysDynaModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDERDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDataTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIDataTypeItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementAttrDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAIElementREDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEAISchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysERMapDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysERMapNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysEditorStyleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysImageDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysIssueDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMapItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMapLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMapViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelChgLogDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelFolderDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelFolderItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelInstDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysModelLogDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMsgQueueDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMsgTargetDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysMsgTemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPDTViewDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPITemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPortletCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysPortletDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysRefDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqItemHisDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysReqModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysResourceDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysRunSessionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSAHandlerDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPITemplDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPluginDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPubDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSFPubPkgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSampleValueDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchBarDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchBarItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchBarLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchDEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchDEFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchDocDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchFieldDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSearchSchemeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysSequenceDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysServiceAPIDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTCAssertDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTCInputDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTDItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestCaseDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTestPrjDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysTranslatorDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUCMapDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUCMapNodeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUniResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUniStateDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUnitDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserDRDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserModeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserRoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserRoleDataDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUserRoleResDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysUtilDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysValueRuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewLogicParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysViewPanelModelDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysWFCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysWFModeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysWFSettingDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDBCfgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSystemRunDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSThresholdDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSThresholdGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSVTCatDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSVTCtrlDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSVTRVDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewMsgDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewMsgGroupDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewMsgGrpDetailDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewTypeCatDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSViewTypeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFDEDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFLinkCondDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFLinkDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFLinkRoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFProcParamDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFProcRoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFProcSubWFDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFProcessDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFRoleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFUtilUIActionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFVersionDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFWorkTimeDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWXAccountDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWXEntAppDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWXLogicDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWXMenuDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWXMenuFuncDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWXMenuItemDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWorkflowDTO;

/**
 * Base class that maps modeling entity names to their typed DTO classes.
 *
 * <p>The mapping mirrors the reference provider: every modeling data entity
 * name resolves to its dedicated {@code PS*DTO} class so that runtime hooks
 * can safely cast the entity DTO. Unknown or missing entity names fall back
 * to the parent implementation.</p>
 */
public abstract class DataEntityRuntimeBaseBase
extends DataEntityRuntime {

    /**
     * Number of entity names that resolve to a dedicated DTO class.
     */
    public static final int ENTITY_DTO_COUNT = 429;

    @Override
    protected IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
        String name = getName();
        if (name == null) {
            return super.createEntityDTO(iPSDEMethodDTO);
        }
        IEntityDTO iEntityDTO = createEntityDTO(name);
        if (iEntityDTO != null) {
            return iEntityDTO;
        }
        return super.createEntityDTO(iPSDEMethodDTO);
    }

    /**
     * Create the typed DTO for the given modeling entity name.
     *
     * @param name upper-case modeling entity name (for example {@code PSDEFIELD})
     * @return the DTO instance, or {@code null} when no dedicated DTO exists
     */
    public static IEntityDTO createEntityDTO(String name) {
        if (name == null) {
            return null;
        }
        switch (name) {
            case "PSSYSTEM":
                return new PSSystemDTO();
            case "PSMODULE":
                return new PSModuleDTO();
            case "PSDATAENTITY":
                return new PSDataEntityDTO();
            case "PSDEFIELD":
                return new PSDEFieldDTO();
            case "PSDER":
                return new PSDERDTO();
            case "PSACHANDLER":
                return new PSACHandlerDTO();
            case "PSACHANDLERACTION":
                return new PSACHandlerActionDTO();
            case "PSAPPDERS":
                return new PSAppDERSDTO();
            case "PSAPPDEVIEW":
                return new PSAppDEViewDTO();
            case "PSAPPDYNADEVIEW":
                return new PSAppDynaDEViewDTO();
            case "PSAPPFUNC":
                return new PSAppFuncDTO();
            case "PSAPPINDEXVIEW":
                return new PSAppIndexViewDTO();
            case "PSAPPLAN":
                return new PSAppLanDTO();
            case "PSAPPLOCALDE":
                return new PSAppDataEntityDTO();
            case "PSAPPLOGIC":
                return new PSAppLogicDTO();
            case "PSAPPMENU":
                return new PSAppMenuDTO();
            case "PSAPPMENUITEM":
                return new PSAppMenuItemDTO();
            case "PSAPPMENULOGIC":
                return new PSAppMenuLogicDTO();
            case "PSAPPMODULE":
                return new PSAppModuleDTO();
            case "PSAPPPDTVIEW":
                return new PSAppPDTViewDTO();
            case "PSAPPPFPLUGIN":
                return new PSAppPFPluginDTO();
            case "PSAPPPVPART":
                return new PSAppPVPartDTO();
            case "PSAPPPANELVIEW":
                return new PSAppPanelViewDTO();
            case "PSAPPPKG":
                return new PSAppPkgDTO();
            case "PSAPPPORTALVIEW":
                return new PSAppPortalViewDTO();
            case "PSAPPPORTLET":
                return new PSAppPortletDTO();
            case "PSAPPRESOURCE":
                return new PSAppResourceDTO();
            case "PSAPPSBITEM":
                return new PSAppSBItemDTO();
            case "PSAPPSBITEMRS":
                return new PSAppSBItemRSDTO();
            case "PSAPPSTORYBOARD":
                return new PSAppStoryBoardDTO();
            case "PSAPPTITLEBAR":
                return new PSAppTitleBarDTO();
            case "PSAPPTYPE":
                return new PSAppTypeDTO();
            case "PSAPPUISTYLE":
                return new PSAppUIStyleDTO();
            case "PSAPPUITHEME":
                return new PSAppUIThemeDTO();
            case "PSAPPUSERMODE":
                return new PSAppUserModeDTO();
            case "PSAPPUTIL":
                return new PSAppUtilDTO();
            case "PSAPPUTILPAGE":
                return new PSAppUtilPageDTO();
            case "PSAPPUTILVIEW":
                return new PSAppUtilViewDTO();
            case "PSAPPVIEW":
                return new PSAppViewDTO();
            case "PSAPPWF":
                return new PSAppWFDTO();
            case "PSAPPWFVER":
                return new PSAppWFVerDTO();
            case "PSCODEITEM":
                return new PSCodeItemDTO();
            case "PSCODELIST":
                return new PSCodeListDTO();
            case "PSCODEPREVIEWACTION":
                return new PSCodePreviewActionDTO();
            case "PSCODESERVERACTION":
                return new PSCodeServerActionDTO();
            case "PSCREDENTIAL":
                return new PSCredentialDTO();
            case "PSCTRLLOGICGROUP":
                return new PSCtrlLogicGroupDTO();
            case "PSCTRLLOGICGRPDETAIL":
                return new PSCtrlLogicGrpDetailDTO();
            case "PSCTRLMSG":
                return new PSCtrlMsgDTO();
            case "PSCTRLMSGITEM":
                return new PSCtrlMsgItemDTO();
            case "PSDBTYPE":
                return new PSDBTypeDTO();
            case "PSDBVALUEOP":
                return new PSDBValueOPDTO();
            case "PSDCBKTASK":
                return new PSDCBKTaskDTO();
            case "PSDCCLUSTER":
                return new PSDCClusterDTO();
            case "PSDCCODESNIPPET":
                return new PSDCCodeSnippetDTO();
            case "PSDCDETEMPL":
                return new PSDCDETemplDTO();
            case "PSDCDEPLOYCENTER":
                return new PSDCDeployCenterDTO();
            case "PSDCFILE":
                return new PSDCFileDTO();
            case "PSDCMSPLATFORM":
                return new PSDCMSPlatformDTO();
            case "PSDCMSPLATFORMFUNC":
                return new PSDCMSPlatformFuncDTO();
            case "PSDCMSPLATFORMNODE":
                return new PSDCMSPlatformNodeDTO();
            case "PSDCMTDEF":
                return new PSDCMTDEFDTO();
            case "PSDCMODELTEMPL":
                return new PSDCModelTemplDTO();
            case "PSDCREGISTRYITEM":
                return new PSDCRegistryItemDTO();
            case "PSDCREGISTRYREPO":
                return new PSDCRegistryRepoDTO();
            case "PSDCREGISTRYSERVER":
                return new PSDCRegistryServerDTO();
            case "PSDCSYSMODELREPO":
                return new PSDCSysModelRepoDTO();
            case "PSDCWORKSPACE":
                return new PSDCWorkspaceDTO();
            case "PSDEACMODE":
                return new PSDEACModeDTO();
            case "PSDEACMODEITEM":
                return new PSDEACModeItemDTO();
            case "PSDEAGDETAIL":
                return new PSDEAGDetailDTO();
            case "PSDEACTION":
                return new PSDEActionDTO();
            case "PSDEACTIONGROUP":
                return new PSDEActionGroupDTO();
            case "PSDEACTIONLOGIC":
                return new PSDEActionLogicDTO();
            case "PSDEACTIONPARAM":
                return new PSDEActionParamDTO();
            case "PSDEACTIONTEMPL":
                return new PSDEActionTemplDTO();
            case "PSDEACTIONVR":
                return new PSDEActionVRDTO();
            case "PSDECHART":
                return new PSDEChartDTO();
            case "PSDECHARTAXES":
                return new PSDEChartAxesDTO();
            case "PSDECHARTLOGIC":
                return new PSDEChartLogicDTO();
            case "PSDECHARTPARAM":
                return new PSDEChartParamDTO();
            case "PSDEDBCFG":
                return new PSDEDBCfgDTO();
            case "PSDEDBIDXFIELD":
                return new PSDEDBIdxFieldDTO();
            case "PSDEDBINDEX":
                return new PSDEDBIndexDTO();
            case "PSDEDQCODE":
                return new PSDEDQCodeDTO();
            case "PSDEDQCODECOND":
                return new PSDEDQCodeCondDTO();
            case "PSDEDQCODEEXP":
                return new PSDEDQCodeExpDTO();
            case "PSDEDQCOND":
                return new PSDEDQCondDTO();
            case "PSDEDQJOIN":
                return new PSDEDQJoinDTO();
            case "PSDEDRDETAIL":
                return new PSDEDRDetailDTO();
            case "PSDEDRGROUP":
                return new PSDEDRGroupDTO();
            case "PSDEDRITEM":
                return new PSDEDRItemDTO();
            case "PSDEDSDQ":
                return new PSDEDSDQDTO();
            case "PSDEDSGRPPARAM":
                return new PSDEDSGrpParamDTO();
            case "PSDEDSPARAM":
                return new PSDEDSParamDTO();
            case "PSDEDTSQUEUE":
                return new PSDEDTSQueueDTO();
            case "PSDEDATAEXP":
                return new PSDEDataExpDTO();
            case "PSDEDATAIMP":
                return new PSDEDataImpDTO();
            case "PSDEDATAIMPITEM":
                return new PSDEDataImpItemDTO();
            case "PSDEDATAQUERY":
                return new PSDEDataQueryDTO();
            case "PSDEDATARELATION":
                return new PSDEDataRelationDTO();
            case "PSDEDATASET":
                return new PSDEDataSetDTO();
            case "PSDEDATASYNC":
                return new PSDEDataSyncDTO();
            case "PSDEDATAVIEW":
                return new PSDEDataViewDTO();
            case "PSDEDATAVIEWLOGIC":
                return new PSDEDataViewLogicDTO();
            case "PSDEFDLOGIC":
                return new PSDEFDLogicDTO();
            case "PSDEFDTCOL":
                return new PSDEFDTColDTO();
            case "PSDEFDATATYPE":
                return new PSDEFDataTypeDTO();
            case "PSDEFGROUP":
                return new PSDEFGroupDTO();
            case "PSDEFGROUPDETAIL":
                return new PSDEFGroupDetailDTO();
            case "PSDEFIUDETAIL":
                return new PSDEFIUDetailDTO();
            case "PSDEFIUPDATE":
                return new PSDEFIUpdateDTO();
            case "PSDEFIVR":
                return new PSDEFIVRDTO();
            case "PSDEFINPUTTIP":
                return new PSDEFInputTipDTO();
            case "PSDEFINPUTTIPSET":
                return new PSDEFInputTipSetDTO();
            case "PSDEFSFITEM":
                return new PSDEFSFItemDTO();
            case "PSDEFTYPE":
                return new PSDEFTypeDTO();
            case "PSDEFFORMITEM":
                return new PSDEFUIModeDTO();
            case "PSDEFVRCOND":
                return new PSDEFVRCondDTO();
            case "PSDEFVALUERULE":
                return new PSDEFValueRuleDTO();
            case "PSDEFORM":
                return new PSDEFormDTO();
            case "PSDEFORMDETAIL":
                return new PSDEFormDetailDTO();
            case "PSDEFORMLOGIC":
                return new PSDEFormLogicDTO();
            case "PSDEFORMRF":
                return new PSDEFormRFDTO();
            case "PSDEGEIUDETAIL":
                return new PSDEGEIUDetailDTO();
            case "PSDEGEIUPDATE":
                return new PSDEGEIUpdateDTO();
            case "PSDEGEIVR":
                return new PSDEGEIVRDTO();
            case "PSDEGRID":
                return new PSDEGridDTO();
            case "PSDEGRIDCOL":
                return new PSDEGridColDTO();
            case "PSDEGRIDLOGIC":
                return new PSDEGridLogicDTO();
            case "PSDEGROUP":
                return new PSDEGroupDTO();
            case "PSDEGROUPDETAIL":
                return new PSDEGroupDetailDTO();
            case "PSDEJOINTYPE":
                return new PSDEJoinTypeDTO();
            case "PSDELLCOND":
                return new PSDELLCondDTO();
            case "PSDELNPARAM":
                return new PSDELNParamDTO();
            case "PSDELIST":
                return new PSDEListDTO();
            case "PSDELISTITEM":
                return new PSDEListItemDTO();
            case "PSDELISTLOGIC":
                return new PSDEListLogicDTO();
            case "PSDELOGIC":
                return new PSDELogicDTO();
            case "PSDELOGICLINK":
                return new PSDELogicLinkDTO();
            case "PSDELOGICNODE":
                return new PSDELogicNodeDTO();
            case "PSDELOGICPARAM":
                return new PSDELogicParamDTO();
            case "PSDEMSACTION":
                return new PSDEMSActionDTO();
            case "PSDEMSFIELD":
                return new PSDEMSFieldDTO();
            case "PSDEMSOPPRIV":
                return new PSDEMSOPPrivDTO();
            case "PSDEMAINSTATE":
                return new PSDEMainStateDTO();
            case "PSDEMAINSTATERS":
                return new PSDEMainStateRSDTO();
            case "PSDEMAP":
                return new PSDEMapDTO();
            case "PSDEMAPACTION":
                return new PSDEMapActionDTO();
            case "PSDEMAPDQ":
                return new PSDEMapDQDTO();
            case "PSDEMAPDS":
                return new PSDEMapDSDTO();
            case "PSDEMAPDETAIL":
                return new PSDEMapDetailDTO();
            case "PSDENOTIFY":
                return new PSDENotifyDTO();
            case "PSDENOTIFYTARGET":
                return new PSDENotifyTargetDTO();
            case "PSDEOPPRIV":
                return new PSDEOPPrivDTO();
            case "PSDEOPPRIVROLE":
                return new PSDEOPPrivRoleDTO();
            case "PSDEPRINT":
                return new PSDEPrintDTO();
            case "PSDERDEFMAP":
                return new PSDERDEFMapDTO();
            case "PSDERGROUP":
                return new PSDERGroupDTO();
            case "PSDERGROUPDETAIL":
                return new PSDERGroupDetailDTO();
            case "PSDEREPITEM":
                return new PSDERepItemDTO();
            case "PSDEREPORT":
                return new PSDEReportDTO();
            case "PSDESADETAIL":
                return new PSDESADetailDTO();
            case "PSDESADETAILPARAM":
                return new PSDESADetailParamDTO();
            case "PSDESARS":
                return new PSDESARSDTO();
            case "PSDESAVR":
                return new PSDESAVRDTO();
            case "PSDESAMPLEDATA":
                return new PSDESampleDataDTO();
            case "PSDESERVICEAPI":
                return new PSDEServiceAPIDTO();
            case "PSDETBITEM":
                return new PSDETBItemDTO();
            case "PSDETEIUDETAIL":
                return new PSDETEIUDetailDTO();
            case "PSDETEIUPDATE":
                return new PSDETEIUpdateDTO();
            case "PSDETABLE":
                return new PSDEDBTableDTO();
            case "PSDETOOLBAR":
                return new PSDEToolbarDTO();
            case "PSDETOOLBARLOGIC":
                return new PSDEToolbarLogicDTO();
            case "PSDETREECOL":
                return new PSDETreeColDTO();
            case "PSDETREELOGIC":
                return new PSDETreeLogicDTO();
            case "PSDETREENODE":
                return new PSDETreeNodeDTO();
            case "PSDETREENODECOL":
                return new PSDETreeNodeColDTO();
            case "PSDETREENODERS":
                return new PSDETreeNodeRSDTO();
            case "PSDETREENODERV":
                return new PSDETreeNodeRVDTO();
            case "PSDETREEVIEW":
                return new PSDETreeViewDTO();
            case "PSDEUAGROUP":
                return new PSDEUAGroupDTO();
            case "PSDEUAGRPDETAIL":
                return new PSDEUAGroupDetailDTO();
            case "PSDEUIACTION":
                return new PSDEUIActionDTO();
            case "PSDEUSERROLE":
                return new PSDEUserRoleDTO();
            case "PSDEUTILDE":
                return new PSDEUtilDTO();
            case "PSDEVRGROUP":
                return new PSDEVRGroupDTO();
            case "PSDEVRGRPDETAIL":
                return new PSDEVRGrpDetailDTO();
            case "PSDEVIEWBASE":
                return new PSDEViewBaseDTO();
            case "PSDEVIEWCTRL":
                return new PSDEViewCtrlDTO();
            case "PSDEVIEWENGINE":
                return new PSDEViewEngineDTO();
            case "PSDEVIEWLOGIC":
                return new PSDEViewLogicDTO();
            case "PSDEVIEWRV":
                return new PSDEViewRVDTO();
            case "PSDEWIZARD":
                return new PSDEWizardDTO();
            case "PSDEWIZARDFORM":
                return new PSDEWizardFormDTO();
            case "PSDEWIZARDLOGIC":
                return new PSDEWizardLogicDTO();
            case "PSDEWIZARDSTEP":
                return new PSDEWizardStepDTO();
            case "PSDEVCENTER":
                return new PSDevCenterDTO();
            case "PSDEVCENTERDBINST":
                return new PSDevCenterDBInstDTO();
            case "PSDEVCENTERSVN":
                return new PSDevCenterSVNDTO();
            case "PSDEVSLN":
                return new PSDevSlnDTO();
            case "PSDEVSLNMSDEPAPI":
                return new PSDevSlnMSDepAPIDTO();
            case "PSDEVSLNMSDEPAPP":
                return new PSDevSlnMSDepAppDTO();
            case "PSDEVSLNMSDEPFUNC":
                return new PSDevSlnMSDepFuncDTO();
            case "PSDEVSLNMSDEPLOY":
                return new PSDevSlnMSDeployDTO();
            case "PSDEVSLNPIPELINE":
                return new PSDevSlnPipelineDTO();
            case "PSDEVSLNPIPELINELOG":
                return new PSDevSlnPipelineLogDTO();
            case "PSDEVSLNPIPELINESTAGE":
                return new PSDevSlnPipelineStageDTO();
            case "PSDEVSLNPIPELINESTEP":
                return new PSDevSlnPipelineStepDTO();
            case "PSDEVSLNRES":
                return new PSDevSlnResDTO();
            case "PSDEVSLNSYS":
                return new PSDevSlnSysDTO();
            case "PSDEVSLNSYSAPI":
                return new PSDevSlnSysAPIDTO();
            case "PSDEVSLNSYSAPP":
                return new PSDevSlnSysAppDTO();
            case "PSDEVSLNSYSBAK":
                return new PSDevSlnSysBakDTO();
            case "PSDEVSLNSYSDEPINST":
                return new PSDevSlnSysDepInstDTO();
            case "PSDEVSLNSYSDYNAINST":
                return new PSDevSlnSysDynaInstDTO();
            case "PSDEVSLNSYSREF":
                return new PSDevSlnSysRefDTO();
            case "PSDEVSLNSYSSRV":
                return new PSDevSlnSysSrvDTO();
            case "PSDEVSLNTEMPL":
                return new PSDevSlnTemplDTO();
            case "PSDEVSLNUSER":
                return new PSDevSlnUserDTO();
            case "PSDEVUSER":
                return new PSDevUserDTO();
            case "PSDEVUSEROBJ":
                return new PSDevUserObjDTO();
            case "PSEDITORTYPE":
                return new PSEditorTypeDTO();
            case "PSGITUSER":
                return new PSGitUserDTO();
            case "PSLANGUAGE":
                return new PSLanguageDTO();
            case "PSLANGUAGEITEM":
                return new PSLanguageItemDTO();
            case "PSLANGUAGERES":
                return new PSLanguageResDTO();
            case "PSMOBAPPPACK":
                return new PSMobAppPackDTO();
            case "PSMOBAPPSTARTPAGE":
                return new PSMobAppStartPageDTO();
            case "PSMODELRT":
                return new PSModelRTDTO();
            case "PSMODELRTCFG":
                return new PSModelRTCfgDTO();
            case "PSPF":
                return new PSPFDTO();
            case "PSPFPREVIEWACTION":
                return new PSPFPreviewActionDTO();
            case "PSPFSTYLE":
                return new PSPFStyleDTO();
            case "PSPANELENGINE":
                return new PSPanelEngineDTO();
            case "PSPANELITEMLOGIC":
                return new PSPanelItemLogicDTO();
            case "PSSF":
                return new PSSFDTO();
            case "PSSFPREVIEWACTION":
                return new PSSFPreviewActionDTO();
            case "PSSFSTYLE":
                return new PSSFStyleDTO();
            case "PSSVNSERVER":
                return new PSSVNServerDTO();
            case "PSSUBSYSSADE":
                return new PSSubSysSADEDTO();
            case "PSSUBSYSSADEFIELD":
                return new PSSubSysSADEFieldDTO();
            case "PSSUBSYSSADERS":
                return new PSSubSysSADERSDTO();
            case "PSSUBSYSSADETAIL":
                return new PSSubSysSADetailDTO();
            case "PSSUBSYSSADETAILPARAM":
                return new PSSubSysSADetailParamDTO();
            case "PSSUBSYSSERVICEAPI":
                return new PSSubSysServiceAPIDTO();
            case "PSSUBVIEWTYPE":
                return new PSSubViewTypeDTO();
            case "PSSYSAICHATAGENT":
                return new PSSysAIChatAgentDTO();
            case "PSSYSAIFACTORY":
                return new PSSysAIFactoryDTO();
            case "PSSYSAIPIPELINEAGENT":
                return new PSSysAIPipelineAgentDTO();
            case "PSSYSAIPIPELINEJOB":
                return new PSSysAIPipelineJobDTO();
            case "PSSYSAIPIPELINEWORKER":
                return new PSSysAIPipelineWorkerDTO();
            case "PSSYSAIWORKERAGENT":
                return new PSSysAIWorkerAgentDTO();
            case "PSSYSACTOR":
                return new PSSysActorDTO();
            case "PSSYSAPP":
                return new PSSysAppDTO();
            case "PSSYSBDCOLSET":
                return new PSSysBDColSetDTO();
            case "PSSYSBDCOLUMN":
                return new PSSysBDColumnDTO();
            case "PSSYSBDINSTCFG":
                return new PSSysBDInstCfgDTO();
            case "PSSYSBDMODULE":
                return new PSSysBDModuleDTO();
            case "PSSYSBDPART":
                return new PSSysBDPartDTO();
            case "PSSYSBDSCHEME":
                return new PSSysBDSchemeDTO();
            case "PSSYSBDTABLE":
                return new PSSysBDTableDTO();
            case "PSSYSBDTABLEDE":
                return new PSSysBDTableDEDTO();
            case "PSSYSBDTABLEDER":
                return new PSSysBDTableDERDTO();
            case "PSSYSBDTABLERS":
                return new PSSysBDTableRSDTO();
            case "PSSYSBIAGGCOLUMN":
                return new PSSysBIAggColumnDTO();
            case "PSSYSBIAGGTABLE":
                return new PSSysBIAggTableDTO();
            case "PSSYSBICUBE":
                return new PSSysBICubeDTO();
            case "PSSYSBICUBEDIMENSION":
                return new PSSysBICubeDimensionDTO();
            case "PSSYSBICUBELEVEL":
                return new PSSysBICubeLevelDTO();
            case "PSSYSBICUBEMEASURE":
                return new PSSysBICubeMeasureDTO();
            case "PSSYSBIDIMENSION":
                return new PSSysBIDimensionDTO();
            case "PSSYSBIHIERARCHY":
                return new PSSysBIHierarchyDTO();
            case "PSSYSBILEVEL":
                return new PSSysBILevelDTO();
            case "PSSYSBIREPORT":
                return new PSSysBIReportDTO();
            case "PSSYSBIREPORTITEM":
                return new PSSysBIReportItemDTO();
            case "PSSYSBISCHEME":
                return new PSSysBISchemeDTO();
            case "PSSYSBACKSERVICE":
                return new PSSysBackServiceDTO();
            case "PSSYSCALENDAR":
                return new PSSysCalendarDTO();
            case "PSSYSCALENDARITEM":
                return new PSSysCalendarItemDTO();
            case "PSSYSCALENDARITEMRV":
                return new PSSysCalendarItemRVDTO();
            case "PSSYSCALENDARLOGIC":
                return new PSSysCalendarLogicDTO();
            case "PSSYSCANVAS":
                return new PSSysCanvasDTO();
            case "PSSYSCANVASMODEL":
                return new PSSysCanvasModelDTO();
            case "PSSYSCHARTTHEME":
                return new PSSysChartThemeDTO();
            case "PSSYSCODESNIPPET":
                return new PSSysCodeSnippetDTO();
            case "PSSYSCONSOLE":
                return new PSSysConsoleDTO();
            case "PSSYSCONTENT":
                return new PSSysContentDTO();
            case "PSSYSCONTENTCAT":
                return new PSSysContentCatDTO();
            case "PSSYSCOUNTER":
                return new PSSysCounterDTO();
            case "PSSYSCOUNTERITEM":
                return new PSSysCounterItemDTO();
            case "PSSYSCSS":
                return new PSSysCssDTO();
            case "PSSYSCSSCAT":
                return new PSSysCssCatDTO();
            case "PSSYSDBCOLUMN":
                return new PSSysDBColumnDTO();
            case "PSSYSDBDETAIL":
                return new PSSysDBDetailDTO();
            case "PSSYSDBPART":
                return new PSSysDBPartDTO();
            case "PSSYSDBPROC":
                return new PSSysDBProcDTO();
            case "PSSYSDBPROCPARAM":
                return new PSSysDBProcParamDTO();
            case "PSSYSDBSCHEME":
                return new PSSysDBSchemeDTO();
            case "PSSYSDBTABLE":
                return new PSSysDBTableDTO();
            case "PSSYSDBVF":
                return new PSSysDBVFDTO();
            case "PSSYSDBVFCODE":
                return new PSSysDBVFCodeDTO();
            case "PSSYSDEFTYPE":
                return new PSSysDEFTypeDTO();
            case "PSSYSDELOGICNODE":
                return new PSSysDELogicNodeDTO();
            case "PSSYSDMITEM":
                return new PSSysDMItemDTO();
            case "PSSYSDMITEMLOG":
                return new PSSysDMItemLogDTO();
            case "PSSYSDMVER":
                return new PSSysDMVerDTO();
            case "PSSYSDASHBOARD":
                return new PSSysDashboardDTO();
            case "PSSYSDASHBOARDLOGIC":
                return new PSSysDashboardLogicDTO();
            case "PSSYSDATASYNCAGENT":
                return new PSSysDataSyncAgentDTO();
            case "PSSYSDEVBKTASK":
                return new PSSysDevBKTaskDTO();
            case "PSSYSDICTCAT":
                return new PSSysDictCatDTO();
            case "PSSYSDYNAMODEL":
                return new PSSysDynaModelDTO();
            case "PSSYSDYNAMODELATTR":
                return new PSSysDynaModelAttrDTO();
            case "PSSYSDYNAMODELCAT":
                return new PSSysDynaModelCatDTO();
            case "PSSYSEAIDE":
                return new PSSysEAIDEDTO();
            case "PSSYSEAIDEFIELD":
                return new PSSysEAIDEFieldDTO();
            case "PSSYSEAIDER":
                return new PSSysEAIDERDTO();
            case "PSSYSEAIDATATYPE":
                return new PSSysEAIDataTypeDTO();
            case "PSSYSEAIDATATYPEITEM":
                return new PSSysEAIDataTypeItemDTO();
            case "PSSYSEAIELEMENT":
                return new PSSysEAIElementDTO();
            case "PSSYSEAIELEMENTATTR":
                return new PSSysEAIElementAttrDTO();
            case "PSSYSEAIELEMENTRE":
                return new PSSysEAIElementREDTO();
            case "PSSYSEAISCHEME":
                return new PSSysEAISchemeDTO();
            case "PSSYSERMAP":
                return new PSSysERMapDTO();
            case "PSSYSERMAPNODE":
                return new PSSysERMapNodeDTO();
            case "PSSYSEDITORSTYLE":
                return new PSSysEditorStyleDTO();
            case "PSSYSIMAGE":
                return new PSSysImageDTO();
            case "PSSYSISSUE":
                return new PSSysIssueDTO();
            case "PSSYSMAPITEM":
                return new PSSysMapItemDTO();
            case "PSSYSMAPLOGIC":
                return new PSSysMapLogicDTO();
            case "PSSYSMAPVIEW":
                return new PSSysMapViewDTO();
            case "PSSYSDBCHGLOG":
                return new PSSysModelChgLogDTO();
            case "PSSYSMODELFOLDER":
                return new PSSysModelFolderDTO();
            case "PSSYSMODELFOLDERITEM":
                return new PSSysModelFolderItemDTO();
            case "PSSYSMODELGROUP":
                return new PSSysModelGroupDTO();
            case "PSSYSMODELINST":
                return new PSSysModelInstDTO();
            case "PSSYSMODELLOG":
                return new PSSysModelLogDTO();
            case "PSSYSMSGQUEUE":
                return new PSSysMsgQueueDTO();
            case "PSSYSMSGTARGET":
                return new PSSysMsgTargetDTO();
            case "PSSYSMSGTEMPL":
                return new PSSysMsgTemplDTO();
            case "PSSYSOPPRIV":
                return new PSSysUserRoleDTO();
            case "PSSYSPDTVIEW":
                return new PSSysPDTViewDTO();
            case "PSSYSPFPITEMPL":
                return new PSSysPFPITemplDTO();
            case "PSSYSPFPLUGIN":
                return new PSSysPFPluginDTO();
            case "PSSYSPORTLET":
                return new PSSysPortletDTO();
            case "PSSYSPORTLETCAT":
                return new PSSysPortletCatDTO();
            case "PSSYSREF":
                return new PSSysRefDTO();
            case "PSSYSREQITEM":
                return new PSSysReqItemDTO();
            case "PSSYSREQITEMDATA":
                return new PSSysReqItemDataDTO();
            case "PSSYSREQITEMHIS":
                return new PSSysReqItemHisDTO();
            case "PSSYSREQMODULE":
                return new PSSysReqModuleDTO();
            case "PSSYSRESOURCE":
                return new PSSysResourceDTO();
            case "PSSYSRUNSESSION":
                return new PSSysRunSessionDTO();
            case "PSSYSSAHANDLER":
                return new PSSysSAHandlerDTO();
            case "PSSYSSFPITEMPL":
                return new PSSysSFPITemplDTO();
            case "PSSYSSFPLUGIN":
                return new PSSysSFPluginDTO();
            case "PSSYSSFPUB":
                return new PSSysSFPubDTO();
            case "PSSYSSFPUBPKG":
                return new PSSysSFPubPkgDTO();
            case "PSSYSSAMPLEVALUE":
                return new PSSysSampleValueDTO();
            case "PSSYSSEARCHBAR":
                return new PSSysSearchBarDTO();
            case "PSSYSSEARCHBARITEM":
                return new PSSysSearchBarItemDTO();
            case "PSSYSSEARCHBARLOGIC":
                return new PSSysSearchBarLogicDTO();
            case "PSSYSSEARCHDE":
                return new PSSysSearchDEDTO();
            case "PSSYSSEARCHDEFIELD":
                return new PSSysSearchDEFieldDTO();
            case "PSSYSSEARCHDOC":
                return new PSSysSearchDocDTO();
            case "PSSYSSEARCHFIELD":
                return new PSSysSearchFieldDTO();
            case "PSSYSSEARCHSCHEME":
                return new PSSysSearchSchemeDTO();
            case "PSSYSSEQUENCE":
                return new PSSysSequenceDTO();
            case "PSSYSSERVICEAPI":
                return new PSSysServiceAPIDTO();
            case "PSSYSTCASSERT":
                return new PSSysTCAssertDTO();
            case "PSSYSTCINPUT":
                return new PSSysTCInputDTO();
            case "PSSYSTDITEM":
                return new PSSysTDItemDTO();
            case "PSSYSTESTCASE":
                return new PSSysTestCaseDTO();
            case "PSSYSTESTDATA":
                return new PSSysTestDataDTO();
            case "PSSYSTESTMODULE":
                return new PSSysTestModuleDTO();
            case "PSSYSTESTPRJ":
                return new PSSysTestPrjDTO();
            case "PSSYSTRANSLATOR":
                return new PSSysTranslatorDTO();
            case "PSSYSUCMAP":
                return new PSSysUCMapDTO();
            case "PSSYSUCMAPNODE":
                return new PSSysUCMapNodeDTO();
            case "PSSYSUNIRES":
                return new PSSysUniResDTO();
            case "PSSYSUNISTATE":
                return new PSSysUniStateDTO();
            case "PSSYSUNIT":
                return new PSSysUnitDTO();
            case "PSSYSUSERDR":
                return new PSSysUserDRDTO();
            case "PSSYSUSERMODE":
                return new PSSysUserModeDTO();
            case "PSSYSUSERROLEDATA":
                return new PSSysUserRoleDataDTO();
            case "PSSYSUSERROLERES":
                return new PSSysUserRoleResDTO();
            case "PSSYSUTILDE":
                return new PSSysUtilDTO();
            case "PSSYSVALUERULE":
                return new PSSysValueRuleDTO();
            case "PSSYSVIEWLOGIC":
                return new PSSysViewLogicDTO();
            case "PSSYSVIEWLOGICPARAM":
                return new PSSysViewLogicParamDTO();
            case "PSSYSVIEWPANEL":
                return new PSSysViewPanelDTO();
            case "PSSYSVIEWPANELITEM":
                return new PSSysViewPanelItemDTO();
            case "PSSYSVIEWPANELLOGIC":
                return new PSSysViewPanelLogicDTO();
            case "PSSYSVIEWPANELMODEL":
                return new PSSysViewPanelModelDTO();
            case "PSSYSWFCAT":
                return new PSSysWFCatDTO();
            case "PSSYSWFMODE":
                return new PSSysWFModeDTO();
            case "PSSYSWFSETTING":
                return new PSSysWFSettingDTO();
            case "PSSYSTEMDBCFG":
                return new PSSystemDBCfgDTO();
            case "PSSYSTEMRUN":
                return new PSSystemRunDTO();
            case "PSTHRESHOLD":
                return new PSThresholdDTO();
            case "PSTHRESHOLDGROUP":
                return new PSThresholdGroupDTO();
            case "PSVTCATDETAIL":
                return new PSVTCatDetailDTO();
            case "PSVTCTRL":
                return new PSVTCtrlDTO();
            case "PSVTRV":
                return new PSVTRVDTO();
            case "PSVIEWMSG":
                return new PSViewMsgDTO();
            case "PSVIEWMSGGROUP":
                return new PSViewMsgGroupDTO();
            case "PSVIEWMSGGRPDETAIL":
                return new PSViewMsgGrpDetailDTO();
            case "PSVIEWTYPE":
                return new PSViewTypeDTO();
            case "PSVIEWTYPECAT":
                return new PSViewTypeCatDTO();
            case "PSWFDE":
                return new PSWFDEDTO();
            case "PSWFLINK":
                return new PSWFLinkDTO();
            case "PSWFLINKCOND":
                return new PSWFLinkCondDTO();
            case "PSWFLINKROLE":
                return new PSWFLinkRoleDTO();
            case "PSWFPROCPARAM":
                return new PSWFProcParamDTO();
            case "PSWFPROCROLE":
                return new PSWFProcRoleDTO();
            case "PSWFPROCSUBWF":
                return new PSWFProcSubWFDTO();
            case "PSWFPROCESS":
                return new PSWFProcessDTO();
            case "PSWFROLE":
                return new PSWFRoleDTO();
            case "PSWFUTILUIACTION":
                return new PSWFUtilUIActionDTO();
            case "PSWFVERSION":
                return new PSWFVersionDTO();
            case "PSWFWORKTIME":
                return new PSWFWorkTimeDTO();
            case "PSWXACCOUNT":
                return new PSWXAccountDTO();
            case "PSWXENTAPP":
                return new PSWXEntAppDTO();
            case "PSWXLOGIC":
                return new PSWXLogicDTO();
            case "PSWXMENU":
                return new PSWXMenuDTO();
            case "PSWXMENUFUNC":
                return new PSWXMenuFuncDTO();
            case "PSWXMENUITEM":
                return new PSWXMenuItemDTO();
            case "PSWORKFLOW":
                return new PSWorkflowDTO();
            default:
                return null;
        }
    }
}