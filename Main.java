public class Main {

    public static void main(String[] args) {

        Order objOrder = new Order();
        Food food1 = new Food("burger", 65);
        objOrder.addFood(food1);

        Food food2 = new Food("Coke", 25);
        objOrder.addFood(food2);

        Pizza pizza1 = new Pizza();
        pizza1.addTopping("Pepperoni");
        pizza1.addTopping("Pineapple");
        pizza1.addTopping("Onion");
        pizza1.display();
        objOrder.addFood(pizza1);

        objOrder.display();

        System.out.println();

    }

}
