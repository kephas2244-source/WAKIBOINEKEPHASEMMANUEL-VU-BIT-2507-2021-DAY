
package vu.coursework1;

import java.util.ArrayList;
public class MemberClass {
     private int memberID;
    private String name;
    private ArrayList<Loan> currentLoans; // Composition: Member "has-a" list of loans 
    
    public MemberClass(int memberID, String name) {
        this.memberID = memberID;
        this.name = name;
        this.currentLoans = new ArrayList<>(); // 
    }

    public int getMemberID() { return memberID; }
    public String getName() { return name; }
    public ArrayList<Loan> getCurrentLoans() { return currentLoans; }

    public void addLoan(Loan loan) {
        currentLoans.add(loan);
    }

    @Override
    public String toString() {
        return "Member ID: " + memberID + ", Name: " + name + 
               ", Active Loans: " + currentLoans.size();
    }
    
    
    
}
