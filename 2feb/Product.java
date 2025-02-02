public class Product{
    private String productName;
    private int price;
    private static int totalProducts;
    public Product(){
    productName="";
    price=0;
    totalProducts++;
    }
    public Product(String productName, int price){
    this.productName=productName;
    this.price=price;
    totalProducts++;
    }
    public void displayProductDetails(){
    System.out.println("Product Name: "+productName);
    System.out.println("Price: "+price);
    }
    public void displayTotalProducts(){
    System.out.println("Total Products: "+totalProducts);
    }
    public static void main(String [] args){
    Product p1=new Product();
    p1.displayProductDetails();
    p1.displayTotalProducts();
    Product p2=new Product("Food Items",300);
    p2.displayProductDetails();
    p2.displayTotalProducts();
    }
    }