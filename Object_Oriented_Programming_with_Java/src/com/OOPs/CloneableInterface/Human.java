package com.OOPs.CloneableInterface;

// Cloneable interface allows the implementing class to have its object to be cloned instead of using a new operator.
public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

    // clone() method in Java is used to clone an object.
    // Shallow copy means creating a clone of an obj, where the obj itself is copied but the nested objs are not copied.
    // Instead of duplicating the nested objs, a shallow copy only copies the reference to those nested objs.
    // This means that both the original obj and the copied obj share the same references to the nested objs.
    //@Override
    //public Object clone() throws CloneNotSupportedException {
    //return super.clone();
    //}

    // Deep Object Cloning or Copy means creating an exact copy of the original object by copying the fields from the original
    // objects to the cloned objects. A separate memory is allocated for the cloned objects where the original object is copied.
    @Override
    public Object clone() throws CloneNotSupportedException {
        Human clonedObj = (Human) super.clone();

        clonedObj.arr = new int[clonedObj.arr.length];
        for (int i = 0; i < clonedObj.arr.length; i++) {
            clonedObj.arr[i] = this.arr[i];
        }
        return clonedObj;
    }
}
