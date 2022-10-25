import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {

    private List<String> toppings;

    public Pizza(String name, double price) {
        super("pizza", 45);

        toppings = new ArrayList<String>();
    }

    public void addTopping(String topping) {

        toppings.add("Pepperoni"); // toppings for the pizza
        toppings.add("Pineapple"); // toppings for the pizza
        toppings.add("Onion"); // toppings for the pizza

        int priceTopping = 10;
        // if pizza contains extra topping increase 10DKK priceTopping++;

        if (toppings.contains(topping));
        priceTopping++; { else {


        }


        }

        System.out.println(topping + priceTopping);
    }

    public void setName(String name) { // must set the name of the pizza through the name field of Food.

        String[] pizzas = { "Pepperoni ", "Margarita", "Napolitana" };

        String separator = "";

        for (String word : pizzas) {

            System.out.println(separator);
            System.out.println(word);
            separator = " ";

        }

    }

    public void display() {
        super.display();
        System.out.println(price + "kr" + name);
        // the class must override the
        // display method of the super class display()
        // e.g 75 kr Pizza { Pepperoni, Pineapple, Onion } or empty pizza = 45 kr Pizza
        // { }
    }

}
