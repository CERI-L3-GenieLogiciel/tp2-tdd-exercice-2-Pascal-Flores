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

    @Test
    void shouldReturn1000WhenM() {
        int result = romanIntConvertor.RomanToInt("M");
        assertEquals(1000, result);
    }

    @Test
    void shouldThrowExceptionWhenInvalid() {
        assertThrows(IllegalArgumentException.class, () -> romanIntConvertor.RomanToInt("A"));
    }

    @Test
    void shouldReturn2WhenII() {
        int result = romanIntConvertor.RomanToInt("II");
        assertEquals(2, result);
    }

    @Test
    void shouldReturn3WhenIII() {
        int result = romanIntConvertor.RomanToInt("III");
        assertEquals(3, result);
    }

    @Test
    void shouldReturn4WhenIV() {
        int result = romanIntConvertor.RomanToInt("IV");
        assertEquals(4, result);
    }
}