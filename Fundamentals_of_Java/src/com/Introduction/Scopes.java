package com.Introduction;

public class Scopes {
    // Scopes : It is a region of program where a defined variable can exist and be accessed
    // Types of scopes are Function Scope, Block Scope, and Loop Scope

    // Function/Method Scope : In this you cannot access one function scope variable from another function scope
    public static void main(String[]args){
        int a = 10;
        int b = 20;

      //  System.out.println(d); // Error : Cannot resolve symbol 'd'


      // Block Scope : In this you cannot access inner scope from outer scope, but you can outer scope from inner scope
        {
            // outer variable accessed by inner
            System.out.println(a); // 10
            System.out.println(b); // 20

            int c = 23;

        }

        // System.out.println(c); // Error : Cannot resolve symbol 'c


        // Loop Scope : In this you cannot access loop scope from outer scope
        for(int i=1; i<5; i++){
            System.out.println("This loop is working!!" + i);
        }

       // System.out.println(i); // Cannot resolve symbol 'i'

    }

    // function to check function scope
    static void testFunc(){
        int d = 34;

      //  System.out.println(a); // Error : Cannot resolve symbol 'a'
    }
}
