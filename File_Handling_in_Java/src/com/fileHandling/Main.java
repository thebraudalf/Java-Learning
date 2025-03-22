package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // File Class is representation of a file or directory pathname. Because file and directory names have different formats on different platforms, a simple string is not adequate to name them.
        try {
            File obj = new File("file.txt");
            // .createNewFile() method is used to create new file
            obj.createNewFile();
            System.out.println("File Created"); // File Created
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        // delete a file
        try {
            File newFile = new File("text.txt");
            newFile.createNewFile();
            if (newFile.delete()){
                System.out.println(newFile.getName());
            }
        } catch (IOException error) {
            System.out.println("Error occurred: " + error);
        }
   }
}
