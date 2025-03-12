package com.OOPs.ExceptionHandling;

/// Exception Handling in java allows developers to manage runtime errors effectively by using mechanisms like try-catch and finally block, etc.
public class Main {

    // ArithmeticException: It is thrown when there’s an illegal math operation.
    // "throws" keyword is used to declare that a method might throw one or more exceptions.
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // "throw" keyword is used to explicitly throw an exception
            throw new ArithmeticException("Don't divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            // it will throw Arithmetic Exception
            //divide(a, b);

            // it will throw normal Exception
            throw new Exception("Exception thrown for fun");
        } catch (ArithmeticException aEx) {
            System.out.println("Arithmetic Exception occur: " + aEx.getMessage()); // Arithmetic Exception occur: Don't divide by zero

        } catch (Exception ex) {
            System.out.println("Exception occur: " + ex.getMessage()); // Exception occur: Exception thrown for fun
        } finally {
            System.out.println("This block will execute"); // This block will execute
        }


    }
}
