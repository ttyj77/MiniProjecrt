package com.kong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.kong.model.CityListVo;
import com.kong.model.CountryListVo;
import com.kong.model.TotalVo;
import com.kong.model.WeatherInfoVo;

@Mapper
@Repository("countryDao")
public interface CountryDao {

	public List<CountryListVo> selectCountry()throws DataAccessException;
	public List<CityListVo> selectCity(String country_id)throws DataAccessException;
	public WeatherInfoVo selectWeatherInfo(int cityNo)throws DataAccessException;
	public List<TotalVo> joinAll(int city_id) throws DataAccessException;
}