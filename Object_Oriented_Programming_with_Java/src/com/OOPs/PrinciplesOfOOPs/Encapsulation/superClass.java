package com.OOPs.PrinciplesOfOOPs.Encapsulation;

// Encapsulation in Java is a principle that combines data and methods in a class.
// It allows implementation details to be hidden while exposing a public interface for interaction.
public class superClass {
    private String name;

    // encapsulate below method
    void getName(){ System.out.println("The name is " + name); };
    void setName(String name){ this.name = name; }
}