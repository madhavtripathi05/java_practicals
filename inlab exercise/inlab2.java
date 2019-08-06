
class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    char getGender() {
        return gender;
    }

    void setEmail(String mail) {
        this.email = mail;
    }

    String toSring() {
        return ("Author [ name = " + name + " , email = " + email + " , gender = " + gender + " ]");
    }

}

public class inlab2 {

    public static void main(String[] args) {

        Author author = new Author("Someone", "Someone@mail.com", 'm');
        System.out.println("Author's Name: " + author.getName());
        System.out.println("Author's Email: " + author.getEmail());
        System.out.println("Author's Gender: " + author.getGender());
        author.setEmail("ThisisNew@mail.com");
        System.out.println(author.toSring());
        System.out.println("\nName:MADHAV\nID:18DCS129");
    }
}