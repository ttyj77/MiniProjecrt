package com.kong.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CityListVo {

	public int city_id;
	public String country_id;
	public String city_name;
	public double lon;
	public double lat;
	
	
	public CityListVo() {
		
	}

	public CityListVo(int city_id, String country_id, String city_name, double lon, double lat) {
		this.city_id = city_id;
		this.country_id = country_id;
		this.city_name = city_name;
		this.lon = lon;
		this.lat = lat;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}
	
}
