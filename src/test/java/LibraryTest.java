import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;

    @Before
    public void before(){
        ArrayList<String> testBooks = new ArrayList<>();
        testBooks.add("Harry Potter");
        library = new Library(testBooks, 10);
    }

    @Test
    public void countBooksInLibrary(){
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook("Oliver Twist");
        assertEquals(2, library.countBooks());
    }

    @Test
    public void hasSpace(){
        assertEquals(true, library.hasSpace());
    }


}
