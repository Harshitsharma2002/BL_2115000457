import java.util.*;
abstract class WarehouseItem {
    String name;
    double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public abstract void displayDetails();
}


class Electronics extends WarehouseItem {
    int warrantyPeriod; 

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    
    public void displayDetails() {
        System.out.println("Electronics [Name: " + name + ", Price: " + price + ", Warranty: " + warrantyPeriod + " years]");
    }
}


class Groceries extends WarehouseItem {
    String expirationDate;

    public Groceries(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

   
    public void displayDetails() {
        System.out.println("Groceries [Name: " + name + ", Price: " + price + ", Expiration Date: " + expirationDate + "]");
    }
}


class Furniture extends WarehouseItem {
    String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

   
    public void displayDetails() {
        System.out.println("Furniture [Name: " + name + ", Price: " + price + ", Material: " + material + "]");
    }
}


class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    
    public void addItem(T item) {
        items.add(item);
    }

    
    public void displayAllItems() {
        for (WarehouseItem item : items) {
            item.displayDetails();
        }
    }
}

public class SmartWarehouseSystem {
    public static void main(String[] args) {
       
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        
        Electronics phone = new Electronics("Smartphone", 699.99, 2);
        Groceries apple = new Groceries("Apple", 1.99, "2025-12-31");
        Furniture chair = new Furniture("Chair", 129.99, "Wood");

        
        electronicsStorage.addItem(phone);
        groceriesStorage.addItem(apple);
        furnitureStorage.addItem(chair);

        
        System.out.println("Electronics Storage:");
        electronicsStorage.displayAllItems();

        System.out.println("\nGroceries Storage:");
        groceriesStorage.displayAllItems();

        System.out.println("\nFurniture Storage:");
        furnitureStorage.displayAllItems();
    }
}
