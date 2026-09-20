package net.ibizsys.modeling.core.dataentity.service;

import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSDERDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;

@Qualifier(value="PSDER")
public interface IPSDERService
extends IPSModelDEService<PSDERDTO, ISearchContextDTO> {
    public static final String ACTION_CREATE = "CREATE";
    public static final String ACTION_UPDATE = "UPDATE";
    public static final String ACTION_REMOVE = "REMOVE";
    public static final String ACTION_GET = "GET";
    public static final String ACTION_GETDRAFT = "GETDRAFT";
    public static final String ACTION_CHECKKEY = "CHECKKEY";
    public static final String ACTION_CREATEDEOPPRIV = "CREATEDEOPPRIV";
    public static final String ACTION_CREATEDEFAULTVR = "CREATEDEFAULTVR";
    public static final String ACTION_CREATEPICKUPTEXTFIELD = "CREATEPICKUPTEXTFIELD";
    public static final String ACTION_EXPORTMODELV2 = "EXPORTMODELV2";
    public static final String ACTION_IMPORTMODELV2 = "IMPORTMODELV2";
    public static final String ACTION_SAVE = "SAVE";
    public static final String DATAQUERY_CURDEDER11 = "CURDEDER11";
    public static final String DATAQUERY_CURDEDER1N = "CURDEDER1N";
    public static final String DATAQUERY_CURDEDER1N2 = "CURDEDER1N2";
    public static final String DATAQUERY_CURDEDERCUSTOM = "CURDEDERCUSTOM";
    public static final String DATAQUERY_CURDEMAJOR = "CURDEMAJOR";
    public static final String DATAQUERY_CURDEMAJOR2 = "CURDEMAJOR2";
    public static final String DATAQUERY_CURDEMAJORAGGDATA = "CURDEMAJORAGGDATA";
    public static final String DATAQUERY_CURDEMINOR = "CURDEMINOR";
    public static final String DATAQUERY_CURDEMINOR2 = "CURDEMINOR2";
    public static final String DATAQUERY_CURSYSDER = "CURSYSDER";
    public static final String DATAQUERY_CURSYSDER1N = "CURSYSDER1N";
    public static final String DATAQUERY_DEFAULT = "DEFAULT";
    public static final String DATAQUERY_MAJORMINORDER1N = "MAJORMINORDER1N";
    public static final String DATAQUERY_VIEW = "VIEW";
    public static final String DATAQUERY_X11 = "X11";
    public static final String DATAQUERY_X1N = "X1N";
    public static final String DATAQUERY_XINDEX = "XINDEX";
    public static final String DATASET_CURDEDER11 = "CURDEDER11";
    public static final String DATASET_CURDEDER11_CUSTOM = "CURDEDER11_CUSTOM";
    public static final String DATASET_CURDEDER1N = "CURDEDER1N";
    public static final String DATASET_CURDEDER1N2 = "CURDEDER1N2";
    public static final String DATASET_CURDEDER1N_CUSTOM = "CURDEDER1N_CUSTOM";
    public static final String DATASET_CURDEDERCUSTOM = "CURDEDERCUSTOM";
    public static final String DATASET_CURDEMAJOR = "CURDEMAJOR";
    public static final String DATASET_CURDEMAJOR2 = "CURDEMAJOR2";
    public static final String DATASET_CURDEMAJORAGGDATA = "CURDEMAJORAGGDATA";
    public static final String DATASET_CURDEMINOR = "CURDEMINOR";
    public static final String DATASET_CURDEMINOR2 = "CURDEMINOR2";
    public static final String DATASET_CURSYSDER = "CURSYSDER";
    public static final String DATASET_CURSYSDER1N = "CURSYSDER1N";
    public static final String DATASET_DEFAULT = "DEFAULT";
    public static final String DATASET_FORMTYPE = "FORMTYPE";
    public static final String DATASET_MAJORMINORDER1N = "MAJORMINORDER1N";
    public static final String DATASET_X1N = "X1N";

    public void createDEOPPriv(PSDERDTO dto) throws Throwable;

    public void createDefaultVR(PSDERDTO dto) throws Throwable;

    public void createPickupTextField(PSDERDTO dto) throws Throwable;

    public Page<PSDERDTO> fetchCurDEDER11(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEDER11_Custom(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEDER1N(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEDER1N2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEDER1N_Custom(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEDERCustom(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEMajor(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEMajor2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEMajorAggData(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEMinor(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurDEMinor2(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurSysDER(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchCurSysDER1N(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchDefault(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchFormType(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchMajorMinorDER1N(ISearchContextDTO searchContext) throws Throwable;

    public Page<PSDERDTO> fetchX1N(ISearchContextDTO searchContext) throws Throwable;
}
