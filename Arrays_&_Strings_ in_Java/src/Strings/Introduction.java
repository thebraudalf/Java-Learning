package Strings;

public class Introduction {

    // String : It is a type of object that can stores character of values and in java every character stores 10 bits i.e. UTF 16-bit encoding
    // Its acts same as an the array of character
    // There are two ways to create String :-

    public static void main(String[] args){

        // First way
        // String Literal : It is used to make java more memory efficient because
        // reference variables are pointing same object in the String constant pools
        // hence we don't need to create another object
        String var1 = "User";
        String var2 = "User";

        // here var1 and var2 are both pointing to same object
        System.out.println(var1); // User
        System.out.println(var2); // User

        // here var1, var2 and var3 are pointing to same object
        String var3 = var1;

        System.out.println(var3); // User


        // Second way
        // Using new keyword : In ths we create string object in non pool heap memory
        // In this reference variables doesn't point to same object
        String var4 = new String("User2");
        String var5 = new String("User2");

        System.out.println(var4); // User2
        System.out.println(var5); // User2


        // Immutables objects are objects whose elements cannot be modified once declared
        // In java strings are immutable, as the content shared storage in a single pool to minimize the creating a copy of same value
        // That's why String class and all wrapper classes are immutable
        String immutableStr = "User3";
        System.out.println(immutableStr); // User3

        // In this creating a new object we do not modified reference variable
        immutableStr = "User4";
        System.out.println(immutableStr); // User4

    }

}
