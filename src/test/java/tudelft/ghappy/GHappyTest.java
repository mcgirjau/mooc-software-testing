package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    public GHappy myString;

    @BeforeEach
    public void initialize() {
        this.myString = new GHappy();
    }

    @Test
    public void hasOnlyGBeginning() {

        boolean result = myString.gHappy("gglkansdf");
        Assertions.assertTrue(result);

        result = myString.gHappy("gaaaaa");
        Assertions.assertFalse(result);
    }

    @Test
    public void hasOnlyGEnd() {

        boolean result = myString.gHappy("dlnfgg");
        Assertions.assertTrue(result);

        result = myString.gHappy("jjdjfjfdjg");
        Assertions.assertFalse(result);

    }

    @Test
    public void hasOnlyGMiddle() {

        boolean result = myString.gHappy("adfgglkhrggdfa");
        Assertions.assertTrue(result);

        result = myString.gHappy("dlfknsgkjdnfggghj");
        Assertions.assertFalse(result);
    }

    @Test
    public void hasGAnywhere() {
        boolean result = myString.gHappy("ggaffgds");
        Assertions.assertFalse(result);

        result = myString.gHappy("sgkggghg");
        Assertions.assertFalse(result);

        result = myString.gHappy("ggggahggsdfgg");
        Assertions.assertTrue(result);

        result = myString.gHappy("ggagg");
        Assertions.assertTrue(result);
    }

}
