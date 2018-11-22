package CharSequence;

public class Shifter implements CharSequence {

    String word2;
    int shifting;


    public Shifter(String word2, int shifting){
        this.word2 = word2;
        this.shifting = shifting;
    }

    public char charAt(int i) {
        return word2.charAt(shifting + i);
    }
}
