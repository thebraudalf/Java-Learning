package com.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

public class input {
    public static void main(String[] args) {
        // .writeString() method is used to return the file path and it can throw four types of exceptions. It is better to use when the content of the file is short.
        String text = "This is a text in which User is typing. \uD83D\uDCBB";
        Path filepath = Paths.get("./File_Handling_in_Java/src/com/fileHandling/file.txt");
        try {
            Files.writeString(filepath, text);
            System.out.println(Files.readString(filepath));
        } catch (IOException error) {
            System.out.println("Error occurred: " + error.getMessage());
        }
    }
}
