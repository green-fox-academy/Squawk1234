package The_Garden_Application;

public class Flower extends Plants {


    public Flower(String color, int waterLevel) {
        super(color, waterLevel);
    }

    public void watering(int wateringamount) {
        this.waterLevel += wateringamount * 0.75;
    }


}
