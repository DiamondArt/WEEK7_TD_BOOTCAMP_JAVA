package td;

public class Mains {
    public static void main(String[] args) {
        // Créer un ensemble d'entiers
        Ensemble<Integer> ensembleEntiers = new Ensemble<>();
        ensembleEntiers.ajouter(10);
        ensembleEntiers.ajouter(20);
        ensembleEntiers.ajouter(30);
        ensembleEntiers.ajouter(20); // cet élément ne sera pas ajouté car il est déjà présent
        System.out.println("Ensemble d'entiers : " + ensembleEntiers);

        // Créer un ensemble de chaînes de caractères
        Ensemble<String> ensembleChaines = new Ensemble<>();
        ensembleChaines.ajouter("Alice");
        ensembleChaines.ajouter("Bob");
        ensembleChaines.ajouter("Charlie");
        ensembleChaines.ajouter("Bob"); // cet élément ne sera pas ajouté car il est déjà présent
        System.out.println("Ensemble de chaînes de caractères : " + ensembleChaines);

    }
}
