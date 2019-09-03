package vegetables_package;

import java.util.ArrayList;

public class Stirfry {
    public static void main(String[] args) {
        ArrayList<Vegetable> veggies = new ArrayList<>();
        VegetableFactory vegFactory = new VegetableFactory();

        // veggies.add(new Onion("gray", "Garden Onion"));
        // veggies.add(new Potato("white", "White Potato"));
        // veggies.add(new Ladyfinger("green", "Indian Ladyfinger"));
        veggies.add(vegFactory.createVegetable("onion"));
        veggies.add(vegFactory.createVegetable("potato"));
        veggies.add(vegFactory.createVegetable("ladyfinger"));

        for (Vegetable veg : veggies) {
            if (!veg.isTasty()) {
                System.out.println("Stirfry is not tasty :(");
                System.exit(1);
            }
        }
        System.out.println("Stirfry is tasty :)");
    }
}
