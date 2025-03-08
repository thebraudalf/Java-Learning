package com.OOPs.ObjectClass;

public class SubClass {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass(23, 75.23f);
        SuperClass obj2 = obj1;

        if (obj1.equals(obj2)) { System.out.println("This is .equals overriding"); }


        System.out.println(obj1.getClass().getName()); // com.OOPs.ObjectClass.SuperClass

        System.out.println(obj1.hashCode()); // some random value(but it's a not memory address)
        System.out.println(obj2.hashCode()); // some random value
    }
}
