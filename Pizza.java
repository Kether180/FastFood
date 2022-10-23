import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {

    private List<Food> toppings = new ArrayList<Food>();
    // private String name;
    // private double price;

    public Pizza(String name, double price) {
        super("pizza", 45);

    }

    public List<Food> addTopping(String topping) {

        Food pizza1 = new Food(null, 0); // subclass object
        Food pizza2 = new Food(null, 0); // subclass object

        toppings.add(pizza1); // toppings for the pizza
        toppings.add(pizza2); // toppings for the pizza

        // price++;

        return toppings;
    }

    {

    }

}

// Note: Parameters refers to the list of variables in a method declaration.
// Arguments are the actual values that are passed in when the method is
// invoked.
// When you invoke a method, the arguments used must match the declaration's
// parameters in type and order.