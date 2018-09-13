
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewGroupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ViewGroupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ViewGroupType")
@XmlEnum
public enum ViewGroupType {

    @XmlEnumValue("Normal")
    NORMAL("Normal");
    private final String value;

    ViewGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewGroupType fromValue(String v) {
        for (ViewGroupType c: ViewGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
