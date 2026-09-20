package net.ibizsys.modeling.core.util;

import java.util.HashMap;
import java.util.Map;

import net.ibizsys.modeling.core.dataentity.dto.PSDEFieldDTO;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * Standard data type identifiers used by modeling data-entity fields.
 */
public final class PSDEFDataTypeUtils {

    public static final String ACID = "ACID";
    public static final String BIGDECIMAL = "BIGDECIMAL";
    public static final String BIGINT = "BIGINT";
    public static final String CODELISTTEXT = "CODELISTTEXT";
    public static final String CURRENCY = "CURRENCY";
    public static final String CURRENCYUNIT = "CURRENCYUNIT";
    public static final String DATE = "DATE";
    public static final String DATETIME = "DATETIME";
    public static final String DATETIME_BIRTHDAY = "DATETIME_BIRTHDAY";
    public static final String DECIMAL = "DECIMAL";
    public static final String FLOAT = "FLOAT";
    public static final String GUID = "GUID";
    public static final String HTMLTEXT = "HTMLTEXT";
    public static final String INHERIT = "INHERIT";
    public static final String INT = "INT";
    public static final String LONGTEXT = "LONGTEXT";
    public static final String LONGTEXT_1000 = "LONGTEXT_1000";
    public static final String NBID = "NBID";
    public static final String NMCODELIST = "NMCODELIST";
    public static final String NSCODELIST = "NSCODELIST";
    public static final String ONE2MANYDATA = "ONE2MANYDATA";
    public static final String PICKUP = "PICKUP";
    public static final String PICKUPDATA = "PICKUPDATA";
    public static final String PICKUPOBJECT = "PICKUPOBJECT";
    public static final String PICKUPTEXT = "PICKUPTEXT";
    public static final String SBID = "SBID";
    public static final String SMCODELIST = "SMCODELIST";
    public static final String SSCODELIST = "SSCODELIST";
    public static final String TEXT = "TEXT";
    public static final String TEXT_EMAIL = "TEXT_EMAIL";
    public static final String TIME = "TIME";
    public static final String TRUEFALSE = "TRUEFALSE";
    public static final String VARBINARY = "VARBINARY";
    public static final String WFSTATE = "WFSTATE";
    public static final String YESNO = "YESNO";

    private static final Map<String, String> DATA_TYPE_NAME_MAP = new HashMap<>();
    private static final Map<String, Integer> DATA_TYPE_STD_MAP = new HashMap<>();

    private PSDEFDataTypeUtils() {
    }

    public static String getName(String dataType) {
        return DATA_TYPE_NAME_MAP.get(dataType);
    }

    public static int getStdDataType(String dataType) {
        Integer standardDataType = DATA_TYPE_STD_MAP.get(dataType);
        return standardDataType == null ? 0 : standardDataType;
    }

    public static void fillPSDEField(PSDEFieldDTO field, int standardDataType,
            int length, int precision) throws Exception {
        switch (standardDataType) {
        case 1:
            field.setPSDataTypeId(BIGINT);
            if (length > 0) {
                field.setLength(length);
            }
            break;
        case 3:
            field.setPSDataTypeId(YESNO);
            break;
        case 4:
        case 11:
            field.setPSDataTypeId(TEXT);
            field.setLength(1);
            break;
        case 5:
        case 16:
        case 22:
            field.setPSDataTypeId(DATETIME);
            break;
        case 27:
            field.setPSDataTypeId(DATE);
            break;
        case 28:
            field.setPSDataTypeId(TIME);
            break;
        case 6:
        case 10:
        case 14:
        case 15:
        case 29:
            field.setPSDataTypeId(BIGDECIMAL);
            if (length >= 0) {
                field.setLength(length);
            }
            if (precision >= 0) {
                field.setPrecision2(precision);
            }
            break;
        case 7:
        case 18:
            field.setPSDataTypeId(FLOAT);
            if (length >= 0) {
                field.setLength(length);
            }
            if (precision >= 0) {
                field.setPrecision2(precision);
            }
            break;
        case 9:
        case 17:
        case 23:
            field.setPSDataTypeId(INT);
            if (length > 0) {
                field.setLength(length);
            }
            break;
        case 12:
        case 21:
            field.setPSDataTypeId(LONGTEXT);
            if (length > 0) {
                field.setLength(length);
            }
            break;
        case 13:
        case 20:
        case 25:
            field.setPSDataTypeId(TEXT);
            if (length > 0) {
                field.setLength(length);
            }
            break;
        case 26:
            field.setPSDataTypeId(GUID);
            if (length > 0) {
                field.setLength(length);
            }
            break;
        case 2:
        case 8:
        case 24:
            field.setPSDataTypeId(VARBINARY);
            if (length > 0) {
                field.setLength(length);
            }
            break;
        case 0:
        case 19:
            throw new Exception(String.format(
                    "\u65e0\u6cd5\u652f\u6301\u7684\u6570\u636e\u7c7b\u578b[%1$s]",
                    DataTypeUtils.getTypeName(standardDataType)));
        default:
            break;
        }
        field.setPSDataTypeName(getName(field.getPSDataTypeId()));
    }

