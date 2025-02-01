package Entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valueHour;
    private Integer hours;

    public HourContract(Date date, double valueHour, Integer hours){
        this.date = date;
        this.valueHour = valueHour;
        this.hours = hours;
    }
    public Integer getHours(){
        return hours;
    }
    public void setHours(Integer hours){
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValueHour() {
        return valueHour;
    }

    public void setValueHour(double valueHour) {
        this.valueHour = valueHour;
    }
    public Double totalValue(){
        return valueHour * hours;
    }
}
