package com.OOPs.Generics;

import java.util.ArrayList;
import java.util.Arrays;

/// Here we make a custom ArrayList with the help of Generics

// Generics means Parameterized types. The idea is to allow a type (like Integer, String, etc., or user-defined types)
// to be a parameter to methods, classes, and interfaces. Using Generics, it's possible to create classes that work with different
// data types. An entity such as a class, interface, or method that operates or a parameterized type is a generic entity.
public class customArrayList<T> {

    // Object is the superclass of all other classes, and Object reference can refer to any obj.
    // These features lack type safety. Generics add that type of safety feature
    private Object[] data;
    private static int DEFAULT_VALUE = 10;
    private int size = 0; // it is also working as index value

    public customArrayList(){
        data = new Object[DEFAULT_VALUE];
    }

    public void add(T num){
        if(isFull()){
            resizeIt();
        }
        data[size++] = num;
    }

    public void resizeIt(){
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull(){
        return size == data.length;
    }


    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }


    public int size(){
        return size;
    }


    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "customArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        // Normal arraylist from collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(42);
        list.set(1, 43);
       System.out.println(list); // [23, 43]

        // Custom ArrayList build with Generics
        customArrayList<Integer> list2 = new customArrayList<>();
        list2.add(23);
        list2.add(33);
        list2.add(43);
        list2.add(53);
        list2.size();

        list2.remove();
        list2.size();

        System.out.println(list2); // customArrayList{data=[23, 33, 43, 53, null, null, null, null, null, null], size=3}

    }
}
