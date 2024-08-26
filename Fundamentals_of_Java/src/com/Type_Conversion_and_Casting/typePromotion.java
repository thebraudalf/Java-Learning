package com.Type_Conversion_and_Casting;

public class typePromotion {
    public static void main(String[] args) {
        // Type Promotion : Type Promotion is automatic conversion of smaller data types to larger data types to ensure that operations are performed correctly.
        // Automatic type promotion in expression

        // Example 1 : converting int to byte
        int intVal = 257;
        byte byteVal = (byte) (intVal);

        System.out.println(byteVal); // 1 how? 257 % 256 = 1

        // Example 2 : getting final value
        byte firstVal = 40;
        byte secondVal = 50;
        byte thirdVal = 100;

        // java automatically evaluating expression by converting byte to int or long
        int finalVal = 40 * 50 / 100;

        System.out.println(finalVal); // 20

        // Example 3 : evaluating expression by using byte
        byte b = 50;

        // you cannot evaluate expression in byte because java automatically evaluates expression in int
        // b = b * 2;

        // Example 4 : assigning letter or word to int
        int letter = 'd';
        System.out.println(letter); // 100 it prints the ascii value of d

        // so you can print words of any languages because java follows unicode principles
        System.out.println("नमस्ते"); // नमस्ते

    }
}
