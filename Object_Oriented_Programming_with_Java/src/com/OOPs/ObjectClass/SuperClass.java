package com.OOPs.ObjectClass;

// Object Class in Java is present in java.lang package. Every class in java is directly or indirectly derived from the Object class.
// If a class does not extend any other class then it is a direct child class of the Java Object class and if it extends another class then it is indirectly derived.
public class SuperClass {
    int num;
    float gpa;

    public SuperClass(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // it will return hashcode
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
    // Downcasting refers to the procedure when subclass type refers to the obj
    // of the parent class is known as downcasting. If it is performed directly compiler gives an error
    // as ClassCastException is thrown at runtime.
        return this.num == ((SuperClass)obj).num;
    }
}
