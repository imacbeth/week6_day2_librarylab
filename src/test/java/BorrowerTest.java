import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Book book;
    Library library;
    Borrower borrower;

    @Before
    public void before(){
        book = new Book(GenreType.CRIME);
        library = new Library(100);
        borrower = new Borrower();
        library.addBook(book);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addBook(library);
        assertEquals(1, borrower.collectionCount());
    }

}
