import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Food> toppings = new ArrayList<Food>(); // list of strings object
        Food pizza1 = new Food(null, 0); // subclass object
        Food pizza2 = new Food(null, 0); // subclass object

        toppings.add(pizza1); // toppings for the pizza
        toppings.add(pizza2); // toppings for the pizza

        System.out.println();

    }

}
