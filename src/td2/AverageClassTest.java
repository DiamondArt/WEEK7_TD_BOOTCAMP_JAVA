package td.src.td2;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;

import static td.src.td2.AverageClass.calculMoyenne;

public class AverageClassTest {
    @org.junit.Test
    public void averageClassTestOne() throws  Exception {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Assert.assertEquals(calculMoyenne(numberList), 2.5, 0);
    }

    @org.junit.Test
    public void averageClassTestTwo() throws  Exception {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Assert.assertEquals(calculMoyenne(numberList), 2.5,0);
    }
}
