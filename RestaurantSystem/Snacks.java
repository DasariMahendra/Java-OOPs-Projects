package com.project.Restaurant;

import java.util.Map;

public class Snacks extends Restaurant{

	public Snacks() {
		menu.put("Bajji",55.0);
		menu.put("Samosa", 67.0);
		menu.put("Chips", 30.0);
		menu.put("Cookies", 35.0);
		menu.put("Pani Puri", 99.0);
	}
	
	
	@Override
	public void displayMenu() {
		System.out.println("----- Cafe Menu -----");
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
			System.out.println(entry.getKey() +" - "+ entry.getValue());
		}
	}

}
