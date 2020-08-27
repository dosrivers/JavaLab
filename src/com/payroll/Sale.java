package com.payroll;

import java.time.LocalDate;

public class Sale {
    private float saleAmount;
    private LocalDate date;
    private String description;

    public Sale(float saleAmount, LocalDate date, String description) {
        this.saleAmount = saleAmount;
        this.date = date;
        this.description = description;
    }
    public float getSaleAmount() {
        return saleAmount;
    }
}
