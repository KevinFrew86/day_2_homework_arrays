import java.util.ArrayList;
import java.util.Collection;

public class Member {

    private String name;
    private ArrayList<Book> collection;

    public Member(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void addBookToCollection(Book book) {
        this.collection.add(book);
    }

    public int getCollectionBookCount() {
        return this.collection.size();
    }
}
