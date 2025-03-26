package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileRead {

    // method to filter and convert the string to Uppercase
    private static List<String> filterAndConvertToUpper(Stream<String> stream, int length) {
        return stream.filter(s -> s.length() == length)
                .map(String::toUpperCase)
                .toList();
    }

    // performing operation to read file
    public static void main(String[] args) {
        String fileName = "./Input_and_Output_in_Java/src/Streams/testFile.txt";

        try(Stream<String> lines = Files.lines(Paths.get(fileName))) {
            List<String> filteredStr = filterAndConvertToUpper(lines, 3);
            System.out.println(filteredStr); // [HER, VIL, MIL]
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
