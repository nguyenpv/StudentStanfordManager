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
 *         &lt;element name="image">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="display_location">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="full" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="state_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country_iso3166" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="magic" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="wmo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="elevation" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observation_location">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="full" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="country_iso3166" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="elevation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="estimated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="station_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observation_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observation_time_rfc822" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observation_epoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="local_time_rfc822" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="local_epoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="local_tz_short" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="local_tz_long" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="local_tz_offset" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="weather" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temperature_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temp_f" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="temp_c" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="relative_humidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_degrees" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="wind_mph" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="wind_gust_mph" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="wind_kph" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="wind_gust_kph" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="pressure_mb" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="pressure_in" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="pressure_trend" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="dewpoint_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dewpoint_f" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="dewpoint_c" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="heat_index_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="heat_index_f" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="heat_index_c" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="windchill_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="windchill_f" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="windchill_c" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feelslike_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feelslike_f" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="feelslike_c" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="visibility_mi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visibility_km" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="solarradiation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UV" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="precip_1hr_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="precip_1hr_in" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="precip_1hr_metric" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="precip_today_string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="precip_today_in" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="precip_today_metric" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="icon_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="forecast_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="history_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="ob_url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
    "image",
    "displayLocation",
    "observationLocation",
    "estimated",
    "stationId",
    "observationTime",
    "observationTimeRfc822",
    "observationEpoch",
    "localTimeRfc822",
    "localEpoch",
    "localTzShort",
    "localTzLong",
    "localTzOffset",
    "weather",
    "temperatureString",
    "tempF",
    "tempC",
    "relativeHumidity",
    "windString",
    "windDir",
    "windDegrees",
    "windMph",
    "windGustMph",
    "windKph",
    "windGustKph",
    "pressureMb",
    "pressureIn",
    "pressureTrend",
    "dewpointString",
    "dewpointF",
    "dewpointC",
    "heatIndexString",
    "heatIndexF",
    "heatIndexC",
    "windchillString",
    "windchillF",
    "windchillC",
    "feelslikeString",
    "feelslikeF",
    "feelslikeC",
    "visibilityMi",
    "visibilityKm",
    "solarradiation",
    "uv",
    "precip1HrString",
    "precip1HrIn",
    "precip1HrMetric",
    "precipTodayString",
    "precipTodayIn",
    "precipTodayMetric",
    "icon",
    "iconUrl",
    "forecastUrl",
    "historyUrl",
    "obUrl"
})
public class CurrentObservation {

