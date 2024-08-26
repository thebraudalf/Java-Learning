package com.Functions_and_Methods;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // calling sum function
        sum();

        // you cannot convert void return type to int or any
        // int add = sum();
        // System.out.println(add);

        // calling sum2 function
        // you can only convert int return type to int
        int add = sum2();
        System.out.println(add);

        // calling greet function
        // you also can only convert String return type to String
        String greeting = greet();
        System.out.println(greeting);

    }

    // Function are block of code which are used to avoid repetition of code multiple times
    // Note : the compiler start executions from main function then other functions.

    /*
    Syntax of BuiltIn function

     access_modifier static return_type function_name(arguments){
    // code
    return_value;
    }
     */

    // function to add two numbers (with "void" as a return type)
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }

    // function to add two numbers (with "int" as a return type)
    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        // returning a value
        return sum;
    }

    // function to greet someone (with "String" as a return type)
    static String greet() {
        return "Hello World";
    }

}
