import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book(GenreType.CRIME);
    }

    @Test
    public void countBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void hasSpace(){
        assertEquals(true, library.hasSpace());
    }

    @Test
    public void canLendBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.countBooks());
    }


}
