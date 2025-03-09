package path.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

public class FileOps {
    public static void main(String[] args) {
        Path file = Path.of("src/path/common/sample.txt");
        checkFile(file);
        try {
            getModifiedDateOfFile(file);
            getOwnerOfFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void checkFile(Path file) {
        boolean exists = Files.exists(file);
        System.out.println("File exists: " + exists);
    }

    private static void getModifiedDateOfFile(Path file) throws IOException {
        FileTime lastModifiedTime = Files.getLastModifiedTime(file);
        System.out.println("Last modified time: " + lastModifiedTime);
    }

    private static void getOwnerOfFile (Path file) throws IOException {
        Object owner = Files.getOwner(file);
        System.out.println("Owner: " + owner);
    }
}
