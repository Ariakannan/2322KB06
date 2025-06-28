import java.util.ArrayList;
import java.util.List;

class Library {
    List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public boolean removeBook(String book) {
        return books.remove(book);
    }

    public boolean issueBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    public void showBooks() {
        System.out.println("Books in library: " + books);
    }
}
