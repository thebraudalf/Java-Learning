import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class InputF {
    static void input(){
      // InputStreamReader is used to translate byte to character
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Input some text");
            int letters = isr.read();
            while (isr.ready()){
                System.out.println(letters);
                System.out.println((char) letters);
                letters = isr.read();
            }
            System.out.println();
        } catch(IOException error) {
            System.out.println(error.getMessage());
            System.out.println(Arrays.toString(error.getStackTrace()));
        }

        // creating new file
        try {
            File f = new File("./Input_and_Output_in_Java/src/new-file.txt");
            f.createNewFile();
            if (f.delete()) {
                System.out.println(f.getName());
            }
        } catch(IOException error) {
            System.out.println(Arrays.toString(error.getStackTrace()));
        }

        // writing in new file
        String text = "This is a text";
        Path filepath = Paths.get("./Input_and_Output_in_Java/src/new-file.txt");
        try {
            Files.writeString(filepath, text);
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }

        // reading a file
        try(FileReader fr = new FileReader("./Input_and_Output_in_Java/src/new-file.txt")) {
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char)letters);
            }
            fr.close();
            System.out.println();
        } catch(IOException error) {
            System.out.println(error.getMessage());
        }

        // byte to char stream then reading char stream
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(br.readLine());
        } catch(IOException err) {
            System.out.println(err.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader("./Input_and_Output_in_Java/src/new-file.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        } catch(IOException err){
            System.out.println(err.getMessage());
        }
    }
}
