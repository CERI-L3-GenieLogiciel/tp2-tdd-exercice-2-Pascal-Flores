import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanIntConvertorTest {
    
    @Test
    void shouldReturn0WhenEmpty() {
        RomanIntConvertor romanIntConvertor = new RomanIntConvertor();
        int result = romanIntConvertor.RomanToInt("");
        assertEquals(0, result);
    }

    @Test
    void shouldReturn1WhenI() {
        RomanIntConvertor romanIntConvertor = new RomanIntConvertor();
        int result = romanIntConvertor.RomanToInt("I");
        assertEquals(1, result);
    }

}