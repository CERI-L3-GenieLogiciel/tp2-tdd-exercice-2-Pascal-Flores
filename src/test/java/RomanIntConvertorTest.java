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
        int result = romanIntConvertor.RomanToInt("");
        assertEquals(0, result);
    }

    @Test
    void shouldReturn1WhenI() {
        int result = romanIntConvertor.RomanToInt("I");
        assertEquals(1, result);
    }

    @Test
    void shouldReturn5WhenV() {
        int result = romanIntConvertor.RomanToInt("V");
        assertEquals(5, result);
    }

    @Test
    void shouldReturn10WhenX() {
        int result = romanIntConvertor.RomanToInt("X");
        assertEquals(10, result);
    }

    @Test
    void shouldReturn50WhenL() {
        int result = romanIntConvertor.RomanToInt("L");
        assertEquals(50, result);
    }

    @Test
    void shouldReturn100WhenC() {
        int result = romanIntConvertor.RomanToInt("C");
        assertEquals(100, result);
    }

    @Test
    void shouldReturn500WhenD() {
        int result = romanIntConvertor.RomanToInt("D");
        assertEquals(500, result);
    }

}