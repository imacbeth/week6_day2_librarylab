import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int countBooks(){
        return this.stock.size();
    }

    public void addBook(Book book) {
        if(hasSpace()){
        this.stock.add(book);
        }
    }

    public boolean hasSpace(){
       return this.capacity >= stock.size();
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }
}
