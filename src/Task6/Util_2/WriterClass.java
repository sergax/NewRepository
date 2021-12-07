package Task6.Util_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterClass extends ReaderClass {
    public void writerData(String str) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("listOfUsers.txt",true))) {
        writer.write(str + "\n");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
