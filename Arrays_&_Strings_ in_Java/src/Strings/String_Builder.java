package Strings;

public class String_Builder {

    // StringBuilder class in java represents a mutable sequence of characters, it is an alternative for immutable String class
    public static void main(String[] args){

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<26; i++){
            char ch = (char)('a' + i);

            // .append() method is used to append the specified characters to the string
            stringBuilder.append(ch);
        }

        System.out.println(stringBuilder); // abcdefghijklmnopqrstuvwxyz

        // In every iteration characters are appending to stringBuilder
        // from this new object is not made in every iteration
        // through this process wastage of memory does not occur

        // toString() method in StringBuilder
        System.out.println(stringBuilder.toString()); // abcdefghijklmnopqrstuvwxyz

        // .deleteCharAt() method is used to remove the character from the specified position in the sequence
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder); // bcdefghijklmnopqrstuvwxyz

    }
}
