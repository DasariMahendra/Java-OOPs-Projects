package com.project.EmployeeManagementSystem;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[100];
		int count =0;
		
		while(true) {
			System.out.println("-----Employee Management System-----");
			System.out.println("1.Add Employee");
			System.out.println("2.List Employee");
			System.out.println("3.Employees with Salary");
			System.out.println("4.Exit");
			System.out.println("Choose an option");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Is Employee a Manager or Developer? (M/D): ");
				String type = sc.nextLine().trim().toUpperCase();
				
				
				System.out.println("Enter name: ");
				String name =sc.nextLine();
				System.out.println("Enter Department: ");
				String department =sc.nextLine();
				System.out.println("Enter Salary: ");
				double salary =sc.nextDouble();
				sc.nextLine();
				
				if(type.equals("M")) {
				System.out.println("Enter Bonus for Manager: ");
				double mBonus =sc.nextDouble();
				sc.nextLine();
				employees[count++] = new Manager(name, department, salary, mBonus);
				}
				else if(type.equals("D")) {
				System.out.println("Enter Developer Programming Language: ");
				String dLang =sc.nextLine();
				employees[count++] = new Developer(name, department, salary, dLang);
				}
				else {
					System.out.println("Invalid Employee type.");
				}
				break;
				
			case 2:
				System.out.println("--- Employee List ---");
				for(int i = 0; i < count; i++) {
				    employees[i].displayInfo();
				    System.out.println();
				}
				break;
			case 3:
				System.out.println("--- Employee with Salary ---");
				if(count ==0) {
					System.out.println("No Employees added yet.");
					break;
				}
				for(int i=0 ; i<count ; i++) {
					String types ="";
					if(employees[i] instanceof Manager) {
						types ="M";
					} 
					else if(employees[i] instanceof Developer) {
						types ="D";
					}
					
					System.out.println("Employee " +employees[i].getName()+ "("+types+") with Salary of "+ employees[i].getSalary());	
				}
				break;
			case 4:
				System.out.println("Exiting... GoodBye!");
				sc.close();
				return;
			default:
				System.out.println("Invalid Option. Try Again!");
			}
		}
	}
}
