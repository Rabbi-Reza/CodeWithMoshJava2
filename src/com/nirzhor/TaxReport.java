package com.nirzhor;

public class TaxReport {

    // private TaxCalculator2018 calculator;
    private TaxCalculator calculator;

//    public TaxReport() {
//        calculator = new TaxCalculator2018(100_000);
//    }

    // Constructor Injection
//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

//    public void show() {
//        var tax = calculator.calculateTax();
//        System.out.println(tax);
//    }

    // Method Injection
      public void show( TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // Setter Injection
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