    @XmlElement(required = true)
    protected Image image;
    @XmlElement(name = "display_location", required = true)
    protected DisplayLocation displayLocation;
    @XmlElement(name = "observation_location", required = true)
    protected ObservationLocation observationLocation;
    @XmlElement(required = true)
    protected String estimated;
    @XmlElement(name = "station_id", required = true)
    protected String stationId;
    @XmlElement(name = "observation_time", required = true)
    protected String observationTime;
    @XmlElement(name = "observation_time_rfc822", required = true)
    protected String observationTimeRfc822;
    @XmlElement(name = "observation_epoch")
    protected int observationEpoch;
    @XmlElement(name = "local_time_rfc822", required = true)
    protected String localTimeRfc822;
    @XmlElement(name = "local_epoch")
    protected int localEpoch;
    @XmlElement(name = "local_tz_short", required = true)
    protected String localTzShort;
    @XmlElement(name = "local_tz_long", required = true)
    protected String localTzLong;
    @XmlElement(name = "local_tz_offset")
    protected short localTzOffset;
    @XmlElement(required = true)
    protected String weather;
    @XmlElement(name = "temperature_string", required = true)
    protected String temperatureString;
    @XmlElement(name = "temp_f")
    protected byte tempF;
    @XmlElement(name = "temp_c")
    protected byte tempC;
    @XmlElement(name = "relative_humidity", required = true)
    protected String relativeHumidity;
    @XmlElement(name = "wind_string", required = true)
    protected String windString;
    @XmlElement(name = "wind_dir", required = true)
    protected String windDir;
    @XmlElement(name = "wind_degrees")
    protected short windDegrees;
    @XmlElement(name = "wind_mph")
    protected byte windMph;
    @XmlElement(name = "wind_gust_mph")
    protected byte windGustMph;
    @XmlElement(name = "wind_kph")
    protected byte windKph;
    @XmlElement(name = "wind_gust_kph")
    protected byte windGustKph;
    @XmlElement(name = "pressure_mb")
    protected short pressureMb;
    @XmlElement(name = "pressure_in")
    protected float pressureIn;
    @XmlElement(name = "pressure_trend")
    protected byte pressureTrend;
    @XmlElement(name = "dewpoint_string", required = true)
    protected String dewpointString;
    @XmlElement(name = "dewpoint_f")
    protected byte dewpointF;
    @XmlElement(name = "dewpoint_c")
    protected byte dewpointC;
    @XmlElement(name = "heat_index_string", required = true)
    protected String heatIndexString;
    @XmlElement(name = "heat_index_f")
    protected byte heatIndexF;
    @XmlElement(name = "heat_index_c")
    protected byte heatIndexC;
    @XmlElement(name = "windchill_string", required = true)
    protected String windchillString;
    @XmlElement(name = "windchill_f", required = true)
    protected String windchillF;
    @XmlElement(name = "windchill_c", required = true)
    protected String windchillC;
    @XmlElement(name = "feelslike_string", required = true)
    protected String feelslikeString;
    @XmlElement(name = "feelslike_f")
    protected byte feelslikeF;
    @XmlElement(name = "feelslike_c")
    protected byte feelslikeC;
    @XmlElement(name = "visibility_mi", required = true)
    protected String visibilityMi;
    @XmlElement(name = "visibility_km", required = true)
    protected String visibilityKm;
    @XmlElement(required = true)
    protected String solarradiation;
    @XmlElement(name = "UV")
    protected byte uv;
    @XmlElement(name = "precip_1hr_string", required = true)
    protected String precip1HrString;
    @XmlElement(name = "precip_1hr_in")
    protected float precip1HrIn;
    @XmlElement(name = "precip_1hr_metric")
    protected float precip1HrMetric;
    @XmlElement(name = "precip_today_string", required = true)
    protected String precipTodayString;
    @XmlElement(name = "precip_today_in")
    protected float precipTodayIn;
    @XmlElement(name = "precip_today_metric")
    protected float precipTodayMetric;
    @XmlElement(required = true)
    protected String icon;
    @XmlElement(name = "icon_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String iconUrl;
    @XmlElement(name = "forecast_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String forecastUrl;
    @XmlElement(name = "history_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String historyUrl;
    @XmlElement(name = "ob_url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String obUrl;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the displayLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayLocation }
     *     
     */
    public DisplayLocation getDisplayLocation() {
        return displayLocation;
    }

    /**
     * Sets the value of the displayLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayLocation }
     *     
     */
    public void setDisplayLocation(DisplayLocation value) {
        this.displayLocation = value;
    }

    /**
     * Gets the value of the observationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationLocation }
     *     
     */
    public ObservationLocation getObservationLocation() {
        return observationLocation;
    }

    /**
     * Sets the value of the observationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationLocation }
     *     
     */
    public void setObservationLocation(ObservationLocation value) {
        this.observationLocation = value;
    }

    /**
     * Gets the value of the estimated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimated() {
        return estimated;
    }

    /**
     * Sets the value of the estimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimated(String value) {
        this.estimated = value;
    }

    /**
     * Gets the value of the stationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * Sets the value of the stationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationId(String value) {
        this.stationId = value;
    }

    /**
     * Gets the value of the observationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationTime() {
        return observationTime;
    }

    /**
     * Sets the value of the observationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationTime(String value) {
        this.observationTime = value;
    }

    /**
     * Gets the value of the observationTimeRfc822 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    /**
     * Sets the value of the observationTimeRfc822 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationTimeRfc822(String value) {
        this.observationTimeRfc822 = value;
    }

    /**
     * Gets the value of the observationEpoch property.
     * 
     */
    public int getObservationEpoch() {
        return observationEpoch;
    }

    /**
     * Sets the value of the observationEpoch property.
     * 
     */
    public void setObservationEpoch(int value) {
        this.observationEpoch = value;
    }

    /**
     * Gets the value of the localTimeRfc822 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    /**
     * Sets the value of the localTimeRfc822 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTimeRfc822(String value) {
        this.localTimeRfc822 = value;
    }

    /**
     * Gets the value of the localEpoch property.
     * 
     */
    public int getLocalEpoch() {
        return localEpoch;
    }

    /**
     * Sets the value of the localEpoch property.
     * 
     */
    public void setLocalEpoch(int value) {
        this.localEpoch = value;
    }

    /**
     * Gets the value of the localTzShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTzShort() {
        return localTzShort;
    }

    /**
     * Sets the value of the localTzShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTzShort(String value) {
        this.localTzShort = value;
    }

    /**
     * Gets the value of the localTzLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTzLong() {
        return localTzLong;
    }

    /**
     * Sets the value of the localTzLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTzLong(String value) {
        this.localTzLong = value;
    }

    /**
     * Gets the value of the localTzOffset property.
     * 
     */
    public short getLocalTzOffset() {
        return localTzOffset;
    }

    /**
     * Sets the value of the localTzOffset property.
     * 
     */
    public void setLocalTzOffset(short value) {
        this.localTzOffset = value;
    }

    /**
     * Gets the value of the weather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather() {
        return weather;
    }

    /**
     * Sets the value of the weather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather(String value) {
        this.weather = value;
    }

    /**
     * Gets the value of the temperatureString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureString() {
        return temperatureString;
    }

    /**
     * Sets the value of the temperatureString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureString(String value) {
        this.temperatureString = value;
    }

    /**
     * Gets the value of the tempF property.
     * 
     */
    public byte getTempF() {
        return tempF;
    }

    /**
     * Sets the value of the tempF property.
     * 
     */
    public void setTempF(byte value) {
        this.tempF = value;
    }

    /**
     * Gets the value of the tempC property.
     * 
     */
    public byte getTempC() {
        return tempC;
    }

    /**
     * Sets the value of the tempC property.
     * 
     */
    public void setTempC(byte value) {
        this.tempC = value;
    }

    /**
     * Gets the value of the relativeHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Sets the value of the relativeHumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeHumidity(String value) {
        this.relativeHumidity = value;
    }

    /**
     * Gets the value of the windString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindString() {
        return windString;
    }

    /**
     * Sets the value of the windString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindString(String value) {
        this.windString = value;
    }

    /**
     * Gets the value of the windDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindDir() {
        return windDir;
    }

    /**
     * Sets the value of the windDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindDir(String value) {
        this.windDir = value;
    }

    /**
     * Gets the value of the windDegrees property.
     * 
     */
    public short getWindDegrees() {
        return windDegrees;
    }

    /**
     * Sets the value of the windDegrees property.
     * 
     */
    public void setWindDegrees(short value) {
        this.windDegrees = value;
    }

    /**
     * Gets the value of the windMph property.
     * 
     */
    public byte getWindMph() {
        return windMph;
    }

    /**
     * Sets the value of the windMph property.
     * 
     */
    public void setWindMph(byte value) {
        this.windMph = value;
    }

    /**
     * Gets the value of the windGustMph property.
     * 
     */
    public byte getWindGustMph() {
        return windGustMph;
    }

    /**
     * Sets the value of the windGustMph property.
     * 
     */
    public void setWindGustMph(byte value) {
        this.windGustMph = value;
    }

    /**
     * Gets the value of the windKph property.
     * 
     */
    public byte getWindKph() {
        return windKph;
    }

    /**
     * Sets the value of the windKph property.
     * 
     */
    public void setWindKph(byte value) {
        this.windKph = value;
    }

    /**
     * Gets the value of the windGustKph property.
     * 
     */
    public byte getWindGustKph() {
        return windGustKph;
    }

    /**
     * Sets the value of the windGustKph property.
     * 
     */
    public void setWindGustKph(byte value) {
        this.windGustKph = value;
    }

    /**
     * Gets the value of the pressureMb property.
     * 
     */
    public short getPressureMb() {
        return pressureMb;
    }

    /**
     * Sets the value of the pressureMb property.
     * 
     */
    public void setPressureMb(short value) {
        this.pressureMb = value;
    }

    /**
     * Gets the value of the pressureIn property.
     * 
     */
    public float getPressureIn() {
        return pressureIn;
    }

    /**
     * Sets the value of the pressureIn property.
     * 
     */
    public void setPressureIn(float value) {
        this.pressureIn = value;
    }

    /**
     * Gets the value of the pressureTrend property.
     * 
     */
    public byte getPressureTrend() {
        return pressureTrend;
    }

    /**
     * Sets the value of the pressureTrend property.
     * 
     */
    public void setPressureTrend(byte value) {
        this.pressureTrend = value;
    }

    /**
     * Gets the value of the dewpointString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDewpointString() {
        return dewpointString;
    }

    /**
     * Sets the value of the dewpointString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDewpointString(String value) {
        this.dewpointString = value;
    }

    /**
     * Gets the value of the dewpointF property.
     * 
     */
    public byte getDewpointF() {
        return dewpointF;
    }

    /**
     * Sets the value of the dewpointF property.
     * 
     */
    public void setDewpointF(byte value) {
        this.dewpointF = value;
    }

    /**
     * Gets the value of the dewpointC property.
     * 
     */
    public byte getDewpointC() {
        return dewpointC;
    }

    /**
     * Sets the value of the dewpointC property.
     * 
     */
    public void setDewpointC(byte value) {
        this.dewpointC = value;
    }

    /**
     * Gets the value of the heatIndexString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatIndexString() {
        return heatIndexString;
    }

    /**
     * Sets the value of the heatIndexString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatIndexString(String value) {
        this.heatIndexString = value;
    }

    /**
     * Gets the value of the heatIndexF property.
     * 
     */
    public byte getHeatIndexF() {
        return heatIndexF;
    }

    /**
     * Sets the value of the heatIndexF property.
     * 
     */
    public void setHeatIndexF(byte value) {
        this.heatIndexF = value;
    }

    /**
     * Gets the value of the heatIndexC property.
     * 
     */
    public byte getHeatIndexC() {
        return heatIndexC;
    }

    /**
     * Sets the value of the heatIndexC property.
     * 
     */
    public void setHeatIndexC(byte value) {
        this.heatIndexC = value;
    }

    /**
     * Gets the value of the windchillString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindchillString() {
        return windchillString;
    }

    /**
     * Sets the value of the windchillString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindchillString(String value) {
        this.windchillString = value;
    }

    /**
     * Gets the value of the windchillF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindchillF() {
        return windchillF;
    }

    /**
     * Sets the value of the windchillF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindchillF(String value) {
        this.windchillF = value;
    }

    /**
     * Gets the value of the windchillC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindchillC() {
        return windchillC;
    }

    /**
     * Sets the value of the windchillC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindchillC(String value) {
        this.windchillC = value;
    }

    /**
     * Gets the value of the feelslikeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeelslikeString() {
        return feelslikeString;
    }

    /**
     * Sets the value of the feelslikeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeelslikeString(String value) {
        this.feelslikeString = value;
    }

    /**
     * Gets the value of the feelslikeF property.
     * 
     */
    public byte getFeelslikeF() {
        return feelslikeF;
    }

    /**
     * Sets the value of the feelslikeF property.
     * 
     */
    public void setFeelslikeF(byte value) {
        this.feelslikeF = value;
    }

    /**
     * Gets the value of the feelslikeC property.
     * 
     */
    public byte getFeelslikeC() {
        return feelslikeC;
    }

    /**
     * Sets the value of the feelslikeC property.
     * 
     */
    public void setFeelslikeC(byte value) {
        this.feelslikeC = value;
    }

    /**
     * Gets the value of the visibilityMi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityMi() {
        return visibilityMi;
    }

    /**
     * Sets the value of the visibilityMi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityMi(String value) {
        this.visibilityMi = value;
    }

    /**
     * Gets the value of the visibilityKm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilityKm() {
        return visibilityKm;
    }

    /**
     * Sets the value of the visibilityKm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilityKm(String value) {
        this.visibilityKm = value;
    }

    /**
     * Gets the value of the solarradiation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolarradiation() {
        return solarradiation;
    }

    /**
     * Sets the value of the solarradiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolarradiation(String value) {
        this.solarradiation = value;
    }

    /**
     * Gets the value of the uv property.
     * 
     */
    public byte getUV() {
        return uv;
    }

    /**
     * Sets the value of the uv property.
     * 
     */
    public void setUV(byte value) {
        this.uv = value;
    }

    /**
     * Gets the value of the precip1HrString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecip1HrString() {
        return precip1HrString;
    }

    /**
     * Sets the value of the precip1HrString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecip1HrString(String value) {
        this.precip1HrString = value;
    }

    /**
     * Gets the value of the precip1HrIn property.
     * 
     */
    public float getPrecip1HrIn() {
        return precip1HrIn;
    }

    /**
     * Sets the value of the precip1HrIn property.
     * 
     */
    public void setPrecip1HrIn(float value) {
        this.precip1HrIn = value;
    }

    /**
     * Gets the value of the precip1HrMetric property.
     * 
     */
    public float getPrecip1HrMetric() {
        return precip1HrMetric;
    }

    /**
     * Sets the value of the precip1HrMetric property.
     * 
     */
    public void setPrecip1HrMetric(float value) {
        this.precip1HrMetric = value;
    }

    /**
     * Gets the value of the precipTodayString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecipTodayString() {
        return precipTodayString;
    }

    /**
     * Sets the value of the precipTodayString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecipTodayString(String value) {
        this.precipTodayString = value;
    }

    /**
     * Gets the value of the precipTodayIn property.
     * 
     */
    public float getPrecipTodayIn() {
        return precipTodayIn;
    }

    /**
     * Sets the value of the precipTodayIn property.
     * 
     */
    public void setPrecipTodayIn(float value) {
        this.precipTodayIn = value;
    }

    /**
     * Gets the value of the precipTodayMetric property.
     * 
     */
    public float getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    /**
     * Sets the value of the precipTodayMetric property.
     * 
     */
    public void setPrecipTodayMetric(float value) {
        this.precipTodayMetric = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the iconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the value of the iconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrl(String value) {
        this.iconUrl = value;
    }

    /**
     * Gets the value of the forecastUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastUrl() {
        return forecastUrl;
    }

    /**
     * Sets the value of the forecastUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastUrl(String value) {
        this.forecastUrl = value;
    }

    /**
     * Gets the value of the historyUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryUrl() {
        return historyUrl;
    }

    /**
     * Sets the value of the historyUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryUrl(String value) {
        this.historyUrl = value;
    }

    /**
     * Gets the value of the obUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObUrl() {
        return obUrl;
    }

    /**
     * Sets the value of the obUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObUrl(String value) {
        this.obUrl = value;
    }

}
