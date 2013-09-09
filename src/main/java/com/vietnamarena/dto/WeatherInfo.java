/**
 * 
 */
package com.vietnamarena.dto;

/**
 * @author NguyenPV
 *
 */
public class WeatherInfo {
	
	private String zipcode;
	private String country;
	private String city;
	private String temperatureC;
	private String windStr;
	
	public WeatherInfo() {
	}
	
	public WeatherInfo(String zipcode, String country, String city,
			String temperatureC, String windStr) {
		this.zipcode = zipcode;
		this.country = country;
		this.city = city;
		this.temperatureC = temperatureC;
		this.windStr = windStr;
	}
	
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the temperatureC
	 */
	public String getTemperatureC() {
		return temperatureC;
	}
	/**
	 * @param temperatureC the temperatureC to set
	 */
	public void setTemperatureC(String temperatureC) {
		this.temperatureC = temperatureC;
	}
	/**
	 * @return the windStr
	 */
	public String getWindStr() {
		return windStr;
	}
	/**
	 * @param windStr the windStr to set
	 */
	public void setWindStr(String windStr) {
		this.windStr = windStr;
	}

}
