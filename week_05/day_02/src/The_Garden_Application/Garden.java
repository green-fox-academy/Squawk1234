package The_Garden_Application;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plants> greens = new ArrayList();

    public void waterMe(int waterAmount) {
        int counter = 0;

        for (Plants plantcount : greens) {
            if (plantcount instanceof Flower) {
                if (plantcount.waterLevel < 5) {
                    counter++;
                }
            } else if (plantcount instanceof Tree) {
                if (plantcount.waterLevel < 10) {
                    counter++;
                }
            }
        }

        int waterAmountDiv = waterAmount / counter;

        for (Plants plant : greens) {
            if (plant instanceof Flower) {
                if (plant.waterLevel > 5) {
                    System.out.println(plant.color + " Flower doesnt needs water");
                } else {
                    ((Flower) plant).watering(waterAmountDiv);
                    if (plant.waterLevel > 5) {
                        System.out.println(plant.color + " Flower doesnt needs water");
                    } else {
                        System.out.println(plant.color + " Flower needs water");
                    }
                }
            }
            if (plant instanceof Tree) {
                if (plant.waterLevel > 10) {
                    System.out.println(plant.color + " Tree doesnt needs water");
                } else {
                    ((Tree) plant).watering(waterAmountDiv);
                    if (plant.waterLevel > 10) {
                        System.out.println(plant.color + " Tree doesnt needs water");
                    } else {
                        System.out.println(plant.color + " Tree needs water");
                    }
                }

            }
        }
    }
}
