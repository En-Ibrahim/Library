
package libraryproject;

import java.util.ArrayList;

/**
 *
 * @author Ibrahim Ashraf
 */
public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();

    public Library() {
    }

    public void addAuthor(Author author) {

        authors.add(author);
    }

    public void removeAuthor(int id) {
        try {
            authors.remove(id - 1);
        } catch (Exception e) {
            System.out.println("Enter the right id");
        }
    }

    public void printAuthor(int id) {
        try {
            authors.get(id - 1).printAuthorDetails();
        } catch (Exception e) {
            System.out.println("Enter the right id");
        }
    }

   
    public void printAuthorBooks(int id) {
        try {
            if (id == authors.get(id - 1).getAuthorId()) {
                for (int i = 0; i < books.size(); i++) {
                    books.get(i).printBookDetails();
                }
            }
        } catch (Exception e) {
            System.out.println("Enter the right id");
        }

    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int id) {
        try {
            books.remove(id - 1);
        } catch (Exception e) {
            System.out.println("Enter the right id");
        }
    }

    public void printBook(int id) {
        try {
            books.get(id - 1).printBookDetails();
        } catch (Exception e) {
            System.out.println("Enter the right id");
        }
    }

}
