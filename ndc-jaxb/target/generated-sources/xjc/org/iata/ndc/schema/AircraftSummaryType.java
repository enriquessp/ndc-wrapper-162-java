
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AIRCRAFT SUMMARY representation.
 * 
 * <p>Java class for AircraftSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AircraftCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="AirlineEquipCode" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftSummaryType", propOrder = {
    "name",
    "airlineEquipCode"
})
public class AircraftSummaryType
    extends AircraftCoreType
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AirlineEquipCode")
    protected String airlineEquipCode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the airlineEquipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineEquipCode() {
        return airlineEquipCode;
    }

    /**
     * Sets the value of the airlineEquipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineEquipCode(String value) {
        this.airlineEquipCode = value;
    }

}