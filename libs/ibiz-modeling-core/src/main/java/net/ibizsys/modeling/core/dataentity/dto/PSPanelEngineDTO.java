package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSPanelEngineDTO
extends PSModelDTOBase {
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_ENGINEOPTION = "ENGINEOPTION";
    protected static final String DTOFIELD_ENGINEOPTION = "engineoption";
    public static final String FIELD_ENGINEPARAM = "ENGINEPARAM";
    protected static final String DTOFIELD_ENGINEPARAM = "engineparam";
    public static final String FIELD_ENGINEPARAM10 = "ENGINEPARAM10";
    protected static final String DTOFIELD_ENGINEPARAM10 = "engineparam10";
    public static final String FIELD_ENGINEPARAM10FLAG = "ENGINEPARAM10FLAG";
    protected static final String DTOFIELD_ENGINEPARAM10FLAG = "engineparam10flag";
    public static final String FIELD_ENGINEPARAM10LABEL = "ENGINEPARAM10LABEL";
    protected static final String DTOFIELD_ENGINEPARAM10LABEL = "engineparam10label";
    public static final String FIELD_ENGINEPARAM2 = "ENGINEPARAM2";
    protected static final String DTOFIELD_ENGINEPARAM2 = "engineparam2";
    public static final String FIELD_ENGINEPARAM2FLAG = "ENGINEPARAM2FLAG";
    protected static final String DTOFIELD_ENGINEPARAM2FLAG = "engineparam2flag";
    public static final String FIELD_ENGINEPARAM2LABEL = "ENGINEPARAM2LABEL";
    protected static final String DTOFIELD_ENGINEPARAM2LABEL = "engineparam2label";
    public static final String FIELD_ENGINEPARAM3 = "ENGINEPARAM3";
    protected static final String DTOFIELD_ENGINEPARAM3 = "engineparam3";
    public static final String FIELD_ENGINEPARAM3FLAG = "ENGINEPARAM3FLAG";
    protected static final String DTOFIELD_ENGINEPARAM3FLAG = "engineparam3flag";
    public static final String FIELD_ENGINEPARAM3LABEL = "ENGINEPARAM3LABEL";
    protected static final String DTOFIELD_ENGINEPARAM3LABEL = "engineparam3label";
    public static final String FIELD_ENGINEPARAM4 = "ENGINEPARAM4";
    protected static final String DTOFIELD_ENGINEPARAM4 = "engineparam4";
    public static final String FIELD_ENGINEPARAM4FLAG = "ENGINEPARAM4FLAG";
    protected static final String DTOFIELD_ENGINEPARAM4FLAG = "engineparam4flag";
    public static final String FIELD_ENGINEPARAM4LABEL = "ENGINEPARAM4LABEL";
    protected static final String DTOFIELD_ENGINEPARAM4LABEL = "engineparam4label";
    public static final String FIELD_ENGINEPARAM5 = "ENGINEPARAM5";
    protected static final String DTOFIELD_ENGINEPARAM5 = "engineparam5";
    public static final String FIELD_ENGINEPARAM5FLAG = "ENGINEPARAM5FLAG";
    protected static final String DTOFIELD_ENGINEPARAM5FLAG = "engineparam5flag";
    public static final String FIELD_ENGINEPARAM5LABEL = "ENGINEPARAM5LABEL";
    protected static final String DTOFIELD_ENGINEPARAM5LABEL = "engineparam5label";
    public static final String FIELD_ENGINEPARAM6 = "ENGINEPARAM6";
    protected static final String DTOFIELD_ENGINEPARAM6 = "engineparam6";
    public static final String FIELD_ENGINEPARAM6FLAG = "ENGINEPARAM6FLAG";
    protected static final String DTOFIELD_ENGINEPARAM6FLAG = "engineparam6flag";
    public static final String FIELD_ENGINEPARAM6LABEL = "ENGINEPARAM6LABEL";
    protected static final String DTOFIELD_ENGINEPARAM6LABEL = "engineparam6label";
    public static final String FIELD_ENGINEPARAM7 = "ENGINEPARAM7";
    protected static final String DTOFIELD_ENGINEPARAM7 = "engineparam7";
    public static final String FIELD_ENGINEPARAM7FLAG = "ENGINEPARAM7FLAG";
    protected static final String DTOFIELD_ENGINEPARAM7FLAG = "engineparam7flag";
    public static final String FIELD_ENGINEPARAM7LABEL = "ENGINEPARAM7LABEL";
    protected static final String DTOFIELD_ENGINEPARAM7LABEL = "engineparam7label";
    public static final String FIELD_ENGINEPARAM8 = "ENGINEPARAM8";
    protected static final String DTOFIELD_ENGINEPARAM8 = "engineparam8";
    public static final String FIELD_ENGINEPARAM8FLAG = "ENGINEPARAM8FLAG";
    protected static final String DTOFIELD_ENGINEPARAM8FLAG = "engineparam8flag";
    public static final String FIELD_ENGINEPARAM8LABEL = "ENGINEPARAM8LABEL";
    protected static final String DTOFIELD_ENGINEPARAM8LABEL = "engineparam8label";
    public static final String FIELD_ENGINEPARAM9 = "ENGINEPARAM9";
    protected static final String DTOFIELD_ENGINEPARAM9 = "engineparam9";
    public static final String FIELD_ENGINEPARAM9FLAG = "ENGINEPARAM9FLAG";
    protected static final String DTOFIELD_ENGINEPARAM9FLAG = "engineparam9flag";
    public static final String FIELD_ENGINEPARAM9LABEL = "ENGINEPARAM9LABEL";
    protected static final String DTOFIELD_ENGINEPARAM9LABEL = "engineparam9label";
    public static final String FIELD_ENGINEPARAMFLAG = "ENGINEPARAMFLAG";
    protected static final String DTOFIELD_ENGINEPARAMFLAG = "engineparamflag";
    public static final String FIELD_ENGINEPARAMLABEL = "ENGINEPARAMLABEL";
    protected static final String DTOFIELD_ENGINEPARAMLABEL = "engineparamlabel";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_NO2PANELITEMFLAG = "NO2PANELITEMFLAG";
    protected static final String DTOFIELD_NO2PANELITEMFLAG = "no2panelitemflag";
    public static final String FIELD_NO2PANELITEMLABEL = "NO2PANELITEMLABEL";
    protected static final String DTOFIELD_NO2PANELITEMLABEL = "no2panelitemlabel";
    public static final String FIELD_NO2PANELLOGICFLAG = "NO2PANELLOGICFLAG";
    protected static final String DTOFIELD_NO2PANELLOGICFLAG = "no2panellogicflag";
    public static final String FIELD_NO2PANELLOGICLABEL = "NO2PANELLOGICLABEL";
    protected static final String DTOFIELD_NO2PANELLOGICLABEL = "no2panellogiclabel";
    public static final String FIELD_NO2PSPANELITEMID = "NO2PSPANELITEMID";
    protected static final String DTOFIELD_NO2PSPANELITEMID = "no2pspanelitemid";
    public static final String FIELD_NO2PSPANELITEMNAME = "NO2PSPANELITEMNAME";
    protected static final String DTOFIELD_NO2PSPANELITEMNAME = "no2pspanelitemname";
    public static final String FIELD_NO2PSPANELLOGICID = "NO2PSPANELLOGICID";
    protected static final String DTOFIELD_NO2PSPANELLOGICID = "no2pspanellogicid";
    public static final String FIELD_NO2PSPANELLOGICNAME = "NO2PSPANELLOGICNAME";
    protected static final String DTOFIELD_NO2PSPANELLOGICNAME = "no2pspanellogicname";
    public static final String FIELD_NO3PANELITEMFLAG = "NO3PANELITEMFLAG";
    protected static final String DTOFIELD_NO3PANELITEMFLAG = "no3panelitemflag";
    public static final String FIELD_NO3PANELITEMLABEL = "NO3PANELITEMLABEL";
    protected static final String DTOFIELD_NO3PANELITEMLABEL = "no3panelitemlabel";
    public static final String FIELD_NO3PANELLOGICFLAG = "NO3PANELLOGICFLAG";
    protected static final String DTOFIELD_NO3PANELLOGICFLAG = "no3panellogicflag";
    public static final String FIELD_NO3PANELLOGICLABEL = "NO3PANELLOGICLABEL";
    protected static final String DTOFIELD_NO3PANELLOGICLABEL = "no3panellogiclabel";
    public static final String FIELD_NO3PSPANELITEMID = "NO3PSPANELITEMID";
    protected static final String DTOFIELD_NO3PSPANELITEMID = "no3pspanelitemid";
    public static final String FIELD_NO3PSPANELITEMNAME = "NO3PSPANELITEMNAME";
    protected static final String DTOFIELD_NO3PSPANELITEMNAME = "no3pspanelitemname";
    public static final String FIELD_NO3PSPANELLOGICID = "NO3PSPANELLOGICID";
    protected static final String DTOFIELD_NO3PSPANELLOGICID = "no3pspanellogicid";
    public static final String FIELD_NO3PSPANELLOGICNAME = "NO3PSPANELLOGICNAME";
    protected static final String DTOFIELD_NO3PSPANELLOGICNAME = "no3pspanellogicname";
    public static final String FIELD_NO4PANELITEMFLAG = "NO4PANELITEMFLAG";
    protected static final String DTOFIELD_NO4PANELITEMFLAG = "no4panelitemflag";
    public static final String FIELD_NO4PANELITEMLABEL = "NO4PANELITEMLABEL";
    protected static final String DTOFIELD_NO4PANELITEMLABEL = "no4panelitemlabel";
    public static final String FIELD_NO4PANELLOGICFLAG = "NO4PANELLOGICFLAG";
    protected static final String DTOFIELD_NO4PANELLOGICFLAG = "no4panellogicflag";
    public static final String FIELD_NO4PANELLOGICLABEL = "NO4PANELLOGICLABEL";
    protected static final String DTOFIELD_NO4PANELLOGICLABEL = "no4panellogiclabel";
    public static final String FIELD_NO4PSPANELITEMID = "NO4PSPANELITEMID";
    protected static final String DTOFIELD_NO4PSPANELITEMID = "no4pspanelitemid";
    public static final String FIELD_NO4PSPANELITEMNAME = "NO4PSPANELITEMNAME";
    protected static final String DTOFIELD_NO4PSPANELITEMNAME = "no4pspanelitemname";
    public static final String FIELD_NO4PSPANELLOGICID = "NO4PSPANELLOGICID";
    protected static final String DTOFIELD_NO4PSPANELLOGICID = "no4pspanellogicid";
    public static final String FIELD_NO4PSPANELLOGICNAME = "NO4PSPANELLOGICNAME";
    protected static final String DTOFIELD_NO4PSPANELLOGICNAME = "no4pspanellogicname";
    public static final String FIELD_ORDERVALUE = "ORDERVALUE";
    protected static final String DTOFIELD_ORDERVALUE = "ordervalue";
    public static final String FIELD_PANELITEMFLAG = "PANELITEMFLAG";
    protected static final String DTOFIELD_PANELITEMFLAG = "panelitemflag";
    public static final String FIELD_PANELITEMLABEL = "PANELITEMLABEL";
    protected static final String DTOFIELD_PANELITEMLABEL = "panelitemlabel";
    public static final String FIELD_PANELLOGICFLAG = "PANELLOGICFLAG";
    protected static final String DTOFIELD_PANELLOGICFLAG = "panellogicflag";
    public static final String FIELD_PANELLOGICLABEL = "PANELLOGICLABEL";
    protected static final String DTOFIELD_PANELLOGICLABEL = "panellogiclabel";
    public static final String FIELD_PSPANELENGINEID = "PSPANELENGINEID";
    protected static final String DTOFIELD_PSPANELENGINEID = "pspanelengineid";
    public static final String FIELD_PSPANELENGINENAME = "PSPANELENGINENAME";
    protected static final String DTOFIELD_PSPANELENGINENAME = "pspanelenginename";
    public static final String FIELD_PSPANELITEMID = "PSPANELITEMID";
    protected static final String DTOFIELD_PSPANELITEMID = "pspanelitemid";
    public static final String FIELD_PSPANELITEMNAME = "PSPANELITEMNAME";
    protected static final String DTOFIELD_PSPANELITEMNAME = "pspanelitemname";
    public static final String FIELD_PSPANELLOGICID = "PSPANELLOGICID";
    protected static final String DTOFIELD_PSPANELLOGICID = "pspanellogicid";
    public static final String FIELD_PSPANELLOGICNAME = "PSPANELLOGICNAME";
    protected static final String DTOFIELD_PSPANELLOGICNAME = "pspanellogicname";
    public static final String FIELD_PSSYSPFPLUGINID = "PSSYSPFPLUGINID";
    protected static final String DTOFIELD_PSSYSPFPLUGINID = "pssyspfpluginid";
    public static final String FIELD_PSSYSPFPLUGINNAME = "PSSYSPFPLUGINNAME";
    protected static final String DTOFIELD_PSSYSPFPLUGINNAME = "pssyspfpluginname";
    public static final String FIELD_PSSYSVIEWPANELID = "PSSYSVIEWPANELID";
    protected static final String DTOFIELD_PSSYSVIEWPANELID = "pssysviewpanelid";
    public static final String FIELD_PSSYSVIEWPANELNAME = "PSSYSVIEWPANELNAME";
    protected static final String DTOFIELD_PSSYSVIEWPANELNAME = "pssysviewpanelname";
    public static final String FIELD_PSUIENGINETYPEID = "PSUIENGINETYPEID";
    protected static final String DTOFIELD_PSUIENGINETYPEID = "psuienginetypeid";
    public static final String FIELD_PSUIENGINETYPENAME = "PSUIENGINETYPENAME";
    protected static final String DTOFIELD_PSUIENGINETYPENAME = "psuienginetypename";
    public static final String FIELD_UPDATEDATE = "UPDATEDATE";
    protected static final String DTOFIELD_UPDATEDATE = "updatedate";
    public static final String FIELD_UPDATEMAN = "UPDATEMAN";
    protected static final String DTOFIELD_UPDATEMAN = "updateman";
    public static final String FIELD_USERCAT = "USERCAT";
    protected static final String DTOFIELD_USERCAT = "usercat";
    public static final String FIELD_USERTAG = "USERTAG";
    protected static final String DTOFIELD_USERTAG = "usertag";
    public static final String FIELD_USERTAG2 = "USERTAG2";
    protected static final String DTOFIELD_USERTAG2 = "usertag2";
    public static final String FIELD_USERTAG3 = "USERTAG3";
    protected static final String DTOFIELD_USERTAG3 = "usertag3";
    public static final String FIELD_USERTAG4 = "USERTAG4";
    protected static final String DTOFIELD_USERTAG4 = "usertag4";
    public static final String FIELD_VALIDFLAG = "VALIDFLAG";
    protected static final String DTOFIELD_VALIDFLAG = "validflag";
    public static final String FIELD_VIEWPARAM = "VIEWPARAM";
    protected static final String DTOFIELD_VIEWPARAM = "viewparam";
    public static final String FIELD_VIEWPARAM10 = "VIEWPARAM10";
    protected static final String DTOFIELD_VIEWPARAM10 = "viewparam10";
    public static final String FIELD_VIEWPARAM2 = "VIEWPARAM2";
    protected static final String DTOFIELD_VIEWPARAM2 = "viewparam2";
    public static final String FIELD_VIEWPARAM3 = "VIEWPARAM3";
    protected static final String DTOFIELD_VIEWPARAM3 = "viewparam3";
    public static final String FIELD_VIEWPARAM4 = "VIEWPARAM4";
    protected static final String DTOFIELD_VIEWPARAM4 = "viewparam4";
    public static final String FIELD_VIEWPARAM5 = "VIEWPARAM5";
    protected static final String DTOFIELD_VIEWPARAM5 = "viewparam5";
    public static final String FIELD_VIEWPARAM6 = "VIEWPARAM6";
    protected static final String DTOFIELD_VIEWPARAM6 = "viewparam6";
    public static final String FIELD_VIEWPARAM7 = "VIEWPARAM7";
    protected static final String DTOFIELD_VIEWPARAM7 = "viewparam7";
    public static final String FIELD_VIEWPARAM8 = "VIEWPARAM8";
    protected static final String DTOFIELD_VIEWPARAM8 = "viewparam8";
    public static final String FIELD_VIEWPARAM9 = "VIEWPARAM9";
    protected static final String DTOFIELD_VIEWPARAM9 = "viewparam9";
    public static final String FIELD_WFVIEWPARAM = "WFVIEWPARAM";
    protected static final String DTOFIELD_WFVIEWPARAM = "wfviewparam";
    public static final String FIELD_WFVIEWPARAM2 = "WFVIEWPARAM2";
    protected static final String DTOFIELD_WFVIEWPARAM2 = "wfviewparam2";
    public static final String FIELD_WFVIEWPARAM3 = "WFVIEWPARAM3";
    protected static final String DTOFIELD_WFVIEWPARAM3 = "wfviewparam3";
    public static final String FIELD_WFVIEWPARAM4 = "WFVIEWPARAM4";
    protected static final String DTOFIELD_WFVIEWPARAM4 = "wfviewparam4";

    @JsonProperty(value="createdate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setCreateDate(Timestamp createDate) {
        this._set(DTOFIELD_CREATEDATE, createDate);
    }

    @JsonIgnore
    public Timestamp getCreateDate() {
        Object objValue = this._get(DTOFIELD_CREATEDATE);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isCreateDateDirty() {
        return this._contains(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public void resetCreateDate() {
        this._reset(DTOFIELD_CREATEDATE);
    }

    @JsonIgnore
    public PSPanelEngineDTO createdate(Timestamp createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    @JsonProperty(value="createman")
    public void setCreateMan(String createMan) {
        this._set(DTOFIELD_CREATEMAN, createMan);
    }

    @JsonIgnore
    public String getCreateMan() {
        Object objValue = this._get(DTOFIELD_CREATEMAN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCreateManDirty() {
        return this._contains(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public void resetCreateMan() {
        this._reset(DTOFIELD_CREATEMAN);
    }

    @JsonIgnore
    public PSPanelEngineDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="engineoption")
    public void setEngineOption(String engineOption) {
        this._set(DTOFIELD_ENGINEOPTION, engineOption);
    }

    @JsonIgnore
    public String getEngineOption() {
        Object objValue = this._get(DTOFIELD_ENGINEOPTION);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineOptionDirty() {
        return this._contains(DTOFIELD_ENGINEOPTION);
    }

    @JsonIgnore
    public void resetEngineOption() {
        this._reset(DTOFIELD_ENGINEOPTION);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineoption(String engineOption) {
        this.setEngineOption(engineOption);
        return this;
    }

    @JsonProperty(value="engineparam")
    public void setEngineParam(String engineParam) {
        this._set(DTOFIELD_ENGINEPARAM, engineParam);
    }

    @JsonIgnore
    public String getEngineParam() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParamDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM);
    }

    @JsonIgnore
    public void resetEngineParam() {
        this._reset(DTOFIELD_ENGINEPARAM);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam(String engineParam) {
        this.setEngineParam(engineParam);
        return this;
    }

    @JsonProperty(value="engineparam10")
    public void setEngineParam10(Integer engineParam10) {
        this._set(DTOFIELD_ENGINEPARAM10, engineParam10);
    }

    @JsonIgnore
    public Integer getEngineParam10() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam10Dirty() {
        return this._contains(DTOFIELD_ENGINEPARAM10);
    }

    @JsonIgnore
    public void resetEngineParam10() {
        this._reset(DTOFIELD_ENGINEPARAM10);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam10(Integer engineParam10) {
        this.setEngineParam10(engineParam10);
        return this;
    }

    @JsonProperty(value="engineparam10flag")
    public void setEngineParam10Flag(Integer engineParam10Flag) {
        this._set(DTOFIELD_ENGINEPARAM10FLAG, engineParam10Flag);
    }

    @JsonIgnore
    public Integer getEngineParam10Flag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM10FLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam10FlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM10FLAG);
    }

    @JsonIgnore
    public void resetEngineParam10Flag() {
        this._reset(DTOFIELD_ENGINEPARAM10FLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam10flag(Integer engineParam10Flag) {
        this.setEngineParam10Flag(engineParam10Flag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam10flag(Boolean engineParam10Flag) {
        if (engineParam10Flag == null) {
            this.setEngineParam10Flag(null);
        } else {
            this.setEngineParam10Flag(engineParam10Flag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam10label")
    public void setEngineParam10Label(String engineParam10Label) {
        this._set(DTOFIELD_ENGINEPARAM10LABEL, engineParam10Label);
    }

    @JsonIgnore
    public String getEngineParam10Label() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM10LABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam10LabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM10LABEL);
    }

    @JsonIgnore
    public void resetEngineParam10Label() {
        this._reset(DTOFIELD_ENGINEPARAM10LABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam10label(String engineParam10Label) {
        this.setEngineParam10Label(engineParam10Label);
        return this;
    }

    @JsonProperty(value="engineparam2")
    public void setEngineParam2(String engineParam2) {
        this._set(DTOFIELD_ENGINEPARAM2, engineParam2);
    }

    @JsonIgnore
    public String getEngineParam2() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam2Dirty() {
        return this._contains(DTOFIELD_ENGINEPARAM2);
    }

    @JsonIgnore
    public void resetEngineParam2() {
        this._reset(DTOFIELD_ENGINEPARAM2);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam2(String engineParam2) {
        this.setEngineParam2(engineParam2);
        return this;
    }

    @JsonProperty(value="engineparam2flag")
    public void setEngineParam2Flag(Integer engineParam2Flag) {
        this._set(DTOFIELD_ENGINEPARAM2FLAG, engineParam2Flag);
    }

    @JsonIgnore
    public Integer getEngineParam2Flag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM2FLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam2FlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM2FLAG);
    }

    @JsonIgnore
    public void resetEngineParam2Flag() {
        this._reset(DTOFIELD_ENGINEPARAM2FLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam2flag(Integer engineParam2Flag) {
        this.setEngineParam2Flag(engineParam2Flag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam2flag(Boolean engineParam2Flag) {
        if (engineParam2Flag == null) {
            this.setEngineParam2Flag(null);
        } else {
            this.setEngineParam2Flag(engineParam2Flag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam2label")
    public void setEngineParam2Label(String engineParam2Label) {
        this._set(DTOFIELD_ENGINEPARAM2LABEL, engineParam2Label);
    }

    @JsonIgnore
    public String getEngineParam2Label() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM2LABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam2LabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM2LABEL);
    }

    @JsonIgnore
    public void resetEngineParam2Label() {
        this._reset(DTOFIELD_ENGINEPARAM2LABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam2label(String engineParam2Label) {
        this.setEngineParam2Label(engineParam2Label);
        return this;
    }

    @JsonProperty(value="engineparam3")
    public void setEngineParam3(String engineParam3) {
        this._set(DTOFIELD_ENGINEPARAM3, engineParam3);
    }

    @JsonIgnore
    public String getEngineParam3() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam3Dirty() {
        return this._contains(DTOFIELD_ENGINEPARAM3);
    }

    @JsonIgnore
    public void resetEngineParam3() {
        this._reset(DTOFIELD_ENGINEPARAM3);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam3(String engineParam3) {
        this.setEngineParam3(engineParam3);
        return this;
    }

    @JsonProperty(value="engineparam3flag")
    public void setEngineParam3Flag(Integer engineParam3Flag) {
        this._set(DTOFIELD_ENGINEPARAM3FLAG, engineParam3Flag);
    }

    @JsonIgnore
    public Integer getEngineParam3Flag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM3FLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam3FlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM3FLAG);
    }

    @JsonIgnore
    public void resetEngineParam3Flag() {
        this._reset(DTOFIELD_ENGINEPARAM3FLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam3flag(Integer engineParam3Flag) {
        this.setEngineParam3Flag(engineParam3Flag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam3flag(Boolean engineParam3Flag) {
        if (engineParam3Flag == null) {
            this.setEngineParam3Flag(null);
        } else {
            this.setEngineParam3Flag(engineParam3Flag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam3label")
    public void setEngineParam3Label(String engineParam3Label) {
        this._set(DTOFIELD_ENGINEPARAM3LABEL, engineParam3Label);
    }

    @JsonIgnore
    public String getEngineParam3Label() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM3LABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam3LabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM3LABEL);
    }

    @JsonIgnore
    public void resetEngineParam3Label() {
        this._reset(DTOFIELD_ENGINEPARAM3LABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam3label(String engineParam3Label) {
        this.setEngineParam3Label(engineParam3Label);
        return this;
    }

    @JsonProperty(value="engineparam4")
    public void setEngineParam4(String engineParam4) {
        this._set(DTOFIELD_ENGINEPARAM4, engineParam4);
    }

    @JsonIgnore
    public String getEngineParam4() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam4Dirty() {
        return this._contains(DTOFIELD_ENGINEPARAM4);
    }

    @JsonIgnore
    public void resetEngineParam4() {
        this._reset(DTOFIELD_ENGINEPARAM4);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam4(String engineParam4) {
        this.setEngineParam4(engineParam4);
        return this;
    }

    @JsonProperty(value="engineparam4flag")
    public void setEngineParam4Flag(Integer engineParam4Flag) {
        this._set(DTOFIELD_ENGINEPARAM4FLAG, engineParam4Flag);
    }

    @JsonIgnore
    public Integer getEngineParam4Flag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM4FLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam4FlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM4FLAG);
    }

    @JsonIgnore
    public void resetEngineParam4Flag() {
        this._reset(DTOFIELD_ENGINEPARAM4FLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam4flag(Integer engineParam4Flag) {
        this.setEngineParam4Flag(engineParam4Flag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam4flag(Boolean engineParam4Flag) {
        if (engineParam4Flag == null) {
            this.setEngineParam4Flag(null);
        } else {
            this.setEngineParam4Flag(engineParam4Flag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam4label")
    public void setEngineParam4Label(String engineParam4Label) {
        this._set(DTOFIELD_ENGINEPARAM4LABEL, engineParam4Label);
    }

    @JsonIgnore
    public String getEngineParam4Label() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM4LABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam4LabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM4LABEL);
    }

    @JsonIgnore
    public void resetEngineParam4Label() {
        this._reset(DTOFIELD_ENGINEPARAM4LABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam4label(String engineParam4Label) {
        this.setEngineParam4Label(engineParam4Label);
        return this;
    }

    @JsonProperty(value="engineparam5")
    public void setEngineParam5(Integer engineParam5) {
        this._set(DTOFIELD_ENGINEPARAM5, engineParam5);
    }

    @JsonIgnore
    public Integer getEngineParam5() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam5Dirty() {
        return this._contains(DTOFIELD_ENGINEPARAM5);
    }

    @JsonIgnore
    public void resetEngineParam5() {
        this._reset(DTOFIELD_ENGINEPARAM5);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam5(Integer engineParam5) {
        this.setEngineParam5(engineParam5);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam5(Boolean engineParam5) {
        if (engineParam5 == null) {
            this.setEngineParam5(null);
        } else {
            this.setEngineParam5(engineParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam5flag")
    public void setEngineParam5Flag(Integer engineParam5Flag) {
        this._set(DTOFIELD_ENGINEPARAM5FLAG, engineParam5Flag);
    }

    @JsonIgnore
    public Integer getEngineParam5Flag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM5FLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam5FlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM5FLAG);
    }

    @JsonIgnore
    public void resetEngineParam5Flag() {
        this._reset(DTOFIELD_ENGINEPARAM5FLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam5flag(Integer engineParam5Flag) {
        this.setEngineParam5Flag(engineParam5Flag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam5flag(Boolean engineParam5Flag) {
        if (engineParam5Flag == null) {
            this.setEngineParam5Flag(null);
        } else {
            this.setEngineParam5Flag(engineParam5Flag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam5label")
    public void setEngineParam5Label(String engineParam5Label) {
        this._set(DTOFIELD_ENGINEPARAM5LABEL, engineParam5Label);
    }

    @JsonIgnore
    public String getEngineParam5Label() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM5LABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam5LabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM5LABEL);
    }

    @JsonIgnore
    public void resetEngineParam5Label() {
        this._reset(DTOFIELD_ENGINEPARAM5LABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam5label(String engineParam5Label) {
        this.setEngineParam5Label(engineParam5Label);
        return this;
    }

    @JsonProperty(value="engineparam6")
    public void setEngineParam6(Integer engineParam6) {
        this._set(DTOFIELD_ENGINEPARAM6, engineParam6);
    }

    @JsonIgnore
    public Integer getEngineParam6() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam6Dirty() {
        return this._contains(DTOFIELD_ENGINEPARAM6);
    }

    @JsonIgnore
    public void resetEngineParam6() {
        this._reset(DTOFIELD_ENGINEPARAM6);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam6(Integer engineParam6) {
        this.setEngineParam6(engineParam6);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam6(Boolean engineParam6) {
        if (engineParam6 == null) {
            this.setEngineParam6(null);
        } else {
            this.setEngineParam6(engineParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam6flag")
    public void setEngineParam6Flag(Integer engineParam6Flag) {
        this._set(DTOFIELD_ENGINEPARAM6FLAG, engineParam6Flag);
    }

    @JsonIgnore
    public Integer getEngineParam6Flag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM6FLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam6FlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM6FLAG);
    }

    @JsonIgnore
    public void resetEngineParam6Flag() {
        this._reset(DTOFIELD_ENGINEPARAM6FLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam6flag(Integer engineParam6Flag) {
        this.setEngineParam6Flag(engineParam6Flag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam6flag(Boolean engineParam6Flag) {
        if (engineParam6Flag == null) {
            this.setEngineParam6Flag(null);
        } else {
            this.setEngineParam6Flag(engineParam6Flag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam6label")
    public void setEngineParam6Label(String engineParam6Label) {
        this._set(DTOFIELD_ENGINEPARAM6LABEL, engineParam6Label);
    }

    @JsonIgnore
    public String getEngineParam6Label() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM6LABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam6LabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM6LABEL);
    }

    @JsonIgnore
    public void resetEngineParam6Label() {
        this._reset(DTOFIELD_ENGINEPARAM6LABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam6label(String engineParam6Label) {
        this.setEngineParam6Label(engineParam6Label);
        return this;
    }

    @JsonProperty(value="engineparam7")
    public void setEngineParam7(Integer engineParam7) {
        this._set(DTOFIELD_ENGINEPARAM7, engineParam7);
    }

    @JsonIgnore
    public Integer getEngineParam7() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM7);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam7Dirty() {
        return this._contains(DTOFIELD_ENGINEPARAM7);
    }

    @JsonIgnore
    public void resetEngineParam7() {
        this._reset(DTOFIELD_ENGINEPARAM7);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam7(Integer engineParam7) {
        this.setEngineParam7(engineParam7);
        return this;
    }

    @JsonProperty(value="engineparam7flag")
    public void setEngineParam7Flag(Integer engineParam7Flag) {
        this._set(DTOFIELD_ENGINEPARAM7FLAG, engineParam7Flag);
    }

    @JsonIgnore
    public Integer getEngineParam7Flag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM7FLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam7FlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM7FLAG);
    }

    @JsonIgnore
    public void resetEngineParam7Flag() {
        this._reset(DTOFIELD_ENGINEPARAM7FLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam7flag(Integer engineParam7Flag) {
        this.setEngineParam7Flag(engineParam7Flag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam7flag(Boolean engineParam7Flag) {
        if (engineParam7Flag == null) {
            this.setEngineParam7Flag(null);
        } else {
            this.setEngineParam7Flag(engineParam7Flag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam7label")
    public void setEngineParam7Label(String engineParam7Label) {
        this._set(DTOFIELD_ENGINEPARAM7LABEL, engineParam7Label);
    }

    @JsonIgnore
    public String getEngineParam7Label() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM7LABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam7LabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM7LABEL);
    }

    @JsonIgnore
    public void resetEngineParam7Label() {
        this._reset(DTOFIELD_ENGINEPARAM7LABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam7label(String engineParam7Label) {
        this.setEngineParam7Label(engineParam7Label);
        return this;
    }

    @JsonProperty(value="engineparam8")
    public void setEngineParam8(Integer engineParam8) {
        this._set(DTOFIELD_ENGINEPARAM8, engineParam8);
    }

    @JsonIgnore
    public Integer getEngineParam8() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM8);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam8Dirty() {
        return this._contains(DTOFIELD_ENGINEPARAM8);
    }

    @JsonIgnore
    public void resetEngineParam8() {
        this._reset(DTOFIELD_ENGINEPARAM8);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam8(Integer engineParam8) {
        this.setEngineParam8(engineParam8);
        return this;
    }

    @JsonProperty(value="engineparam8flag")
    public void setEngineParam8Flag(Integer engineParam8Flag) {
        this._set(DTOFIELD_ENGINEPARAM8FLAG, engineParam8Flag);
    }

    @JsonIgnore
    public Integer getEngineParam8Flag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM8FLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam8FlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM8FLAG);
    }

    @JsonIgnore
    public void resetEngineParam8Flag() {
        this._reset(DTOFIELD_ENGINEPARAM8FLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam8flag(Integer engineParam8Flag) {
        this.setEngineParam8Flag(engineParam8Flag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam8flag(Boolean engineParam8Flag) {
        if (engineParam8Flag == null) {
            this.setEngineParam8Flag(null);
        } else {
            this.setEngineParam8Flag(engineParam8Flag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam8label")
    public void setEngineParam8Label(String engineParam8Label) {
        this._set(DTOFIELD_ENGINEPARAM8LABEL, engineParam8Label);
    }

    @JsonIgnore
    public String getEngineParam8Label() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM8LABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam8LabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM8LABEL);
    }

    @JsonIgnore
    public void resetEngineParam8Label() {
        this._reset(DTOFIELD_ENGINEPARAM8LABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam8label(String engineParam8Label) {
        this.setEngineParam8Label(engineParam8Label);
        return this;
    }

    @JsonProperty(value="engineparam9")
    public void setEngineParam9(Integer engineParam9) {
        this._set(DTOFIELD_ENGINEPARAM9, engineParam9);
    }

    @JsonIgnore
    public Integer getEngineParam9() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam9Dirty() {
        return this._contains(DTOFIELD_ENGINEPARAM9);
    }

    @JsonIgnore
    public void resetEngineParam9() {
        this._reset(DTOFIELD_ENGINEPARAM9);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam9(Integer engineParam9) {
        this.setEngineParam9(engineParam9);
        return this;
    }

    @JsonProperty(value="engineparam9flag")
    public void setEngineParam9Flag(Integer engineParam9Flag) {
        this._set(DTOFIELD_ENGINEPARAM9FLAG, engineParam9Flag);
    }

    @JsonIgnore
    public Integer getEngineParam9Flag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM9FLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam9FlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM9FLAG);
    }

    @JsonIgnore
    public void resetEngineParam9Flag() {
        this._reset(DTOFIELD_ENGINEPARAM9FLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam9flag(Integer engineParam9Flag) {
        this.setEngineParam9Flag(engineParam9Flag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam9flag(Boolean engineParam9Flag) {
        if (engineParam9Flag == null) {
            this.setEngineParam9Flag(null);
        } else {
            this.setEngineParam9Flag(engineParam9Flag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparam9label")
    public void setEngineParam9Label(String engineParam9Label) {
        this._set(DTOFIELD_ENGINEPARAM9LABEL, engineParam9Label);
    }

    @JsonIgnore
    public String getEngineParam9Label() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAM9LABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParam9LabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAM9LABEL);
    }

    @JsonIgnore
    public void resetEngineParam9Label() {
        this._reset(DTOFIELD_ENGINEPARAM9LABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparam9label(String engineParam9Label) {
        this.setEngineParam9Label(engineParam9Label);
        return this;
    }

    @JsonProperty(value="engineparamflag")
    public void setEngineParamFlag(Integer engineParamFlag) {
        this._set(DTOFIELD_ENGINEPARAMFLAG, engineParamFlag);
    }

    @JsonIgnore
    public Integer getEngineParamFlag() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isEngineParamFlagDirty() {
        return this._contains(DTOFIELD_ENGINEPARAMFLAG);
    }

    @JsonIgnore
    public void resetEngineParamFlag() {
        this._reset(DTOFIELD_ENGINEPARAMFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparamflag(Integer engineParamFlag) {
        this.setEngineParamFlag(engineParamFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparamflag(Boolean engineParamFlag) {
        if (engineParamFlag == null) {
            this.setEngineParamFlag(null);
        } else {
            this.setEngineParamFlag(engineParamFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="engineparamlabel")
    public void setEngineParamLabel(String engineParamLabel) {
        this._set(DTOFIELD_ENGINEPARAMLABEL, engineParamLabel);
    }

    @JsonIgnore
    public String getEngineParamLabel() {
        Object objValue = this._get(DTOFIELD_ENGINEPARAMLABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isEngineParamLabelDirty() {
        return this._contains(DTOFIELD_ENGINEPARAMLABEL);
    }

    @JsonIgnore
    public void resetEngineParamLabel() {
        this._reset(DTOFIELD_ENGINEPARAMLABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO engineparamlabel(String engineParamLabel) {
        this.setEngineParamLabel(engineParamLabel);
        return this;
    }

    @JsonProperty(value="memo")
    public void setMemo(String memo) {
        this._set(DTOFIELD_MEMO, memo);
    }

    @JsonIgnore
    public String getMemo() {
        Object objValue = this._get(DTOFIELD_MEMO);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMemoDirty() {
        return this._contains(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public void resetMemo() {
        this._reset(DTOFIELD_MEMO);
    }

    @JsonIgnore
    public PSPanelEngineDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="no2panelitemflag")
    public void setNo2PanelItemFlag(Integer no2PanelItemFlag) {
        this._set(DTOFIELD_NO2PANELITEMFLAG, no2PanelItemFlag);
    }

    @JsonIgnore
    public Integer getNo2PanelItemFlag() {
        Object objValue = this._get(DTOFIELD_NO2PANELITEMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNo2PanelItemFlagDirty() {
        return this._contains(DTOFIELD_NO2PANELITEMFLAG);
    }

    @JsonIgnore
    public void resetNo2PanelItemFlag() {
        this._reset(DTOFIELD_NO2PANELITEMFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO no2panelitemflag(Integer no2PanelItemFlag) {
        this.setNo2PanelItemFlag(no2PanelItemFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no2panelitemflag(Boolean no2PanelItemFlag) {
        if (no2PanelItemFlag == null) {
            this.setNo2PanelItemFlag(null);
        } else {
            this.setNo2PanelItemFlag(no2PanelItemFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="no2panelitemlabel")
    public void setNo2PanelItemLabel(String no2PanelItemLabel) {
        this._set(DTOFIELD_NO2PANELITEMLABEL, no2PanelItemLabel);
    }

    @JsonIgnore
    public String getNo2PanelItemLabel() {
        Object objValue = this._get(DTOFIELD_NO2PANELITEMLABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PanelItemLabelDirty() {
        return this._contains(DTOFIELD_NO2PANELITEMLABEL);
    }

    @JsonIgnore
    public void resetNo2PanelItemLabel() {
        this._reset(DTOFIELD_NO2PANELITEMLABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO no2panelitemlabel(String no2PanelItemLabel) {
        this.setNo2PanelItemLabel(no2PanelItemLabel);
        return this;
    }

    @JsonProperty(value="no2panellogicflag")
    public void setNo2PanelLogicFlag(Integer no2PanelLogicFlag) {
        this._set(DTOFIELD_NO2PANELLOGICFLAG, no2PanelLogicFlag);
    }

    @JsonIgnore
    public Integer getNo2PanelLogicFlag() {
        Object objValue = this._get(DTOFIELD_NO2PANELLOGICFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNo2PanelLogicFlagDirty() {
        return this._contains(DTOFIELD_NO2PANELLOGICFLAG);
    }

    @JsonIgnore
    public void resetNo2PanelLogicFlag() {
        this._reset(DTOFIELD_NO2PANELLOGICFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO no2panellogicflag(Integer no2PanelLogicFlag) {
        this.setNo2PanelLogicFlag(no2PanelLogicFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no2panellogicflag(Boolean no2PanelLogicFlag) {
        if (no2PanelLogicFlag == null) {
            this.setNo2PanelLogicFlag(null);
        } else {
            this.setNo2PanelLogicFlag(no2PanelLogicFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="no2panellogiclabel")
    public void setNo2PanelLogicLabel(String no2PanelLogicLabel) {
        this._set(DTOFIELD_NO2PANELLOGICLABEL, no2PanelLogicLabel);
    }

    @JsonIgnore
    public String getNo2PanelLogicLabel() {
        Object objValue = this._get(DTOFIELD_NO2PANELLOGICLABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PanelLogicLabelDirty() {
        return this._contains(DTOFIELD_NO2PANELLOGICLABEL);
    }

    @JsonIgnore
    public void resetNo2PanelLogicLabel() {
        this._reset(DTOFIELD_NO2PANELLOGICLABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO no2panellogiclabel(String no2PanelLogicLabel) {
        this.setNo2PanelLogicLabel(no2PanelLogicLabel);
        return this;
    }

    @JsonProperty(value="no2pspanelitemid")
    public void setNo2PSPanelItemId(String no2PSPanelItemId) {
        this._set(DTOFIELD_NO2PSPANELITEMID, no2PSPanelItemId);
    }

    @JsonIgnore
    public String getNo2PSPanelItemId() {
        Object objValue = this._get(DTOFIELD_NO2PSPANELITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSPanelItemIdDirty() {
        return this._contains(DTOFIELD_NO2PSPANELITEMID);
    }

    @JsonIgnore
    public void resetNo2PSPanelItemId() {
        this._reset(DTOFIELD_NO2PSPANELITEMID);
    }

    @JsonIgnore
    public PSPanelEngineDTO no2pspanelitemid(String no2PSPanelItemId) {
        this.setNo2PSPanelItemId(no2PSPanelItemId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no2pspanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem) {
        if (pSSysViewPanelItem == null) {
            this.setNo2PSPanelItemId(null);
            this.setNo2PSPanelItemName(null);
        } else {
            this.setNo2PSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setNo2PSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    @JsonProperty(value="no2pspanelitemname")
    public void setNo2PSPanelItemName(String no2PSPanelItemName) {
        this._set(DTOFIELD_NO2PSPANELITEMNAME, no2PSPanelItemName);
    }

    @JsonIgnore
    public String getNo2PSPanelItemName() {
        Object objValue = this._get(DTOFIELD_NO2PSPANELITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSPanelItemNameDirty() {
        return this._contains(DTOFIELD_NO2PSPANELITEMNAME);
    }

    @JsonIgnore
    public void resetNo2PSPanelItemName() {
        this._reset(DTOFIELD_NO2PSPANELITEMNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO no2pspanelitemname(String no2PSPanelItemName) {
        this.setNo2PSPanelItemName(no2PSPanelItemName);
        return this;
    }

    @JsonProperty(value="no2pspanellogicid")
    public void setNo2PSPanelLogicId(String no2PSPanelLogicId) {
        this._set(DTOFIELD_NO2PSPANELLOGICID, no2PSPanelLogicId);
    }

    @JsonIgnore
    public String getNo2PSPanelLogicId() {
        Object objValue = this._get(DTOFIELD_NO2PSPANELLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSPanelLogicIdDirty() {
        return this._contains(DTOFIELD_NO2PSPANELLOGICID);
    }

    @JsonIgnore
    public void resetNo2PSPanelLogicId() {
        this._reset(DTOFIELD_NO2PSPANELLOGICID);
    }

    @JsonIgnore
    public PSPanelEngineDTO no2pspanellogicid(String no2PSPanelLogicId) {
        this.setNo2PSPanelLogicId(no2PSPanelLogicId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no2pspanellogicid(PSSysViewPanelLogicDTO pSSysViewPanelLogic) {
        if (pSSysViewPanelLogic == null) {
            this.setNo2PSPanelLogicId(null);
            this.setNo2PSPanelLogicName(null);
        } else {
            this.setNo2PSPanelLogicId(pSSysViewPanelLogic.getPSSysViewPanelLogicId());
            this.setNo2PSPanelLogicName(pSSysViewPanelLogic.getPSSysViewPanelLogicName());
        }
        return this;
    }

    @JsonProperty(value="no2pspanellogicname")
    public void setNo2PSPanelLogicName(String no2PSPanelLogicName) {
        this._set(DTOFIELD_NO2PSPANELLOGICNAME, no2PSPanelLogicName);
    }

    @JsonIgnore
    public String getNo2PSPanelLogicName() {
        Object objValue = this._get(DTOFIELD_NO2PSPANELLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo2PSPanelLogicNameDirty() {
        return this._contains(DTOFIELD_NO2PSPANELLOGICNAME);
    }

    @JsonIgnore
    public void resetNo2PSPanelLogicName() {
        this._reset(DTOFIELD_NO2PSPANELLOGICNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO no2pspanellogicname(String no2PSPanelLogicName) {
        this.setNo2PSPanelLogicName(no2PSPanelLogicName);
        return this;
    }

    @JsonProperty(value="no3panelitemflag")
    public void setNo3PanelItemFlag(Integer no3PanelItemFlag) {
        this._set(DTOFIELD_NO3PANELITEMFLAG, no3PanelItemFlag);
    }

    @JsonIgnore
    public Integer getNo3PanelItemFlag() {
        Object objValue = this._get(DTOFIELD_NO3PANELITEMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNo3PanelItemFlagDirty() {
        return this._contains(DTOFIELD_NO3PANELITEMFLAG);
    }

    @JsonIgnore
    public void resetNo3PanelItemFlag() {
        this._reset(DTOFIELD_NO3PANELITEMFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO no3panelitemflag(Integer no3PanelItemFlag) {
        this.setNo3PanelItemFlag(no3PanelItemFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no3panelitemflag(Boolean no3PanelItemFlag) {
        if (no3PanelItemFlag == null) {
            this.setNo3PanelItemFlag(null);
        } else {
            this.setNo3PanelItemFlag(no3PanelItemFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="no3panelitemlabel")
    public void setNo3PanelItemLabel(String no3PanelItemLabel) {
        this._set(DTOFIELD_NO3PANELITEMLABEL, no3PanelItemLabel);
    }

    @JsonIgnore
    public String getNo3PanelItemLabel() {
        Object objValue = this._get(DTOFIELD_NO3PANELITEMLABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3PanelItemLabelDirty() {
        return this._contains(DTOFIELD_NO3PANELITEMLABEL);
    }

    @JsonIgnore
    public void resetNo3PanelItemLabel() {
        this._reset(DTOFIELD_NO3PANELITEMLABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO no3panelitemlabel(String no3PanelItemLabel) {
        this.setNo3PanelItemLabel(no3PanelItemLabel);
        return this;
    }

    @JsonProperty(value="no3panellogicflag")
    public void setNo3PanelLogicFlag(Integer no3PanelLogicFlag) {
        this._set(DTOFIELD_NO3PANELLOGICFLAG, no3PanelLogicFlag);
    }

    @JsonIgnore
    public Integer getNo3PanelLogicFlag() {
        Object objValue = this._get(DTOFIELD_NO3PANELLOGICFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNo3PanelLogicFlagDirty() {
        return this._contains(DTOFIELD_NO3PANELLOGICFLAG);
    }

    @JsonIgnore
    public void resetNo3PanelLogicFlag() {
        this._reset(DTOFIELD_NO3PANELLOGICFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO no3panellogicflag(Integer no3PanelLogicFlag) {
        this.setNo3PanelLogicFlag(no3PanelLogicFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no3panellogicflag(Boolean no3PanelLogicFlag) {
        if (no3PanelLogicFlag == null) {
            this.setNo3PanelLogicFlag(null);
        } else {
            this.setNo3PanelLogicFlag(no3PanelLogicFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="no3panellogiclabel")
    public void setNo3PanelLogicLabel(String no3PanelLogicLabel) {
        this._set(DTOFIELD_NO3PANELLOGICLABEL, no3PanelLogicLabel);
    }

    @JsonIgnore
    public String getNo3PanelLogicLabel() {
        Object objValue = this._get(DTOFIELD_NO3PANELLOGICLABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3PanelLogicLabelDirty() {
        return this._contains(DTOFIELD_NO3PANELLOGICLABEL);
    }

    @JsonIgnore
    public void resetNo3PanelLogicLabel() {
        this._reset(DTOFIELD_NO3PANELLOGICLABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO no3panellogiclabel(String no3PanelLogicLabel) {
        this.setNo3PanelLogicLabel(no3PanelLogicLabel);
        return this;
    }

    @JsonProperty(value="no3pspanelitemid")
    public void setNo3PSPanelItemId(String no3PSPanelItemId) {
        this._set(DTOFIELD_NO3PSPANELITEMID, no3PSPanelItemId);
    }

    @JsonIgnore
    public String getNo3PSPanelItemId() {
        Object objValue = this._get(DTOFIELD_NO3PSPANELITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3PSPanelItemIdDirty() {
        return this._contains(DTOFIELD_NO3PSPANELITEMID);
    }

    @JsonIgnore
    public void resetNo3PSPanelItemId() {
        this._reset(DTOFIELD_NO3PSPANELITEMID);
    }

    @JsonIgnore
    public PSPanelEngineDTO no3pspanelitemid(String no3PSPanelItemId) {
        this.setNo3PSPanelItemId(no3PSPanelItemId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no3pspanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem) {
        if (pSSysViewPanelItem == null) {
            this.setNo3PSPanelItemId(null);
            this.setNo3PSPanelItemName(null);
        } else {
            this.setNo3PSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setNo3PSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    @JsonProperty(value="no3pspanelitemname")
    public void setNo3PSPanelItemName(String no3PSPanelItemName) {
        this._set(DTOFIELD_NO3PSPANELITEMNAME, no3PSPanelItemName);
    }

    @JsonIgnore
    public String getNo3PSPanelItemName() {
        Object objValue = this._get(DTOFIELD_NO3PSPANELITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3PSPanelItemNameDirty() {
        return this._contains(DTOFIELD_NO3PSPANELITEMNAME);
    }

    @JsonIgnore
    public void resetNo3PSPanelItemName() {
        this._reset(DTOFIELD_NO3PSPANELITEMNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO no3pspanelitemname(String no3PSPanelItemName) {
        this.setNo3PSPanelItemName(no3PSPanelItemName);
        return this;
    }

    @JsonProperty(value="no3pspanellogicid")
    public void setNo3PSPanelLogicId(String no3PSPanelLogicId) {
        this._set(DTOFIELD_NO3PSPANELLOGICID, no3PSPanelLogicId);
    }

    @JsonIgnore
    public String getNo3PSPanelLogicId() {
        Object objValue = this._get(DTOFIELD_NO3PSPANELLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3PSPanelLogicIdDirty() {
        return this._contains(DTOFIELD_NO3PSPANELLOGICID);
    }

    @JsonIgnore
    public void resetNo3PSPanelLogicId() {
        this._reset(DTOFIELD_NO3PSPANELLOGICID);
    }

    @JsonIgnore
    public PSPanelEngineDTO no3pspanellogicid(String no3PSPanelLogicId) {
        this.setNo3PSPanelLogicId(no3PSPanelLogicId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no3pspanellogicid(PSSysViewPanelLogicDTO pSSysViewPanelLogic) {
        if (pSSysViewPanelLogic == null) {
            this.setNo3PSPanelLogicId(null);
            this.setNo3PSPanelLogicName(null);
        } else {
            this.setNo3PSPanelLogicId(pSSysViewPanelLogic.getPSSysViewPanelLogicId());
            this.setNo3PSPanelLogicName(pSSysViewPanelLogic.getPSSysViewPanelLogicName());
        }
        return this;
    }

    @JsonProperty(value="no3pspanellogicname")
    public void setNo3PSPanelLogicName(String no3PSPanelLogicName) {
        this._set(DTOFIELD_NO3PSPANELLOGICNAME, no3PSPanelLogicName);
    }

    @JsonIgnore
    public String getNo3PSPanelLogicName() {
        Object objValue = this._get(DTOFIELD_NO3PSPANELLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo3PSPanelLogicNameDirty() {
        return this._contains(DTOFIELD_NO3PSPANELLOGICNAME);
    }

    @JsonIgnore
    public void resetNo3PSPanelLogicName() {
        this._reset(DTOFIELD_NO3PSPANELLOGICNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO no3pspanellogicname(String no3PSPanelLogicName) {
        this.setNo3PSPanelLogicName(no3PSPanelLogicName);
        return this;
    }

    @JsonProperty(value="no4panelitemflag")
    public void setNo4PanelItemFlag(Integer no4PanelItemFlag) {
        this._set(DTOFIELD_NO4PANELITEMFLAG, no4PanelItemFlag);
    }

    @JsonIgnore
    public Integer getNo4PanelItemFlag() {
        Object objValue = this._get(DTOFIELD_NO4PANELITEMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNo4PanelItemFlagDirty() {
        return this._contains(DTOFIELD_NO4PANELITEMFLAG);
    }

    @JsonIgnore
    public void resetNo4PanelItemFlag() {
        this._reset(DTOFIELD_NO4PANELITEMFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO no4panelitemflag(Integer no4PanelItemFlag) {
        this.setNo4PanelItemFlag(no4PanelItemFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no4panelitemflag(Boolean no4PanelItemFlag) {
        if (no4PanelItemFlag == null) {
            this.setNo4PanelItemFlag(null);
        } else {
            this.setNo4PanelItemFlag(no4PanelItemFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="no4panelitemlabel")
    public void setNo4PanelItemLabel(String no4PanelItemLabel) {
        this._set(DTOFIELD_NO4PANELITEMLABEL, no4PanelItemLabel);
    }

    @JsonIgnore
    public String getNo4PanelItemLabel() {
        Object objValue = this._get(DTOFIELD_NO4PANELITEMLABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo4PanelItemLabelDirty() {
        return this._contains(DTOFIELD_NO4PANELITEMLABEL);
    }

    @JsonIgnore
    public void resetNo4PanelItemLabel() {
        this._reset(DTOFIELD_NO4PANELITEMLABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO no4panelitemlabel(String no4PanelItemLabel) {
        this.setNo4PanelItemLabel(no4PanelItemLabel);
        return this;
    }

    @JsonProperty(value="no4panellogicflag")
    public void setNo4PanelLogicFlag(Integer no4PanelLogicFlag) {
        this._set(DTOFIELD_NO4PANELLOGICFLAG, no4PanelLogicFlag);
    }

    @JsonIgnore
    public Integer getNo4PanelLogicFlag() {
        Object objValue = this._get(DTOFIELD_NO4PANELLOGICFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isNo4PanelLogicFlagDirty() {
        return this._contains(DTOFIELD_NO4PANELLOGICFLAG);
    }

    @JsonIgnore
    public void resetNo4PanelLogicFlag() {
        this._reset(DTOFIELD_NO4PANELLOGICFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO no4panellogicflag(Integer no4PanelLogicFlag) {
        this.setNo4PanelLogicFlag(no4PanelLogicFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no4panellogicflag(Boolean no4PanelLogicFlag) {
        if (no4PanelLogicFlag == null) {
            this.setNo4PanelLogicFlag(null);
        } else {
            this.setNo4PanelLogicFlag(no4PanelLogicFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="no4panellogiclabel")
    public void setNo4PanelLogicLabel(String no4PanelLogicLabel) {
        this._set(DTOFIELD_NO4PANELLOGICLABEL, no4PanelLogicLabel);
    }

    @JsonIgnore
    public String getNo4PanelLogicLabel() {
        Object objValue = this._get(DTOFIELD_NO4PANELLOGICLABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo4PanelLogicLabelDirty() {
        return this._contains(DTOFIELD_NO4PANELLOGICLABEL);
    }

    @JsonIgnore
    public void resetNo4PanelLogicLabel() {
        this._reset(DTOFIELD_NO4PANELLOGICLABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO no4panellogiclabel(String no4PanelLogicLabel) {
        this.setNo4PanelLogicLabel(no4PanelLogicLabel);
        return this;
    }

    @JsonProperty(value="no4pspanelitemid")
    public void setNo4PSPanelItemId(String no4PSPanelItemId) {
        this._set(DTOFIELD_NO4PSPANELITEMID, no4PSPanelItemId);
    }

    @JsonIgnore
    public String getNo4PSPanelItemId() {
        Object objValue = this._get(DTOFIELD_NO4PSPANELITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo4PSPanelItemIdDirty() {
        return this._contains(DTOFIELD_NO4PSPANELITEMID);
    }

    @JsonIgnore
    public void resetNo4PSPanelItemId() {
        this._reset(DTOFIELD_NO4PSPANELITEMID);
    }

    @JsonIgnore
    public PSPanelEngineDTO no4pspanelitemid(String no4PSPanelItemId) {
        this.setNo4PSPanelItemId(no4PSPanelItemId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no4pspanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem) {
        if (pSSysViewPanelItem == null) {
            this.setNo4PSPanelItemId(null);
            this.setNo4PSPanelItemName(null);
        } else {
            this.setNo4PSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setNo4PSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    @JsonProperty(value="no4pspanelitemname")
    public void setNo4PSPanelItemName(String no4PSPanelItemName) {
        this._set(DTOFIELD_NO4PSPANELITEMNAME, no4PSPanelItemName);
    }

    @JsonIgnore
    public String getNo4PSPanelItemName() {
        Object objValue = this._get(DTOFIELD_NO4PSPANELITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo4PSPanelItemNameDirty() {
        return this._contains(DTOFIELD_NO4PSPANELITEMNAME);
    }

    @JsonIgnore
    public void resetNo4PSPanelItemName() {
        this._reset(DTOFIELD_NO4PSPANELITEMNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO no4pspanelitemname(String no4PSPanelItemName) {
        this.setNo4PSPanelItemName(no4PSPanelItemName);
        return this;
    }

    @JsonProperty(value="no4pspanellogicid")
    public void setNo4PSPanelLogicId(String no4PSPanelLogicId) {
        this._set(DTOFIELD_NO4PSPANELLOGICID, no4PSPanelLogicId);
    }

    @JsonIgnore
    public String getNo4PSPanelLogicId() {
        Object objValue = this._get(DTOFIELD_NO4PSPANELLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo4PSPanelLogicIdDirty() {
        return this._contains(DTOFIELD_NO4PSPANELLOGICID);
    }

    @JsonIgnore
    public void resetNo4PSPanelLogicId() {
        this._reset(DTOFIELD_NO4PSPANELLOGICID);
    }

    @JsonIgnore
    public PSPanelEngineDTO no4pspanellogicid(String no4PSPanelLogicId) {
        this.setNo4PSPanelLogicId(no4PSPanelLogicId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO no4pspanellogicid(PSSysViewPanelLogicDTO pSSysViewPanelLogic) {
        if (pSSysViewPanelLogic == null) {
            this.setNo4PSPanelLogicId(null);
            this.setNo4PSPanelLogicName(null);
        } else {
            this.setNo4PSPanelLogicId(pSSysViewPanelLogic.getPSSysViewPanelLogicId());
            this.setNo4PSPanelLogicName(pSSysViewPanelLogic.getPSSysViewPanelLogicName());
        }
        return this;
    }

    @JsonProperty(value="no4pspanellogicname")
    public void setNo4PSPanelLogicName(String no4PSPanelLogicName) {
        this._set(DTOFIELD_NO4PSPANELLOGICNAME, no4PSPanelLogicName);
    }

    @JsonIgnore
    public String getNo4PSPanelLogicName() {
        Object objValue = this._get(DTOFIELD_NO4PSPANELLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isNo4PSPanelLogicNameDirty() {
        return this._contains(DTOFIELD_NO4PSPANELLOGICNAME);
    }

    @JsonIgnore
    public void resetNo4PSPanelLogicName() {
        this._reset(DTOFIELD_NO4PSPANELLOGICNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO no4pspanellogicname(String no4PSPanelLogicName) {
        this.setNo4PSPanelLogicName(no4PSPanelLogicName);
        return this;
    }

    @JsonProperty(value="ordervalue")
    public void setOrderValue(Integer orderValue) {
        this._set(DTOFIELD_ORDERVALUE, orderValue);
    }

    @JsonIgnore
    public Integer getOrderValue() {
        Object objValue = this._get(DTOFIELD_ORDERVALUE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isOrderValueDirty() {
        return this._contains(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public void resetOrderValue() {
        this._reset(DTOFIELD_ORDERVALUE);
    }

    @JsonIgnore
    public PSPanelEngineDTO ordervalue(Integer orderValue) {
        this.setOrderValue(orderValue);
        return this;
    }

    @JsonProperty(value="panelitemflag")
    public void setPanelItemFlag(Integer panelItemFlag) {
        this._set(DTOFIELD_PANELITEMFLAG, panelItemFlag);
    }

    @JsonIgnore
    public Integer getPanelItemFlag() {
        Object objValue = this._get(DTOFIELD_PANELITEMFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPanelItemFlagDirty() {
        return this._contains(DTOFIELD_PANELITEMFLAG);
    }

    @JsonIgnore
    public void resetPanelItemFlag() {
        this._reset(DTOFIELD_PANELITEMFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO panelitemflag(Integer panelItemFlag) {
        this.setPanelItemFlag(panelItemFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO panelitemflag(Boolean panelItemFlag) {
        if (panelItemFlag == null) {
            this.setPanelItemFlag(null);
        } else {
            this.setPanelItemFlag(panelItemFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="panelitemlabel")
    public void setPanelItemLabel(String panelItemLabel) {
        this._set(DTOFIELD_PANELITEMLABEL, panelItemLabel);
    }

    @JsonIgnore
    public String getPanelItemLabel() {
        Object objValue = this._get(DTOFIELD_PANELITEMLABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPanelItemLabelDirty() {
        return this._contains(DTOFIELD_PANELITEMLABEL);
    }

    @JsonIgnore
    public void resetPanelItemLabel() {
        this._reset(DTOFIELD_PANELITEMLABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO panelitemlabel(String panelItemLabel) {
        this.setPanelItemLabel(panelItemLabel);
        return this;
    }

    @JsonProperty(value="panellogicflag")
    public void setPanelLogicFlag(Integer panelLogicFlag) {
        this._set(DTOFIELD_PANELLOGICFLAG, panelLogicFlag);
    }

    @JsonIgnore
    public Integer getPanelLogicFlag() {
        Object objValue = this._get(DTOFIELD_PANELLOGICFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPanelLogicFlagDirty() {
        return this._contains(DTOFIELD_PANELLOGICFLAG);
    }

    @JsonIgnore
    public void resetPanelLogicFlag() {
        this._reset(DTOFIELD_PANELLOGICFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO panellogicflag(Integer panelLogicFlag) {
        this.setPanelLogicFlag(panelLogicFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO panellogicflag(Boolean panelLogicFlag) {
        if (panelLogicFlag == null) {
            this.setPanelLogicFlag(null);
        } else {
            this.setPanelLogicFlag(panelLogicFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="panellogiclabel")
    public void setPanelLogicLabel(String panelLogicLabel) {
        this._set(DTOFIELD_PANELLOGICLABEL, panelLogicLabel);
    }

    @JsonIgnore
    public String getPanelLogicLabel() {
        Object objValue = this._get(DTOFIELD_PANELLOGICLABEL);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPanelLogicLabelDirty() {
        return this._contains(DTOFIELD_PANELLOGICLABEL);
    }

    @JsonIgnore
    public void resetPanelLogicLabel() {
        this._reset(DTOFIELD_PANELLOGICLABEL);
    }

    @JsonIgnore
    public PSPanelEngineDTO panellogiclabel(String panelLogicLabel) {
        this.setPanelLogicLabel(panelLogicLabel);
        return this;
    }

    @JsonProperty(value="pspanelengineid")
    public void setPSPanelEngineId(String pSPanelEngineId) {
        this._set(DTOFIELD_PSPANELENGINEID, pSPanelEngineId);
    }

    @JsonIgnore
    public String getPSPanelEngineId() {
        Object objValue = this._get(DTOFIELD_PSPANELENGINEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPanelEngineIdDirty() {
        return this._contains(DTOFIELD_PSPANELENGINEID);
    }

    @JsonIgnore
    public void resetPSPanelEngineId() {
        this._reset(DTOFIELD_PSPANELENGINEID);
    }

    @JsonIgnore
    public PSPanelEngineDTO pspanelengineid(String pSPanelEngineId) {
        this.setPSPanelEngineId(pSPanelEngineId);
        return this;
    }

    @JsonProperty(value="pspanelenginename")
    public void setPSPanelEngineName(String pSPanelEngineName) {
        this._set(DTOFIELD_PSPANELENGINENAME, pSPanelEngineName);
    }

    @JsonIgnore
    public String getPSPanelEngineName() {
        Object objValue = this._get(DTOFIELD_PSPANELENGINENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPanelEngineNameDirty() {
        return this._contains(DTOFIELD_PSPANELENGINENAME);
    }

    @JsonIgnore
    public void resetPSPanelEngineName() {
        this._reset(DTOFIELD_PSPANELENGINENAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO pspanelenginename(String pSPanelEngineName) {
        this.setPSPanelEngineName(pSPanelEngineName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSPanelEngineName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSPanelEngineName(strName);
    }

    @JsonIgnore
    public PSPanelEngineDTO name(String strName) {
        this.setPSPanelEngineName(strName);
        return this;
    }

    @JsonProperty(value="pspanelitemid")
    public void setPSPanelItemId(String pSPanelItemId) {
        this._set(DTOFIELD_PSPANELITEMID, pSPanelItemId);
    }

    @JsonIgnore
    public String getPSPanelItemId() {
        Object objValue = this._get(DTOFIELD_PSPANELITEMID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPanelItemIdDirty() {
        return this._contains(DTOFIELD_PSPANELITEMID);
    }

    @JsonIgnore
    public void resetPSPanelItemId() {
        this._reset(DTOFIELD_PSPANELITEMID);
    }

    @JsonIgnore
    public PSPanelEngineDTO pspanelitemid(String pSPanelItemId) {
        this.setPSPanelItemId(pSPanelItemId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO pspanelitemid(PSSysViewPanelItemDTO pSSysViewPanelItem) {
        if (pSSysViewPanelItem == null) {
            this.setPSPanelItemId(null);
            this.setPSPanelItemName(null);
        } else {
            this.setPSPanelItemId(pSSysViewPanelItem.getPSSysViewPanelItemId());
            this.setPSPanelItemName(pSSysViewPanelItem.getPSSysViewPanelItemName());
        }
        return this;
    }

    @JsonProperty(value="pspanelitemname")
    public void setPSPanelItemName(String pSPanelItemName) {
        this._set(DTOFIELD_PSPANELITEMNAME, pSPanelItemName);
    }

    @JsonIgnore
    public String getPSPanelItemName() {
        Object objValue = this._get(DTOFIELD_PSPANELITEMNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPanelItemNameDirty() {
        return this._contains(DTOFIELD_PSPANELITEMNAME);
    }

    @JsonIgnore
    public void resetPSPanelItemName() {
        this._reset(DTOFIELD_PSPANELITEMNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO pspanelitemname(String pSPanelItemName) {
        this.setPSPanelItemName(pSPanelItemName);
        return this;
    }

    @JsonProperty(value="pspanellogicid")
    public void setPSPanelLogicId(String pSPanelLogicId) {
        this._set(DTOFIELD_PSPANELLOGICID, pSPanelLogicId);
    }

    @JsonIgnore
    public String getPSPanelLogicId() {
        Object objValue = this._get(DTOFIELD_PSPANELLOGICID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPanelLogicIdDirty() {
        return this._contains(DTOFIELD_PSPANELLOGICID);
    }

    @JsonIgnore
    public void resetPSPanelLogicId() {
        this._reset(DTOFIELD_PSPANELLOGICID);
    }

    @JsonIgnore
    public PSPanelEngineDTO pspanellogicid(String pSPanelLogicId) {
        this.setPSPanelLogicId(pSPanelLogicId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO pspanellogicid(PSSysViewPanelLogicDTO pSSysViewPanelLogic) {
        if (pSSysViewPanelLogic == null) {
            this.setPSPanelLogicId(null);
            this.setPSPanelLogicName(null);
        } else {
            this.setPSPanelLogicId(pSSysViewPanelLogic.getPSSysViewPanelLogicId());
            this.setPSPanelLogicName(pSSysViewPanelLogic.getPSSysViewPanelLogicName());
        }
        return this;
    }

    @JsonProperty(value="pspanellogicname")
    public void setPSPanelLogicName(String pSPanelLogicName) {
        this._set(DTOFIELD_PSPANELLOGICNAME, pSPanelLogicName);
    }

    @JsonIgnore
    public String getPSPanelLogicName() {
        Object objValue = this._get(DTOFIELD_PSPANELLOGICNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSPanelLogicNameDirty() {
        return this._contains(DTOFIELD_PSPANELLOGICNAME);
    }

    @JsonIgnore
    public void resetPSPanelLogicName() {
        this._reset(DTOFIELD_PSPANELLOGICNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO pspanellogicname(String pSPanelLogicName) {
        this.setPSPanelLogicName(pSPanelLogicName);
        return this;
    }

    @JsonProperty(value="pssyspfpluginid")
    public void setPSSysPFPluginId(String pSSysPFPluginId) {
        this._set(DTOFIELD_PSSYSPFPLUGINID, pSSysPFPluginId);
    }

    @JsonIgnore
    public String getPSSysPFPluginId() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginIdDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public void resetPSSysPFPluginId() {
        this._reset(DTOFIELD_PSSYSPFPLUGINID);
    }

    @JsonIgnore
    public PSPanelEngineDTO pssyspfpluginid(String pSSysPFPluginId) {
        this.setPSSysPFPluginId(pSSysPFPluginId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO pssyspfpluginid(PSSysPFPluginDTO pSSysPFPlugin) {
        if (pSSysPFPlugin == null) {
            this.setPSSysPFPluginId(null);
            this.setPSSysPFPluginName(null);
        } else {
            this.setPSSysPFPluginId(pSSysPFPlugin.getPSSysPFPluginId());
            this.setPSSysPFPluginName(pSSysPFPlugin.getPSSysPFPluginName());
        }
        return this;
    }

    @JsonProperty(value="pssyspfpluginname")
    public void setPSSysPFPluginName(String pSSysPFPluginName) {
        this._set(DTOFIELD_PSSYSPFPLUGINNAME, pSSysPFPluginName);
    }

    @JsonIgnore
    public String getPSSysPFPluginName() {
        Object objValue = this._get(DTOFIELD_PSSYSPFPLUGINNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysPFPluginNameDirty() {
        return this._contains(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public void resetPSSysPFPluginName() {
        this._reset(DTOFIELD_PSSYSPFPLUGINNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO pssyspfpluginname(String pSSysPFPluginName) {
        this.setPSSysPFPluginName(pSSysPFPluginName);
        return this;
    }

    @JsonProperty(value="pssysviewpanelid")
    public void setPSSysViewPanelId(String pSSysViewPanelId) {
        this._set(DTOFIELD_PSSYSVIEWPANELID, pSSysViewPanelId);
    }

    @JsonIgnore
    public String getPSSysViewPanelId() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelIdDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public void resetPSSysViewPanelId() {
        this._reset(DTOFIELD_PSSYSVIEWPANELID);
    }

    @JsonIgnore
    public PSPanelEngineDTO pssysviewpanelid(String pSSysViewPanelId) {
        this.setPSSysViewPanelId(pSSysViewPanelId);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO pssysviewpanelid(PSSysViewPanelDTO pSSysViewPanel) {
        if (pSSysViewPanel == null) {
            this.setPSSysViewPanelId(null);
            this.setPSSysViewPanelName(null);
        } else {
            this.setPSSysViewPanelId(pSSysViewPanel.getPSSysViewPanelId());
            this.setPSSysViewPanelName(pSSysViewPanel.getPSSysViewPanelName());
        }
        return this;
    }

    @JsonProperty(value="pssysviewpanelname")
    public void setPSSysViewPanelName(String pSSysViewPanelName) {
        this._set(DTOFIELD_PSSYSVIEWPANELNAME, pSSysViewPanelName);
    }

    @JsonIgnore
    public String getPSSysViewPanelName() {
        Object objValue = this._get(DTOFIELD_PSSYSVIEWPANELNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysViewPanelNameDirty() {
        return this._contains(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public void resetPSSysViewPanelName() {
        this._reset(DTOFIELD_PSSYSVIEWPANELNAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO pssysviewpanelname(String pSSysViewPanelName) {
        this.setPSSysViewPanelName(pSSysViewPanelName);
        return this;
    }

    @JsonProperty(value="psuienginetypeid")
    public void setPSUIEngineTypeId(String pSUIEngineTypeId) {
        this._set(DTOFIELD_PSUIENGINETYPEID, pSUIEngineTypeId);
    }

    @JsonIgnore
    public String getPSUIEngineTypeId() {
        Object objValue = this._get(DTOFIELD_PSUIENGINETYPEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSUIEngineTypeIdDirty() {
        return this._contains(DTOFIELD_PSUIENGINETYPEID);
    }

    @JsonIgnore
    public void resetPSUIEngineTypeId() {
        this._reset(DTOFIELD_PSUIENGINETYPEID);
    }

    @JsonIgnore
    public PSPanelEngineDTO psuienginetypeid(String pSUIEngineTypeId) {
        this.setPSUIEngineTypeId(pSUIEngineTypeId);
        return this;
    }

    @JsonProperty(value="psuienginetypename")
    public void setPSUIEngineTypeName(String pSUIEngineTypeName) {
        this._set(DTOFIELD_PSUIENGINETYPENAME, pSUIEngineTypeName);
    }

    @JsonIgnore
    public String getPSUIEngineTypeName() {
        Object objValue = this._get(DTOFIELD_PSUIENGINETYPENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSUIEngineTypeNameDirty() {
        return this._contains(DTOFIELD_PSUIENGINETYPENAME);
    }

    @JsonIgnore
    public void resetPSUIEngineTypeName() {
        this._reset(DTOFIELD_PSUIENGINETYPENAME);
    }

    @JsonIgnore
    public PSPanelEngineDTO psuienginetypename(String pSUIEngineTypeName) {
        this.setPSUIEngineTypeName(pSUIEngineTypeName);
        return this;
    }

    @JsonProperty(value="updatedate")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    public void setUpdateDate(Timestamp updateDate) {
        this._set(DTOFIELD_UPDATEDATE, updateDate);
    }

    @JsonIgnore
    public Timestamp getUpdateDate() {
        Object objValue = this._get(DTOFIELD_UPDATEDATE);
        if (objValue == null) {
            return null;
        }
        return (Timestamp)objValue;
    }

    @JsonIgnore
    public boolean isUpdateDateDirty() {
        return this._contains(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public void resetUpdateDate() {
        this._reset(DTOFIELD_UPDATEDATE);
    }

    @JsonIgnore
    public PSPanelEngineDTO updatedate(Timestamp updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    @JsonProperty(value="updateman")
    public void setUpdateMan(String updateMan) {
        this._set(DTOFIELD_UPDATEMAN, updateMan);
    }

    @JsonIgnore
    public String getUpdateMan() {
        Object objValue = this._get(DTOFIELD_UPDATEMAN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUpdateManDirty() {
        return this._contains(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public void resetUpdateMan() {
        this._reset(DTOFIELD_UPDATEMAN);
    }

    @JsonIgnore
    public PSPanelEngineDTO updateman(String updateMan) {
        this.setUpdateMan(updateMan);
        return this;
    }

    @JsonProperty(value="usercat")
    public void setUserCat(String userCat) {
        this._set(DTOFIELD_USERCAT, userCat);
    }

    @JsonIgnore
    public String getUserCat() {
        Object objValue = this._get(DTOFIELD_USERCAT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserCatDirty() {
        return this._contains(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public void resetUserCat() {
        this._reset(DTOFIELD_USERCAT);
    }

    @JsonIgnore
    public PSPanelEngineDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO usercat(PSModelEnums.ModelUserCat userCat) {
        if (userCat == null) {
            this.setUserCat(null);
        } else {
            this.setUserCat(userCat.value);
        }
        return this;
    }

    @JsonProperty(value="usertag")
    public void setUserTag(String userTag) {
        this._set(DTOFIELD_USERTAG, userTag);
    }

    @JsonIgnore
    public String getUserTag() {
        Object objValue = this._get(DTOFIELD_USERTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTagDirty() {
        return this._contains(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public void resetUserTag() {
        this._reset(DTOFIELD_USERTAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO usertag(String userTag) {
        this.setUserTag(userTag);
        return this;
    }

    @JsonProperty(value="usertag2")
    public void setUserTag2(String userTag2) {
        this._set(DTOFIELD_USERTAG2, userTag2);
    }

    @JsonIgnore
    public String getUserTag2() {
        Object objValue = this._get(DTOFIELD_USERTAG2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag2Dirty() {
        return this._contains(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public void resetUserTag2() {
        this._reset(DTOFIELD_USERTAG2);
    }

    @JsonIgnore
    public PSPanelEngineDTO usertag2(String userTag2) {
        this.setUserTag2(userTag2);
        return this;
    }

    @JsonProperty(value="usertag3")
    public void setUserTag3(String userTag3) {
        this._set(DTOFIELD_USERTAG3, userTag3);
    }

    @JsonIgnore
    public String getUserTag3() {
        Object objValue = this._get(DTOFIELD_USERTAG3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag3Dirty() {
        return this._contains(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public void resetUserTag3() {
        this._reset(DTOFIELD_USERTAG3);
    }

    @JsonIgnore
    public PSPanelEngineDTO usertag3(String userTag3) {
        this.setUserTag3(userTag3);
        return this;
    }

    @JsonProperty(value="usertag4")
    public void setUserTag4(String userTag4) {
        this._set(DTOFIELD_USERTAG4, userTag4);
    }

    @JsonIgnore
    public String getUserTag4() {
        Object objValue = this._get(DTOFIELD_USERTAG4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isUserTag4Dirty() {
        return this._contains(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public void resetUserTag4() {
        this._reset(DTOFIELD_USERTAG4);
    }

    @JsonIgnore
    public PSPanelEngineDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="validflag")
    public void setValidFlag(Integer validFlag) {
        this._set(DTOFIELD_VALIDFLAG, validFlag);
    }

    @JsonIgnore
    public Integer getValidFlag() {
        Object objValue = this._get(DTOFIELD_VALIDFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isValidFlagDirty() {
        return this._contains(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public void resetValidFlag() {
        this._reset(DTOFIELD_VALIDFLAG);
    }

    @JsonIgnore
    public PSPanelEngineDTO validflag(Integer validFlag) {
        this.setValidFlag(validFlag);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO validflag(Boolean validFlag) {
        if (validFlag == null) {
            this.setValidFlag(null);
        } else {
            this.setValidFlag(validFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="viewparam")
    public void setViewParam(String viewParam) {
        this._set(DTOFIELD_VIEWPARAM, viewParam);
    }

    @JsonIgnore
    public String getViewParam() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewParamDirty() {
        return this._contains(DTOFIELD_VIEWPARAM);
    }

    @JsonIgnore
    public void resetViewParam() {
        this._reset(DTOFIELD_VIEWPARAM);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam(String viewParam) {
        this.setViewParam(viewParam);
        return this;
    }

    @JsonProperty(value="viewparam10")
    public void setViewParam10(Integer viewParam10) {
        this._set(DTOFIELD_VIEWPARAM10, viewParam10);
    }

    @JsonIgnore
    public Integer getViewParam10() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM10);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewParam10Dirty() {
        return this._contains(DTOFIELD_VIEWPARAM10);
    }

    @JsonIgnore
    public void resetViewParam10() {
        this._reset(DTOFIELD_VIEWPARAM10);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam10(Integer viewParam10) {
        this.setViewParam10(viewParam10);
        return this;
    }

    @JsonProperty(value="viewparam2")
    public void setViewParam2(String viewParam2) {
        this._set(DTOFIELD_VIEWPARAM2, viewParam2);
    }

    @JsonIgnore
    public String getViewParam2() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewParam2Dirty() {
        return this._contains(DTOFIELD_VIEWPARAM2);
    }

    @JsonIgnore
    public void resetViewParam2() {
        this._reset(DTOFIELD_VIEWPARAM2);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam2(String viewParam2) {
        this.setViewParam2(viewParam2);
        return this;
    }

    @JsonProperty(value="viewparam3")
    public void setViewParam3(Integer viewParam3) {
        this._set(DTOFIELD_VIEWPARAM3, viewParam3);
    }

    @JsonIgnore
    public Integer getViewParam3() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM3);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewParam3Dirty() {
        return this._contains(DTOFIELD_VIEWPARAM3);
    }

    @JsonIgnore
    public void resetViewParam3() {
        this._reset(DTOFIELD_VIEWPARAM3);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam3(Integer viewParam3) {
        this.setViewParam3(viewParam3);
        return this;
    }

    @JsonProperty(value="viewparam4")
    public void setViewParam4(Integer viewParam4) {
        this._set(DTOFIELD_VIEWPARAM4, viewParam4);
    }

    @JsonIgnore
    public Integer getViewParam4() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM4);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewParam4Dirty() {
        return this._contains(DTOFIELD_VIEWPARAM4);
    }

    @JsonIgnore
    public void resetViewParam4() {
        this._reset(DTOFIELD_VIEWPARAM4);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam4(Integer viewParam4) {
        this.setViewParam4(viewParam4);
        return this;
    }

    @JsonProperty(value="viewparam5")
    public void setViewParam5(Integer viewParam5) {
        this._set(DTOFIELD_VIEWPARAM5, viewParam5);
    }

    @JsonIgnore
    public Integer getViewParam5() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM5);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewParam5Dirty() {
        return this._contains(DTOFIELD_VIEWPARAM5);
    }

    @JsonIgnore
    public void resetViewParam5() {
        this._reset(DTOFIELD_VIEWPARAM5);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam5(Integer viewParam5) {
        this.setViewParam5(viewParam5);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam5(Boolean viewParam5) {
        if (viewParam5 == null) {
            this.setViewParam5(null);
        } else {
            this.setViewParam5(viewParam5 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="viewparam6")
    public void setViewParam6(Integer viewParam6) {
        this._set(DTOFIELD_VIEWPARAM6, viewParam6);
    }

    @JsonIgnore
    public Integer getViewParam6() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM6);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewParam6Dirty() {
        return this._contains(DTOFIELD_VIEWPARAM6);
    }

    @JsonIgnore
    public void resetViewParam6() {
        this._reset(DTOFIELD_VIEWPARAM6);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam6(Integer viewParam6) {
        this.setViewParam6(viewParam6);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam6(Boolean viewParam6) {
        if (viewParam6 == null) {
            this.setViewParam6(null);
        } else {
            this.setViewParam6(viewParam6 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="viewparam7")
    public void setViewParam7(String viewParam7) {
        this._set(DTOFIELD_VIEWPARAM7, viewParam7);
    }

    @JsonIgnore
    public String getViewParam7() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM7);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewParam7Dirty() {
        return this._contains(DTOFIELD_VIEWPARAM7);
    }

    @JsonIgnore
    public void resetViewParam7() {
        this._reset(DTOFIELD_VIEWPARAM7);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam7(String viewParam7) {
        this.setViewParam7(viewParam7);
        return this;
    }

    @JsonProperty(value="viewparam8")
    public void setViewParam8(String viewParam8) {
        this._set(DTOFIELD_VIEWPARAM8, viewParam8);
    }

    @JsonIgnore
    public String getViewParam8() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM8);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isViewParam8Dirty() {
        return this._contains(DTOFIELD_VIEWPARAM8);
    }

    @JsonIgnore
    public void resetViewParam8() {
        this._reset(DTOFIELD_VIEWPARAM8);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam8(String viewParam8) {
        this.setViewParam8(viewParam8);
        return this;
    }

    @JsonProperty(value="viewparam9")
    public void setViewParam9(Integer viewParam9) {
        this._set(DTOFIELD_VIEWPARAM9, viewParam9);
    }

    @JsonIgnore
    public Integer getViewParam9() {
        Object objValue = this._get(DTOFIELD_VIEWPARAM9);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isViewParam9Dirty() {
        return this._contains(DTOFIELD_VIEWPARAM9);
    }

    @JsonIgnore
    public void resetViewParam9() {
        this._reset(DTOFIELD_VIEWPARAM9);
    }

    @JsonIgnore
    public PSPanelEngineDTO viewparam9(Integer viewParam9) {
        this.setViewParam9(viewParam9);
        return this;
    }

    @JsonProperty(value="wfviewparam")
    public void setWFViewParam(Integer wFViewParam) {
        this._set(DTOFIELD_WFVIEWPARAM, wFViewParam);
    }

    @JsonIgnore
    public Integer getWFViewParam() {
        Object objValue = this._get(DTOFIELD_WFVIEWPARAM);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWFViewParamDirty() {
        return this._contains(DTOFIELD_WFVIEWPARAM);
    }

    @JsonIgnore
    public void resetWFViewParam() {
        this._reset(DTOFIELD_WFVIEWPARAM);
    }

    @JsonIgnore
    public PSPanelEngineDTO wfviewparam(Integer wFViewParam) {
        this.setWFViewParam(wFViewParam);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO wfviewparam(Boolean wFViewParam) {
        if (wFViewParam == null) {
            this.setWFViewParam(null);
        } else {
            this.setWFViewParam(wFViewParam != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="wfviewparam2")
    public void setWFViewParam2(Integer wFViewParam2) {
        this._set(DTOFIELD_WFVIEWPARAM2, wFViewParam2);
    }

    @JsonIgnore
    public Integer getWFViewParam2() {
        Object objValue = this._get(DTOFIELD_WFVIEWPARAM2);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isWFViewParam2Dirty() {
        return this._contains(DTOFIELD_WFVIEWPARAM2);
    }

    @JsonIgnore
    public void resetWFViewParam2() {
        this._reset(DTOFIELD_WFVIEWPARAM2);
    }

    @JsonIgnore
    public PSPanelEngineDTO wfviewparam2(Integer wFViewParam2) {
        this.setWFViewParam2(wFViewParam2);
        return this;
    }

    @JsonIgnore
    public PSPanelEngineDTO wfviewparam2(Boolean wFViewParam2) {
        if (wFViewParam2 == null) {
            this.setWFViewParam2(null);
        } else {
            this.setWFViewParam2(wFViewParam2 != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="wfviewparam3")
    public void setWFViewParam3(String wFViewParam3) {
        this._set(DTOFIELD_WFVIEWPARAM3, wFViewParam3);
    }

    @JsonIgnore
    public String getWFViewParam3() {
        Object objValue = this._get(DTOFIELD_WFVIEWPARAM3);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFViewParam3Dirty() {
        return this._contains(DTOFIELD_WFVIEWPARAM3);
    }

    @JsonIgnore
    public void resetWFViewParam3() {
        this._reset(DTOFIELD_WFVIEWPARAM3);
    }

    @JsonIgnore
    public PSPanelEngineDTO wfviewparam3(String wFViewParam3) {
        this.setWFViewParam3(wFViewParam3);
        return this;
    }

    @JsonProperty(value="wfviewparam4")
    public void setWFViewParam4(String wFViewParam4) {
        this._set(DTOFIELD_WFVIEWPARAM4, wFViewParam4);
    }

    @JsonIgnore
    public String getWFViewParam4() {
        Object objValue = this._get(DTOFIELD_WFVIEWPARAM4);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isWFViewParam4Dirty() {
        return this._contains(DTOFIELD_WFVIEWPARAM4);
    }

    @JsonIgnore
    public void resetWFViewParam4() {
        this._reset(DTOFIELD_WFVIEWPARAM4);
    }

    @JsonIgnore
    public PSPanelEngineDTO wfviewparam4(String wFViewParam4) {
        this.setWFViewParam4(wFViewParam4);
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSPanelEngineId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSPanelEngineId(strValue);
    }

    @JsonIgnore
    public PSPanelEngineDTO id(String strValue) {
        this.setPSPanelEngineId(strValue);
        return this;
    }
}
