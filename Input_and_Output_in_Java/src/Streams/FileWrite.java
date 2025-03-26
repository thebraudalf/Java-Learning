package Streams;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWrite {
    public static void main(String[]args){
        String[] words = { "Chill", "Pil", "Sil", "Drill" } ;

        String filename = "./Input_and_Output_in_Java/src/Streams/testFile.txt";

        // Performing operation to write file with streams
        try(PrintWriter pw = new PrintWriter(Files.newBufferedWriter(Paths.get(filename)))) {
            Stream.of(words).forEach(pw::println);
            System.out.println("Words written to the file");
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
