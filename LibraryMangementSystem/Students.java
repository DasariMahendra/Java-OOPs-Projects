package com.project.libraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

	List<Student> studentList = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	
	public void registerStudent(){
		try {
			System.out.println("Enter Student Roll Number: ");
			int roll = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student name: ");
			String name = sc.nextLine();
			System.out.println("Enter Department name: ");
			String dept = sc.nextLine();
			
			for (Student s : studentList) {
	            if (s.getRollNo() == roll && s.getDept().equalsIgnoreCase(dept)) {
	                System.out.println("Duplicate details: Student with same roll number and department already exists.");
	                return;
	            }
	        }
			
			Student student = new Student(roll, name, dept);
			studentList.add(student);
			
			System.out.println("Student Registered");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void showAllStudents() {
		for(Student s: studentList) {
			s.showInfo();
		}
	}
	
	public Student getStudentById(int roll) {
		for(Student s: studentList) {
			if(s.getRollNo() == roll) {
				return s;
			}
		}
		return null;
	}
	
	public void checkOutBook(Books books) {
        System.out.print("Enter Student roll number: ");
        int roll = sc.nextInt();
        Student s = getStudentById(roll);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Book ID to borrow: ");
        int bookId = sc.nextInt();
        Book b = books.getBookById(bookId);
        if (b != null && b.getAvailable() > 0) {
            s.borrowedBooks.add(b);
            b.setAvailable(b.getAvailable() - 1);
            System.out.println("Book issued.");
        } else {
            System.out.println("Book not available.");
        }
    }

    public void checkInBook(Books books) {
        System.out.print("Enter Student roll number: ");
        int roll = sc.nextInt();
        Student s = getStudentById(roll);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Book ID to return: ");
        int bookId = sc.nextInt();
        for (Book b : s.borrowedBooks) {
            if (b.getId() == bookId) {
                s.borrowedBooks.remove(b);
                b.setAvailable(b.getAvailable() + 1);
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book not found in student record.");
    }
}
