import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanIntConvertorTest {

    RomanIntConvertor romanIntConvertor;

    @BeforeEach
    void init() {
        romanIntConvertor = new RomanIntConvertor();
    }
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

    @Test
    void shouldReturn5WhenV() {
        RomanIntConvertor romanIntConvertor = new RomanIntConvertor();
        int result = romanIntConvertor.RomanToInt("V");
        assertEquals(5, result);
    }

    @Test
    void shouldReturn10WhenX() {
        RomanIntConvertor romanIntConvertor = new RomanIntConvertor();
        int result = romanIntConvertor.RomanToInt("X");
        assertEquals(10, result);
    }
}