/*

Task 2:- Library Book issue and return system
-------

Code:-
--------

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private boolean available;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Available: " + book.isAvailable());
        }
    }

    public boolean issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && book.isAvailable()) {
                book.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && !book.isAvailable()) {
                book.setAvailable(true);
                return true;
            }
        }
        return false;
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Add some sample books to the library
        library.addBook(new Book(1, "Maths"));
        library.addBook(new Book(2, "Computer"));
        library.addBook(new Book(3, "English"));
        library.addBook(new Book(4, "Hindi"));
        library.addBook(new Book(5, "Science"));
        library.addBook(new Book(6, "History"));
        library.addBook(new Book(7, "Music"));
        library.addBook(new Book(8, "Art"));
        library.addBook(new Book(9, "Geography"));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. List Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    System.out.print("Enter the book ID to issue: ");
                    int issueId = scanner.nextInt();
                    if (library.issueBook(issueId)) {
                        System.out.println("Book issued successfully.");
                    } else {
                        System.out.println("Book not available or ID invalid.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the book ID to return: ");
                    int returnId = scanner.nextInt();
                    if (library.returnBook(returnId)) {
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book ID invalid or already returned.");
                    }
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

/*

Output:-
----------

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 1
Library Books:
ID: 1, Title: Maths, Available: true
ID: 2, Title: Computer, Available: true
ID: 3, Title: English, Available: true
ID: 4, Title: Hindi, Available: true
ID: 5, Title: Science, Available: true
ID: 6, Title: History, Available: true
ID: 7, Title: Music, Available: true
ID: 8, Title: Art, Available: true
ID: 9, Title: Geography, Available: true

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 2
Enter the book ID to issue: 5
Book issued successfully.

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 2
Enter the book ID to issue: 5
Book not available or ID invalid.

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 3
Enter the book ID to return: 5
Book returned successfully.

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 2
Enter the book ID to issue: 2
Book issued successfully.

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 2
Enter the book ID to issue: 5
Book issued successfully.

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 4
(base) 

Output2:-
----------


Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 1
Library Books:
ID: 1, Title: Maths, Available: true
ID: 2, Title: Computer, Available: true
ID: 3, Title: English, Available: true
ID: 4, Title: Hindi, Available: true
ID: 5, Title: Science, Available: true
ID: 6, Title: History, Available: true
ID: 7, Title: Music, Available: true
ID: 8, Title: Art, Available: true
ID: 9, Title: Geography, Available: true

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 2
Enter the book ID to issue: 9
Book issued successfully.

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 3
Enter the book ID to return: 4
Book ID invalid or already returned.

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 3
Enter the book ID to return: 9
Book returned successfully.

Menu:
1. List Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 4
(base) 

 */