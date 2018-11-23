package CountLetters;

import java.util.HashMap;

public class CountLetter {

    public HashMap<Character, Integer> splitMe(String stingToHash) {

        HashMap<Character, Integer> myFirst = new HashMap<>();

        for (int i = 0; i < stingToHash.length(); i++) {
            char originL = stingToHash.charAt(i);


            if (myFirst.containsKey(originL)) {
                myFirst.put(originL, myFirst.get(originL) + 1);
            } else {
                myFirst.put(originL, 1);
            }
        }
        return myFirst;
    }


}
