package com.project.libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int rollNo;
	private String name;
	private String dept;
	List<Book> borrowedBooks = new ArrayList<>();

	public Student(int rollNo, String name, String dept) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public void showInfo() {
	    System.out.println("Roll No: " + rollNo + ", Name: " + name +", Department: "+dept);
	    if (borrowedBooks.isEmpty()) {
	        System.out.println("Borrowed Books: None");
	    } else {
	        System.out.println("Borrowed Books:");
	        for (Book b : borrowedBooks) {
	            System.out.println("- " + b.getName());
	        }
	    }
	}

	
}
