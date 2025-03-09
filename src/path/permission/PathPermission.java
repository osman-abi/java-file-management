package path.permission;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

public class PathPermission {
    public static void main(String[] args) {
        try {
            Path file = Path.of("src/path/permission/sample.txt");
            getPermission(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void getPermission(Path file) throws IOException{
        Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(file);
        System.out.println("Permissions: " + permissions);
    }
}
