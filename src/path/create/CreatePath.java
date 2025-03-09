package path.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreatePath {
    public static void main(String[] args) {
        get_temp_directory();
        try {
            createTempFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void get_temp_directory() {
        Path tempDirectory = Path.of(System.getProperty("java.io.tmpdir"));
        System.out.println("Temp directory: " + tempDirectory);
    }

    private static void createTempFile() throws IOException {
        Path file = Files.createTempFile("sample", ".json");
    }

    private static void createTempDirectory() throws IOException {
        Path directory = Files.createTempDirectory("tmp");
    }

    private static void createDirectory() throws IOException {
        Path directory = Files.createDirectory(Path.of("src/path/create/sample"));
    }

    private static void createFile() throws IOException {
        Path file = Files.createFile(Path.of("src/path/create/sample.txt"));
    }
}
