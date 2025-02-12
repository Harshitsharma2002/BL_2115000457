import java.util.ArrayList;

class Book{
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;

    }
    public void BookDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}
class Library{
    ArrayList<Book> books;
    String libraryName;
    Library(String libraryName){
        this.libraryName=libraryName;
        books = new ArrayList<>();
        }
         
        public void addBooks(Book book){
            books.add(book);
        }
        public void displayBook(){
            for(Book book:books){
                    book.BookDetails();
            }
        }
}

public class LibrarySystem {
    public static void main(String[] args) {
        
    
    Book b1=new Book("harry", "tulsi");
    Book b2=new Book("potter", "Harshit");
    b1.BookDetails();
    b2.BookDetails();
    Library l1=new Library("internation library");
    l1.addBooks(b1);
    l1.addBooks(b2);
    l1.displayBook();


    }
}