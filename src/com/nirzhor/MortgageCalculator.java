package com.nirzhor;

public class MortgageCalculator {

    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENTAGE = 100;

    private int principle;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principle, float annualInterest, byte years) {
        this.principle = principle;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    private double calculateBalance( short numberOfPaymentsMade) {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = principle
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }


    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();
        double Mortgage = principle
                * ((monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments))
                        / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1));

        return Mortgage;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);

        return balances;
    }

    private float getMonthlyInterest() {
        return (annualInterest / PERCENTAGE) / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

}
