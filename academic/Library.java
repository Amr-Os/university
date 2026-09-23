package academic;

public class Library {
    private String LibraryId;
    private String LibrarianName;
    private String BookSection;
    private int TotalBooks;

    public Library(String libraryId, String librarianName, String bookSection, int totalBooks) {
        this.LibraryId = libraryId;
        this.LibrarianName = librarianName;
        this.BookSection = bookSection;
        this.TotalBooks = totalBooks;
    }

    public void LibraryDetails() {
        System.out.println("Library ID: " + LibraryId + " | Librarian: " + LibrarianName);
        System.out.println("Section: " + BookSection + " | Total Books: " + TotalBooks);
    }

    public void SearchBooks(String bookTitle) {
        System.out.println("Searching for book: '" + bookTitle + "' in section: " + BookSection);
    }

    // استعارة كتاب لطالب
    public void LendBooks(Student student, String bookTitle) {
        if (TotalBooks > 0) {
            System.out.println("Book '" + bookTitle + "' lent to student.");
            TotalBooks--;
        } else {
            System.out.println("No books available in library.");
        }
    }

    // استعارة كتاب لموظف أو محاضر
    public void LendBooks(Staff staff, String bookTitle) {
        if (TotalBooks > 0) {
            System.out.println("Book '" + bookTitle + "' lent to staff member.");
            TotalBooks--;
        } else {
            System.out.println("No books available in library.");
        }
    }

    // إرجاع كتاب من طالب
    public void ReturnBooks(Student student, String bookTitle) {
        System.out.println("Book '" + bookTitle + "' returned by student.");
        TotalBooks++;
    }

    // إرجاع كتاب من موظف
    public void ReturnBooks(Staff staff, String bookTitle) {
        System.out.println("Book '" + bookTitle + "' returned by staff member.");
        TotalBooks++;
    }

    // دفع غرامة
    public void PayFine(Student student, double amount) {
        System.out.println("Fine of $" + amount + " paid successfully by student.");
    }
}