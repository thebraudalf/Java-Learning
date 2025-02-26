package Strings;

public class Pretty_Printing {
    public static void main(String[] args) {

        // we can also use formatted print function as printf() method
        float floatValue = 45.243f;
        System.out.printf("Formated float value %.2f ", floatValue); // Formated float value 45.24

        // printing formatted pi
        System.out.printf("\nFormatted pi value %.3f", Math.PI); // Formatted pi value 3.142

        // printing formatted strings
        System.out.printf("\nFormatted string %s and %s.", "User", "User2"); // Formatted string User and User2.

    }
}
