# Restaurant Menu Management System

The Restaurant Menu Management System is a Java-based application that allows customers to browse and order items from various restaurant categories. The system provides a user-friendly interface to navigate through the menu, place orders, and view the final bill.

## Features
- Display menu for different restaurant categories (Tiffins, Cafe, Briyani, Chinese, Cool Drinks, Snacks)
- Allow customers to order items from the displayed menu
- Keep track of the ordered items and their quantities
- Calculate the total bill based on the ordered items
- Print the order summary with the total bill

## Usage

### Main Menu
The main menu allows the user to select the desired restaurant category to view the menu and place orders.

----- Restaurant Menu -----
1. Tiffins
2. Cafe
3. Briyani
4. Chinese
5. Cool Drinks
6. Snacks
7. Exit
Enter Choice:
```

### Ordering Process
1. The user selects a restaurant category from the main menu.
2. The selected restaurant's menu is displayed.
3. The user can enter the item name to order and the quantity.
4. The ordered items and their quantities are stored in a `LinkedHashMap`.
5. The user can continue ordering from the same menu or switch to a different restaurant category.

### Order Summary
After the user finishes ordering, the system prints the order summary, including the ordered items, their quantities, and the total bill.

```
--- Order Summary ---
Idly x 2 = Rs80.00
Puri x 1 = Rs45.00
Vada x 3 = Rs126.00
Total Bill: Rs251.00
```

## Classes

### Restaurant
The `Restaurant` class is an abstract class that defines the common functionality for all restaurant categories. It includes the following methods:
- `displayMenu()`: Displays the menu for the specific restaurant category.
- `isItemAvailable(String itemName)`: Checks if the given item is available in the menu.
- `getActualItemName(String itemName)`: Retrieves the actual item name from the menu, considering case-insensitive search.
- `calculateBill(Map<String, Integer> orders)`: Calculates the total bill based on the ordered items and their quantities.

### Tiffins
The `Tiffins` class extends the `Restaurant` class and represents the Tiffins menu. It initializes the menu items and their prices.

### Cafe
The `Cafe` class extends the `Restaurant` class and represents the Cafe menu. It initializes the menu items and their prices.

### Briyani
The `Briyani` class extends the `Restaurant` class and represents the Briyani menu. It initializes the menu items and their prices.

### Chinese
The `Chinese` class extends the `Restaurant` class and represents the Chinese menu. It initializes the menu items and their prices.

### Cooldrinks
The `Cooldrinks` class extends the `Restaurant` class and represents the Cool Drinks menu. It initializes the menu items and their prices.

### Snacks
The `Snacks` class extends the `Restaurant` class and represents the Snacks menu. It initializes the menu items and their prices.

### Main
The `Main` class is the entry point of the application. It handles the user interaction, including displaying the main menu, taking orders, and printing the order summary.
