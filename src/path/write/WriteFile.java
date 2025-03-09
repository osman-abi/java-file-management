package path.write;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {

    public static void main(String[] args) {
        writeFile("src/path/write/newFile.txt", "Hello, World!");

    }

    private static void writeFile(String fileName, String content) {
        try {
            Files.writeString(Path.of(fileName), content);
        } catch (Exception e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
