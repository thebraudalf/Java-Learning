package com.Type_Conversion_and_Casting;

public class typeCasting {
    public static void main(String[] args) {
        // Type Casting : Type Casting is similar to type conversion, but it is more explicitly controlled by user.
        // Widening (Automatic) Type Casting
        // Automatically done by Java when converting to smaller type to larger type
        int intValue = 2343;
        long longValue = intValue;
        float floatValue = longValue;

        System.out.println(intValue); // 2343
        System.out.println(longValue); // 2343
        System.out.println(floatValue); // 2343.0

        // Narrowing (Explicit) Type Casting
        // Requires explicitly by user
        double doubleVal = 2343.343;
        long longVal = (long) doubleVal;
        int intVal = (int) longVal;

        System.out.println(doubleVal); // 2343.343
        System.out.println(longVal); // 2343
        System.out.println(intVal); // 2343

    }
}
