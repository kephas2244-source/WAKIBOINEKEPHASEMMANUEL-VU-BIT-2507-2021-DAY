
package vu.coursework1;


public class BookClass {
      private String isbn;
    private String title;
    private String author;
    private boolean available;

    // Constructor 1: Basic details
    public BookClass(String isbn, String title){
        this(isbn, title, "Unknown"); // Invokes overloaded constructor 
    }

    // Constructor 2: Overloaded with author 
    public BookClass(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = true; // Business rule: starts as available
    }

    // Accessors and Mutators (Encapsulation)
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return "Book [ISBN: " + isbn + ", Title: " + title + ", Author: " + author + 
               ", Status: " + (available ? "Available" : "On Loan") + "]";
    }
    
}
