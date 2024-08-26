package com.Input;

import java.util.Scanner;

public class stringInput {
    public static void main(String[]args){

        // taking String Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String :");

        String string = input.next();
        System.out.println(string); // it prints only one word

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a String :");

        String string2 = input2.nextLine();
        System.out.println(string2); // it prints whole string

    }
}
