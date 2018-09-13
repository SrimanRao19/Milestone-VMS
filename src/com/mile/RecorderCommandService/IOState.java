
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IOState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IOState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Activated"/>
 *     &lt;enumeration value="Deactivated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IOState")
@XmlEnum
public enum IOState {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Activated")
    ACTIVATED("Activated"),
    @XmlEnumValue("Deactivated")
    DEACTIVATED("Deactivated");
    private final String value;

    IOState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IOState fromValue(String v) {
        for (IOState c: IOState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
