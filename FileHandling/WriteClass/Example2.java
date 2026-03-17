package FileHandling.WriteClass;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example2 {

    public static void main(String[] args) {
        try (Writer writer = new FileWriter("/home/amoh/programming/java_tutorial/FileHandling/writeExample.txt", true)) {
            writer.write("\nThis line was appended later.");
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
