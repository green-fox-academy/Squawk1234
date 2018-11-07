import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        ArrayList<String> join = new ArrayList<String>();

        join.addAll(girls);


        for (int i = 0; i < boys.size(); i+= +2) {
            join.add(boys.get(i));
        }

        System.out.println(join);
    }
}



       // System.out.println(makingMatches(girls, boys));

