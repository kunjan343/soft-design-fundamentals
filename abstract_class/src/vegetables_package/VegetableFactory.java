package vegetables_package;

public class VegetableFactory {
    public Vegetable createVegetable(String name) {
        if (name.equals("potato")) {
            return new Potato("white", "White Potato");
        } else if (name.equals("ladyfinger")) {
            return new Ladyfinger("green", "Indian Ladyfinger");
        }
        return new Onion("gray", "Garden Onion");
    }
}
