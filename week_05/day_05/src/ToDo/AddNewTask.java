package ToDo;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class AddNewTask {

    public AddNewTask(String arg, String addingWord) {

        try {
            Path filePath = Paths.get("./todo.txt");
            // List<String> lines = Files.readAllLines(filePath);
            FileWriter writer = new FileWriter();


            if (lines.size() == 0) {
                System.out.println("No todos for today! :)");
            } else {
                for (int i = 0; i < lines.size(); i++) {
                    System.out.println(i + 1 + " - " + lines.get(i));
                }
            }

        } catch (Exception e) {
            System.out.println("Uh-oh, could not write the file!");
        }

    }

    }
}
