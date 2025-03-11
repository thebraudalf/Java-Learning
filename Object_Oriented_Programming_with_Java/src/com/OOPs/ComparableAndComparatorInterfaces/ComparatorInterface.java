package com.OOPs.ComparableAndComparatorInterfaces;

import java.util.Comparator;

// Comparator interface in java used to order the objects of user-defined classes. A comparator obj is capable of comparing two objects of the same class.
public class ComparatorInterface {
    int rollNo;
    float marks;

    public ComparatorInterface(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "rollNo=" + rollNo +
               ", marks=" + marks;
    }
}

class SortByRollNo implements Comparator<ComparatorInterface>{

    // implementing or overriding compare method
    @Override
    public int compare(ComparatorInterface o1, ComparatorInterface o2) {
        return o1.rollNo - o2.rollNo;
    }
}
