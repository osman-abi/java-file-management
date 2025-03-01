package file.createFile;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String fileName = "src/file/createFile/newFile.txt";
        try {
            createFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void createFile(String fileName)
            throws IOException {
        File newFile = new File(fileName);
        if (newFile.createNewFile()) {
            System.out.println("File created: " + newFile.getName());
        } else {
            System.out.println("File already exists.");
        }

    }
}
