package com.Functions_and_Methods;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // Check if all 3 digit armstrong numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println(isArmStrong(num));

    }

    static boolean isArmStrong(int num){
        int original = num;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }

        return sum == original;
    }

}
