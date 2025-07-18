package com.project.EmployeeManagementSystem;

public class Developer extends Employee{

	private String programmingLang;
	
	public Developer(String name, String department, double salary, String programmingLang) {
		super(name, department, salary);
		this.programmingLang = programmingLang;
		
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Programming Language: "+programmingLang);
		
	}
}
