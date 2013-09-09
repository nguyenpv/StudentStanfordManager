//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.13 at 09:41:37 PM PDT 
//


package com.vietnamarena.xml.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_iso3166" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tz_short" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tz_long" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="magic" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="wmo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="l" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requesturl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wuiurl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="nearby_weather_stations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airport">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="station">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="icao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="pws" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "type",
    "country",
    "countryIso3166",
    "countryName",
    "state",
    "city",
    "tzShort",
    "tzLong",
    "lat",
    "lon",
    "zip",
    "magic",
    "wmo",
    "l",
    "requesturl",
    "wuiurl",
    "nearbyWeatherStations"
})
public class Location {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(name = "country_iso3166", required = true)
    protected String countryIso3166;
    @XmlElement(name = "country_name", required = true)
    protected String countryName;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(name = "tz_short", required = true)
    protected String tzShort;
    @XmlElement(name = "tz_long", required = true)
    protected String tzLong;
    protected float lat;
    protected float lon;
    protected byte zip;
    protected byte magic;
    protected int wmo;
    @XmlElement(required = true)
    protected String l;
    @XmlElement(required = true)
    protected String requesturl;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String wuiurl;
    @XmlElement(name = "nearby_weather_stations", required = true)
    protected NearbyWeatherStations nearbyWeatherStations;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryIso3166 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIso3166() {
        return countryIso3166;
    }

    /**
     * Sets the value of the countryIso3166 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIso3166(String value) {
        this.countryIso3166 = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the tzShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzShort() {
        return tzShort;
    }

    /**
     * Sets the value of the tzShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzShort(String value) {
        this.tzShort = value;
    }

    /**
     * Gets the value of the tzLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzLong() {
        return tzLong;
    }

    /**
     * Sets the value of the tzLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzLong(String value) {
        this.tzLong = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     */
    public float getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     */
    public void setLat(float value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     */
    public float getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     */
    public void setLon(float value) {
        this.lon = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     */
    public byte getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     */
    public void setZip(byte value) {
        this.zip = value;
    }

    /**
     * Gets the value of the magic property.
     * 
     */
    public byte getMagic() {
        return magic;
    }

    /**
     * Sets the value of the magic property.
     * 
     */
    public void setMagic(byte value) {
        this.magic = value;
    }

    /**
     * Gets the value of the wmo property.
     * 
     */
    public int getWmo() {
        return wmo;
    }

    /**
     * Sets the value of the wmo property.
     * 
     */
    public void setWmo(int value) {
        this.wmo = value;
    }

    /**
     * Gets the value of the l property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL(String value) {
        this.l = value;
    }

    /**
     * Gets the value of the requesturl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesturl() {
        return requesturl;
    }

    /**
     * Sets the value of the requesturl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesturl(String value) {
        this.requesturl = value;
    }

    /**
     * Gets the value of the wuiurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWuiurl() {
        return wuiurl;
    }

    /**
     * Sets the value of the wuiurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWuiurl(String value) {
        this.wuiurl = value;
    }

    /**
     * Gets the value of the nearbyWeatherStations property.
     * 
     * @return
     *     possible object is
     *     {@link NearbyWeatherStations }
     *     
     */
    public NearbyWeatherStations getNearbyWeatherStations() {
        return nearbyWeatherStations;
    }

    /**
     * Sets the value of the nearbyWeatherStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link NearbyWeatherStations }
     *     
     */
    public void setNearbyWeatherStations(NearbyWeatherStations value) {
        this.nearbyWeatherStations = value;
    }

}
