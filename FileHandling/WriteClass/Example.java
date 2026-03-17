package FileHandling.WriteClass;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example {

    public static void main(String[] args) throws IOException {
        try {
            Writer w = new FileWriter("/home/amoh/programming/java_tutorial/FileHandling/writeExample.txt");
            w.write("i love coding in java");
            w.close();
            System.out.println("message written successfully");
        }catch (IOException ex){
            System.out.println("Error occurred " + ex.getMessage());
        }
    }
}
