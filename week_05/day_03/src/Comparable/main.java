package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main  {
    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(4,2));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        System.out.println(dominoes);

      //  System.out.println(dominoes.get(0).compareTo(dominoes.get(dominoes.size()-1)));
        Collections.sort(dominoes);
        System.out.println(dominoes);


        Domino d1 = new Domino(4, 2);
        Domino d2 = new Domino(5,1);

        System.out.println(d1.compareTo(d2));
// the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]

    }

}
