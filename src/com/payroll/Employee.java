package com.payroll;

public abstract class Employee {
    private String name;
    private int employeeID;

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }



    public int getEmployeeID() {
        return employeeID;
    }public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }public abstract float calculatePay();
}
