package com.Type_Conversion_and_Casting;

import java.util.Scanner;

public class typeConversion {
    public static void main(String[] args) {
        // Type Conversion : Type Conversion is the process of converting a value of one data type to another.

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter floating number : ");

        // Widening (Automatic) Type Conversion
        // This happens automatically when you assign a smaller data type to larger data type.
        // float intValue = input.nextInt();
        // System.out.println(intValue); // print float value if only int value is given

        // Narrowing (Explicit) Type Conversion
        // This requires explicit casting when you assign a larger data type to a smaller data type.
        float floatValue = input1.nextFloat();
        int typeConversion = (int) floatValue;
        System.out.println(typeConversion); // prints integer value


        // you cannot convert int to float through input like this else error occurred
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter number : ");

        // int floatValue = input.nextFloat();
        // System.out.println(floatValue); // incompatible types: possible lossy conversion from float to int

    }
}
