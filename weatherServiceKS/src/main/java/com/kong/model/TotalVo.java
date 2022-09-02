package com.kong.model;

import org.springframework.stereotype.Component;


@Component("totalVo")
public class TotalVo {
	public String country_id;
	public String city_name;
	public double lon;
	public double lat;
	public int city_id;
	public String daily_date;
	public String main_status;
	public double temp;
	public double temp_min;
	public double temp_max;
	public double feels_like;
	public int humidity;
	public double wind_speed;
	
	public TotalVo() {
		
	}

	
	
	
	public TotalVo(String country_id, String city_name, double lon, double lat, int city_id, String daily_date,
			String main_status, double temp, double temp_min, double temp_max, double feels_like, int humidity,
			double wind_speed) {
		super();
		this.country_id = country_id;
		this.city_name = city_name;
		this.lon = lon;
		this.lat = lat;
		this.city_id = city_id;
		this.daily_date = daily_date;
		this.main_status = main_status;
		this.temp = temp;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.feels_like = feels_like;
		this.humidity = humidity;
		this.wind_speed = wind_speed;
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

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getDaily_date() {
		return daily_date;
	}

	public void setDaily_date(String daily_date) {
		this.daily_date = daily_date;
	}

	public String getMain_status() {
		return main_status;
	}

	public void setMain_status(String main_status) {
		this.main_status = main_status;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}

	public double getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}

	public double getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(double feels_like) {
		this.feels_like = feels_like;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public double getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}

	
	
}
