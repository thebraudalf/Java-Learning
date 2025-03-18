package StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        // StringBuffer is a class in Java that represents a mutable sequence of characters. It provides an alternative
        // to the immutable String class, allowing you to modify the contexts of a string without creating a new object every time.
        // Constructor 1 By default the initial capacity is 16
        StringBuffer sb = new StringBuffer();

        // constructor 2
        StringBuffer sb2 = new StringBuffer(32);

        // constructor 3
        StringBuffer sb3 = new StringBuffer("This is a long String.");

        // append() method to append string
        sb.append("This is a String");
        // in StringBuffer the another string is appended
        sb.append(" !!!");

        String str = sb.toString();
        System.out.println(sb.toString()); // This is a String !!!

        // also you can insert new particular char at index
        sb.insert(4, "dfs");
        System.out.println(sb.toString()); // Thisdfs is a String !!!

        // to delete particular string
        sb.delete(4, 6);
        System.out.println(sb.toString()); // Thiss is a String !!!

        // to replace particular string
        sb.replace(4, 6, "fsdfsdf");
        System.out.println(sb.toString()); // Thisfsdfsdfis a String !!!

        // to remove whitespaces
        String collectionOfWords = " dfsfsd fdf  fdsfsdf   dfsd";
        System.out.println(collectionOfWords);

        System.out.println(collectionOfWords.replaceAll("\s", ""));

        // to split
        String arr = "This, is, User, !!";
        String[] text = arr.split(",");
        System.out.println(Arrays.toString(text)); // [This,  is,  User,  !!]

        // generating random string
        String newStr = GenerateRandom.generateRandom(6);
        System.out.println(newStr); // random generated string

        // rounding off through DecimalFormat class
        DecimalFormat df = new DecimalFormat("0.342");
        System.out.println(df.format(7.29)); // 7.342
    }
}
