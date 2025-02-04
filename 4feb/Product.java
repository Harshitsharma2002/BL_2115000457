class Product {
   
    static double discount = 9.0; 
    final int productID;
    String productName;
    double price;
    int quantity;

  
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }


    public void displayProductDetails() {
        if (this instanceof Product) { 
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
       
        }
    }

    public static void main(String[] args) {
     
        Product p1 = new Product(10001, "Laptop", 750.00, 2);
        Product p2 = new Product(102, "Smartphone", 500.00, 1);

    
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.updateDiscount(15.0);
        System.out.println("After updating discount:");
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}