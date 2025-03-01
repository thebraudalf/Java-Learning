package com.OOPs.StaticKeyword;

public class staticKeyword {
    // "static" keyword in java is used for mainly memory management.
    // The static keyword in java is used to share the same variable or method of a given class.
    // means static keyword belongs to the class rather than instance of the class.
    // This is used for a constant variable or a method that is same for every instance of a class
    public static void main(String[]args){
        // We can access static methods in other static method
        fun();

        // but we cannot access non-static methods in static method without referencing it
//        fun2();

        // So, we have to reference it
        staticKeyword obj = new staticKeyword();
        obj.fun2(); /* Hello World
                       Hello World
                    */
    }

    // we know static methods are not dependent on objects
    static void fun() {
        // So, we cannot use this because it requires an instance
        // but the function or method we are using it in does depend on instances
        // we cannot access non-static stuff without referencing their instances in a static context
        // greeting();

        // Here we are referencing it
        staticKeyword obj = new staticKeyword();
        obj.greeting(); // Hello World
    }

    // we can access non-static method in other non-static method
    void fun2() {
        greeting();
    }

    // we know that something which is non-static belongs to an object
    void greeting(){
        // here we can access static function in non-static
//        fun();
        System.out.println("Hello World");
    }
}

