package Anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram newTest = new Anagram();

    @BeforeEach
    void setUp() {
    }

    @Test
    void anagramTest() {

        String first = "java";
        String second = "ajva";

        assertEquals(true, newTest.anagramTest(first, second));

    }
}