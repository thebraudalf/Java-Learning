package com.OOPs.LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;

interface Operation {
    int operation(int a, int b);
}

public class lambdaExpressions {
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        // Lambda Expression in Java, represent instances of functional interfaces(interfaces with a single abstract method).
        // They provide concise way to express instances of single-method interfaces using a block of code.
        //list.forEach((item) -> System.out.println(item * 2));

        // Lambda Expression implement the only abstract method or function
        Consumer<Integer> lamFunc = (item) -> System.out.println(item * 2);
        list.forEach(lamFunc);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;


        lambdaExpressions calc = new lambdaExpressions();
        System.out.println(calc.operate(5, 2, sum)); // 7
        System.out.println(calc.operate(5, 2, sub)); // 3
        System.out.println(calc.operate(5, 2, mul)); // 10
    }
}
