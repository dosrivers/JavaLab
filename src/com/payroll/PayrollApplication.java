package com.payroll;

import java.util.ArrayList;

public class PayrollApplication {
    public static void main(String[] args){
        float totalPayroll = 0;
        Employee[] employees = Employee.getEmployeesAsArray();
        for (Employee employee: employees){
            totalPayroll += employee.calculatePay();
        }
        System.out.println("Total Payroll via array: " + totalPayroll);

        totalPayroll = 0;
        ArrayList<Employee> employeeList = Employee.getEmployeesAsList();
        for (Employee employee:employeeList){
            totalPayroll += employee.calculatePay();
        }
        System.out.println("Total Payroll via List: " + totalPayroll);
    }


}
