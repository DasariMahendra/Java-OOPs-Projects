package com.project.Restaurant;

import java.util.Map;

public class Chinese extends Restaurant{

	public Chinese() {
		menu.put("Burger", 99.0);
		menu.put("Fries", 59.0);
		menu.put("Pizza", 199.0);
		menu.put("Spring rolls", 149.0);
		menu.put("Manchurian", 109.0);
		menu.put("Noodles", 98.0);
	}
	
	
	@Override
	public void displayMenu() {
		System.out.println("----- Chinese Menu -----");
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
			System.out.println(entry.getKey() +" - "+ entry.getValue());
		}
	}
}
