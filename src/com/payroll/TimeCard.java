package com.payroll;

import java.time.LocalDate;

public class TimeCard {
    private float[] hours = new float[7];
    private LocalDate startingDate;

    public TimeCard() {
        startingDate = TimeCardDateGenerator.getInstance().getStartingDate();
    }

    public float getHours() {
        float total = 0;
        for (float hour: hours){
            total += hour;
        }
        return total;
    }
    public void work(float hours, Days day)throws HourlyException{
        float currentHours = this.hours[day.ordinal()];
        if ((hours + currentHours)>24){
            throw new HourlyException("Invalid hours for " + day.toString() + " :" + hours);
        }
        this.hours[day.ordinal()] += hours;
    }
}
