package com.hibernate.cityservice.test;

import com.google.gson.Gson;
import com.hibernate.world.entities.Country;

public class GsonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Country c = new Country();
		Gson gson = new Gson(); // Or use new GsonBuilder().create();
		c.setCapital(40);
		c.setContinent("Continent");
		c.setName("India");
		String json = "{\"name\":\"India\",\"continent\":\"Continent\",\"surfaceArea\":0.0,\"population\":0,\"capital\":40}"; // serializes target to Json
		

		Country target2 = gson.fromJson(json, Country.class);
		System.out.println(target2.getName());
	}

}
