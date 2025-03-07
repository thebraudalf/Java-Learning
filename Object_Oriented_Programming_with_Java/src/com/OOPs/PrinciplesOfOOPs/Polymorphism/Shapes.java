package com.OOPs.PrinciplesOfOOPs.Polymorphism;

/// In Java, Polymorphism refers to the ability of a message to be displayed in more than one form
/// This concepts is a key feature of OOPs, and it allows objects to behave differently based on their specific class type
/// There are two types of Polymorphism:
public class Shapes {
    // Compile-Time Polymorphism is also known as static polymorphism or early binding. Compile-Time polymorphism is a polymorphism
    // that is resolved during the compilation process. Overloading of methods is called through the reference var of a class
    void area () {
        System.out.println("This is area shapes");
    }

    void area(String str){
        System.out.println("Hello! " + str);
    }
}
