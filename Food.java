public class Food {

    protected String name;
    protected double price;

    public Food(String name, double price) {

        this.name = name;
        this.price = price;

    }

    public double getPrice()

    {

        return price;

    }

    public void display()

    {
        System.out.println(price + "kr" + name);

    }

}
