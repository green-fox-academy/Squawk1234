package Anagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {


    public boolean anagramTest(String first, String second) {

        char[] charactersfrom = first.toCharArray();
        char[] charactersfrom2 = second.toCharArray();
        Arrays.sort(charactersfrom);
        Arrays.sort(charactersfrom2);
        return Arrays.equals(charactersfrom, charactersfrom2);

    }
}
