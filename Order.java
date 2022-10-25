import java.util.ArrayList;
import java.util.List;

public class Order implements CreditCard {

    protected List<Food> ordered;

    public Order() {

        ordered = new ArrayList<Food>();

    }

    public void addFood(Food food) {

        ordered.add(food);

    }

    public int total() {

        int total;
        total = 0;

        for (Food f : ordered) {
            total += f.price;
        }

        return total;

    }

    public void display()

    {

        for (Food f : ordered) {

            System.out.println(f.price + " kr " + f.name);
        }

        System.out.println(total() + " TOTAL");

    }

    public boolean payWith(CreditCard card) {
        return false;
    }

    @Override
    public boolean withdraw(int amount) {

        if (amount == total()) {
            return true;
        } else {
            return false;
        }
    }

}

// 65 kr Burge
// 25 kr Coke
// 75 kr Pizza { Pepperoni, Pineapple, Onion }
// 165 TOTAL