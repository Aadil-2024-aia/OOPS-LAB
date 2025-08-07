class LibraryBook {
    String title;
    String author;
    int bookID;
    boolean isIssued;

    void addBook(String t, String a, int id) {
        title = t;
        author = a;
        bookID = id;
        isIssued = false;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

 void displayStatus() {
        System.out.println(" Title : " + title);
        System.out.println(" Author: " + author);
        System.out.println(" Book ID: " + bookID);
    System.out.println(" Status: " + (isIssued ? "Issued" : "Available"));
    }
}

public class LibraryBookTest {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook();
        book1.addBook("Java Fundamentals", "James Gosling", 101);
        book1.issueBook();
        book1.displayStatus();
        book1.returnBook();
        book1.displayStatus();
    }
}
