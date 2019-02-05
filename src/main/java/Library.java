import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library() {
        this.books = new ArrayList<Book>();
        this.capacity = 10;
    }


    public int bookCount() {
        return this.books.size();
    }


    public void addBook(Book book) {
        if (bookCount() < capacity) {
            this.books.add(book);
        }
    }
}
