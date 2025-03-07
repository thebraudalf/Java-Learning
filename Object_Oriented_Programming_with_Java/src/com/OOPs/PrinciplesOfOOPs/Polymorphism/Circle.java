package com.OOPs.PrinciplesOfOOPs.Polymorphism;

public class Circle extends Shapes{
    // Run-Time Polymorphism in Java known as Dynamic Method Dispatch. It's a process in which
    // a function call to the overridden method is resolved at runtime.
    // Method overriding in Java occurs when a subclass implements a method which is already defined in the superclass or Base class.
    // The method in the subclass must have the same signature as in the superclass. It allows the subclass to modify the inherited methods.
    void area(){
        System.out.println("Area of circle is pi * r * r");
    }
}
