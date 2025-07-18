package com.project.EmployeeManagementSystem;

public class Manager extends Employee {
	
	private double bonus;

	public Manager(String name, String department, double salary, double bonus) {
		super(name, department, salary);
		this.bonus = bonus;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Bonus: "+bonus);
		
	}

	public double getSalary() {
		return super.getSalary() + bonus;
	}
}
