package com.payroll;

public class Hourly extends Employee {
    private static final float OVERTIME_THRESHOLD = 40;
    private static final float OVERTIME_RATE = .5F;
    private float hourlyRate;
//    public static final int SUNDAY = 0;
//    public static final int MONDAY = 1;
//    public static final int TUESDAY = 2;
//    public static final int WEDNESDAY = 3;
//    public static final int THURSDAY = 4;
//    public static final int FRIDAY = 5;
//    public static final int SATURDAY = 6;
//    private float hours;
//    private float[] hours = new float[7];
    private TimeCard timeCard;

    public Hourly(String name, int employeeID, float hourlyRate) {
        super(name, employeeID);
        this.hourlyRate = hourlyRate;
        timeCard = new TimeCard();
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public float getHours() {
//        float total = 0;
//        for (int day=SUNDAY; day<SATURDAY; day++){
//        for (float hour: hours){
//            total += hour;
//        }
//        return total;
        return timeCard.getHours();
    }

    public void work(float hours, Days day)throws HourlyException{
        timeCard.work(hours, day);
//        this.hours[day] += hours;
    }

    @Override
    public float calculatePay(){
        float hours = getHours();
        float overtimeHours = 0;
        if (hours> Hourly.OVERTIME_THRESHOLD){
            overtimeHours = hours=hours- Hourly.OVERTIME_THRESHOLD;
        }
        float totalPay = hourlyRate * getHours();
        totalPay += hourlyRate* Hourly.OVERTIME_RATE*overtimeHours;
        return totalPay;
    }
}
