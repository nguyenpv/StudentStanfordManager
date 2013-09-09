/**
 * 
 */
package com.vietnamarena.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vietnamarena.cache.WeatherCacheUtil;
import com.vietnamarena.dto.WeatherInfo;

/**
 * @author NguyenPV
 *
 */
public class WeatherInfoAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6949653544673523284L;

	public String execute() {
		weatherInfo = weatherCacheUtil.getWeatherInfo();
		return SUCCESS;
	}
	
	
	/* **** GETTERS & SETTERS **** */
	/**
	 * @return the weatherCache
	 */
	public WeatherCacheUtil getWeatherCacheUtil() {
		return weatherCacheUtil;
	}

	/**
	 * @param weatherCache the weatherCache to set
	 */
	public void setWeatherCacheUtil(WeatherCacheUtil weatherCacheUtil) {
		this.weatherCacheUtil = weatherCacheUtil;
	}

	/**
	 * @return the weatherInfo
	 */
	public WeatherInfo getWeatherInfo() {
		return weatherInfo;
	}


	/**
	 * @param weatherInfo the weatherInfo to set
	 */
	public void setWeatherInfo(WeatherInfo weatherInfo) {
		this.weatherInfo = weatherInfo;
	}

	private WeatherCacheUtil weatherCacheUtil;
	private WeatherInfo weatherInfo;
}
