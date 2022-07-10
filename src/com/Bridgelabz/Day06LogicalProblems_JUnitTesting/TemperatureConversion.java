package com.Bridgelabz.Day06LogicalProblems_JUnitTesting;

import java.util.Scanner;

public class TemperatureConversion {

                                                                    //fahrenheitCheck method created with arguments
    public static void fahrenheitCheck(double celsius) {
                                                                    //double fahrenheit = 0;
        double fahrenheit = celsius * 9 / 5 + 32;                   //formula for converting fahrenheit into celsius
        System.out.println("Fahrenheit: " +fahrenheit);
    }

                                                                    //celsiusCheck method created with arguments
    public static void celsiusCheck(double fahrenheit) {
                                                                    //double celsius = 0;
        double celsius = (fahrenheit - 32) * 5 / 9;                 //formula for converting fahrenheit into celsius
        System.out.println("Celsius: " +celsius);
    }

    public static void main(String[] args) {
        System.out.println("Enter the choice for conversion: ");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
                                                                    //Switch case used for choices of user
        switch (selection) {
            case 1:
                System.out.println("Enter the fahrenheit value to convert to celsius: ");
                double fahrenheit = scanner.nextInt();
                celsiusCheck(fahrenheit);
                break;
            case 2:
                System.out.println("Enter the celsius value to convert to fahrenheit: ");
                double celsius = scanner.nextInt();
                fahrenheitCheck(celsius);
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
