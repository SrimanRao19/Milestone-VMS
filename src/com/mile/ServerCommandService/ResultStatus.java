
package com.mile.ServerCommandService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="PartlySuccess"/>
 *     &lt;enumeration value="MarkedDataNotFound"/>
 *     &lt;enumeration value="FeatureNotLicensed"/>
 *     &lt;enumeration value="RecorderNotFound"/>
 *     &lt;enumeration value="ManagementServerUnavailable"/>
 *     &lt;enumeration value="Unauthorized"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultStatus")
@XmlEnum
public enum ResultStatus {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("PartlySuccess")
    PARTLY_SUCCESS("PartlySuccess"),
    @XmlEnumValue("MarkedDataNotFound")
    MARKED_DATA_NOT_FOUND("MarkedDataNotFound"),
    @XmlEnumValue("FeatureNotLicensed")
    FEATURE_NOT_LICENSED("FeatureNotLicensed"),
    @XmlEnumValue("RecorderNotFound")
    RECORDER_NOT_FOUND("RecorderNotFound"),
    @XmlEnumValue("ManagementServerUnavailable")
    MANAGEMENT_SERVER_UNAVAILABLE("ManagementServerUnavailable"),
    @XmlEnumValue("Unauthorized")
    UNAUTHORIZED("Unauthorized");
    private final String value;

    ResultStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultStatus fromValue(String v) {
        for (ResultStatus c: ResultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
