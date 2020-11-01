//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.31 at 07:07:04 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContinuousMovementCommand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContinuousMovementCommand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="move"/>
 *     &lt;enumeration value="strafe"/>
 *     &lt;enumeration value="pitch"/>
 *     &lt;enumeration value="turn"/>
 *     &lt;enumeration value="jump"/>
 *     &lt;enumeration value="crouch"/>
 *     &lt;enumeration value="attack"/>
 *     &lt;enumeration value="use"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContinuousMovementCommand")
@XmlEnum
public enum ContinuousMovementCommand {

    @XmlEnumValue("move")
    MOVE("move"),
    @XmlEnumValue("strafe")
    STRAFE("strafe"),
    @XmlEnumValue("pitch")
    PITCH("pitch"),
    @XmlEnumValue("turn")
    TURN("turn"),
    @XmlEnumValue("jump")
    JUMP("jump"),
    @XmlEnumValue("crouch")
    CROUCH("crouch"),
    @XmlEnumValue("attack")
    ATTACK("attack"),
    @XmlEnumValue("use")
    USE("use");
    private final String value;

    ContinuousMovementCommand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContinuousMovementCommand fromValue(String v) {
        for (ContinuousMovementCommand c: ContinuousMovementCommand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
