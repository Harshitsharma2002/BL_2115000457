
enum BookCategory {
    FICTION, NON_FICTION, SCIENCE, ART
}

enum ClothingCategory {
    MEN, WOMEN, KIDS
}

enum GadgetCategory {
    MOBILE, LAPTOP, TABLET, ACCESSORY
}


abstract class Product<T> {
    String name;
    double price;
    T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayDetails() {
        System.out.println("Product [Name: " + name + ", Price: " + price + ", Category: " + category + "]");
    }


    public void applyDiscount(double percentage) {
        this.price -= this.price * percentage / 100;
    }
}


class Book extends Product<BookCategory> {
    public Book(String name, double price, BookCategory category) {
        super(name, price, category);
    }
}


class Clothing extends Product<ClothingCategory> {
    public Clothing(String name, double price, ClothingCategory category) {
        super(name, price, category);
    }
}


class Gadget extends Product<GadgetCategory> {
    public Gadget(String name, double price, GadgetCategory category) {
        super(name, price, category);
    }
}


class ProductCatalog {
    
    public <T extends Product> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }

   
    public <T extends Product> void displayProductDetails(T product) {
        product.displayDetails();
    }
}

public class OnlineMarketplace {
    public static void main(String[] args) {
       
        Book book1 = new Book("Java Programming", 50.0, BookCategory.SCIENCE);
        Clothing clothing1 = new Clothing("T-shirt", 20.0, ClothingCategory.MEN);
        Gadget gadget1 = new Gadget("Smartphone", 300.0, GadgetCategory.MOBILE);

       
        ProductCatalog catalog = new ProductCatalog();

      
        System.out.println("Original Product Details:");
        catalog.displayProductDetails(book1);
        catalog.displayProductDetails(clothing1);
        catalog.displayProductDetails(gadget1);

   
        catalog.applyDiscount(book1, 10); 
        catalog.applyDiscount(clothing1, 15); 
        catalog.applyDiscount(gadget1, 20); 

       
        System.out.println("\nProduct Details After Discount:");
        catalog.displayProductDetails(book1);
        catalog.displayProductDetails(clothing1);
        catalog.displayProductDetails(gadget1);
    }
}
