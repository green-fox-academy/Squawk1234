import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        System.out.println(copy("./myfile.txt"));

    }

    public static boolean copy(String source) {

        File sourceFile = new File(source);
        File newFile = new File("./newfile.txt");


        try {
            Files.copy(sourceFile.toPath(), newFile.toPath());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to read file" + source);
            return false;
        }

    }

}
