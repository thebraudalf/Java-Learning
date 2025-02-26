package Strings;

import java.util.Arrays;

public class String_Comparison_and_Methods {
    public static void main(String[] args) {

        // There are two ways to compare strings

        // first way
        // using "==" comparison operator
        // It is used to check if reference variables are pointing to same object or not
        String var1 = "User";
        String var2 = "User";

        System.out.println(var1 == var2); // true

        String var3 = "No User";
        System.out.println(var1 == var3); // false

        // second way
        // using .equals() method
        // It is use to check values of reference variable
        String str1 = "User";
        String str2 = "User";

        System.out.println(var2.equals(str1)); // true

        String str3 = "newUser";
        System.out.println(str3.equals(str2)); // false


        // some extra methods

        // .charAt() method to get character of character array
        System.out.println(str3.charAt(5)); // e

       // .toCharArray() method to get array of characters
        System.out.println(str3.toCharArray()); // newUser

        // .toLowerCase() method is used to lower the case of string
        System.out.println(str3.toLowerCase()); // newuser

        // .split() method is used to split the string around matches of the given regular expressions
        System.out.println(Arrays.toString(str3.split(" "))); // [newUser]

        //.strip() method is used to remove whitespaces form strings
        System.out.println("     user     ".strip()); // user

    }
}
