import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanIntConvertorTest {

    RomanIntConvertor romanIntConvertor;

    @BeforeEach
    void init() {
        romanIntConvertor = new RomanIntConvertor();
    }

    /////////////////////////
    // Test for RomanToInt //
    /////////////////////////
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

    @Test
    void shouldReturn9WhenIX() {
        int result = romanIntConvertor.RomanToInt("IX");
        assertEquals(9, result);
    }

    @Test
    void shouldReturn14WhenXIV() {
        int result = romanIntConvertor.RomanToInt("XIV");
        assertEquals(14, result);
    }

    @Test
    void shouldReturn90WhenXC() {
        int result = romanIntConvertor.RomanToInt("XC");
        assertEquals(90, result);
    }

    @Test
    void shouldReturn400WhenCD() {
        int result = romanIntConvertor.RomanToInt("CD");
        assertEquals(400, result);
    }

    @Test
    void shouldReturn900WhenCM() {
        int result = romanIntConvertor.RomanToInt("CM");
        assertEquals(900, result);
    }

    @Test
    void shouldReturn1994WhenMCMXCIV() {
        int result = romanIntConvertor.RomanToInt("MCMXCIV");
        assertEquals(1994, result);
    }

    @Test
    void shouldThrowExceptionWhenMoreThan3SameLetters() {
        assertThrows(IllegalArgumentException.class, () -> romanIntConvertor.RomanToInt("IIII"));
    }

    /////////////////////////
    // Test for IntToRoman //
    /////////////////////////

    @Test
    void shouldReturnEmptyWhen0() {
        String result = romanIntConvertor.IntToRoman(0);
        assertEquals("", result);
    }

    @Test
    void shouldThrowExceptionWhenNegative() {
        assertThrows(IllegalArgumentException.class, () -> romanIntConvertor.IntToRoman(-1));
    }
    @Test
    void shouldReturnIWhen1() {
        String result = romanIntConvertor.IntToRoman(1);
        assertEquals("I", result);
    }

    @Test
    void shouldReturnVWhen5() {
        String result = romanIntConvertor.IntToRoman(5);
        assertEquals("V", result);
    }

    @Test
    void shouldReturnXWhen10() {
        String result = romanIntConvertor.IntToRoman(10);
        assertEquals("X", result);
    }

    @Test
    void shouldReturnLWhen50() {
        String result = romanIntConvertor.IntToRoman(50);
        assertEquals("L", result);
    }

    @Test
    void shouldReturnCWhen100() {
        String result = romanIntConvertor.IntToRoman(100);
        assertEquals("C", result);
    }

    @Test
    void shouldReturnDWhen500() {
        String result = romanIntConvertor.IntToRoman(500);
        assertEquals("D", result);
    }

    @Test
    void shouldReturnMWhen1000() {
        String result = romanIntConvertor.IntToRoman(1000);
        assertEquals("M", result);
    }

    @Test
    void shouldReturnIIWhen2() {
        String result = romanIntConvertor.IntToRoman(2);
        assertEquals("II", result);
    }

    @Test
    void shouldReturnIIIWhen3() {
        String result = romanIntConvertor.IntToRoman(3);
        assertEquals("III", result);
    }
}