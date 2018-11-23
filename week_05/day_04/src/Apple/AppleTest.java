package Apple;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {


    String message = "example";
    Apple messageUtil = new Apple(message);



    @BeforeEach
    void setUp() {
    }

    @Test
    public void testPrintMessage() {

        assertEquals(message, messageUtil.printMe() );
    }
}