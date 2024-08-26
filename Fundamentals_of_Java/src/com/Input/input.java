package com.Input;

import java.util.Scanner;

public class input {
    public static void main(String[]args){

        // Scanner class is used to take input in java
        Scanner input = new Scanner(System.in);
        System.out.print("Enter something : ");
        // Using .nextInt() method to get integer output
        // System.out.println(input.nextInt());
        // Using .nextLine() method to get string or character input
        // System.out.println(input.nextLine());
        // Using .hasNestLine() method to give true if input is string
        System.out.println(input.hasNextInt());

    }
}
