package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader implements Reader {

    private String path;

    public CustomFileReader(String path) {
        this.path = path;
    }

    @Override
    public String read() {
        StringBuilder output = new StringBuilder();
        File file = new File(this.path);
        try (FileReader reader = new FileReader(file); BufferedReader bf = new BufferedReader(reader);) {
            String input = bf.readLine();
            while (null != input) {
                input = bf.readLine();
                output.append(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }
}
