import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Book class
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// Book Collection implementing Iterable interface
class BookCollection implements Iterable<Book> {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}

// Main class to demonstrate Iterator Pattern
public class Iterator{
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Design Patterns in Java"));
        bookCollection.addBook(new Book("Effective Java"));
        bookCollection.addBook(new Book("Clean Code"));

        // Using Iterator to traverse the book collection
        for (Book book : bookCollection) {
            System.out.println("Book: " + book.getTitle());
        }
    }
}
