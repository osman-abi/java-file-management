package file.appendFIle;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            appendFile("src/file/appendFIle/newFile.txt", "Hello, my wonderful World!");
            appendFile("src/file/appendFIle/newFile.txt", "\nI am appending this line to the file.");
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

        private static void appendFile (String fileName, String content)
            throws IOException {
            FileWriter newFile = new FileWriter(fileName, true);
            newFile.write(content);
            newFile.close();
        }
    }
