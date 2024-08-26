package com.Conditionals_and_Iterations;

import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args) {
        // If else statement is used for conditions

        // Example 1
        int val = 24;

        // we use "==" comparison operator to compare two integers
        if (val == 24) { System.out.println(true); }

        else { System.out.println(false); }


        // Example 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fruit name : ");
        String fruit = input.nextLine();

        // we use .equals() method to compare strings
        if (fruit.equals("mango")) { System.out.println(true); }

        else { System.out.println(false); }

    }
}
