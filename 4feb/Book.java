public class Book {
    static String  libraryName="internatioal library";
    final int isbn;
    String title;
    String author;
    public Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public static void dispplayLibraryName(){
        System.out.print(libraryName);
    }
    public void display(){
        if(this instanceof Book){
            System.out.println(title);
            System.out.println(author);
            System.out.println(isbn);
            System.out.println(libraryName);

        }
    }
    public static void main(String[] args) {
        Book B1=new Book("Haary", "potter", 12);
        B1.display();
        B1.dispplayLibraryName();
    }
    
}