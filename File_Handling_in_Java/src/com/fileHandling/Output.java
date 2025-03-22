package com.fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public static void main(String[] args) {
        // FileWriter class is used to write data in character form to a file
        try (FileWriter fw = new FileWriter("./File_Handling_in_Java/src/com/fileHandling/newFile.txt")) {
            String text = "This is a text in which User is typing. \uD83D\uDCBB";
            fw.write(text);
            System.out.println("File created.");
        } catch (IOException error) {
            System.out.println("Error occurred: " + error.getMessage());
        }

        // FileReader in Java is a class which can be used to read a stream of characters from the files.
        try (FileReader fr = new FileReader("./File_Handling_in_Java/src/com/fileHandling/file.txt")) {
            int letters = fr.read();
            while (fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }
            System.out.println();
        } catch (IOException error) {
            System.out.println("Error occurred: " + error.getMessage());
        }
    }
}
