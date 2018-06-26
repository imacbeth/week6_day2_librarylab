import java.util.ArrayList;

public class Library {

    private ArrayList<String> books;
    private int capacity;

    public Library(ArrayList<String> books, int capacity) {
        this.books = books;
        this.capacity = capacity;
    }

    public int countBooks(){
        return this.books.size();
    }

    public void addBook(String book) {
        this.books.add(book);
    }

    public boolean hasSpace(){
       return this.capacity >= books.size();
    }
}
