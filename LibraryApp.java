
package libraryproject;

/**
 *
 * @author Ibrahim Ashraf
 */
public class LibraryApp {
    public static void main(String[] args) {
        Author a=new Author("Ibrahim", "53412556", "Ibrahim@gmail.com");
        

        Book b=new Book("OOP", "2005-jan", 1, a);
        Book b1=new Book("OOP", "2005-jan", 2, a);
        Book b2=new Book("OOP", "2005-jan", 3, a);
        Book b3=new Book("OOP", "2005-jan", 4, a);
    

         
         Library L1= new Library();
         L1.addAuthor(a);
         L1.addBook(b);
         L1.addBook(b1);
         L1.addBook(b2);
         L1.addBook(b3);
         
         L1.printAuthorBooks(1);
         
    }
}
