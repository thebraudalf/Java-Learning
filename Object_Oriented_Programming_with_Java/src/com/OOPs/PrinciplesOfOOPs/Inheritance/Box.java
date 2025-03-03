package com.OOPs.PrinciplesOfOOPs.Inheritance;

// It is called a parent or base class which is inherited by child or Sub-Base class
public class Box {
    // problem statement for inheritance
    private double l;
    double w;
    double h;

    // Used to init through super keyword in child class
    double weight;

    Box () {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box (double side) {
        // super() class is a type of class in java which is a reference var that is used to refer parent class constructors.
        // we can use super() class here because parent class is inherited by Object Class
        // super();
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box (double l, double w, double h) {
        System.out.println("Box Class Constructor");
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box oldBox) {
        this.l = oldBox.l;
        this.w = oldBox.w;
        this.h = oldBox.h;
    }

}
