package Domino;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {


        int counter = 0;

        List<Domino> dominos = Dominoes.initializeDominoes();
        int dominoSize = dominos.size();
        List<Domino> newDominos = new ArrayList<>();



            for (int i = 0; i < dominos.size(); i++) {

                //   System.out.println(dominoNum.get(i));

                if (dominos.get(i).getLeftSide() == dominos.get(i + 1).getRightSide()) {

                }

                System.out.println(dominos.get(i));
            }
        }

    }




/*

[5, 2]
 -[4, 6]
[1, 5]
-[6, 7]
[2, 4]
-[7, 1]

*/
