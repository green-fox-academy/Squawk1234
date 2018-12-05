package Pirates2;

public class Main {

    public static void main(String[] args) {

        Pirates sparrow = new Pirates();
        Pirates jack = new Pirates();
        Pirates william = new Pirates();
        Ship blackDiamond = new Ship();
        Ship grayGoose = new Ship();

        blackDiamond.fillShip();
        grayGoose.fillShip();

        System.out.println(blackDiamond.pirates.size());
        System.out.println(grayGoose.pirates.size());


/*        william.brawl(jack);


        System.out.println("Jack alive: " + jack.alive);
        System.out.println("Sparrow alve: " + sparrow.alive);
        System.out.println("Will alve: " + william.alive);
        System.out.println("Will drunk level: " + william.drunkLevel);
        System.out.println("Jack drunk level: " + jack.drunkLevel);
        System.out.println("Sparrow drunk level: " + sparrow.drunkLevel);

*/
    }
}
