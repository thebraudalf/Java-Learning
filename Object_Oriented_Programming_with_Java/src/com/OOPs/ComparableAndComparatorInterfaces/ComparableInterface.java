package com.OOPs.ComparableAndComparatorInterfaces;

/// Comparable interface in java is used to define the natural ordering of objects for a user-defined class. It is a part of the java.lang package,
/// and it provides a compareTo() method to compare instances of the class. A class has to implement a Comparable interface to define its natural ordering.
public class ComparableInterface implements Comparable<ComparableInterface>{
    int rollNo;
    float marks;

    public ComparableInterface(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return  "rollNo=" + rollNo + ", marks=" + marks;
    }

    // implementing or overriding compareTo() method
    @Override
    public int compareTo(ComparableInterface o) {
        System.out.println("In compareTo method");
        return (int)(this.marks - o.marks);
    }

}
