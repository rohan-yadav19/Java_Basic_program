import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        // Replace with the path of the file you want to check
        File file = new File("example.txt");

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("File size in bytes: " + file.length());
            System.out.println("Is a file: " + file.isFile());
            System.out.println("Is a directory: " + file.isDirectory());
            System.out.println("Last modified: " + file.lastModified());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
