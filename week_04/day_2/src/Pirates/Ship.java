package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

    private List<Pirate> pirates;
    private Pirate captain;
    public Ship(){

        pirates = new ArrayList<>();
        pirates.add(new Pirate());
    }

    public void fillShip() {
        this.captain = new Pirate();
        int randomNumber = new Random().nextInt();
        for (int i = 0; i < randomNumber; i++) {
            pirates.add(new Pirate());
        }

      //  public boolean battle(Ship ) {
      //      int n = 0;

        }

    }



