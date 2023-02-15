package calculator;

import org.junit.Assert;

public class CalculatorTest {
    @org.junit.Test
    public void calculatorTestOne() throws  Exception {
        Assert.assertEquals(Calculator.calculator("1+2"), 3);
    }

    @org.junit.Test
    public void calculatorTestTwo() throws  Exception {
        Assert.assertEquals(Calculator.calculator("1+2*5"), 11);
    }

    @org.junit.Test
    public void calculatorTestThree() throws  Exception {
        Assert.assertEquals(Calculator.calculator("1+2-5"), -2);
    }
}
