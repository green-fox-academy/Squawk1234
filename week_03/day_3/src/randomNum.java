import java.util.Random;

public class randomNum {


    public static void main(String[] args) {

        int max = 50;
        int min = 2;
        int randomDouble = (int) (Math.random() *
                (max - min) + 1) + min ;

        System.out.println(randomDouble);
    }
}
