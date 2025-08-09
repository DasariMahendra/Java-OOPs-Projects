package com.project.libraryManagement;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Books books = new Books();
        Students students = new Students();

        while (true) {
        	try {
	            System.out.println("\n===== LIBRARY MENU =====");
	            System.out.println("1. Add a New Book");
	            System.out.println("2. Upgrade Quantity of a Book");
	            System.out.println("3. Search a Book");
	            System.out.println("4. Show All Books");
	            System.out.println("5. Register Student");
	            System.out.println("6. Show All Registered Students");
	            System.out.println("7. Check Out Book");
	            System.out.println("8. Check-In Book");
	            System.out.println("9. Exit");
	            System.out.print("Enter your choice: ");
	
	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline
	
	            switch (choice) {
	                case 1 : books.addBook();
	                break;
	                case 2 : books.upgradeBookQty();
	                break;
	                case 3 : books.searchBook();
	                break;
	                case 4 : books.showAllBooks();
	                break;
	                case 5 : students.registerStudent();
	                break;
	                case 6 : students.showAllStudents();
	                break;
	                case 7 : students.checkOutBook(books);
	                break;
	                case 8 : students.checkInBook(books);
	                break;
	                case 9 : System.out.println("Thank you! Visit Again");
	                sc.close();
	                return;
	                default : System.out.println("Invalid choice.");
	            }
        	}
        	catch(Exception e) {
        		System.out.println(e.getMessage());
        	}
        }
	}
}
