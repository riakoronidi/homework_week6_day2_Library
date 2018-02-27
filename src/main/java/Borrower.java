import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public void addBorrowedBook(Book book){
        this.collection.add(book);
    }

    public int getCollection(){
        return this.collection.size();
    }

    public Book removeBorrowedBook(){
        return this.collection.remove(0);
    }

    public void pickUpBook(Library library){
        Book book = library.removeBook();
        this.collection.add(book);
    }

}
