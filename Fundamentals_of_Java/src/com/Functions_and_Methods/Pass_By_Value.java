package com.Functions_and_Methods;

import java.util.Arrays;

public class Pass_By_Value {
    public static void main(String[] args) {
        // Java is strictly pass by value, meaning that it always passes a copy of actual parameter when calling a function or method.
        // In case of primitive data type variable cannot be changed
        int val1 = 10;
        int val2 = 20;

        // adding va1 to val2
        System.out.println(add(val1, val2)); // 30

        // the val1 is not changed
        System.out.println(val1); // 10

        // In case of non-primitive data type, Java passes a copy of the reference to the object. Means that while you cannot change the reference itself, you can modify the object that reference points to
        int[] arr = {1, 3, 5, 14, 23, 20};

        // changing arr[0] element
        changeArr(arr);

        System.out.println(Arrays.toString(arr)); // [34, 3, 5, 14, 23, 20]

        // you cannot change String because they are immutable
        String name = "UserName";

        // changing the string
        changeStr(name);

        System.out.println(name); // UserName

    }

    // function to add
    static int add(int x, int y) {
        x += y;
        return x;
    }

    // function to change array element
    static int changeArr(int[] arr) {
        return arr[0] = 34;
    }

    // function to change string
    static String changeStr(String naam) {
        return naam = "Email";
    }

}

