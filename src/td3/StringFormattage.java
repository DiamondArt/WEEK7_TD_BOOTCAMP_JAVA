package td.src.td3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercice 1 :
 * Écrivez une fonction qui prend une liste de chaînes de caractères
 * et qui renvoie la liste des chaînes de caractères en majuscules.
 * */
public class StringFormattage {

    public static void main(String[] args) {

        //Exercice 1
        System.out.println("=========== EXERCICE 1 ================");
        List<String> strList = Arrays.asList("Java", "Python", "JavaScript","ANGULAR", "PHP");
        List<String> stringList = (List<String>) strList.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
        System.out.println(stringList);

        //Method 2
        System.out.println("\nEXO1 METHOD 2\n");
        System.out.println(convertToUpperCase(strList));


        System.out.println("===== EXERCICE 2 =====");

        //Exercice 2
        //false
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5,12,20);

        int summPair = intList.stream().filter(num->(num%2)== 0).mapToInt(Integer::intValue).sum();
        System.out.println("summ paire = "+ summPair);

        //SOLUTION 2
        System.out.println(sumEvenNumbers(intList));;

        //Exercice 3
        double average = intList.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average = "+average);

        //Exercice 4
        List<String> stringLists = stringList.stream().filter(str ->(str.length() >= 5)).collect(Collectors.toList());
        System.out.println(stringLists);

    }
    /**
     * CORRECTIONS
     * */

    //Exercice1
    public static List<String> convertToUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    //exercice 2
    public static int sumEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

}
