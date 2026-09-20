package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSLanguageResDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSLANGUAGERES")
public interface IPSLanguageResService
extends IPSModelDEService<PSLanguageResDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_AUTOFILLMODULE = "AUTOFILLMODULE";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATESHORTTAG = "CREATESHORTTAG";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_INITLANITEM = "INITLANITEM";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURSYS = "CURSYS";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATASET_CURSYS = "CURSYS";
    public static final String DATASET_DEFAULT = "DEFAULT";

    public void autoFillModule(PSLanguageResDTO dto) throws Throwable;

    public void createShortTag(PSLanguageResDTO dto) throws Throwable;

    public void initLanItem(PSLanguageResDTO dto) throws Throwable;

    public Page<PSLanguageResDTO> fetchCurSys(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSLanguageResDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;
}
