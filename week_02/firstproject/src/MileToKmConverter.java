import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner mileScanner = new Scanner(System.in);
        int userInput3 = mileScanner.nextInt();
        System.out.println(userInput3 + " mile " + "is: " + (userInput3 * 1.609344) + " km" );



    }
}