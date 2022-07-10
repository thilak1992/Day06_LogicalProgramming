package com.Bridgelabz.Day06LogicalProblems_JUnitTesting;

public class MonthlyPayment {

                                                                                                        // static variables
    public static double r, numOfYears, payment, principalAmount, rate, years;

                                                                                                        /*
                                                                                                         * Calculating monthly payment
                                                                                                         */
    public static void monthlyPaymentComputation(double principalAmount, double rate, double years) {
        r = rate / (12 * 100);                                                                          //Values taken to calculate monthly Payment
        numOfYears = 12 * years;                                                                        //1,00,000 * (12/12*100) / 1 - (1 + 0.01)^10
        payment = (principalAmount * r) / (1 - Math.pow(1 + r, -numOfYears));
        System.out.println("Monthly Payment: " + payment);
    }

    public static void main(String[] args) {
                                                                                                        // command-line arguments
        principalAmount = Double.parseDouble(args[0]);
        rate = Double.parseDouble(args[1]);
        years = Double.parseDouble(args[2]);
                                                                                                        // calling method
        monthlyPaymentComputation(principalAmount, rate, years);
    }
}
