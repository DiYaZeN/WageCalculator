package com.codewithmosh;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    public static int numOfEmployees;

    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numOfEmployees++;
    }
    public Employee(int baseSalary){
        this(baseSalary,0);
    }

    public static void printNoOfEmployee (){
        System.out.println(numOfEmployees);
    }

    public int calculateWage(int ExtraHours) {
        return (getBaseSalary()+ (getExtraHours() * getHourlyRate()));
    }
    public int calculateWage() {
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base Salary must be greater than 0");
        } else {
            this.baseSalary = baseSalary;
        }

    }

    private void setExtraHours(int extraHours) {
            this.extraHours = extraHours;
    }

    private int getBaseSalary() {
        return this.baseSalary;
    }

    private int getExtraHours() {
        return this.extraHours;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (extraHours < 0)
            throw new IllegalArgumentException("Hourly Rate must be greater than or equal to 0");
        else
            this.hourlyRate = hourlyRate;

    }
}
