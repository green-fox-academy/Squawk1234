import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {

    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.


        try {
            Path filePath = Paths.get("./log.txt");
            List<String> lines = Files.readAllLines(filePath);
            List<String> unique = new ArrayList();


            for (int i = 0; i < lines.size(); i++) {
                String[] output = lines.get(i).split(" ");
                if (!unique.contains(output[8])) {
                    unique.add(output[8]);
                }
            }
            System.out.println(unique);


        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }


    }
}
