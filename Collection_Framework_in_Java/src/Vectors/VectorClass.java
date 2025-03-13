package Vectors;

import java.util.*;

public class VectorClass {
    // A vector provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the arrays needed.
    // This is identical to Arraylist in terms of implemetation.
    // However, the primary difference between a vector and Arraylist is that a Vector is synchronized and an Arraylist is non-synchronized.
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        for (int i = 0; i < 5; i++) {
            v.add(i);
        }
        System.out.println(v);


    }

}