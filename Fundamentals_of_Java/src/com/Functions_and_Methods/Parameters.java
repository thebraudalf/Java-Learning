package com.Functions_and_Methods;

public class Parameters {
    public static void main(String[] args) {

        // calling function and passing arguments to sum
        int sum = sum(3, 4);
        System.out.println(sum);

        // calling function and passing arguments to greet
        String greet = greet("User");
        System.out.println(greet);


    }

    // assigning parameters to sum
    static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // assigning parameter to greet
    static String greet(String name) {
        return "Hello " + name;
    }

}
