import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int edition;

    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }
}

public class BookArray {
    public static void main(String[] args) {
        // Create an array of 6 Book objects in ascending order
        Book[] books = new Book[6];
        books[0] = new Book("Book1", "Author1", 1);
        books[1] = new Book("Book2", "Author1", 2);
        books[2] = new Book("Book3", "Author2", 1);
        books[3] = new Book("Book4", "Author3", 1);
        books[4] = new Book("Book5", "Author4", 1);
        books[5] = new Book("Book6", "Author5", 1);

        // Get user input for the author's name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author's name: ");
        String inputAuthor = scanner.nextLine();

        // Display books by the input author
        boolean found = false;
        System.out.println("Books by " + inputAuthor + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(inputAuthor)) {
                System.out.println("Title: " + book.getTitle() + ", Edition: " + book.getEdition());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by " + inputAuthor + ".");
        }

        scanner.close();
    }
}
