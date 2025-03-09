package com.OOPs.Interfaces.ExtendInterface.Example1;

public class Main implements B{
    @Override
    public void greet() {
        System.out.println("Hello!");
    }

    @Override
    public void test() {
        System.out.println("Test it");
    }
}
