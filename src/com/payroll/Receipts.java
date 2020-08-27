package com.payroll;

import java.util.ArrayList;

public class Receipts {
//    private float[] sales = new float[30];
//    private ArrayList<Float> sales = new ArrayList<Float>();

    private ArrayList<Sale> sales = new ArrayList<Sale>();
    public void makeSale(Sale sale){
        int count = 0;
        sales.add(sale);
    }
    public float getTotalSales(){
        float total = 0;
        for (Sale sale: sales){
            total += sale.getSaleAmount();
        }
        return total;
    }
}
