// Родительский класс Product
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

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}

// Наследник класса Product - класс HotDrink
class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink [name=" + getName() + ", price=" + getPrice() + ", temperature=" + temperature + "]";
    }
}

// Главный класс с методом main
public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Чай", 1.5, 80);
        HotDrink coffee = new HotDrink("Кофе", 2.0, 90);
        HotDrink hotChocolate = new HotDrink("Горячий шоколад", 2.5, 85);

        System.out.println(tea);
        System.out.println(coffee);
        System.out.println(hotChocolate);
    }
}
