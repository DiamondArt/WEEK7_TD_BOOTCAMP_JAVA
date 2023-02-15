package td;

import java.util.ArrayList;

public class EnsembleEntiers {
    private ArrayList<Integer> ensemble;

    public EnsembleEntiers() {
        ensemble = new ArrayList<Integer>();
    }

    public void ajouter(int nombre) {
        if (!ensemble.contains(nombre)) {
            ensemble.add(nombre);
        }
    }

    public void union(EnsembleEntiers autre) {
        for (int nombre : autre.ensemble) {
            ajouter(nombre);
        }
    }

    public void intersection(EnsembleEntiers autre) {
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for (int nombre : ensemble) {
            if (autre.ensemble.contains(nombre)) {
                intersection.add(nombre);
            }
        }
        ensemble = intersection;
    }

    public int cardinalite() {
        return ensemble.size();
    }

    public boolean contient(int nombre) {
        return ensemble.contains(nombre);
    }
}
