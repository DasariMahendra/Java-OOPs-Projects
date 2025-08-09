package com.project.libraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {

	List<Book> booksList = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	
	public void addBook() {
		System.out.println("Enter Book ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book Title: ");
		String name = sc.nextLine();
		System.out.println("Enter Author name: ");
		String author = sc.nextLine();
		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();
		
		Book book = new Book(id, name, author, quantity, quantity);
		booksList.add(book);
		
		System.out.println("Book Added Successfully.");
	}
	
	public void upgradeBookQty() {
		System.out.println("Enter Book Id to Upgrade: ");
		int id = sc.nextInt();
		System.out.println("Enter Quantity to add: ");
		int quantity = sc.nextInt();
		
		boolean found = false;
		for(Book b : booksList) {
			if(b.getId() == id) {
				b.setQuantity( b.getQuantity() + quantity);
				b.setAvailable(b.getAvailable() + quantity);
				System.out.println("Quantity Upgraded");
				found = true;
				break;
			}
		}
		if(!found) {
		System.out.println("Book not found");
		}
	}
	
	public void searchBook() {
		System.out.println("Enter Book Title to Search: ");
		String title = sc.nextLine();
		for(Book b :booksList) {
			if(b.getName().equalsIgnoreCase(title)) {
				b.showInfo();
				return;
			}
		}
		System.out.println("Book not found");
	}
	
	public void showAllBooks() {
		for(Book b : booksList) {
			b.showInfo();
		}
	}
	
	public Book getBookById(int id) {
		for(Book b : booksList) {
			if(b.getId() == id) {
				return b;
			}
		}
		return null;
	}
}
