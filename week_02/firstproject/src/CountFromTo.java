import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {



        System.out.println("Tell me a number: ");
        Scanner number1 = new Scanner(System.in);
        int userNumber1 = number1.nextInt();


        System.out.println("Tell me another number: ");
        Scanner number2 = new Scanner(System.in);
        int userNumber2 = number2.nextInt();

        if (userNumber2 < userNumber1) {
            System.out.println("The second number should be bigger");
        }
        else {
            for (int i = userNumber1; i < userNumber2; i++) {
                System.out.println(i);

            }

        }



        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

    }
}
