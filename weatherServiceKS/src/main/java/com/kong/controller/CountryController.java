
package com.kong.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kong.model.CityListVo;
import com.kong.model.CountryListVo;
import com.kong.model.TotalVo;
import com.kong.model.WeatherInfoVo;
import com.kong.service.CountryService;

@Controller("countryController")

@RequestMapping("/country")

public class CountryController {
	@Autowired
	CountryService countryService;

	@Autowired
	CountryListVo countryListVo;
	
	@Autowired
	WeatherInfoVo weatherInfoVo;
	@Autowired
	CityListVo cityListVo;
	

	List<CountryListVo> countryList = new ArrayList<CountryListVo>();
	List<CityListVo> cityList = new ArrayList<CityListVo>();
	List<WeatherInfoVo> weatherList2 = new ArrayList<WeatherInfoVo>();
	List<TotalVo> weatherList = new ArrayList<TotalVo>();
	
	Logger logger = LoggerFactory.getLogger("com.kong.service.CountryController");
	
	@RequestMapping("/countryList")
	@ResponseBody
	public List<CountryListVo> selectCountry() {
		countryList = countryService.CountryList();
		logger.info("=============> getCountryList 메서드 진입");
		return countryList;
	}
	
	@RequestMapping("/cityList")
	@ResponseBody
	public List<CityListVo> selectCountry(@RequestParam(value = "country_id") String country_id) {
		cityList = countryService.selectCity(country_id);
		logger.info("=============> getCountryList 메서드 진입");
		return cityList;
	}
	
	
	
	@RequestMapping("/weatherList")
	@ResponseBody
	public List<TotalVo> selectCity(@RequestParam(value = "city_id") int city_id) {
		weatherList = countryService.selectWeather(city_id);
		logger.info("=============> getCountryList 메서드 진입");
		return weatherList;
	}
	
	
	
	
	
	
	
//	 특정 html 에서 그 html의 action 을 /country/selectCity로 바꿔주는 스크립트 작성후 호출
//	 그러면 특정 html에서 'name'이 'city_id'인 변수를 get방식으로 이 메소드에 가져옴
//	@RequestMapping(value = "/selectCity",method = RequestMethod.GET)
//	public ModelAndView selectCity(@RequestParam(value = "country_id") String country_id) {
//		cityList = countryService.selectCity("CY");
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("cityList");
//		mv.addObject("cityList", cityList);
//		return mv;
//	}

	
	
	
	
	
//	@RequestMapping({"/weatherList","/"})
//	@ResponseBody
//	public List<WeatherInfoVo> WeatherList() {
//		weatherList = countryService.WeatherList();
//		logger.info("=============> getCountryList 메서드 진입");
//		return weatherList;
//	}
	
	
//	@RequestMapping(value="/weatherList",method=RequestMethod.GET)
//	public ModelAndView WeatherList(@RequestParam(value = "city_id") int city_id) {
//		weather_tmp = countryService.WeatherList(city_id);
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("weatherList");
//		mv.addObject("weather",weatherInfoVo);
//		return mv;
//	}
	
	
//	@RequestMapping(value="/viewArticle",method=RequestMethod.GET)
//	public ModelAndView viewArticle(@RequestParam(value = "articleno") String articleNo) {
//		articleVO = boardService.viewArticle(Integer.parseInt(articleNo));
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("viewArticle");
//		mv.addObject("article",articleVO);
//		return mv;
//	
//	}

}
