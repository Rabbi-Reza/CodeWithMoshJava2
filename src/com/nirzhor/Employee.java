package com.nirzhor;

public class Employee {

    /// Encapsulation

    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary){
        ///setBaseSalary(baseSalary);
        ///setHourlyRate(0);

        this(baseSalary,0);
        /// Calling mployee(int baseSalary , int hourlyRate)
    }

    public Employee(int baseSalary , int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployee(){
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage(){
        ///return baseSalary;
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    /// Abstraction
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate< 0)
            throw new IllegalArgumentException("HourlyRate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

}
