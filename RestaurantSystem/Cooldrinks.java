package com.project.Restaurant;

import java.util.Map;

public class Cooldrinks extends Restaurant{

	public Cooldrinks() {
		menu.put("Sprite", 105.0);
		menu.put("Thumbs Up", 115.0);
		menu.put("Coke", 97.0);
		menu.put("Soda", 88.0);
	}

	
	@Override
	public void displayMenu() {
		System.out.println("----- Cool Drinks Menu -----");
		for(Map.Entry<String, Double> entry : menu.entrySet()) {
			System.out.println(entry.getKey() +" - "+ entry.getValue());
		}
	}
}
