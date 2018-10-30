
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner oddEven = new Scanner(System.in);
        int userInput3 = oddEven.nextInt();


        if (userInput3 % 2 ==0) {
            System.out.println("Hey, that is an Even number mate"); // This block will NOT run
        } else {
            System.out.println("Gimme another number buddy! " + userInput3 + " is Odd"); // This block will run
        }


    }
}
