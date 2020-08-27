package com.payroll;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TimeCardDateGenerator {
    private static TimeCardDateGenerator ourInstance = new TimeCardDateGenerator();

    public static TimeCardDateGenerator getInstance() {
        return ourInstance;
    }

    public LocalDate getStartingDate(){
        LocalDate next = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(next);
        return next;
    }

    private TimeCardDateGenerator() {
    }
}
