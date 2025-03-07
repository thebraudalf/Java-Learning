package com.OOPs.PrinciplesOfOOPs.Polymorphism;

public class Main {
    public static void main(String[]args){
        // example of compile time polymorphism
        Shapes shape = new Shapes();
        shape.area(); // This is area shapes
        shape.area("User"); // Hello! User


        /// example of run time polymorphism
        Circle circle = new Circle();
        circle.area(); // Area of circle is pi * r * r
        Square square = new Square();
        square.area(); // Area of square is side * side

        // when an overridden method is called through a superclass ref.
        // Java determines which version(superclass/subclasses) of that method is to be executed based upon the type of the obj being referred to at the time the call occurs.
        // Thus, this determination is made at run time.
        // At run-time, it depends on the type of the obj being referred to(not the type of the reference var) that determines which version of an overridden method will be executed
        // A superclass ref var can refer to a subclass obj. This is known as upcasting.
        // Java uses this fact to resolve calls to overridden methods at run-time.
        Shapes newCircle = new Circle();
        newCircle.area(); // Area of circle is pi * r * r

    }
}
