abstract class LibraryItem {
    private String itemId, title, author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book reserved.");
    }

    public boolean checkAvailability() {
        return true;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem item = new Book("B101", "Java Programming", "Gaurav Patel");
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        ((Reservable) item).reserveItem();
    }
}