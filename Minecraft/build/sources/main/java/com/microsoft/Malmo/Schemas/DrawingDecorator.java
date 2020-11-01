//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.31 at 07:07:04 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ProjectMalmo.microsoft.com}DrawObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "drawObjectType"
})
@XmlRootElement(name = "DrawingDecorator")
public class DrawingDecorator {

    @XmlElementRef(name = "DrawObjectType", namespace = "http://ProjectMalmo.microsoft.com", type = JAXBElement.class)
    protected List<JAXBElement<? extends DrawObjectType>> drawObjectType;

    /**
     * Gets the value of the drawObjectType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drawObjectType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrawObjectType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DrawItem }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawSphere }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawBlock }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawLine }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawSign }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawCuboid }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawEntity }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawContainer }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends DrawObjectType>> getDrawObjectType() {
        if (drawObjectType == null) {
            drawObjectType = new ArrayList<JAXBElement<? extends DrawObjectType>>();
        }
        return this.drawObjectType;
    }

}
