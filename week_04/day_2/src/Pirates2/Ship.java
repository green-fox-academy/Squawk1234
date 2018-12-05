package Pirates2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

    public List<Pirates> pirates;
    private Pirates captain;

    public Ship() {
        pirates = new ArrayList<>();
    }

    public void fillShip() {
        this.captain = new Pirates();
        int randomNumber = getNumber();
        for (int i = 0; i < randomNumber; i++) {
            pirates.add(new Pirates());
        }
    }

    private static Random random = new Random();

    public static int getNumber() {
        return random.nextInt(100);
    }

    public int countPiratesAlive() {
        int countAlivePirates = 0;
        for (int i = 0; i < pirates.size(); i++) {
            if (pirates.get(i).isAlive()) {
                countAlivePirates++;
            }

        }

        return countAlivePirates;
    }

 /*   public boolean battle() {
        return this.countPiratesAlive() - this.captain.getDrunkLevel()
    } */

}
