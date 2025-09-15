import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public void showBooks() {
        for(Book b : books) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor());
        }
    }
}
