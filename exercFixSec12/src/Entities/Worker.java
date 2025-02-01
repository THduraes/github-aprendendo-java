package Entities;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removContratc(){
        contracts.remove(contracts);
    }
    public void income(int month, int year){
        double sal = baseSalary;
        Calendar calen = Calendar.getInstance();
        for(HourContract c : contracts){
            calen.setTime(c.getDate());
            int c_year = calen.get(Calendar.YEAR);
            int c_month = 1+ calen.get(Calendar.MONTH);
            if(year == c_year && month == c_month) sal +=c.totalValue();
        }
        System.out.printf("Income for %d/%d : %.2f",month, year, sal);
    }
}



