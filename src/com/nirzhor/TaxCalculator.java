package com.nirzhor;

public interface  TaxCalculator {

    // Interface deal with what not how
    // Declaring field between interface
    // Intention is to avoid magic numbers
    /// float minimumTax = 100; // Final , Static

    double calculateTax();


    // Ability to define static methods
//    static double getTaxabaleIncome(double income, double expenses ){
//        return income - expenses;
//    }


}
