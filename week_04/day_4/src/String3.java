public class String3 {

    public static void main(String[] args) {

        System.out.println(addMe("ertfeldekrex"));
    }

    private static String addMe(String addingWord) {
        if (addingWord.length() < 2) {
            return addingWord;
        }
        return addingWord.charAt(0) + "*" + addMe(addingWord.substring(1));
    }

}


