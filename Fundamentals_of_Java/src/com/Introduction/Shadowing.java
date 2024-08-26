package com.Introduction;

public class Shadowing {
    // Shadowing : when a variable declared within a certain scope has the same name as a variable declared in an outer scope
    static int shadowedValue = 32;

    public static void main(String[] args) {
        System.out.println(shadowedValue); // 32

        // calling testFunc function
        testFunc(); // 32

        // initializing same variable as global variable
       // int shadowedValue = 23;
       // System.out.println(shadowedValue); // 23

        // reinitializing Shadowing "shadowedValue" variable
        shadowedValue = 41;
        System.out.println(shadowedValue); // 41

    }

    static void testFunc(){
        System.out.println(shadowedValue); // 32
    }
}
