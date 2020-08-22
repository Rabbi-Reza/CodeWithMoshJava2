package com.nirzhor;

public class Mortgage_OOP1{

    public static void main(String[] args ){

        var mortClass = new Mortgage_class();

        int Principle =  (int) mortClass.readNumber(" Principal ($1K - $1M): ", 1000,1_000_000);
        float annualInterest =  (float) mortClass.readNumber(" Annual Interest rate: ", 1,30);
        byte years =  (byte) mortClass.readNumber(" Period (Years): ", 1,30);

        mortClass.printMortgage(Principle, years, annualInterest);
        mortClass.printPaymentSchedule(Principle, years, annualInterest);
    }
}