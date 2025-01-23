package com.tns.ifet.assignment;

import java.util.Scanner;

public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter employee ID: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            if (salary < 0) {
                throw new InvalidInputException("Salary cannot be negative.");
            }

            System.out.print("Is the employee a manager? (yes/no): ");
            String isManager = scanner.nextLine();

            if (isManager.equalsIgnoreCase("yes")) {
                System.out.print("Enter team name: ");
                String teamName = scanner.nextLine();
                Manager manager = new Manager(employeeId, name, department, salary, teamName);
                System.out.println("\nManager Details:");
                manager.displayDetails();
            } else {
                Employee employee = new Employee(employeeId, name, department, salary);
                System.out.println("\nEmployee Details:");
                employee.displayDetails();
            }

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}