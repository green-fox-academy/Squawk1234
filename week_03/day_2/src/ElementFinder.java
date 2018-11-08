import java.util.*;

public class ElementFinder {
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int numSearch = 7;
        if (arrayList.contains(numSearch)) {
            System.out.println("Hoorray");
        } else {
            System.out.println("Nooooo");
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == numSearch) {
                System.out.println("Hoorray");
            } else {
                System.out.println("Nooooo");
            }


            //System.out.println(containsSeven(arrayList));
            // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
            // The output should be: "Noooooo"
            // Do this again with a different solution using different list methods!

        }
    }
}