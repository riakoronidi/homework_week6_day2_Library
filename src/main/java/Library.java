import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int numberOfBooks(){
        return this.stock.size();
    }

    public void addBook(Book book){
        if (numberOfBooks() < this.capacity){
            this.stock.add(book);
        }
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }


}