    static {
        DATA_TYPE_NAME_MAP.put(ACID, "\u81ea\u589e\u6807\u8bc6\uff0c\u6574\u6570\u7c7b\u578b\uff0c\u7528\u6237\u4e0d\u53ef\u89c1");
        DATA_TYPE_NAME_MAP.put(BIGDECIMAL, "\u5927\u6570\u503c");
        DATA_TYPE_NAME_MAP.put(BIGINT, "\u5927\u6574\u578b");
        DATA_TYPE_NAME_MAP.put(CODELISTTEXT, "\u9009\u62e9\u9879\u6587\u672c");
        DATA_TYPE_NAME_MAP.put(CURRENCY, "\u8d27\u5e01");
        DATA_TYPE_NAME_MAP.put(CURRENCYUNIT, "\u8d27\u5e01\u5355\u4f4d");
        DATA_TYPE_NAME_MAP.put(DATE, "\u65e5\u671f\u578b");
        DATA_TYPE_NAME_MAP.put(DATETIME, "\u65e5\u671f\u65f6\u95f4\u578b");
        DATA_TYPE_NAME_MAP.put(DATETIME_BIRTHDAY, "\u51fa\u751f\u65e5\u671f");
        DATA_TYPE_NAME_MAP.put(DECIMAL, "\u6570\u503c");
        DATA_TYPE_NAME_MAP.put(FLOAT, "\u6d6e\u70b9");
        DATA_TYPE_NAME_MAP.put(GUID, "\u5168\u5c40\u552f\u4e00\u6807\u8bc6\uff0c\u6587\u672c\u7c7b\u578b\uff0c\u7528\u6237\u4e0d\u53ef\u89c1");
        DATA_TYPE_NAME_MAP.put(HTMLTEXT, "HTML\u6587\u672c\uff0c\u6ca1\u6709\u957f\u5ea6\u9650\u5236");
        DATA_TYPE_NAME_MAP.put(INHERIT, "\u7ee7\u627f\u5c5e\u6027");
        DATA_TYPE_NAME_MAP.put(INT, "\u6574\u578b");
        DATA_TYPE_NAME_MAP.put(LONGTEXT, "\u957f\u6587\u672c\uff0c\u6ca1\u6709\u957f\u5ea6\u9650\u5236");
        DATA_TYPE_NAME_MAP.put(LONGTEXT_1000, "\u957f\u6587\u672c\uff0c\u957f\u5ea61000");
        DATA_TYPE_NAME_MAP.put(NBID, "\u6570\u5b57\u4e32\u4e1a\u52a1\u6807\u8bc6\uff0c\u6570\u5b57\u7c7b\u578b\uff0c\u7528\u6237\u53ef\u89c1");
        DATA_TYPE_NAME_MAP.put(NMCODELIST, "\u591a\u9879\u9009\u62e9(\u6570\u503c)");
        DATA_TYPE_NAME_MAP.put(NSCODELIST, "\u5355\u9879\u9009\u62e9(\u6570\u503c)");
        DATA_TYPE_NAME_MAP.put(ONE2MANYDATA, "\u4e00\u5bf9\u591a\u5173\u7cfb\u6570\u636e\u96c6\u5408");
        DATA_TYPE_NAME_MAP.put(PICKUP, "\u5916\u952e\u503c");
        DATA_TYPE_NAME_MAP.put(PICKUPDATA, "\u5916\u952e\u503c\u9644\u52a0\u6570\u636e");
        DATA_TYPE_NAME_MAP.put(PICKUPOBJECT, "\u5916\u952e\u503c\u5bf9\u8c61");
        DATA_TYPE_NAME_MAP.put(PICKUPTEXT, "\u5916\u952e\u503c\u6587\u672c");
        DATA_TYPE_NAME_MAP.put(SBID, "\u5b57\u7b26\u4e32\u4e1a\u52a1\u6807\u8bc6\uff0c\u6587\u672c\u7c7b\u578b\uff0c\u7528\u6237\u53ef\u89c1");
        DATA_TYPE_NAME_MAP.put(SMCODELIST, "\u591a\u9879\u9009\u62e9(\u6587\u672c\u503c)");
        DATA_TYPE_NAME_MAP.put(SSCODELIST, "\u5355\u9879\u9009\u62e9(\u6587\u672c\u503c)");
        DATA_TYPE_NAME_MAP.put(TEXT, "\u6587\u672c\uff0c\u53ef\u6307\u5b9a\u957f\u5ea6");
        DATA_TYPE_NAME_MAP.put(TEXT_EMAIL, "\u7535\u5b50\u90ae\u4ef6");
        DATA_TYPE_NAME_MAP.put(TIME, "\u65f6\u95f4\u578b");
        DATA_TYPE_NAME_MAP.put(TRUEFALSE, "\u771f\u5047\u903b\u8f91");
        DATA_TYPE_NAME_MAP.put(VARBINARY, "\u4e8c\u8fdb\u5236\u6d41\uff0c\u6ca1\u6709\u957f\u5ea6\u9650\u5236");
        DATA_TYPE_NAME_MAP.put(WFSTATE, "\u5de5\u4f5c\u6d41\u5904\u7406\u72b6\u6001");
        DATA_TYPE_NAME_MAP.put(YESNO, "\u662f\u5426\u903b\u8f91");

        DATA_TYPE_STD_MAP.put(ACID, 1);
        DATA_TYPE_STD_MAP.put(BIGDECIMAL, 6);
        DATA_TYPE_STD_MAP.put(BIGINT, 1);
        DATA_TYPE_STD_MAP.put(CODELISTTEXT, 25);
        DATA_TYPE_STD_MAP.put(CURRENCY, 25);
        DATA_TYPE_STD_MAP.put(CURRENCYUNIT, 25);
        DATA_TYPE_STD_MAP.put(DATE, 5);
        DATA_TYPE_STD_MAP.put(DATETIME, 5);
        DATA_TYPE_STD_MAP.put(DATETIME_BIRTHDAY, 5);
        DATA_TYPE_STD_MAP.put(DECIMAL, 6);
        DATA_TYPE_STD_MAP.put(FLOAT, 7);
        DATA_TYPE_STD_MAP.put(GUID, 25);
        DATA_TYPE_STD_MAP.put(HTMLTEXT, 21);
        DATA_TYPE_STD_MAP.put(INT, 9);
        DATA_TYPE_STD_MAP.put(LONGTEXT, 21);
        DATA_TYPE_STD_MAP.put(LONGTEXT_1000, 25);
        DATA_TYPE_STD_MAP.put(NBID, 9);
        DATA_TYPE_STD_MAP.put(NMCODELIST, 9);
        DATA_TYPE_STD_MAP.put(NSCODELIST, 9);
        DATA_TYPE_STD_MAP.put(ONE2MANYDATA, 21);
        DATA_TYPE_STD_MAP.put(PICKUPOBJECT, 21);
        DATA_TYPE_STD_MAP.put(SBID, 25);
        DATA_TYPE_STD_MAP.put(SMCODELIST, 25);
        DATA_TYPE_STD_MAP.put(SSCODELIST, 25);
        DATA_TYPE_STD_MAP.put(TEXT, 25);
        DATA_TYPE_STD_MAP.put(TEXT_EMAIL, 25);
        DATA_TYPE_STD_MAP.put(TIME, 5);
        DATA_TYPE_STD_MAP.put(TRUEFALSE, 9);
        DATA_TYPE_STD_MAP.put(WFSTATE, 9);
        DATA_TYPE_STD_MAP.put(YESNO, 9);
    }
}