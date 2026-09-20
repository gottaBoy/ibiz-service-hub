package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFLinkDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSWFLINK")
public interface IPSWFLinkService
extends IPSModelDEService<PSWFLinkDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_CREATETEMP = "CREATETEMP";
    public static final String ACTION_CREATETEMPMAJOR = "CREATETEMPMAJOR";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_UPDATETEMP = "UPDATETEMP";
    public static final String ACTION_UPDATETEMPMAJOR = "UPDATETEMPMAJOR";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_REMOVETEMP = "REMOVETEMP";
    public static final String ACTION_REMOVETEMPMAJOR = "REMOVETEMPMAJOR";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETTEMP = "GETTEMP";
    public static final String ACTION_GETTEMPMAJOR = "GETTEMPMAJOR";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_GETDRAFTTEMP = "GETDRAFTTEMP";
    public static final String ACTION_GETDRAFTTEMPMAJOR = "GETDRAFTTEMPMAJOR";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEWITHMODEL = "CREATEWITHMODEL";
    public static final String ACTION_GETWITHMODEL = "GETWITHMODEL";
    public static final String ACTION_SAVE = "SAVE";
    public static final String ACTION_UPDATEWITHMODEL = "UPDATEWITHMODEL";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_SOURCE = "SOURCE";
    public static final String DATAQUERY_TARGET = "TARGET";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_IA = "IA";
    public static final String DATASET_SOURCE = "SOURCE";
    public static final String DATASET_TARGET = "TARGET";

    public void createWithModel(PSWFLinkDTO dto) throws Throwable;

    public PSWFLinkDTO getWithModel(String value) throws Throwable;

    public void updateWithModel(PSWFLinkDTO dto) throws Throwable;

    public Page<PSWFLinkDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSWFLinkDTO> fetchIA(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSWFLinkDTO> fetchSource(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSWFLinkDTO> fetchTarget(ISearchContextDTO searchContext) throws Throwable;
}
