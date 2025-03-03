package com.OOPs.PrinciplesOfOOPs.Inheritance;

public class Introduction {
    public static void main(String[]args){
    /// Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class.
    /// In addition, you can add new fields and methods to your current class as well.

        // Calling Parent class and child classes
        Box box1 = new Box(2.44,4.23, 40.23);
        Box box2 = new Box(box1);
        System.out.println(box1.w + " " + box2.h); // 4.23 40.23

        BoxWeight box3 = new BoxWeight(2, 3, 4, 5);
        BoxWeight box4 = new BoxWeight(2,3, 4, 5);
        System.out.println(box3.w + " " + box4.weight); // 3.0 5.0


        Box box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.h + " " + box5.weight); //

        // There are many vars in both parent class and child classes
        // you're given the access to vars that are in the ref. type i.e. BoxWeight
        // hence, you should have access to weight var
        // this also means, that the ones you're trying to access should be initialized
        // but here, when the obj itself is of type of parent class, how will you call the constructor of child class
        // that is why error occur
        //BoxWeight box6 = new Box(2.0, 3.4, 4.453, 5.89);


    }
}
