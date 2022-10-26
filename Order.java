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
            f.display();
            // System.out.println(f.price + " kr " + f.name);
        }

        System.out.println(total() + " kr TOTAL");

    }

    public boolean payWith(CreditCard card) {

        if (!card.withdraw(total())) {

            System.out.println("ERROR: Payment failed");

        }
        return card.withdraw(total());
    }

    @Override
    public boolean withdraw(int amount) {

        return false;

    }

}

// 65 kr Burge
// 25 kr Coke
// 75 kr Pizza { Pepperoni, Pineapple, Onion }
// 165 TOTAL