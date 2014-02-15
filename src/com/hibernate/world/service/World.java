package com.hibernate.world.service;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.WebParam;

import com.hibernate.cityservice.request.vo.CityServiceRequest;
import com.hibernate.cityservice.response.vo.CityServiceResponse;
import com.hibernate.dao.CityDAO;
import com.hibernate.world.entities.City;

@WebService()
public class World {
	
	CityDAO cityDao = new CityDAO();

	@WebMethod()
	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@WebMethod()
	public @WebResult(name="CityServiceResponse") CityServiceResponse getCityName
			(@WebParam(name="CityServiceRequest") CityServiceRequest request){
		String cityId = request.getCityId();

		City city = cityDao.findById(Integer.parseInt(cityId));
		CityServiceResponse response = new CityServiceResponse();
		response.setCityName(city.getName());
		return response;
	}
}
