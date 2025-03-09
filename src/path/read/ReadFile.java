package path.read;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) {
        readFile("src/path/read/sample.txt");
    }

    static void readFile(String fileName) {
        Path file = Path.of(fileName);
        try {
            String content = Files.readString(file, StandardCharsets.UTF_8);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
