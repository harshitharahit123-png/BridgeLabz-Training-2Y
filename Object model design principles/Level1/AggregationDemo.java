import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBook() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibraryBooks() {
        System.out.println("\nLibrary: " + name);
        for (Book book : books) {
            book.displayBook();
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("Clean Code", "Robert C. Martin");
        Book b3 = new Book("Introduction to Algorithms", "Cormen");
        Book b4 = new Book("Design Patterns", "GoF");

        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("Engineering Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);
        lib2.addBook(b4);

        lib1.displayLibraryBooks();
        lib2.displayLibraryBooks();
    }
}
