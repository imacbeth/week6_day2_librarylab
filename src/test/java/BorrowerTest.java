import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Library library;
    Borrower borrower;

    @Before
    public void before(){
        book = new Book();
        library = new Library();
        borrower = new Borrower();
        library.addBook(book);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.collectionCount());
    }

}
