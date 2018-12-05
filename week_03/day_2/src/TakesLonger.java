public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        /*String builder = " always takes longer than ";

        quote = quote.substring(0, 20) + builder + quote.substring(21, quote.length());

        System.out.println(quote); */

        StringBuilder ab = new StringBuilder();
        ab.append(" always takes longer than ");

        quote = quote.substring(0, 20) + ab.toString() + quote.substring(21, quote.length());
        System.out.println(quote);
    }
}