package com.project.Restaurant;

import java.util.*;
import java.util.Map.Entry;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Restaurant restaurant;
    static Map<String, Double> orders = new LinkedHashMap<>();

    public static void main(String[] args) {
        System.out.println("----- Welcome To Restaurant -----");

        boolean continueOrdering = true;
        while (continueOrdering) {
            // Show main menu
            restaurant = getRestaurantMenu();
            if (restaurant == null) {
                break; // Exit option chosen
            }

            restaurant.displayMenu();

            // Take orders
            while (true) {
                System.out.print("Enter item name to order (or type 'done' to finish this menu): ");
                String itemInput = sc.nextLine();

                if (itemInput.equalsIgnoreCase("done")) {
                    break;
                }

                // Case-insensitive search
                String actualItem = null;
                for (String key : restaurant.menu.keySet()) {
                    if (key.equalsIgnoreCase(itemInput)) {
                        actualItem = key;
                        break;
                    }
                }

                if (actualItem == null) {
                    System.out.println("Item not found in menu.");
                    continue;
                }

                System.out.print("Enter quantity: ");
                double quantity = sc.nextDouble();
                sc.nextLine();

                orders.put(actualItem, orders.getOrDefault(actualItem, 0.0) + quantity);
            }

            // Ask if user wants to continue
            System.out.print("Anything else? (y/n): ");
            String response = sc.nextLine();
            if (!response.equalsIgnoreCase("y")) {
                continueOrdering = false;
            }
        }

        printSummary();
        System.out.println("Thank you... Visit Again!");
        sc.close();
    }

    // Show restaurant categories
    private static Restaurant getRestaurantMenu() {
        while (true) {
            System.out.println("\n----- Restaurant Menu -----");
            System.out.println("1. Tiffins");
            System.out.println("2. Cafe");
            System.out.println("3. Briyani");
            System.out.println("4. Chinese");
            System.out.println("5. Cool Drinks");
            System.out.println("6. Snacks");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            return switch (choice) {
                case 1 -> new Tiffins();
                case 2 -> new Cafe();
                case 3 -> new Briyani();
                case 4 -> new Chinese();
                case 5 -> new Cooldrinks();
                case 6 -> new Snacks();
                case 7 -> null;
                default -> {
                    System.out.println("Invalid Option. Try Again!");
                    yield getRestaurantMenu();
                }
            };
        }
    }

    // Print final bill
    private static void printSummary() {
        if (orders.isEmpty()) {
            System.out.println("No items ordered.");
            return;
        }

        System.out.println("\n--- Order Summary ---");
        double total = 0.0;

        for (Entry<String, Double> entry : orders.entrySet()) {
            String item = entry.getKey();
            double qty = entry.getValue();

            double price = 0.0;
            for (Map<String, Double> menu : getAllMenus()) {
                if (menu.containsKey(item)) {
                    price = menu.get(item);
                    break;
                }
            }

            double itemTotal = price * qty;
            System.out.printf("%s x %.0f = Rs%.2f\n", item, qty, itemTotal);
            total += itemTotal;
        }

        System.out.printf("Total Bill: Rs %.2f\n", total);
    }

    // To look up prices from any category
    private static List<Map<String, Double>> getAllMenus() {
        return Arrays.asList(
            new Tiffins().menu,
            new Cafe().menu,
            new Briyani().menu,
            new Chinese().menu,
            new Cooldrinks().menu,
            new Snacks().menu
        );
    }
}
