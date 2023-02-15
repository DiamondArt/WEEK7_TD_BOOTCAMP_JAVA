package td;

import java.util.ArrayList;
import java.util.List;

public class Ensemble<T> {
    private List<T> elements;
    public Ensemble() {
        this.elements = new ArrayList<T>();
    }

    public void ajouter(T element) {
        if (!this.elements.contains(element)) {
            this.elements.add(element);
        }
    }

    public void union(Ensemble<T> autre) {
        for (T element : autre.elements) {
            this.ajouter(element);
        }
    }

    public void intersection(Ensemble<T> autre) {
        List<T> intersection = new ArrayList<T>();
        for (T element : this.elements) {
            if (autre.elements.contains(element)) {
                intersection.add(element);
            }
        }
        this.elements = intersection;
    }

    public int cardinalite() {
        return this.elements.size();
    }

    public boolean contient(T element) {
        return this.elements.contains(element);
    }
}
