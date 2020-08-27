package com.payroll;

public class Sales extends Employee {

    private float commissionRate;
    private Receipts receipts;

    public Sales(String name, int employeeID, float commissionRate) {
        super(name, employeeID);
        receipts = new Receipts();
        this.commissionRate = commissionRate;
    }
    public float getCurrentSalesTotal(){
        return receipts.getTotalSales();
    }
    public void makeSale(Sale sale){
        receipts.makeSale(sale);
    }







    @Override
    public float calculatePay() {
        float totalPay = commissionRate*receipts.getTotalSales();
        return totalPay;
    }
}




