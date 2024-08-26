package com.Conditionals_and_Iterations;

public class switch_case {
    public static void main(String[]args){
        // switch case statements is used for more efficient multi-way branching, Instead of using multiple if-else statements
        int num = 3;
        switch (num){
            case 1 -> System.out.println("Num 1");
            case 2 -> System.out.println("Num 2");
            case 3 -> System.out.println("Num 3");
            default -> System.out.println("None of the case");
        }
    }
}
