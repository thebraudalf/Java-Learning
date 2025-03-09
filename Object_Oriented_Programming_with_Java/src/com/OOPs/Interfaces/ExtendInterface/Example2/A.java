package com.OOPs.Interfaces.ExtendInterface.Example2;

public interface A {

    // default implementations are useful for adding new methods to interfaces without breaking existing implementations.
    default void test(){
        System.out.println("This is test A.");
    }

}
