package com.Functions_and_Methods;

import java.util.Arrays;

public class Method_Overloading {
    // Function/Method Overloading : It allows a class to have a more than one method with the same name, as long as their parameter lists are different
    // It happens at a compile time
    static void testFunc(int a) {
        System.out.println(a);
    }

    static void testFunc(String str) {
        System.out.println(str);
    }

    // and also make function if parameters are more than one
    static void testFunc(int a, int b, int c) {
        System.out.println(a + ", " + b + ", " + c);
    }


    // It also works in VarArgs
    static void varArgsFunc(int... VarArgs) {
        System.out.println(Arrays.toString(VarArgs));
    }

    static void varArgsFunc(String... VarArgs) {
        System.out.println(Arrays.toString(VarArgs));
    }

    public static void main(String[] args) {
        // you can use overloaded function by just passing arguments if function is exist
        testFunc(32); // 32
        testFunc("User"); // User
        testFunc(32, 43, 89); // 32, 43, 89

        varArgsFunc(32, 43, 89, 43); // [32, 43, 89, 43]
        varArgsFunc("Superman", "batman", "Ironman"); // [Superman, batman, Ironman]

    }
}
