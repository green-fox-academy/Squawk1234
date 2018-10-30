
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int remainingSeconds = 60 - currentSeconds;
        int remainingMinutes = (60 - currentMinutes)*60;
        int remainingHours = (24 - currentHours)*3600;

        System.out.println( remainingHours + remainingMinutes + remainingSeconds );

    }
}