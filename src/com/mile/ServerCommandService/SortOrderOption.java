
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrderOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrderOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Header"/>
 *     &lt;enumeration value="Description"/>
 *     &lt;enumeration value="StartTime"/>
 *     &lt;enumeration value="TagTime"/>
 *     &lt;enumeration value="EndTime"/>
 *     &lt;enumeration value="CreateTime"/>
 *     &lt;enumeration value="RetentionExpireTime"/>
 *     &lt;enumeration value="UserName"/>
 *     &lt;enumeration value="Size"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortOrderOption")
@XmlEnum
public enum SortOrderOption {

    @XmlEnumValue("Header")
    HEADER("Header"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description"),
    @XmlEnumValue("StartTime")
    START_TIME("StartTime"),
    @XmlEnumValue("TagTime")
    TAG_TIME("TagTime"),
    @XmlEnumValue("EndTime")
    END_TIME("EndTime"),
    @XmlEnumValue("CreateTime")
    CREATE_TIME("CreateTime"),
    @XmlEnumValue("RetentionExpireTime")
    RETENTION_EXPIRE_TIME("RetentionExpireTime"),
    @XmlEnumValue("UserName")
    USER_NAME("UserName"),
    @XmlEnumValue("Size")
    SIZE("Size");
    private final String value;

    SortOrderOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrderOption fromValue(String v) {
        for (SortOrderOption c: SortOrderOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
