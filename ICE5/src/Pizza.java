import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 *
 * @author dancye
 */
public class Pizza {
    public int bakeTemp = 100;//temp to bake at
    private ArrayList<String> ingredients = new ArrayList<>();

    public void bake(int temp) {
        bakeTemp = temp;
    }

    /**
     * A method to add toppings to the ingredients
     * list
     *
     * @param topping
     */
    public void addTopping(String topping) {
        ingredients.add(topping);
    }
}
