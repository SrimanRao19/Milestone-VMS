
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetViewGroupDataResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SetViewGroupDataResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UnspecifiedError"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="ReadOnlyError"/>
 *     &lt;enumeration value="ModifiedError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SetViewGroupDataResultType")
@XmlEnum
public enum SetViewGroupDataResultType {

    @XmlEnumValue("UnspecifiedError")
    UNSPECIFIED_ERROR("UnspecifiedError"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("ReadOnlyError")
    READ_ONLY_ERROR("ReadOnlyError"),
    @XmlEnumValue("ModifiedError")
    MODIFIED_ERROR("ModifiedError");
    private final String value;

    SetViewGroupDataResultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetViewGroupDataResultType fromValue(String v) {
        for (SetViewGroupDataResultType c: SetViewGroupDataResultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
