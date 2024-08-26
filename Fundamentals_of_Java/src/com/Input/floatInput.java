package com.Input;

import java.util.Scanner;

public class floatInput {
    public static void main(String[] args) {

        // taking Float Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a floating no. : ");

        float floatValue = input.nextFloat();
        System.out.println(floatValue); // it prints floating no.
        // but can give floating point error or didn't give accurate value

    }
}
