package CountLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLetterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void splitMe() {

        CountLetter count = new CountLetter();

        String stingToHash = "abca";
        int result = count.splitMe(stingToHash).get('a');


        assertEquals(2, result);
    }
}