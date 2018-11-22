package The_Garden_Application;

public class Tree extends Plants {

    public Tree(String color, int waterLevel) {
        super(color, waterLevel);
    }


    public void watering(int wateringamount) {
        waterLevel += wateringamount * 0.4;
    }


}