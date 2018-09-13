
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetCustomSettingResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetCustomSettingResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UnspecifiedError"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="ModifiedError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetCustomSettingResultType")
@XmlEnum
public enum SetCustomSettingResultType {

    @XmlEnumValue("UnspecifiedError")
    UNSPECIFIED_ERROR("UnspecifiedError"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("ModifiedError")
    MODIFIED_ERROR("ModifiedError");
    private final String value;

    SetCustomSettingResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetCustomSettingResultType fromValue(String v) {
        for (SetCustomSettingResultType c: SetCustomSettingResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
