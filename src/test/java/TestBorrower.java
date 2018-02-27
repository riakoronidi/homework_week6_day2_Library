import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Borrower borrowed;
    Book book;
    Library library;

    @Before
    public void before(){
        borrowed = new Borrower("Ria");
        book = new Book(GenreType.CRIME);
        library = new Library(10);
//        library.addBook(book);
    }

    @Test
    public void getNumberOfCollection(){
        assertEquals(0, borrowed.getCollection());
    }

    @Test
    public void canAddBorrowedBook(){
        borrowed.addBorrowedBook(book);
        assertEquals(1, borrowed.getCollection());
    }

    @Test
    public void canRemoveBorrowedBook(){
        borrowed.addBorrowedBook(book);
        assertEquals(1, borrowed.getCollection());
        borrowed.removeBorrowedBook();
        assertEquals(0, borrowed.getCollection());
    }

    @Test
    public void addBookToCollectionFromLibraryStock(){
        library.addBook(book);
        borrowed.pickUpBook(library);
        assertEquals(0, library.numberOfBooks());
        assertEquals(1, borrowed.getCollection());
    }

}
