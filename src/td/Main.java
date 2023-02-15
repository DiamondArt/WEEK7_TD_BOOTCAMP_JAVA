package td;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Cardinalite cardinal = new Cardinalite((ArrayList<Integer>) Arrays.asList(23,45,78));
        List<Integer> arrayIntegers = new ArrayList<>(Arrays.asList(45,27,30));
        List<String> arrayStrings = new ArrayList<>(Arrays.asList("hello","hi","Akwaba"));

        Cardinalite cardinal = new Cardinalite((ArrayList<Integer>) arrayIntegers);
        Cardinalite cardinal2 = new Cardinalite((ArrayList<String>) arrayStrings);

        System.out.println("============== Test with type INTEGER =============");
        cardinal.addInput(65);
        cardinal.testInput(65);
        cardinal.testInput(130);

        System.out.println("======================================================");
        System.out.println("============== Test with type STRING =============");

        cardinal2.addInput("hello");
        cardinal2.testInput("hello");
        cardinal2.testInput("Bonjour");
        cardinal2.testInput("blabla");

    }
}
