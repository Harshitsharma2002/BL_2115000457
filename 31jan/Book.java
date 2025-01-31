public class Book {
    private String title;
    private String author;
    private int price;
    public Book(String title,String author,int price){
        this.author=author;
        this.price=price;
        this.title=title;
    }
    public void display(){
        System.out.println("title "+title);
        System.out.println("author "+author);
        System.out.println("price "+price);
    }
    public static void main(String[] args) {
        Book b=new Book("Harray Potter","Harshit",1000000);
        b.display();
    }
}