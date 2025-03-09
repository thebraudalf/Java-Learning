package com.OOPs.Interfaces;

// An interface in Java is defined as an abstract type used to specify the behaviour of a class.
// An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.
public interface Engine {
    static final int PRICE = 708229;

    // Static methods in interfaces should have a body
    //static void method();


    void start();
    void acc();
    void stop();
}
