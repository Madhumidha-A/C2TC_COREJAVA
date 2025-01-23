package com.tns.ifet.assignment;

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeId, String name, String department, double salary, String teamName) {
        super(employeeId, name, department, salary);
        this.teamName = teamName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Name: " + teamName);
    }
}


