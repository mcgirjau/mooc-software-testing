package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();

        int result = roman.convert("I");
        Assertions.assertEquals(1, result);

        result = roman.convert("L");
        Assertions.assertEquals(50, result);
    }

    @Test
    public void multipleDigits() {
        RomanNumeral roman = new RomanNumeral();

        int result = roman.convert("XX");
        Assertions.assertEquals(20, result);

        result = roman.convert("CCC");
        Assertions.assertEquals(300, result);
    }

    @Test
    public void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();

        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);

        result = roman.convert("MCCCLXXXVII");
        Assertions.assertEquals(1387, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();

        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);

        result = roman.convert("CMXCIX");
        Assertions.assertEquals(999, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();

        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);

        result = roman.convert("CCXC");
        Assertions.assertEquals(290, result);
    }

    // This test fails - the RomanNumeral class does not yet handle invalid numbers
    @Test
    public void invalidNumber() {
        RomanNumeral roman = new RomanNumeral();

        int result = roman.convert("VX");
        Assertions.assertEquals(-1, result);

        result = roman.convert("XXC");
        Assertions.assertEquals(-1, result);
    }
}
