package com.kong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kong.dao.CountryDao;
import com.kong.model.CityListVo;
import com.kong.model.CountryListVo;
import com.kong.model.TotalVo;
import com.kong.model.WeatherInfoVo;

@Service("countryService")
@Transactional
public class CountryService {
	@Autowired
	private CountryDao countryDao;


	public CountryService(CountryDao countryDao) {
		this.countryDao = countryDao;
	}

	public List<CountryListVo> CountryList() {
		List<CountryListVo> countryList = countryDao.selectCountry();
		return countryList;
	}
	
	public List<CityListVo> selectCity(String country_id) {
		List<CityListVo> cityList = countryDao.selectCity(country_id);
		return cityList;
	}
	
	public List<TotalVo> selectWeather(int city_id) {
		List<TotalVo> weatherList = countryDao.joinAll(city_id);
		return weatherList;
	}
	
	
	public WeatherInfoVo WeatherList(int city_id) {
		WeatherInfoVo weather = countryDao.selectWeatherInfo(city_id);
		return weather;
	}	
	
}

