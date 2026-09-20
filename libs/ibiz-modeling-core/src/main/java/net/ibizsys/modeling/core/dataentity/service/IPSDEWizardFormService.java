package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDEWizardFormDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDEWIZARDFORM")
public interface IPSDEWizardFormService
extends IPSModelDEService<PSDEWizardFormDTO, ISearchContextDTO> {
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
    public static final String ACTION_INITNEXTACTION = "INITNEXTACTION";
    public static final String ACTION_INITPREACTION = "INITPREACTION";
    public static final String ACTION_INITWIZARDFORM = "INITWIZARDFORM";
    public static final String ACTION_INITWIZARDSTEP = "INITWIZARDSTEP";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void initNextAction(PSDEWizardFormDTO dto) throws Throwable;

    public void initPreAction(PSDEWizardFormDTO dto) throws Throwable;

    public void initWizardForm(PSDEWizardFormDTO dto) throws Throwable;

    public void initWizardStep(PSDEWizardFormDTO dto) throws Throwable;

    public Page<PSDEWizardFormDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
