public class String1 {

    public static void main(String[] args) {
        System.out.println(wordreplace("hgjfufx"));
    }

    public static String wordreplace(String word) {
        if (word.length() == 0) {
            return word;
        } else {
            if ( word.charAt(0) == 'x') {
                return "y" + wordreplace(word.substring(1));
            } else {
                return word.charAt(0) + wordreplace(word.substring(1));
            }

        }
    }


  /*  public static String wordreplace(String word) {
        if (word.contains("x")) {
            return word.replace("x", "y");
        } else {
            return word;
        }
    } */


}

// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

