import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
        System.out.println("Tell me the secret number:");
        Scanner secretNumberSc = new Scanner(System.in);
        int userSecretNumber = secretNumberSc.nextInt();




        System.out.println("Now, guess the number");
        Scanner guessTheNumber = new Scanner(System.in);
        int userinputtNumber = guessTheNumber.nextInt();


        while (userinputtNumber != userSecretNumber) {

            if (userSecretNumber > userinputtNumber) {
                System.out.println("The stored number is higher");;
            }

            else {
                System.out.println("The stored number is lower");
            }

            System.out.println("You found the number: " + userSecretNumber);


        };






    }
}
