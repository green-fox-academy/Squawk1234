package Practice.FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            List<String> appledata = Files.readAllLines(Paths.get("apple.csv"));
            List<String[]> splittedApple = new ArrayList<>();
            for (String line : appledata) {
                splittedApple.add(line.split(";"));
            }
            //find max value
            //first item as default
            //iterate through all the items
            //
            String mostAppleString = splittedApple.get(0)[3];
            int mosApple = Integer.parseInt(mostAppleString);
            for (int i = 1; i < splittedApple.size(); i++) {
                if (Integer.parseInt(splittedApple.get(i)[3]) > mosApple) {
                    mosApple = Integer.parseInt(splittedApple.get(i)[3]);
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    /*    Path path = Paths.get("file.txt");
        {
            try {List<String> lines = Files.readAllLines(path);
                System.out.println(lines);
                lines.add("Hello 2");
            //    Files.write(path, "Hello".getBytes());
                Files.write(path, lines);
                System.out.println(lines);


            } catch (IOException e) {
                e.printStackTrace();
            }
        } */

    }
}

// read all lines,
//then split them at ";",
//find the value
