package Sharpie;

public class main {
    public static void main(String[] args) {
        Sharpie print = new Sharpie();

        print.color = "Red";
        print.width = 100;

        print.use();

        System.out.println(print.inkAmount);


    }

}
