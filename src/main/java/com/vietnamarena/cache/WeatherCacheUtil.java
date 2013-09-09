/**
 * 
 */
package com.vietnamarena.cache;

import com.vietnamarena.dto.WeatherInfo;
import com.vietnamarena.rest.client.WeatherClientService;
import com.vietnamarena.xml.entities.WeatherResponse;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * @author NguyenPV
 *
 */
public class WeatherCacheUtil {
	
	private CacheManager cacheManager;
	private static Cache cachedElements;
	
	public void initWeatherCache() {
		clearCache();
		if (cacheManager == null) {
			cacheManager = CacheManager.create("/WEB-INF/ehcache.xml");
		}
		cachedElements = cacheManager.getCache("weather");
		putWeatherInfo();
	}
	
	public void putWeatherInfo() {
		WeatherResponse response = WeatherClientService.getInstance().retrieveWeatherInfo();
		if (response != null) {
			cachedElements.put(new Element("hanoiWeather", response));
		}
	}
	
	public WeatherInfo getWeatherInfo() {
		if (cachedElements == null) {
			cachedElements = cacheManager.getCache("weather");
		}
		Element element = cachedElements.get("hanoiWeather");
		if (element == null) {
			putWeatherInfo();
		}
		element = cachedElements.get("hanoiWeather");
		WeatherResponse responseObj = (WeatherResponse) element.getObjectValue();
		byte zip = responseObj.getLocation().getZip();
		String zipcode = new Byte(zip).toString();
		String city = responseObj.getLocation().getCity();
		String country = responseObj.getLocation().getCountryIso3166();
		String temp = responseObj.getCurrentObservation().getTemperatureString();
		String windStr = responseObj.getCurrentObservation().getWindString();
		return new WeatherInfo(zipcode, country, city, temp, windStr);
	}
	
	public void clearCache() {
		if (cacheManager == null) {
			return;
		}
		cacheManager.clearAll();
	}
	
	/**
	 * @return the cachedElements
	 */
	public static Cache getCachedElements() {
		return cachedElements;
	}

	/**
	 * @return the cacheManager
	 */
	public CacheManager getCacheManager() {
		return cacheManager;
	}

	/**
	 * @param cacheManager the cacheManager to set
	 */
	public void setCacheManager(CacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}

}
