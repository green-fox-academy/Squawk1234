import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {

    public static void main(String[] args) {

        writeMultiple("./myfile.txt", "apple", 5);

    }

    public static void writeMultiple(String path, String word, int num) {


        try {
            Path filePath = Paths.get(path);

            List<String> content = new ArrayList();

            for (int i = 0; i < num; i++) {
                content.add(word);
            }
            Files.write(filePath, content);

        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }
    }


}



