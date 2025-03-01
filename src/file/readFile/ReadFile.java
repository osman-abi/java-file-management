package file.readFile;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            readFile("src/file/readFile/newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String fileName)
            throws IOException {
        FileReader file = new FileReader(fileName);
        StringBuilder content = new StringBuilder();
        int ch;
        while ((ch = file.read()) != -1) {
            content.append((char) ch);
        }
        System.out.println(content.toString());
        file.close();

    }
}
