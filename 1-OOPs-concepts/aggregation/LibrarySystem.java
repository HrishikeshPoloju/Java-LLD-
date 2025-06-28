import java.util.*;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return title + " by " + author + " | ISBN: " + isbn + " | " + (isIssued ? "Issued" : "Available");
    }

    public void markIssued() {
        isIssued = true;
    }

    public void markReturned() {
        isIssued = false;
    }

    public boolean isAvailable() {
        return !isIssued;
    }

    public String getISBN() {
        return isbn;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        for (Book b : books) {
            System.out.println(b.getInfo());
        }
    }

    public void issueBook(String isbn) {
        for (Book b : books) {
            if (b.getISBN().equals(isbn) && b.isAvailable()) {
                b.markIssued();
                System.out.println("Issued: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not available or doesn't exist.");
    }

    public void returnBook(String isbn) {
        for (Book b : books) {
            if (b.getISBN().equals(isbn)) {
                b.markReturned();
                System.out.println("Returned: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN not found.");
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("Clean Code", "Robert Martin", "ISBN001");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "ISBN002");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.listAllBooks();
        lib.issueBook("ISBN001");
        lib.listAllBooks();
        lib.returnBook("ISBN001");
        lib.listAllBooks();
    }
}
