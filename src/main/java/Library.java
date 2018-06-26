import java.util.ArrayList;

public class Library {

    private ArrayList<String> books;

    public Library(ArrayList<String> books) {
        this.books = books;
    }

    public int countBooks(){
        return this.books.size();
    }

}
