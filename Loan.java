
package vu.coursework1;

import java.util.Date;

public class Loan {
      private MemberClass member;
    private BookClass book;
    private Date borrowDate;
    private Date dueDate;

    public Loan(MemberClass member, BookClass book) {
        this.member = member;
        this.book = book;
        this.borrowDate = new Date(); // Current system time 
    }

    public BookClass getBook() { return book; }

    @Override
    public String toString() {
        return "Loan: [Book: " + book.getTitle() + " | Member: " + member.getName() + 
               " | Date: " + borrowDate + "]";
    }
    }
    


