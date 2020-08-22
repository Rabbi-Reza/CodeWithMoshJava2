package com.nirzhor;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_class {



    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;

    public double readNumber(
            String prompt ,
            double min ,
            double max ){

        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){

            System.out.print(prompt);
            value = scanner.nextFloat();

            if( value >= min && value <= max)
                break;
            System.out.println(" Enter a number between " + min + " and " + max );

        }

        return  value;
    }

    public void printMortgage(int principle, byte years, float annualInterest) {

        double Mortgage = calculateMortgage(principle, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted );
    }

    public void printPaymentSchedule(int principle, byte years, float annualInterest) {

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("---------------- ");
        for(short month = 1; month <= years * MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principle, annualInterest, years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    private double calculateBalance(
            int Principle,
            float annualInterest,
            byte  years,
            short numberOfPaymentsMade){


        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyInterest = ( annualInterest / PERCENTAGE ) / MONTHS_IN_YEAR;

        double balance = Principle
                * (Math.pow(1 + monthlyInterest , numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest , numberOfPayments) - 1 );
        return balance;
    }

    private double calculateMortgage(
            int Principle,
            float annualInterest,
            byte  years) {

        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyInterest = ( annualInterest / PERCENTAGE ) / MONTHS_IN_YEAR;

        double Mortgage = Principle * ( ( monthlyInterest * Math.pow((1+monthlyInterest), numberOfPayments)) / (Math.pow((1+monthlyInterest),numberOfPayments) - 1));

        return Mortgage;
    }


}
