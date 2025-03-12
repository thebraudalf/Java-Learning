package com.OOPs.ExceptionHandling;

// Exception is an unwanted or unexpected event that occurs during the execution of a program (i.e. at runtime) and disrupts the normal flow of the program's instructions.
// Here we throw our custom exception via Exception class
public class newException extends Exception{
    public newException(String message){
        super(message);
    }
}
