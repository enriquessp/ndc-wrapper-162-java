
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Core Priced Flight Offer definition.
 * 
 * <p>Java class for PricedFlightOfferCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedFlightOfferCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferPrice"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferPriceLeadType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}FareDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="LeadPricedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LeadPricingIncInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedFlightOfferCoreType", propOrder = {
    "offerPrice",
    "fareDetail"
})
@XmlSeeAlso({
    AltPricedFlightOfferType.class
})
public class PricedFlightOfferCoreType {

    @XmlElement(name = "OfferPrice", required = true)
    protected PricedFlightOfferCoreType.OfferPrice offerPrice;
    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;
    @XmlAttribute(name = "LeadPricedInd")
    protected Boolean leadPricedInd;
    @XmlAttribute(name = "LeadPricingIncInd")
    protected Boolean leadPricingIncInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the offerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PricedFlightOfferCoreType.OfferPrice }
     *     
     */
    public PricedFlightOfferCoreType.OfferPrice getOfferPrice() {
        return offerPrice;
    }

    /**
     * Sets the value of the offerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedFlightOfferCoreType.OfferPrice }
     *     
     */
    public void setOfferPrice(PricedFlightOfferCoreType.OfferPrice value) {
        this.offerPrice = value;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

    /**
     * Gets the value of the leadPricedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadPricedInd() {
        return leadPricedInd;
    }

    /**
     * Sets the value of the leadPricedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadPricedInd(Boolean value) {
        this.leadPricedInd = value;
    }

    /**
     * Gets the value of the leadPricingIncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadPricingIncInd() {
        return leadPricingIncInd;
    }

    /**
     * Sets the value of the leadPricingIncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadPricingIncInd(Boolean value) {
        this.leadPricingIncInd = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}OfferPriceLeadType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OfferPrice
        extends OfferPriceLeadType
    {


    }

}