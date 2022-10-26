import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {

    protected List<String> toppings;

    public Pizza() {

        super("Pizza", 45);

        toppings = new ArrayList<String>();
    }

    public void addTopping(String topping) {

        toppings.add(topping); // toppings for the pizza

        price = price + 10;
    }

    public void setName(String name) { // must set the name of the pizza through the name field of Food.
        this.name = name;
    }

    @Override
    public void display() {

        String sToppingConcat;
        sToppingConcat = " ";
        for (String toppinNames : toppings) {
            sToppingConcat += "";
            sToppingConcat += toppinNames;
            sToppingConcat += ", ";

        }
        if (toppings.isEmpty()) {
            sToppingConcat = sToppingConcat.substring(0, sToppingConcat.length() - 1);

        } else
            sToppingConcat = sToppingConcat.substring(0, sToppingConcat.length() - 2);
        sToppingConcat += " }";

        // setName(sToppingConcat);
        System.out.println(price + " kr " + name + " {" + sToppingConcat);

    }

}
