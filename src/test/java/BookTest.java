import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("The Sellout", "Paul Beatty", "Fiction");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("The Sellout", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Paul Beatty", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Fiction", book.getGenre());
    }
}
