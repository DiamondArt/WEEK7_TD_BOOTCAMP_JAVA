package voyelOnly;

import org.junit.Assert;

public class VoyelOnlyTest {
    @org.junit.Test
    public void voyelOnlyTestOne() throws Exception {
        String input = "Hello world";
        String output = VoyelOnly.voyeOnly(input);
        String expected = "eoo";
        Assert.assertEquals(expected, output);
    }

    @org.junit.Test
    public void voyelOnlyTestTwo() throws  Exception {
        String input = "Adaci Course";
        String output = VoyelOnly.voyeOnly(input);
        String expected = "Aaioue";
        Assert.assertEquals(expected, output);

    }
}
