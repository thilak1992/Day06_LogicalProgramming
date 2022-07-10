package com.Bridgelabz.Day06LogicalProblems_JUnitTesting;

import java.util.Scanner;

public class Sqrt_NewtonsMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
                                                            // converting string to double
        double c = Double.parseDouble(args[0]);
                                                            // initialize t = c
        double t = c;
                                                            // relative error tolerance
        double epsilon = 1e-15;
                                                            // repeat until desired accuracy reached
        while (Math.abs(t - c / t) > epsilon * t) {
                                                             // replace t with the average of c/t and t
            t = (c / t + t) / 2.0;
        }
        System.out.println("Square root of " + c + " is " + t);
    }
}
