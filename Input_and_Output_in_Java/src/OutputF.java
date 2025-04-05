import java.io.*;

public class OutputF {
    static void output() {
        // OutputStream abstract class is the superclass of all classes representing an output stream of bytes. An output stream accepts output bytes and sends them to some sink.
        OutputStream os = System.out;

        // if we write Illegal Character in int type we get error
        //os.write(😍); // illegal character: '\ud83d\ude0d'

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello World");
            osw.write(98);
            osw.write('A');
            osw.write('\n');
            char[] arr = "Hello World".toCharArray();
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }

        try(FileWriter fw = new FileWriter("./Input_and_Output_in_Java/src/new-file.txt", true)) {
            fw.write("Append this");
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        try(BufferedWriter fw = new BufferedWriter(new FileWriter("./Input_and_Output_in_Java/src/new-file.txt"))) {
            fw.write("Again append this");
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }
}
