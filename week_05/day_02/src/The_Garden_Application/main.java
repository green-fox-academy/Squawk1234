package The_Garden_Application;

public class main {

    public static void main(String[] args) {

        Garden myGarden = new Garden();

        Flower yellow = new Flower("Yellow", 0);
        Flower blue = new Flower("Blue", 0);
        Tree purple = new Tree( "Purple", 0);
        Tree orange = new Tree("Orange ", 0);


        myGarden.greens.add(yellow);
        myGarden.greens.add(blue);
        myGarden.greens.add(purple);
        myGarden.greens.add(orange);


        myGarden.waterMe(40);
        System.out.println("-----");
        myGarden.waterMe(70);


    }
}
