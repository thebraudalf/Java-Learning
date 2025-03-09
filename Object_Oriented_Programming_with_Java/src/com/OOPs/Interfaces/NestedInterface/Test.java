package com.OOPs.Interfaces.NestedInterface;

public class Test {

    // We can declare interfaces as members of a class or another interface. Such as interface is called member interface or nested interface.
    public interface nestedInterface{
        boolean isOdd(int num);
    }
}

class B implements Test.nestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
