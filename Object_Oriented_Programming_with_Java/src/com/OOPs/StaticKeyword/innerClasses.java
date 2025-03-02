package com.OOPs.StaticKeyword;

// another classes static variables can be access by other classes static methods
class Test1 {
    static String name;

    Test1(String name) {
        Test1.name = name;
    }
}

// In Java, an inner class is a class that is defined inside another class. An inner class can access the member of the outer class,
// including private members, and it can be used to implement callbacks and event handlers.
public class innerClasses {

    // Static Nested Class: It is a static class that is defined inside another class.
    // It does not have access to the non-static members of the outer class.
    static class Test2 {
        String name;

        public Test2(String name) {
            this.name = name;
        }

        // Overriding toString() method of String class
        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Test1 test = new Test1("User");
        System.out.println(test.name); // User
        Test1 test2 = new Test1("UserAgain");
        System.out.println(test.name); // UserAgain
        System.out.println(test2.name); // UserAgain

        Test2 a = new Test2("User1");
        System.out.println(a.name); // User1

        Test2 b = new Test2("User2");
        System.out.println(b.name); // User2

        //System.out.println(a); // it will print some garbage value
        System.out.println(a.toString()); // User1
        System.out.println(b.toString()); // User2
    }
}

// We cannot add static keyword in outer classes because it is not dependent on any class
// and static is dependent on class
//static class Test{
//
//}
