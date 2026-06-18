/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        // Due date logic (e.g., 14 days) could be added here
    }

    public BookClass getBook() { return book; }

    @Override
    public String toString() {
        return "Loan: [Book: " + book.getTitle() + " | Member: " + member.getName() + 
               " | Date: " + borrowDate + "]";
    }
    }
    


