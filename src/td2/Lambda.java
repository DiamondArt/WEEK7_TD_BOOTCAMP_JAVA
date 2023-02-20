package td.src.td2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Exercice 1: Ecrire une lambda expression qui prend deux entiers en entrée et renvoie leur somme.
 * Exercice 2: Ecrire une lambda expression qui prend une chaîne en entrée et renvoie sa longueur.
 * Exercice 3: Ecrire une lambda expression qui prend un tableau d'entiers en entrée et renvoie
 * la somme de tous les éléments.
 *
 * Exercice 4: Ecrire une lambda expression qui prend une liste de chaînes en entrée
 * et renvoie une liste contenant la longueur de chaque chaîne.
 *
 * Exercice 5: Ecrire une lambda expression qui prend une liste d'entiers en entrée
 * et renvoie une liste contenant les carrés de ces entiers.
 *
 * Exercice 6: Ecrire une lambda expression qui prend une liste de chaînes en entrée et
 *renvoie une chaîne contenant la concaténation de toutes les chaînes de la liste.
 *
 * Exercice 7: Ecrire une lambda expression qui prend une liste de chaînes en entrée et
 * renvoie une liste contenant toutes les chaînes qui commencent par la lettre "J".
 **/
public class Lambda {

    public static void main(String[] args) {

        System.out.println("===========EXO1========================");
            LambdaInterface lm;
        lm = (a, b) -> {
            return a+b;
        };
        System.out.println("La somme est "+lm.summ(23,78));

        //Method 2
        int a = 5, b = 7;
        IntBinaryOperator addition = (x, y) -> x + y;
        int sum = addition.applyAsInt(a, b);
        System.out.println(sum);


        System.out.println("\n===========EXO2========================");

        LambdaInterface2 lm2 = (string) -> {
            return string.length();
        };
        System.out.println("Text length is "+lm2.stringLength("hello world"));

        //Method 3
        String strs = "Hello, World!";
        ToIntFunction<String> length = s -> s.length();
        int len = length.applyAsInt(strs);
        System.out.println(len);

        System.out.println("\n===========EXO3========================");
        ArrayList<Integer> arrs = new ArrayList<>(Arrays.asList(23,45,66,89));

        LambdaInterface3 lm3 = (arr) -> {
            int summ = 0;
            for(int el: arr) {
                summ += el;
            }
            return summ;
        };
        System.out.println("Array items sum is "+ lm3.sumArray(arrs));

        //Method 2
        int[] arrr = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arrr);
        int summ = stream.reduce(0, (x, y) -> x + y);
        System.out.println(summ); // Output: 15

        System.out.println("\n===========EXO4========================");

        List arrLen = new ArrayList<>();
        ArrayList<String> arrayString = new ArrayList<>(Arrays.asList("Bonjour","julia","Love","Sorry","Nice","Jolie", "John"));

        LambdaInterfaceClass4 lm4 = (arr) -> {
            for (String el : arr) {
                arrLen.add(el.length());
            }
            return arrLen;
        };
        System.out.println("Array list item length "+ lm4.getLength(arrayString));

        // Method 2
        List<String> strList = Arrays.asList("Java", "Python", "JavaScript", "PHP");
        Function<String, Integer> lengths = s -> s.length();
        List<Integer> lenList = strList.stream().map(lengths).collect(Collectors.toList());
        System.out.println(lenList); // Output: [4, 6, 10, 3]

        System.out.println("\n===========EXO5========================");

        List<Integer> arraySquare = new ArrayList<>();
        LambdaInterfaceClass5 lm5 = (arr) -> {
            for (int el: arr) {
                arraySquare.add((el*el));
            }
            return arraySquare;
        };
        System.out.println("Array List "+arrs);
        System.out.println("Array list of items square "+ lm5.getNumberSquare(arrs));

        //Method 2
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> square = x -> x * x;
        List<Integer> squareList = intList.stream().map(square).collect(Collectors.toList());
        System.out.println(squareList); // Output: [1, 4, 9, 16, 25]


        System.out.println("\n===========EXO6========================");

        LambdaInterfaceClass6 lm6 = (arr) -> {
            String concatString = "";
            for (String str : arr) {
                concatString += str;
            }
            return concatString;
        };

        System.out.println("Array string "+arrayString);
        System.out.println("Concatanation of Array string is "+ lm6.chaine(arrayString));

        //Method 2
        List<String> strListe = Arrays.asList("Java", "Python", "JavaScript", "PHP");
        String concatStr = strListe.stream().reduce("", (x, y) -> x + y);
        System.out.println(concatStr); // Output: JavaPythonJavaScriptPHP

        System.out.println("\n===========EXO7========================");

        LambdaInterfaceClass7 lm7 =  (arr) -> {

            List listContainsLetterJ = new ArrayList<>();
            for(String el : arr) {
                if(el.startsWith("j") || el.startsWith("J")  ){
                    listContainsLetterJ.add(el);
                }
            }
            return listContainsLetterJ  ;
        };

        System.out.println("List of string contain letter J is "+  lm7.getStringBeginJ(arrayString));

        //Method 2
        List<String> strLists = Arrays.asList("Java", "Python", "JavaScript", "PHP");
        Predicate<String> startsWithJ = s -> s.startsWith("J");
        List<String> jList = strLists.stream().filter(startsWithJ).collect(Collectors.toList());
        System.out.println(jList); // Output: [Java, JavaScript]

        //voir java doc pour les streams

    }

}
