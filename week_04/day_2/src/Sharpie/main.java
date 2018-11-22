package Sharpie;

public class main {
    public static void main(String[] args) {
        Sharpie red = new Sharpie("Red", 100);
        Sharpie blue = new Sharpie("Blue", 100);
        Sharpie black = new Sharpie("Black", 100);

        black.inkAmount = 0;

        SharpieSet sharpieSet = new SharpieSet();

        sharpieSet.add(red);
        sharpieSet.add(blue);
        sharpieSet.add(black);

        red.use();

        System.out.println(red.inkAmount);


      System.out.println(sharpieSet.countUsable());












    }

}
