
package com.mile.RecorderCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartSearchStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmartSearchStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UnspecifiedError"/>
 *     &lt;enumeration value="SearchInProgress"/>
 *     &lt;enumeration value="SearchResultReady"/>
 *     &lt;enumeration value="SearchEndTimeReached"/>
 *     &lt;enumeration value="SearchCancelled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmartSearchStatusType")
@XmlEnum
public enum SmartSearchStatusType {

    @XmlEnumValue("UnspecifiedError")
    UNSPECIFIED_ERROR("UnspecifiedError"),
    @XmlEnumValue("SearchInProgress")
    SEARCH_IN_PROGRESS("SearchInProgress"),
    @XmlEnumValue("SearchResultReady")
    SEARCH_RESULT_READY("SearchResultReady"),
    @XmlEnumValue("SearchEndTimeReached")
    SEARCH_END_TIME_REACHED("SearchEndTimeReached"),
    @XmlEnumValue("SearchCancelled")
    SEARCH_CANCELLED("SearchCancelled");
    private final String value;

    SmartSearchStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmartSearchStatusType fromValue(String v) {
        for (SmartSearchStatusType c: SmartSearchStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
