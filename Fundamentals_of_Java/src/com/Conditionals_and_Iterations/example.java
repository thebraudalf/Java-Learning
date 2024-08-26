package com.Conditionals_and_Iterations;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        // Writing a program to convert temperature into Celsius to Fahrenheit
        float Fahrenheit = 0;

        Scanner tempInput = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius : ");

        float temp = tempInput.nextFloat();
        // to converting Celsius to Fahrenheit we multiply value by 9/2 then add to 32
        for (int i=1; i <= 32; i++){
            Fahrenheit = (temp * (9.0f/5.0f)) + i;
        }

        System.out.println(Fahrenheit);

    }
}
