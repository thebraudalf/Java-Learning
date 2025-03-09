package com.OOPs.PrinciplesOfOOPs.Abstraction;

/// Abstraction in Java is the process of hiding the implementation details and only showing the essential
/// functionality or features to the user. This helps simplify the system by focusing on what an object does rather than how it does it.
// "abstract" is a non-access modifier in java applicable for classes, and methods but not variables.
//  Any class that contains one or more abstract methods must also be declared with an "abstract" keyword
public abstract class superClass {
    int age;
    final int VALUE;

    public superClass(int age){
        this.age = age;
        this.VALUE = 32432;
    }

    static void hello(){
        System.out.println("Hello User!");
    }

    void normalFn(){
        System.out.println("This is normal function.");
    }

    // An abstract method is a method that is declared without implementation
    abstract void career();
    abstract void favoriteHero();
}

/* Note:
1. Any class that contains one or more abstract methods must also be declared with an "abstract" keyword.
2. There can be no obj of an abstract class. That is, an abstract class can not be directly instantiated with the new keyword.
3. You cannot use abstract and static keywords in single method
4. You also cannot use abstract and final keywords in single class as well as methods.
*/
