import java.util.ArrayList;

public class Borrower {

   private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int collectionCount(){
        return this.collection.size();
    }


}
