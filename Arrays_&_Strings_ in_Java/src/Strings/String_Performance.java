package Strings;

public class String_Performance {
    public static void main(String[] args) {

        // printing alphabets by adding ascii values to numbers
        String series = "";

        for (int i=0; i<26; i++){

            // converting ascii value to character
            char ch = (char)('a' + i);
            series = series + ch; // series += ch
        }

        System.out.println(series); // abcdefghijklmnopqrstuvwxyz
    }

    // In every iteration character is assigning to series
    // from this new object is made in every iteration
    // new object is made because strings are immutable they cannot change
    // through this process wastage of memory occur

    // The time complexity is O(N^2)
}
