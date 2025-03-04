package com.OOPs.PrinciplesOfOOPs.Inheritance;

// In Multilevel inheritance, a derived class will be inheriting a base class, and as well as the derived class
// also acts as the base class for other classes.
public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }
}
