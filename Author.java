package libraryproject;

/**
 *
 * @author Ibrahim Ashraf
 */
public class Author {

    protected static int id = 0;
    private final int AuthorId;
    private String name, phone, email;

    public Author(String name, String phone, String email) {

        this.name = name;
        this.phone = phone;
        this.email = email;
        AuthorId = ++id;
    }

    public int getAuthorId() {
        return AuthorId;
    }

   
    @Override
    public String toString() {
        return "Author{" + "AuthorId=" + AuthorId + ", name=" + name + ", phone=" + phone + ", email=" + email + '}';
    }

    
    public void printAuthorDetails() {
        System.out.println(toString());
    }

}
