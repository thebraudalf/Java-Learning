package com.OOPs.Introduction;

public class WrapperClass_and_GarbageCollection {
    // Wrapper Classes are classes in java is one whose object wraps or contains primitive datatypes
    // When we create an object to a wrapper class, it contains fields, and in these fields we store primitive data types

    public static void main(String[] args) {
        // When we need to change the values of a primitive datatypes we cannot do with functions
        // because java is pass by value
        int a = 10;
        int b = 20;

        swapsint(a, b);
        System.out.println(a + " " + b); // 10 20

        // with wrapper class
        Integer a1 = 10;
        Integer b1 = 20;

        swapInt(a1, b1);
        System.out.println(a1 + " " + b1); // 10 20


        // "final" keyword is used as a non-access specifier in java only applicable to a var, a method or a class.
        // It is used to restrict a user in java
        // using with primitive datatype
//        final int num = 23;
//        num = 34;

        // using with non-primitive datatype
        final Test obj = new Test("Random Text");
        obj.name = "Dummy Text";
        System.out.println(obj.name); // Dummy Text

        // if we reassign same value multiple times than it will be removed by garbage value collector
        Test test = new Test("R Text");
        System.out.println(test);

        for (int i = 0; i < 1000000; i++) {
            test = new Test("Again Random Text");
        }
    }

    static void swapsint(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swapInt(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class Test {
    final int num = 23;
    String name;

    Test(String name) {
        this.name = name;
    }

    // finalize() method of object class is a method which Garbage Collector always calls just before
    // the deletion of the object which is eligible for Garbage Collection to perform clean-up activity
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is to be destroyed.");
    }
}
