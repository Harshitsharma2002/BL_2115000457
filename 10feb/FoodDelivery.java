abstract class FoodItem {
    private String itemName;
    protected double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

interface Discountable {
    void applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return price * 1.05;
    }

    public void applyDiscount() {
        System.out.println("Applying 5% discount on Veg Item.");
    }

    public String getDiscountDetails() {
        return "Discount: 5%";
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        FoodItem item = new VegItem("Paneer Tikka", 200, 2);
        item.getItemDetails();
        System.out.println("Total Price: $" + item.calculateTotalPrice());
        ((Discountable) item).applyDiscount();
    }
}