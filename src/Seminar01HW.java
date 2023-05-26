class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}

class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink [name=" + getName() + ", price=" + getPrice() + ", temperature=" + temperature + "]";
    }
}

public class Seminar01HW {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Tea", 1.99, 75);
        HotDrink coffee = new HotDrink("Coffee", 2.49, 85);

        System.out.println(tea);
        System.out.println(coffee);

        tea.setPrice(2.29);
        coffee.setTemperature(90);

        System.out.println(tea);
        System.out.println(coffee);
    }
}
