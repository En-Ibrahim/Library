package libraryproject;

/*
 *
 * @author Ibrahim Ashraf
 */
public class Book {

    protected static int id = 0;
    private final int BookId;

    private int version;
    private String title, publishing_date;
    private Author author;

    public Book(String title, String publishing_date, int version, Author author) {
        this.version = version;
        this.title = title;
        this.publishing_date = publishing_date;
        this.author = author;
        BookId = ++id;
    }

   
    @Override
    public String toString() {
        return "Book{" + "BookId=" + BookId + ", version=" + version + ", title=" + title + ", publishing_date=" + publishing_date
                + ",\n author=" + author + '}';
    }

    
    public void printBookDetails() {
        System.out.println(toString());
    }

}
