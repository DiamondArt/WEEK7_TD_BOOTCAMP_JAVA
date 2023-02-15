package td;

import java.util.ArrayList;
import java.util.List;

public class Cardinalite <T> {
    private List<T> inputNbre;

    public Cardinalite() {}

    public Cardinalite(List<T> inputNbre) {
        this.inputNbre = inputNbre;
    }


    public void addInput(T userInput) {

        this.inputNbre.add(userInput);
    }

    public void testInput(T userInput) {

        boolean isExist = this.inputNbre.contains(userInput);

        if (isExist) {
            System.out.println("The element "+userInput + " exist in this table");
        } else {
            System.out.println("Element no exist");
        }

    }
}
