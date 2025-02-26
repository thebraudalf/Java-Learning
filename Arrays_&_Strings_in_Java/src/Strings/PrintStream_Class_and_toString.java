package Strings;

import java.util.Arrays;

public class PrintStream_Class_and_toString {

    // PrintStream class is ability to print the representations of various data values conveniently
    // some methods of PrintStream class
    public static void main(String[] args) {
        // println() method is used to print input or variable
        System.out.println("24"); // 24

        // toString() method is used to print objects in string
        String str = "User";
        System.out.println(str.toString()); // User

        int[] arr = new int[] {1, 2, 3};
        System.out.println(arr.toString()); // it will print garbage value like this [I@7b23ec81 because java doesn't know which object is to print

        // for this we use Arrays class to print array object
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]

    }


}
