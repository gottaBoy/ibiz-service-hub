package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSWFProcessDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSWFPROCESS")
public interface IPSWFProcessService
extends IPSModelDEService<PSWFProcessDTO, ISearchContextDTO> {
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
    public static final String ACTION_CALCEMBEDPSDEID = "CALCEMBEDPSDEID";
    public static final String ACTION_CALCPSDEID = "CALCPSDEID";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_FORMTYPE = "FORMTYPE";
    public static final String DATASET_IA = "IA";

    public void calcEmbedPSDEId(PSWFProcessDTO dto) throws Throwable;

    public void calcPSDEId(PSWFProcessDTO dto) throws Throwable;

    public Page<PSWFProcessDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSWFProcessDTO> fetchFormType(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSWFProcessDTO> fetchIA(ISearchContextDTO searchContext) throws Throwable;
}
