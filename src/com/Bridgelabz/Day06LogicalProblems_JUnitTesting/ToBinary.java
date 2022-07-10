package com.Bridgelabz.Day06LogicalProblems_JUnitTesting;

import java.util.Scanner;

public class ToBinary {

    public static void main(String[] args) {
        int number, i = 0;
                                                            // array to store binary number
        int binary[] = new int[1000];
                                                            //Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        number = sc.nextInt();

                                                            //counter for binary array
        while (number != 0) {
                                                            // storing remainder in binary array
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }

        System.out.println("Binary value is: ");
                                                             // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}
