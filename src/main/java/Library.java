import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library() {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countBooks(){
        return this.stock.size();
    }

    public void addBook(Book book) {
        this.stock.add(book);
    }

    public boolean hasSpace(){
       return this.capacity >= stock.size();
    }
}
