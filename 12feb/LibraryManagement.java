import java.util.Scanner;

class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

class Library {
    private Book head, tail;
    private int count;

    public void addBook(String title, String author, String genre, int bookId, boolean isAvailable, int position) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (position == 0 || head == null) {
            newBook.next = head;
            if (head != null) head.prev = newBook;
            head = newBook;
            if (tail == null) tail = newBook;
        } else {
            Book temp = head;
            for (int i = 0; i < position - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            newBook.next = temp.next;
            newBook.prev = temp;
            if (temp.next != null) temp.next.prev = newBook;
            temp.next = newBook;
            if (newBook.next == null) tail = newBook;
        }
        count++;
    }

    public void removeBook(int bookId) {
        if (head == null) return;

        if (head.bookId == bookId) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
            count--;
            return;
        }

        Book temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp.next != null) temp.next.prev = temp.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp == tail) tail = temp.prev;
        count--;
    }

    public Book searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateAvailability(int bookId, boolean newStatus) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = newStatus;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayBooks() {
        Book temp = head;
        System.out.println("\n📚 Library Books:");
        while (temp != null) {
            System.out.println("ID: " + temp.bookId + " | Title: " + temp.title + " | Author: " + temp.author +
                               " | Genre: " + temp.genre + " | Available: " + temp.isAvailable);
            temp = temp.next;
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

      
        library.addBook("HarryPotter", "J.K.Rowling", "Fantasy", 1, true, 0);
        library.addBook("TheHobbit", "J.R.R.Tolkien", "Fantasy", 2, true, 1);
        library.addBook("1984", "GeorgeOrwell", "Dystopian", 3, true, 2);
        library.addBook("ToKillAMockingbird", "HarperLee", "Fiction", 4, true, 3);

  
        System.out.println("\n=== Display All Books ===");
        library.displayBooks();

            System.out.println("\n=== Search for '1984' ===");
        Book foundBook = library.searchByTitle("1984");
        if (foundBook != null)
            System.out.println("✅ Found: " + foundBook.title + " | Author: " + foundBook.author + " | Available: " + foundBook.isAvailable);
        else
            System.out.println("❌ Book not found.");

   
        System.out.println("\n=== Updating Availability of 'The Hobbit' ===");
        library.updateAvailability(2, false);
        library.displayBooks();

       
        System.out.println("\n=== Removing 'Harry Potter' ===");
        library.removeBook(1);
        library.displayBooks();
    }
}