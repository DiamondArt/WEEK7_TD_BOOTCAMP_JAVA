package td.src.td2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Calcul de la moyenne d'une liste d'entier
 * Écrivez une fonction en Java qui prend en entrée une liste d'entiers et qui renvoie la moyenne
 * de ces entiers en utilisant la programmation fonctionnelle.
 * Utilisez la méthode stream() pour transformer la liste d'entiers en un flux d'entiers.
 * Utilisez la méthode mapToInt() pour transformer le flux d'entiers en un flux d'entiers primitifs.
 * Utilisez la méthode average() pour calculer la moyenne des entiers.
 * */
public class AverageClass {
    public static void main(String[] args) {

        ArrayList<Integer> arrayNumberOne = new ArrayList<>(Arrays.asList(12,65,55,22,89));
        System.out.println("\n ========================== Method 1: classic method ===================");
        System.out.println("Result for classic method "+ calculateAverage(arrayNumberOne));

        System.out.println("\n========================== Method 2: Using Stream  ===================");
        System.out.println("Result with Stream using "+calculMoyenne(arrayNumberOne));
    }

    public static double calculMoyenne(List<Integer> entiers) {
        return entiers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public static double calculateAverage(List<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return (double) sum / arr.size();
    }

}
