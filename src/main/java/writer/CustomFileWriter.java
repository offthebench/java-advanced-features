package writer;

import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter implements Writer {

    @Override
    public void write(String message) {
        try {
            FileWriter fileWriter = new FileWriter("output/fileWriter.txt");
            fileWriter.write(message);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
