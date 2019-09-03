import java.util.Scanner;

/**
 * Review class for Final Exam Part D review.
 * Creates a pizza of a given type and cuts it into slices.
 * Note that the following source was used as a reference in
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 *
 * @author dancye, 2019
 */
public class PizzaShop {

    public static void main(String[] args) {
        PizzaController pc = new PizzaController();

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the pizza shop");
        System.out.println("What kind of pizza do you want?");
        System.out.println("Please enter exactly cheese or pepperoni");
        String type = sc.nextLine();

        pc.createPizza(type);
        System.out.println("how many slices would you like?");
        int numSlices = sc.nextInt();
        pc.cutPizza(numSlices);
        if (pc.getPizza() != null) {
            pc.bake(150);
            System.out.println("Great job, here is your pizza in " + pc.getSlices() + " slices");
        } else {
            System.out.println("Enter a valid pizza type so we can cut it next time!");
        }
    }
}
