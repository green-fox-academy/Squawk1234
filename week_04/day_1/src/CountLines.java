import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class CountLines {


    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("./myfile.txt");
            long countOfLines = Files.lines(filePath).count();
            System.out.println(countOfLines);

        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }
}


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.