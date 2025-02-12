import java.util.ArrayList;
import java.util.List;

class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println("  - " + p.getProductName() + " ($" + p.getPrice() + ")");
        }
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            o.displayOrder();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer gaurav = new Customer("Gaurav");

        Product laptop = new Product("Laptop", 800.00);
        Product phone = new Product("Smartphone", 500.00);

        Order order1 = new Order(101);
        order1.addProduct(laptop);
        order1.addProduct(phone);

        gaurav.placeOrder(order1);
        
        gaurav.showOrders();
    }
}