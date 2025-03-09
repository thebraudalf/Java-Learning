package com.OOPs.Interfaces.ExtendInterface.Example2;

public class Main implements A, B{

    @Override
    public void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        A a = new Main();
        a.test(); //
    }
}
