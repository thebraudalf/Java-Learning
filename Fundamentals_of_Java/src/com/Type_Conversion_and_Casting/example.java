package com.Type_Conversion_and_Casting;

public class example {
    public static void main(String[] args) {
        // it is an example to understand type promotion
        byte byteVal = 39;
        char charVal = 's';
        short shortVal = 23434;
        int intVal = 6004343;
        float floatVal = 4.634f;
        double doubleVal = 4372.33234;
        // evaluating expressions which convert byte to float, char to int, double to short
        double result = (floatVal * byteVal) + (intVal / charVal) - (doubleVal - shortVal);
        //  float + int - double = double

        System.out.println(result); // 71453.3942225

        System.out.println((floatVal + byteVal) + " " + (intVal / charVal) + " " + (doubleVal - shortVal)); // 43.634 52211 -19061.66766

    }
}
