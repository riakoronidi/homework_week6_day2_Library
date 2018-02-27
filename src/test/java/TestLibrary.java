import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book(GenreType.CRIME);
    }

    @Test
    public void getNumberOfBooks(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void canAddBook(){
       library.addBook(book);
       assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.numberOfBooks());
    }


}
