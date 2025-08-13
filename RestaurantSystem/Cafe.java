package com.project.Restaurant;

import java.util.Map;

public class Cafe extends Restaurant{
	
	public Cafe() {
		menu.put("Tea", 18.0);
		menu.put("Coffee", 25.0);
		menu.put("Sandwwich", 108.0);
		menu.put("Pastry", 79.0);
	}
	
	
	@Override
	public void displayMenu() {
		System.out.println("----- Cafe Menu -----");
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
			System.out.println(entry.getKey() +" - "+ entry.getValue());
		}
	}
}
