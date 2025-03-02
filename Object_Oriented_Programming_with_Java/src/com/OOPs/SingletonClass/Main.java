package com.OOPs.SingletonClass;

public class Main {
    //
    public static void main(String[] args) {
        // all 4 reference vars are pointing to just one object
        singletonClass obj1 = singletonClass.getInstance();
        singletonClass obj2 = singletonClass.getInstance();
        singletonClass obj3 = singletonClass.getInstance();
        singletonClass obj4 = singletonClass.getInstance();

    }

}
