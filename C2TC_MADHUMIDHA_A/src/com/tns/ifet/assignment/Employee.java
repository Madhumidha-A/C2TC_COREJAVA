package com.tns.ifet.assignment;

//Base class for Employee
class Employee {
 protected int employeeId;
 protected String name;
 protected String department;
 protected double salary;

 public Employee(int employeeId2, String name2, String department2, double salary2) {
	// TODO Auto-generated constructor stub
}

public void displayDetails() {
     System.out.println("Employee ID: " + employeeId);
     System.out.println("Name: " + name);
//     System.out.println("Department: " + department);
     System.out.println("Salary: " + salary);
 }
}
