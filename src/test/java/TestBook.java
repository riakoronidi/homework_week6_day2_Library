import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestBook {

    Book book;

    @Before
    public void before(){
        book = new Book(GenreType.CRIME);
    }

    @Test
    public void canGetGenreForCrime(){
        book = new Book(GenreType.CRIME);
        assertEquals("Mystery", book.getGenreFromEnum()) ;
    }
}
