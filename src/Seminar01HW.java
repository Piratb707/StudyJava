
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
        return name + " - $" + price;
    }
}

class VendingMachine {
    private List<Product> products;
    private double cash;

    public VendingMachine() {
        products = new ArrayList<>();
        cash = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCash(double amount) {
        cash += amount;
    }

    public void buyProduct(int index) {
        if (index >= 0 && index < products.size()) {
            Product product = products.get(index);
            if (cash >= product.getPrice()) {
                cash -= product.getPrice();
                products.remove(index);
                JOptionPane.showMessageDialog(null, "Вы купили " + product.getName() + " за $" + product.getPrice());
            } else {
                JOptionPane.showMessageDialog(null, "Недостаточно средств для покупки " + product.getName());
            }
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getCash() {
        return cash;
    }
}

