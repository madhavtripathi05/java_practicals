import java.util.Scanner;

class Author {
    private String firstName;
    private String lastName;
    Scanner scan = new Scanner(System.in);

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setValue() {
        System.out.print("Enter the value of First name of the author: ");
        firstName = scan.nextLine();
        System.out.print("Enter the value of Last name of the author: ");
        lastName = scan.nextLine();
    }
}

class Book {
    private String title;
    private Author a = new Author();
    private float price;
    Scanner scan = new Scanner(System.in);

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public String getAuthorFirstName() {
        return a.getFirstName();
    }

    public String getAuthorLastName() {
        return a.getLastName();
    }

    public void setTitle() {
        System.out.print("Enter the title of the book: ");
        title = scan.nextLine();
    }

    public void setAuthor() {
        System.out.println("Enter the details about the author of the book: ");
        a.setValue();
    }

    public void setPrice() {
        System.out.print("Enter the price of the book: ");
        price = scan.nextFloat();
    }

    public void input() {
        this.setTitle();
        this.setAuthor();
        this.setPrice();
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book b = new Book();
        b.input();
        System.out.println("\n\nPrinting the details of the book");
        System.out.println("The Title of the book is : " + b.getTitle());
        System.out.println("The Author of the book is : " + b.getAuthorFirstName() + " " + b.getAuthorLastName());
        System.out.println("The Price of the book is : " + b.getPrice());
        System.out.println("\nNAME:MADHAV\nID:18DCS129\n");
    }
}
