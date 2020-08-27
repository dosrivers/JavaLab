package com.payroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HourlyTest {
     private Hourly hourly;
    @Before
    public void setUp() throws Exception {
        hourly = new Hourly(14.5f, "TEST", 11111);


    }

    @Test
    public void workSingleDayPolicy() {
        float expectedHours = 7;
        hourly.work(7, TUESDAY);
        float actualHours = hourly.getHoursWorked();
        assertEquals(expectedHours, actualHours, .001);
    }

    @Test
    public void calculatePaySingleDayPositive() {
        float expectedPay= 101.5F;
        hourly.work(7,2);
        float actualPay = hourly.calculatePay();
        assertEquals(expectedPay, actualPay, .001);
    }
    @Test
    public void getHoursWorkedSingleDayPositive() {
        float expectedHours= 7;
        hourly.work(expectedHours,2);
        float actualHours = hourly.getHoursWorked();
        assertEquals(expectedHours, actualHours, .001);
    }
    @Test
    public void getHoursWorkedMultipleDayPositive () {
    float expectedHours = 14;
    hourly.work(7,0);
    hourly.work(7,6);
    float actualHours = hourly.getHoursWorked();
    assertEquals(expectedHours, actualHours, .001);
    }
    @Test
    public void calculatePayMultipleDayPositive () {
    float expectedPay= 203F;
    hourly.work(7,0);
    hourly.work(7,6);
    float actualPay = hourly.calculatePay();
    assertEquals(expectedPay, actualPay, .001);

    }

    private class TUESDAY {
    }
}