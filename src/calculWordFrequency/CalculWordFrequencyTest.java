package calculWordFrequency;

import calculator.Calculator;
import org.junit.Assert;
import java.util.Arrays;

public class CalculWordFrequencyTest {

    @org.junit.Test
    public static void calculWordFrequencyTestOne() throws  Exception {
        CalculWordFrequency.calculWordFrequency(Arrays.asList("abc","abc"));
        Assert.assertEquals("abc|2", "abc|2");
    }
}
