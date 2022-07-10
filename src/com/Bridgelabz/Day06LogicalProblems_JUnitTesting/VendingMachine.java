package com.Bridgelabz.Day06LogicalProblems_JUnitTesting;

import java.util.Scanner;

public class VendingMachine {
                                                                             // Static Variables i for indexing the array and total for calculating the total Notes
    static int i = 0;
    static int total = 0;

                                                                            //Initialization of New Array
    static int notes[] = { 1000,500,100,50,10,5,2,1};
    static int money;

                                                                            // Function for Calculating the notes
    public static int calculate(int money,int[]notes ) {
                                                                            //calling calculate Function
        int remainder;

        if (money == 0) {
            return -1;
        } else {
                                                                            // for(int i = 0; i < notes.length; i++) {
            if (money >= notes[i]) {
                                                                            // logic for Calculating The notes
                int calNotes = money / notes[i];
                remainder = money % notes[i];
                money = remainder;
                total += calNotes;
                System.out.println(notes[i] + " Notes ---> " + calNotes);
            }
            i++;
            return calculate(money, notes);
        }
    }
    public static void main(String[] args) {
                                                                            //Taking amount from the user
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();

                                                                            //Creating object for Vending Machine
        VendingMachine.calculate(money,notes);
        System.out.println("Total Number of Notes are :"+total);
    }
}
