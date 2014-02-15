package com.hibernate.cityservice.test;

import com.hibernate.dao.CityDAO;
import com.hibernate.world.entities.City;



public class HibernateReadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CityDAO cityDao = new CityDAO();
		City city = cityDao.findById(new Integer(4070));
		
		System.out.println(city.getName());

	}

}
