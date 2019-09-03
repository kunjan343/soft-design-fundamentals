/**
 * A class that creates different kinds of pizzas
 * depending on their type.
 * Note that the following source was used as a reference in
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 *
 * @author dancye
 */
class PizzaController {
    private int numSlices = 0;
    private Pizza pizza = null;

    /**
     * returns a concrete pizza object
     *
     * @param type the type of pizza to return
     * @return
     */
    public void createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
    }

    public Pizza getPizza() {
        return this.pizza;
    }

    public void cutPizza(int numSlices) {
        this.numSlices = numSlices;
    }

    public int getSlices() {
        return this.numSlices;
    }

    public void bake(int temp) {
        pizza.bake(temp);
    }
}
