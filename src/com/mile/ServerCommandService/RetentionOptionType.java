
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetentionOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetentionOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unused"/>
 *     &lt;enumeration value="Days"/>
 *     &lt;enumeration value="Weeks"/>
 *     &lt;enumeration value="Months"/>
 *     &lt;enumeration value="Years"/>
 *     &lt;enumeration value="UserDefined"/>
 *     &lt;enumeration value="Indefinite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetentionOptionType")
@XmlEnum
public enum RetentionOptionType {

    @XmlEnumValue("Unused")
    UNUSED("Unused"),
    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Weeks")
    WEEKS("Weeks"),
    @XmlEnumValue("Months")
    MONTHS("Months"),
    @XmlEnumValue("Years")
    YEARS("Years"),
    @XmlEnumValue("UserDefined")
    USER_DEFINED("UserDefined"),
    @XmlEnumValue("Indefinite")
    INDEFINITE("Indefinite");
    private final String value;

    RetentionOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetentionOptionType fromValue(String v) {
        for (RetentionOptionType c: RetentionOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
