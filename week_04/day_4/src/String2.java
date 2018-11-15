public class String2 {

    public static void main(String[] args) {

        System.out.println(replaceMe("ertfeldekrex"));


    }

    private static String replaceMe(String replaceable) {
        if (replaceable.length() == 0) {
            return replaceable;
        } else {
            if (replaceable.charAt(0) == 'x') {
                return "" + replaceMe(replaceable.substring(1));
            } else {
                return replaceable.charAt(0) + replaceMe(replaceable.substring(1));
            }
        }
    }
}


// Given a string, compute recursively a new string where all the 'x' chars have been removed.