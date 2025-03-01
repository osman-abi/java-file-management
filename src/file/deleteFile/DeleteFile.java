package file.deleteFile;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        deleteFile("src/file/deleteFile/newFile.txt");
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
