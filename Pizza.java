import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {

    private List<String> toppings = new ArrayList<String>();

    public Pizza(String name, double price) {
        super("pizza", 45);
    }

    public void addTopping(String topping) {

        toppings.add("Pepperoni"); // toppings for the pizza
        toppings.add("Pineapple"); // toppings for the pizza
        toppings.add("Onion"); // toppings for the pizza

        int priceTopping = 10;
        // if pizza contains extra topping increase 10DKK priceTopping++;

        if (toppings.contains(topping))
            ;
        priceTopping++;

        System.out.println("Pizza: " + toppings + priceTopping); // example not yet done - the class must override the
                                                                 // display method of the super class
        // e.g 75 kr Pizza { Pepperoni, Pineapple, Onion } or empty pizza = 45 kr Pizza
        // { }
    }

}

// Note: Parameters refers to the list of variables in a method declaration.
// Arguments are the actual values that are passed in when the method is
// invoked.
// When you invoke a method, the arguments used must match the declaration's
// parameters in type and order.