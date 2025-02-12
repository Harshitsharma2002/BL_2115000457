import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private int productId;
    private String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }

    abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.1;
    }

    @Override
    public double calculateTax() {
        return price * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Details for Electronics: 5% of the price";
    }

    public double finalPrice() {
        return price + calculateTax() - calculateDiscount();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
        System.out.println("Final Price: $" + finalPrice());
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.15;
    }

    @Override
    public double calculateTax() {
        return price * 0.08;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Details for Clothing: 8% of the price";
    }

    public double finalPrice() {
        return price + calculateTax() - calculateDiscount();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
        System.out.println("Final Price: $" + finalPrice());
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }

    public double finalPrice() {
        return price - calculateDiscount();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Final Price: $" + finalPrice());
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "T-Shirt", 1500));
        products.add(new Groceries(103, "Rice", 800));

        for (Product product : products) {
            product.displayDetails();
            System.out.println("---------------------------------");
        }
    }
}