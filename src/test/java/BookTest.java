import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book(GenreType.CRIME);
    }

    @Test
    public void canGetGenreType(){
        assertEquals(GenreType.CRIME, book.getGenre());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Mysterious", book.getDescriptionFromEnum());
    }


}
