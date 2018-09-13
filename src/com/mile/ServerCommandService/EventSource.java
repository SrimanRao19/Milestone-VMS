
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Device"/>
 *     &lt;enumeration value="External"/>
 *     &lt;enumeration value="Hardware"/>
 *     &lt;enumeration value="Recorder"/>
 *     &lt;enumeration value="Server"/>
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Timer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventSource")
@XmlEnum
public enum EventSource {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Device")
    DEVICE("Device"),
    @XmlEnumValue("External")
    EXTERNAL("External"),
    @XmlEnumValue("Hardware")
    HARDWARE("Hardware"),
    @XmlEnumValue("Recorder")
    RECORDER("Recorder"),
    @XmlEnumValue("Server")
    SERVER("Server"),
    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Timer")
    TIMER("Timer");
    private final String value;

    EventSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventSource fromValue(String v) {
        for (EventSource c: EventSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
