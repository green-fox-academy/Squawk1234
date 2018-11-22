package CharSequence;

public class Gnirts implements CharSequence {

    String word;


    public Gnirts(String word){
        this.word = word;
    }

    public char charAt(int i) {
        return word.charAt((word.length()-1)-i);
    }
}
