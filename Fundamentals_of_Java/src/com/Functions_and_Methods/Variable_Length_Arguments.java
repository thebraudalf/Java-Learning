package com.Functions_and_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Variable_Length_Arguments {
    // Variable Length Arguments or VarArgs : It allows a method to accept variable number of arguments
    public static void main(String[] args) {
        usingVarArgsAtFirst(32, 43, 24, 89, 100); // [32, 43, 24, 89, 100]

        usingVarArgsAtLast(2, 4, "Spiderman", "Batman", "Superman"); // 2, 4, [Spiderman, Batman, Superman]

    }

    // you can pass VarArgs in the one parameter only else must be the last in the list
    // it, always return values in array
    static void usingVarArgsAtFirst(int... VarArgs) {
        System.out.println(Arrays.toString(VarArgs));
    }

    static void usingVarArgsAtLast(int a, int b, String... VarArgs) {
        System.out.println(a + ", " + b + ", " + Arrays.toString(VarArgs));
    }

    // if you pass VarArgs in the mid of the parameter you can get
    // Error : "Vararg" parameter must be the last in the list

}
