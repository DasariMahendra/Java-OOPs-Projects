package com.project.libraryManagement;

public class Book {

	private int id;
	private String name;
	private String author;
	private int quantity;
	private int available;
	
	
	public Book(int id, String name, String author, int quantity, int available) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
		this.available = available;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getAvailable() {
		return available;
	}


	public void setAvailable(int available) {
		this.available = available;
	}


	public void showInfo() {
		System.out.println( "Book [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + ", available="
				+ available + "]");
	}
	
	
}
