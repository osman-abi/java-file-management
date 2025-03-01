package file.writeFile;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            writeFile("src/file/writeFile/newFile.txt", "Hello, my wonderful World!");
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(String fileName, String content)
            throws Exception {
        FileWriter file = new FileWriter(fileName);
        file.write(content);
        file.close();

    }
}
