import java.util.ArrayList;

public class Pizza extends Food {

    private ArrayList<String> toppings = new ArrayList<String>();
    private String name;
    private double price;

    public Pizza(String name, double price, String toppings) {
        super(name, price);

        this.name = name;
        this.price = price;

    }

    public ArrayList<String> addTopping(String topping) {

        // price++;

        return toppings;
    }

    {

    }

}
