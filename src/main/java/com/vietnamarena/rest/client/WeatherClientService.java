package com.vietnamarena.rest.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.vietnamarena.utils.SMConstants;
import com.vietnamarena.xml.entities.WeatherResponse;

public class WeatherClientService {
	
	private static WeatherClientService instance;
	
	private WeatherClientService() {
	}
	
	/**
	 * @return the instance
	 */
	public static WeatherClientService getInstance() {
		if (instance == null) {
			instance = new WeatherClientService();
		}
		return instance;
	}

	public WeatherResponse retrieveWeatherInfo() {
		try {

			URL url = new URL(SMConstants.GET_WEATHER_API_XML_URL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			// Create JAXBContext object
			JAXBContext jaxbContext = JAXBContext
					.newInstance(WeatherResponse.class);

			// create unmarshaller object from the JAXBContext obj
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			// create XML File object/InputStream object to be read and pass to
			// unmarshall
			InputStream is = conn.getInputStream();

			// unmarshall
			WeatherResponse responseObj = (WeatherResponse) unmarshaller
					.unmarshal(is);
			System.out.println("resp+ location:"
					+ responseObj.getLocation().getCity());
			is.close();
			return responseObj;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		getInstance().retrieveWeatherInfo();
	}
}
