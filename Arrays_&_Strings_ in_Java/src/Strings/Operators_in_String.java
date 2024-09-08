package Strings;

import java.util.ArrayList;

public class Operators_in_String {
    public static void main(String[]args){

        // we use "+" operator for concatenating strings
        System.out.println("a" + "b"); // ab

        // we use also "+" operator for adding ascii values
        System.out.println('a' + 'b'); // 195


        // int will be converted to a Integer (Wrapper class) that will call toString() method
        // this is same as after few steps : "a" + "1"
        System.out.println("a" + 1); // a1

        // converting ascii value to char
        System.out.println((char)('a' + 2)); // c

        // we also add string to arraylist
        System.out.println("user" + new ArrayList<>()); // user[]

        // we also add string to wrapper classes
        System.out.println("User" + new Integer(56)); // User56

        // concatenate both objects
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans); // 56[]

        // adding string to ascii value
        System.out.println("a" + 'a'); // aa

    }
}
