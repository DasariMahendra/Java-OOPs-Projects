package com.project.Restaurant;

import java.util.Map;

public class Tiffins extends Restaurant{
	
	public Tiffins() {
		menu.put("Idly", 40.0);
		menu.put("Puri", 45.0);
		menu.put("Vada", 42.0);
		menu.put("Bonda", 48.0);
		menu.put("Dosa", 50.0);
	}
	
	
	@Override
	public void displayMenu() {
		System.out.println("----- Tiffins Menu -----");
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
			System.out.println(entry.getKey() +" - "+ entry.getValue());
		}
	}
}
