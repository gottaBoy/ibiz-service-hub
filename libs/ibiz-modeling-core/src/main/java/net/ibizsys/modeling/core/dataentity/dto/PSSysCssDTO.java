package net.ibizsys.modeling.core.dataentity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.modeling.core.dataentity.dto.PSModuleDTO;
import net.ibizsys.modeling.core.dataentity.dto.PSSysCssCatDTO;
import net.ibizsys.modeling.core.util.PSModelDTOBase;

public class PSSysCssDTO
extends PSModelDTOBase {
    public static final String FIELD_BKCOLOR = "BKCOLOR";
    protected static final String DTOFIELD_BKCOLOR = "bkcolor";
    public static final String FIELD_BORDER = "BORDER";
    protected static final String DTOFIELD_BORDER = "border";
    public static final String FIELD_BORDERCOLOR = "BORDERCOLOR";
    protected static final String DTOFIELD_BORDERCOLOR = "bordercolor";
    public static final String FIELD_BORDERSTYLE = "BORDERSTYLE";
    protected static final String DTOFIELD_BORDERSTYLE = "borderstyle";
    public static final String FIELD_CODENAME = "CODENAME";
    protected static final String DTOFIELD_CODENAME = "codename";
    public static final String FIELD_CREATEDATE = "CREATEDATE";
    protected static final String DTOFIELD_CREATEDATE = "createdate";
    public static final String FIELD_CREATEMAN = "CREATEMAN";
    protected static final String DTOFIELD_CREATEMAN = "createman";
    public static final String FIELD_CSSCATNAME = "CSSCATNAME";
    protected static final String DTOFIELD_CSSCATNAME = "csscatname";
    public static final String FIELD_CSSNAME = "CSSNAME";
    protected static final String DTOFIELD_CSSNAME = "cssname";
    public static final String FIELD_CSSSTYLE = "CSSSTYLE";
    protected static final String DTOFIELD_CSSSTYLE = "cssstyle";
    public static final String FIELD_CSSSTYLE2 = "CSSSTYLE2";
    protected static final String DTOFIELD_CSSSTYLE2 = "cssstyle2";
    public static final String FIELD_FONTCOLOR = "FONTCOLOR";
    protected static final String DTOFIELD_FONTCOLOR = "fontcolor";
    public static final String FIELD_FONTFAMILY = "FONTFAMILY";
    protected static final String DTOFIELD_FONTFAMILY = "fontfamily";
    public static final String FIELD_FONTSIZE = "FONTSIZE";
    protected static final String DTOFIELD_FONTSIZE = "fontsize";
    public static final String FIELD_FONTSTYLE = "FONTSTYLE";
    protected static final String DTOFIELD_FONTSTYLE = "fontstyle";
    public static final String FIELD_FULLCSSNAME = "FULLCSSNAME";
    protected static final String DTOFIELD_FULLCSSNAME = "fullcssname";
    public static final String FIELD_HALIGN = "HALIGN";
    protected static final String DTOFIELD_HALIGN = "halign";
    public static final String FIELD_MARGIN = "MARGIN";
    protected static final String DTOFIELD_MARGIN = "margin";
    public static final String FIELD_MEMO = "MEMO";
    protected static final String DTOFIELD_MEMO = "memo";
    public static final String FIELD_OWNERID = "OWNERID";
    protected static final String DTOFIELD_OWNERID = "ownerid";
    public static final String FIELD_OWNERTAG = "OWNERTAG";
    protected static final String DTOFIELD_OWNERTAG = "ownertag";
    public static final String FIELD_OWNERTYPE = "OWNERTYPE";
    protected static final String DTOFIELD_OWNERTYPE = "ownertype";
    public static final String FIELD_PADDING = "PADDING";
    protected static final String DTOFIELD_PADDING = "padding";
    public static final String FIELD_PSCSSTEMPLID = "PSCSSTEMPLID";
    protected static final String DTOFIELD_PSCSSTEMPLID = "pscsstemplid";
    public static final String FIELD_PSCSSTEMPLNAME = "PSCSSTEMPLNAME";
    protected static final String DTOFIELD_PSCSSTEMPLNAME = "pscsstemplname";
    public static final String FIELD_PSMODULEID = "PSMODULEID";
    protected static final String DTOFIELD_PSMODULEID = "psmoduleid";
    public static final String FIELD_PSMODULENAME = "PSMODULENAME";
    protected static final String DTOFIELD_PSMODULENAME = "psmodulename";
    public static final String FIELD_PSSYSCSSCATID = "PSSYSCSSCATID";
    protected static final String DTOFIELD_PSSYSCSSCATID = "pssyscsscatid";
    public static final String FIELD_PSSYSCSSCATNAME = "PSSYSCSSCATNAME";
    protected static final String DTOFIELD_PSSYSCSSCATNAME = "pssyscsscatname";
    public static final String FIELD_PSSYSCSSID = "PSSYSCSSID";
    protected static final String DTOFIELD_PSSYSCSSID = "pssyscssid";
    public static final String FIELD_PSSYSCSSNAME = "PSSYSCSSNAME";
    protected static final String DTOFIELD_PSSYSCSSNAME = "pssyscssname";
    public static final String FIELD_PUBLICFLAG = "PUBLICFLAG";
    protected static final String DTOFIELD_PUBLICFLAG = "publicflag";
    public static final String FIELD_SAMPLECONTENT = "SAMPLECONTENT";
    protected static final String DTOFIELD_SAMPLECONTENT = "samplecontent";
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
    public static final String FIELD_VALIGN = "VALIGN";
    protected static final String DTOFIELD_VALIGN = "valign";

    @JsonProperty(value="bkcolor")
    public void setBKColor(String bKColor) {
        this._set(DTOFIELD_BKCOLOR, bKColor);
    }

    @JsonIgnore
    public String getBKColor() {
        Object objValue = this._get(DTOFIELD_BKCOLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBKColorDirty() {
        return this._contains(DTOFIELD_BKCOLOR);
    }

    @JsonIgnore
    public void resetBKColor() {
        this._reset(DTOFIELD_BKCOLOR);
    }

    @JsonIgnore
    public PSSysCssDTO bkcolor(String bKColor) {
        this.setBKColor(bKColor);
        return this;
    }

    @JsonProperty(value="border")
    public void setBorder(String border) {
        this._set(DTOFIELD_BORDER, border);
    }

    @JsonIgnore
    public String getBorder() {
        Object objValue = this._get(DTOFIELD_BORDER);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBorderDirty() {
        return this._contains(DTOFIELD_BORDER);
    }

    @JsonIgnore
    public void resetBorder() {
        this._reset(DTOFIELD_BORDER);
    }

    @JsonIgnore
    public PSSysCssDTO border(String border) {
        this.setBorder(border);
        return this;
    }

    @JsonProperty(value="bordercolor")
    public void setBorderColor(String borderColor) {
        this._set(DTOFIELD_BORDERCOLOR, borderColor);
    }

    @JsonIgnore
    public String getBorderColor() {
        Object objValue = this._get(DTOFIELD_BORDERCOLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBorderColorDirty() {
        return this._contains(DTOFIELD_BORDERCOLOR);
    }

    @JsonIgnore
    public void resetBorderColor() {
        this._reset(DTOFIELD_BORDERCOLOR);
    }

    @JsonIgnore
    public PSSysCssDTO bordercolor(String borderColor) {
        this.setBorderColor(borderColor);
        return this;
    }

    @JsonProperty(value="borderstyle")
    public void setBorderStyle(String borderStyle) {
        this._set(DTOFIELD_BORDERSTYLE, borderStyle);
    }

    @JsonIgnore
    public String getBorderStyle() {
        Object objValue = this._get(DTOFIELD_BORDERSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isBorderStyleDirty() {
        return this._contains(DTOFIELD_BORDERSTYLE);
    }

    @JsonIgnore
    public void resetBorderStyle() {
        this._reset(DTOFIELD_BORDERSTYLE);
    }

    @JsonIgnore
    public PSSysCssDTO borderstyle(String borderStyle) {
        this.setBorderStyle(borderStyle);
        return this;
    }

    @JsonIgnore
    public PSSysCssDTO borderstyle(PSModelEnums.BorderStyle borderStyle) {
        if (borderStyle == null) {
            this.setBorderStyle(null);
        } else {
            this.setBorderStyle(borderStyle.value);
        }
        return this;
    }

    @JsonProperty(value="codename")
    public void setCodeName(String codeName) {
        this._set(DTOFIELD_CODENAME, codeName);
    }

    @JsonIgnore
    public String getCodeName() {
        Object objValue = this._get(DTOFIELD_CODENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCodeNameDirty() {
        return this._contains(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public void resetCodeName() {
        this._reset(DTOFIELD_CODENAME);
    }

    @JsonIgnore
    public PSSysCssDTO codename(String codeName) {
        this.setCodeName(codeName);
        return this;
    }

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
    public PSSysCssDTO createdate(Timestamp createDate) {
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
    public PSSysCssDTO createman(String createMan) {
        this.setCreateMan(createMan);
        return this;
    }

    @JsonProperty(value="csscatname")
    public void setCssCatName(String cssCatName) {
        this._set(DTOFIELD_CSSCATNAME, cssCatName);
    }

    @JsonIgnore
    public String getCssCatName() {
        Object objValue = this._get(DTOFIELD_CSSCATNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCssCatNameDirty() {
        return this._contains(DTOFIELD_CSSCATNAME);
    }

    @JsonIgnore
    public void resetCssCatName() {
        this._reset(DTOFIELD_CSSCATNAME);
    }

    @JsonIgnore
    public PSSysCssDTO csscatname(String cssCatName) {
        this.setCssCatName(cssCatName);
        return this;
    }

    @JsonProperty(value="cssname")
    public void setCSSName(String cSSName) {
        this._set(DTOFIELD_CSSNAME, cSSName);
    }

    @JsonIgnore
    public String getCSSName() {
        Object objValue = this._get(DTOFIELD_CSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCSSNameDirty() {
        return this._contains(DTOFIELD_CSSNAME);
    }

    @JsonIgnore
    public void resetCSSName() {
        this._reset(DTOFIELD_CSSNAME);
    }

    @JsonIgnore
    public PSSysCssDTO cssname(String cSSName) {
        this.setCSSName(cSSName);
        return this;
    }

    @JsonProperty(value="cssstyle")
    public void setCSSStyle(String cSSStyle) {
        this._set(DTOFIELD_CSSSTYLE, cSSStyle);
    }

    @JsonIgnore
    public String getCSSStyle() {
        Object objValue = this._get(DTOFIELD_CSSSTYLE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCSSStyleDirty() {
        return this._contains(DTOFIELD_CSSSTYLE);
    }

    @JsonIgnore
    public void resetCSSStyle() {
        this._reset(DTOFIELD_CSSSTYLE);
    }

    @JsonIgnore
    public PSSysCssDTO cssstyle(String cSSStyle) {
        this.setCSSStyle(cSSStyle);
        return this;
    }

    @JsonProperty(value="cssstyle2")
    public void setCssStyle2(String cssStyle2) {
        this._set(DTOFIELD_CSSSTYLE2, cssStyle2);
    }

    @JsonIgnore
    public String getCssStyle2() {
        Object objValue = this._get(DTOFIELD_CSSSTYLE2);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isCssStyle2Dirty() {
        return this._contains(DTOFIELD_CSSSTYLE2);
    }

    @JsonIgnore
    public void resetCssStyle2() {
        this._reset(DTOFIELD_CSSSTYLE2);
    }

    @JsonIgnore
    public PSSysCssDTO cssstyle2(String cssStyle2) {
        this.setCssStyle2(cssStyle2);
        return this;
    }

    @JsonProperty(value="fontcolor")
    public void setFontColor(String fontColor) {
        this._set(DTOFIELD_FONTCOLOR, fontColor);
    }

    @JsonIgnore
    public String getFontColor() {
        Object objValue = this._get(DTOFIELD_FONTCOLOR);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFontColorDirty() {
        return this._contains(DTOFIELD_FONTCOLOR);
    }

    @JsonIgnore
    public void resetFontColor() {
        this._reset(DTOFIELD_FONTCOLOR);
    }

    @JsonIgnore
    public PSSysCssDTO fontcolor(String fontColor) {
        this.setFontColor(fontColor);
        return this;
    }

    @JsonProperty(value="fontfamily")
    public void setFontFamily(String fontFamily) {
        this._set(DTOFIELD_FONTFAMILY, fontFamily);
    }

    @JsonIgnore
    public String getFontFamily() {
        Object objValue = this._get(DTOFIELD_FONTFAMILY);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFontFamilyDirty() {
        return this._contains(DTOFIELD_FONTFAMILY);
    }

    @JsonIgnore
    public void resetFontFamily() {
        this._reset(DTOFIELD_FONTFAMILY);
    }

    @JsonIgnore
    public PSSysCssDTO fontfamily(String fontFamily) {
        this.setFontFamily(fontFamily);
        return this;
    }

    @JsonProperty(value="fontsize")
    public void setFontSize(Integer fontSize) {
        this._set(DTOFIELD_FONTSIZE, fontSize);
    }

    @JsonIgnore
    public Integer getFontSize() {
        Object objValue = this._get(DTOFIELD_FONTSIZE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFontSizeDirty() {
        return this._contains(DTOFIELD_FONTSIZE);
    }

    @JsonIgnore
    public void resetFontSize() {
        this._reset(DTOFIELD_FONTSIZE);
    }

    @JsonIgnore
    public PSSysCssDTO fontsize(Integer fontSize) {
        this.setFontSize(fontSize);
        return this;
    }

    @JsonProperty(value="fontstyle")
    public void setFontStyle(Integer fontStyle) {
        this._set(DTOFIELD_FONTSTYLE, fontStyle);
    }

    @JsonIgnore
    public Integer getFontStyle() {
        Object objValue = this._get(DTOFIELD_FONTSTYLE);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isFontStyleDirty() {
        return this._contains(DTOFIELD_FONTSTYLE);
    }

    @JsonIgnore
    public void resetFontStyle() {
        this._reset(DTOFIELD_FONTSTYLE);
    }

    @JsonIgnore
    public PSSysCssDTO fontstyle(Integer fontStyle) {
        this.setFontStyle(fontStyle);
        return this;
    }

    @JsonIgnore
    public PSSysCssDTO fontstyle(PSModelEnums.FontStyle[] fontStyle) {
        if (fontStyle == null || fontStyle.length == 0) {
            this.setFontStyle(null);
        } else {
            int _value = 0;
            for (PSModelEnums.FontStyle _item : fontStyle) {
                _value |= _item.value;
            }
            this.setFontStyle(_value);
        }
        return this;
    }

    @JsonProperty(value="fullcssname")
    public void setFullCssName(String fullCssName) {
        this._set(DTOFIELD_FULLCSSNAME, fullCssName);
    }

    @JsonIgnore
    public String getFullCssName() {
        Object objValue = this._get(DTOFIELD_FULLCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isFullCssNameDirty() {
        return this._contains(DTOFIELD_FULLCSSNAME);
    }

    @JsonIgnore
    public void resetFullCssName() {
        this._reset(DTOFIELD_FULLCSSNAME);
    }

    @JsonIgnore
    public PSSysCssDTO fullcssname(String fullCssName) {
        this.setFullCssName(fullCssName);
        return this;
    }

    @JsonProperty(value="halign")
    public void setHAlign(String hAlign) {
        this._set(DTOFIELD_HALIGN, hAlign);
    }

    @JsonIgnore
    public String getHAlign() {
        Object objValue = this._get(DTOFIELD_HALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isHAlignDirty() {
        return this._contains(DTOFIELD_HALIGN);
    }

    @JsonIgnore
    public void resetHAlign() {
        this._reset(DTOFIELD_HALIGN);
    }

    @JsonIgnore
    public PSSysCssDTO halign(String hAlign) {
        this.setHAlign(hAlign);
        return this;
    }

    @JsonIgnore
    public PSSysCssDTO halign(PSModelEnums.TextAlign hAlign) {
        if (hAlign == null) {
            this.setHAlign(null);
        } else {
            this.setHAlign(hAlign.value);
        }
        return this;
    }

    @JsonProperty(value="margin")
    public void setMargin(String margin) {
        this._set(DTOFIELD_MARGIN, margin);
    }

    @JsonIgnore
    public String getMargin() {
        Object objValue = this._get(DTOFIELD_MARGIN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isMarginDirty() {
        return this._contains(DTOFIELD_MARGIN);
    }

    @JsonIgnore
    public void resetMargin() {
        this._reset(DTOFIELD_MARGIN);
    }

    @JsonIgnore
    public PSSysCssDTO margin(String margin) {
        this.setMargin(margin);
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
    public PSSysCssDTO memo(String memo) {
        this.setMemo(memo);
        return this;
    }

    @JsonProperty(value="ownerid")
    public void setOwnerId(String ownerId) {
        this._set(DTOFIELD_OWNERID, ownerId);
    }

    @JsonIgnore
    public String getOwnerId() {
        Object objValue = this._get(DTOFIELD_OWNERID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOwnerIdDirty() {
        return this._contains(DTOFIELD_OWNERID);
    }

    @JsonIgnore
    public void resetOwnerId() {
        this._reset(DTOFIELD_OWNERID);
    }

    @JsonIgnore
    public PSSysCssDTO ownerid(String ownerId) {
        this.setOwnerId(ownerId);
        return this;
    }

    @JsonProperty(value="ownertag")
    public void setOwnerTag(String ownerTag) {
        this._set(DTOFIELD_OWNERTAG, ownerTag);
    }

    @JsonIgnore
    public String getOwnerTag() {
        Object objValue = this._get(DTOFIELD_OWNERTAG);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOwnerTagDirty() {
        return this._contains(DTOFIELD_OWNERTAG);
    }

    @JsonIgnore
    public void resetOwnerTag() {
        this._reset(DTOFIELD_OWNERTAG);
    }

    @JsonIgnore
    public PSSysCssDTO ownertag(String ownerTag) {
        this.setOwnerTag(ownerTag);
        return this;
    }

    @JsonProperty(value="ownertype")
    public void setOwnerType(String ownerType) {
        this._set(DTOFIELD_OWNERTYPE, ownerType);
    }

    @JsonIgnore
    public String getOwnerType() {
        Object objValue = this._get(DTOFIELD_OWNERTYPE);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isOwnerTypeDirty() {
        return this._contains(DTOFIELD_OWNERTYPE);
    }

    @JsonIgnore
    public void resetOwnerType() {
        this._reset(DTOFIELD_OWNERTYPE);
    }

    @JsonIgnore
    public PSSysCssDTO ownertype(String ownerType) {
        this.setOwnerType(ownerType);
        return this;
    }

    @JsonProperty(value="padding")
    public void setPadding(String padding) {
        this._set(DTOFIELD_PADDING, padding);
    }

    @JsonIgnore
    public String getPadding() {
        Object objValue = this._get(DTOFIELD_PADDING);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPaddingDirty() {
        return this._contains(DTOFIELD_PADDING);
    }

    @JsonIgnore
    public void resetPadding() {
        this._reset(DTOFIELD_PADDING);
    }

    @JsonIgnore
    public PSSysCssDTO padding(String padding) {
        this.setPadding(padding);
        return this;
    }

    @JsonProperty(value="pscsstemplid")
    public void setPSCssTemplId(String pSCssTemplId) {
        this._set(DTOFIELD_PSCSSTEMPLID, pSCssTemplId);
    }

    @JsonIgnore
    public String getPSCssTemplId() {
        Object objValue = this._get(DTOFIELD_PSCSSTEMPLID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCssTemplIdDirty() {
        return this._contains(DTOFIELD_PSCSSTEMPLID);
    }

    @JsonIgnore
    public void resetPSCssTemplId() {
        this._reset(DTOFIELD_PSCSSTEMPLID);
    }

    @JsonIgnore
    public PSSysCssDTO pscsstemplid(String pSCssTemplId) {
        this.setPSCssTemplId(pSCssTemplId);
        return this;
    }

    @JsonProperty(value="pscsstemplname")
    public void setPSCssTemplName(String pSCssTemplName) {
        this._set(DTOFIELD_PSCSSTEMPLNAME, pSCssTemplName);
    }

    @JsonIgnore
    public String getPSCssTemplName() {
        Object objValue = this._get(DTOFIELD_PSCSSTEMPLNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSCssTemplNameDirty() {
        return this._contains(DTOFIELD_PSCSSTEMPLNAME);
    }

    @JsonIgnore
    public void resetPSCssTemplName() {
        this._reset(DTOFIELD_PSCSSTEMPLNAME);
    }

    @JsonIgnore
    public PSSysCssDTO pscsstemplname(String pSCssTemplName) {
        this.setPSCssTemplName(pSCssTemplName);
        return this;
    }

    @JsonProperty(value="psmoduleid")
    public void setPSModuleId(String pSModuleId) {
        this._set(DTOFIELD_PSMODULEID, pSModuleId);
    }

    @JsonIgnore
    public String getPSModuleId() {
        Object objValue = this._get(DTOFIELD_PSMODULEID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleIdDirty() {
        return this._contains(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public void resetPSModuleId() {
        this._reset(DTOFIELD_PSMODULEID);
    }

    @JsonIgnore
    public PSSysCssDTO psmoduleid(String pSModuleId) {
        this.setPSModuleId(pSModuleId);
        return this;
    }

    @JsonIgnore
    public PSSysCssDTO psmoduleid(PSModuleDTO pSModule) {
        if (pSModule == null) {
            this.setPSModuleId(null);
            this.setPSModuleName(null);
        } else {
            this.setPSModuleId(pSModule.getPSModuleId());
            this.setPSModuleName(pSModule.getPSModuleName());
        }
        return this;
    }

    @JsonProperty(value="psmodulename")
    public void setPSModuleName(String pSModuleName) {
        this._set(DTOFIELD_PSMODULENAME, pSModuleName);
    }

    @JsonIgnore
    public String getPSModuleName() {
        Object objValue = this._get(DTOFIELD_PSMODULENAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSModuleNameDirty() {
        return this._contains(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public void resetPSModuleName() {
        this._reset(DTOFIELD_PSMODULENAME);
    }

    @JsonIgnore
    public PSSysCssDTO psmodulename(String pSModuleName) {
        this.setPSModuleName(pSModuleName);
        return this;
    }

    @JsonProperty(value="pssyscsscatid")
    public void setPSSysCssCatId(String pSSysCssCatId) {
        this._set(DTOFIELD_PSSYSCSSCATID, pSSysCssCatId);
    }

    @JsonIgnore
    public String getPSSysCssCatId() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSCATID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssCatIdDirty() {
        return this._contains(DTOFIELD_PSSYSCSSCATID);
    }

    @JsonIgnore
    public void resetPSSysCssCatId() {
        this._reset(DTOFIELD_PSSYSCSSCATID);
    }

    @JsonIgnore
    public PSSysCssDTO pssyscsscatid(String pSSysCssCatId) {
        this.setPSSysCssCatId(pSSysCssCatId);
        return this;
    }

    @JsonIgnore
    public PSSysCssDTO pssyscsscatid(PSSysCssCatDTO pSSysCssCat) {
        if (pSSysCssCat == null) {
            this.setCssCatName(null);
            this.setPSSysCssCatId(null);
            this.setPSSysCssCatName(null);
        } else {
            this.setCssCatName(pSSysCssCat.getCssCatName());
            this.setPSSysCssCatId(pSSysCssCat.getPSSysCssCatId());
            this.setPSSysCssCatName(pSSysCssCat.getPSSysCssCatName());
        }
        return this;
    }

    @JsonProperty(value="pssyscsscatname")
    public void setPSSysCssCatName(String pSSysCssCatName) {
        this._set(DTOFIELD_PSSYSCSSCATNAME, pSSysCssCatName);
    }

    @JsonIgnore
    public String getPSSysCssCatName() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSCATNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssCatNameDirty() {
        return this._contains(DTOFIELD_PSSYSCSSCATNAME);
    }

    @JsonIgnore
    public void resetPSSysCssCatName() {
        this._reset(DTOFIELD_PSSYSCSSCATNAME);
    }

    @JsonIgnore
    public PSSysCssDTO pssyscsscatname(String pSSysCssCatName) {
        this.setPSSysCssCatName(pSSysCssCatName);
        return this;
    }

    @JsonProperty(value="pssyscssid")
    public void setPSSysCssId(String pSSysCssId) {
        this._set(DTOFIELD_PSSYSCSSID, pSSysCssId);
    }

    @JsonIgnore
    public String getPSSysCssId() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSID);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssIdDirty() {
        return this._contains(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public void resetPSSysCssId() {
        this._reset(DTOFIELD_PSSYSCSSID);
    }

    @JsonIgnore
    public PSSysCssDTO pssyscssid(String pSSysCssId) {
        this.setPSSysCssId(pSSysCssId);
        return this;
    }

    @JsonProperty(value="pssyscssname")
    public void setPSSysCssName(String pSSysCssName) {
        this._set(DTOFIELD_PSSYSCSSNAME, pSSysCssName);
    }

    @JsonIgnore
    public String getPSSysCssName() {
        Object objValue = this._get(DTOFIELD_PSSYSCSSNAME);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isPSSysCssNameDirty() {
        return this._contains(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public void resetPSSysCssName() {
        this._reset(DTOFIELD_PSSYSCSSNAME);
    }

    @JsonIgnore
    public PSSysCssDTO pssyscssname(String pSSysCssName) {
        this.setPSSysCssName(pSSysCssName);
        return this;
    }

    @JsonIgnore
    public String getName() {
        return this.getPSSysCssName();
    }

    @JsonIgnore
    public void setName(String strName) {
        this.setPSSysCssName(strName);
    }

    @JsonIgnore
    public PSSysCssDTO name(String strName) {
        this.setPSSysCssName(strName);
        return this;
    }

    @JsonProperty(value="publicflag")
    public void setPublicFlag(Integer publicFlag) {
        this._set(DTOFIELD_PUBLICFLAG, publicFlag);
    }

    @JsonIgnore
    public Integer getPublicFlag() {
        Object objValue = this._get(DTOFIELD_PUBLICFLAG);
        if (objValue == null) {
            return null;
        }
        return (Integer)objValue;
    }

    @JsonIgnore
    public boolean isPublicFlagDirty() {
        return this._contains(DTOFIELD_PUBLICFLAG);
    }

    @JsonIgnore
    public void resetPublicFlag() {
        this._reset(DTOFIELD_PUBLICFLAG);
    }

    @JsonIgnore
    public PSSysCssDTO publicflag(Integer publicFlag) {
        this.setPublicFlag(publicFlag);
        return this;
    }

    @JsonIgnore
    public PSSysCssDTO publicflag(Boolean publicFlag) {
        if (publicFlag == null) {
            this.setPublicFlag(null);
        } else {
            this.setPublicFlag(publicFlag != false ? 1 : 0);
        }
        return this;
    }

    @JsonProperty(value="samplecontent")
    public void setSampleContent(String sampleContent) {
        this._set(DTOFIELD_SAMPLECONTENT, sampleContent);
    }

    @JsonIgnore
    public String getSampleContent() {
        Object objValue = this._get(DTOFIELD_SAMPLECONTENT);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isSampleContentDirty() {
        return this._contains(DTOFIELD_SAMPLECONTENT);
    }

    @JsonIgnore
    public void resetSampleContent() {
        this._reset(DTOFIELD_SAMPLECONTENT);
    }

    @JsonIgnore
    public PSSysCssDTO samplecontent(String sampleContent) {
        this.setSampleContent(sampleContent);
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
    public PSSysCssDTO updatedate(Timestamp updateDate) {
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
    public PSSysCssDTO updateman(String updateMan) {
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
    public PSSysCssDTO usercat(String userCat) {
        this.setUserCat(userCat);
        return this;
    }

    @JsonIgnore
    public PSSysCssDTO usercat(PSModelEnums.ModelUserCat userCat) {
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
    public PSSysCssDTO usertag(String userTag) {
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
    public PSSysCssDTO usertag2(String userTag2) {
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
    public PSSysCssDTO usertag3(String userTag3) {
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
    public PSSysCssDTO usertag4(String userTag4) {
        this.setUserTag4(userTag4);
        return this;
    }

    @JsonProperty(value="valign")
    public void setVAlign(String vAlign) {
        this._set(DTOFIELD_VALIGN, vAlign);
    }

    @JsonIgnore
    public String getVAlign() {
        Object objValue = this._get(DTOFIELD_VALIGN);
        if (objValue == null) {
            return null;
        }
        return (String)objValue;
    }

    @JsonIgnore
    public boolean isVAlignDirty() {
        return this._contains(DTOFIELD_VALIGN);
    }

    @JsonIgnore
    public void resetVAlign() {
        this._reset(DTOFIELD_VALIGN);
    }

    @JsonIgnore
    public PSSysCssDTO valign(String vAlign) {
        this.setVAlign(vAlign);
        return this;
    }

    @JsonIgnore
    public PSSysCssDTO valign(PSModelEnums.TextVAlign vAlign) {
        if (vAlign == null) {
            this.setVAlign(null);
        } else {
            this.setVAlign(vAlign.value);
        }
        return this;
    }

    @JsonIgnore
    public String getId() {
        return this.getPSSysCssId();
    }

    @JsonIgnore
    public void setId(String strValue) {
        this.setPSSysCssId(strValue);
    }

    @JsonIgnore
    public PSSysCssDTO id(String strValue) {
        this.setPSSysCssId(strValue);
        return this;
    }
}
