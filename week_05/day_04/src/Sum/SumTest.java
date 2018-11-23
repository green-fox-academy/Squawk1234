package Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    Sum red = new Sum();



    @BeforeEach
    void setUp() {
    }


    @Test
    void sumMeTest() {
        ArrayList<Integer> checkArray = new ArrayList<>();
        checkArray.add(2);
        checkArray.add(4);
        checkArray.add(7);

        assertEquals(13, red.sumMe(checkArray));

    }
}