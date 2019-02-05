import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemberTest {

    Member member;
    Library library;
    Book book;

    @Before
    public void before() {
        member = new Member ("Big Jonny Boi");
        library = new Library();
        library.addBook(book);
    }

    @Test
    public void memberHasName() {
        assertEquals("Big Jonny Boi", member.getName());
    }

    @Test
    public void bookAddedToCollection() {
        member.addBookToCollection(book);
        assertEquals(1, member.getCollectionBookCount());
    }


    @Test
    public void addsBookFromLibraryToMemberCollection() {
        library.addBook(book);
        member.addBookToCollection(book);
        assertEquals(0, library.bookCount());
        assertEquals(1,  member.getCollectionBookCount());
    }


}
