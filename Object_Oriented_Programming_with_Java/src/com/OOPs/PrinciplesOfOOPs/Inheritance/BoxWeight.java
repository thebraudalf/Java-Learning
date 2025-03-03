package com.OOPs.PrinciplesOfOOPs.Inheritance;

// It is called Child Class or Sub-Base Class which inherits members of Parent Class or Base Class using extends keyword
public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double w, double h, double weight){
        // Used to initialize values present in parent class
        // Calling the parent class constructor
        super(l, w, h);

        // Super keyword is reference var that is used to refer parent class objects.
        // It is generally used to access the specific var of a superclass.
        //System.out.println(super.weight);
        this.weight = weight;
    }

}
