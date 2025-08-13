package com.project.Restaurant;

import java.util.*;

abstract class Restaurant {

	Map<String, Double> menu = new LinkedHashMap<>();
	
	public abstract void displayMenu();
	
	public boolean isItemAvailable(String itemName) {
        for (String key : menu.keySet()) {
            if (key.equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }

    public String getActualItemName(String itemName) {
        for (String key : menu.keySet()) {
            if (key.equalsIgnoreCase(itemName)) {
                return key;
            }
        }
        return null;
    }
	
	public double calculateBill(Map<String,Integer> orders) {
		double total = 0.0;
		for(Map.Entry<String, Integer> order : orders.entrySet()) {
			String item = order.getKey();
			int quantity = order.getValue();
			Double price = menu.get(item);
			
			if(price != null) {
				total += price * quantity;
			}
		}
		return total;
	}
}
