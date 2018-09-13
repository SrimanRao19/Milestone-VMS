
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaDeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaDeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Camera"/>
 *     &lt;enumeration value="Microphone"/>
 *     &lt;enumeration value="Speaker"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediaDeviceType")
@XmlEnum
public enum MediaDeviceType {

    @XmlEnumValue("Camera")
    CAMERA("Camera"),
    @XmlEnumValue("Microphone")
    MICROPHONE("Microphone"),
    @XmlEnumValue("Speaker")
    SPEAKER("Speaker");
    private final String value;

    MediaDeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaDeviceType fromValue(String v) {
        for (MediaDeviceType c: MediaDeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
