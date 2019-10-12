package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.SQLOutput;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "Message is {0}, shift is {1}, and translation is {2}")
    @CsvSource({"abc, 3, def", "olssv, 757, rovvy", "2nkjk, 2, invalid",
                "nkjk4, 1, invalid", "babkej, -10, rqrauz", "abc def, 1, bcd efg"})
    public void shift(String message, int shift, String translation) {

        CaesarShiftCipher myCipher = new CaesarShiftCipher();
        String result = myCipher.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(translation, result);

    }
}
