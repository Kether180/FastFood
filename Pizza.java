import java.util.ArrayList;

public class Pizza extends Food {

    private ArrayList<String> toppings = new ArrayList<String>();
    private String name;
    private double price;

    public Pizza(String name, double price) {
        super("pizza", 45);

    }

    public ArrayList<String> addTopping(String topping) {

        // price++;

        return toppings;
    }

    {

    }

}
