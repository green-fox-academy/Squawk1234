import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));


        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

       System.out.println(makingMatches(boys, girls));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> boys, ArrayList<String> girls ) {
        ArrayList<String> join = new ArrayList();

        for (int j = 0; j <= boys.size()-1; j++) {
            if (join.size() < boys.size() + girls.size()-1) {
                join.add(boys.get(j));
                join.add(girls.get(j));
            }

            else {
                join.add(boys.get(j));
            }
        }
        return join;

    }


}