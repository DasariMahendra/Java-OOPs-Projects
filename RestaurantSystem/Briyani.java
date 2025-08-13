package com.project.Restaurant;

import java.util.Map;

public class Briyani extends Restaurant{

	public Briyani() {
		menu.put("Veg Briyani", 180.0);
		menu.put("Chicken Briyani", 210.0);
		menu.put("Mutton Briyani", 235.0);
		menu.put("Fish Briyani", 265.0);
	}
	
	
	@Override
	public void displayMenu() {
		System.out.println("----- Briyani Menu -----");
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
			System.out.println(entry.getKey() +" - "+ entry.getValue());
		}
	}
}
