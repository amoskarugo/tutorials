package FileHandling.ReaderClass;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example {


    public static void main(String[] args) throws IOException {

        try {
            Reader r = new FileReader("/home/amoh/programming/java_tutorial/FileHandling/readExample.txt");

            int data = r.read();

            while(data != -1){
                System.out.print((char) data + " ");
                data = r.read();
            }

            r.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
