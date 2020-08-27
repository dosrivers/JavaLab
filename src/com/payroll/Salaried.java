package com.payroll;

public class Salaried extends Employee {
    private float annualSalary;
    public Salaried(String name, int employeeID, float salary) {
        super(name, employeeID);
        this.annualSalary = salary;
    }






    @Override
    public float calculatePay() {
        return annualSalary/26;
    }
}
