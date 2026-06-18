
package vu.coursework1;
import java.util.ArrayList;
public class Library {

private ArrayList<BookClass> books = new ArrayList<>();
private ArrayList<MemberClass> members = new ArrayList<>();
public void addBook(BookClass b) {
books.add(b);
}
public void registerMember(MemberClass m) {
members.add(m);
}
public void lendBook(String isbn, int memberID) {
BookClass targetBook = null;
for (BookClass b : books)
if (b.getIsbn().equals(isbn)) targetBook = b;
MemberClass targetMember = null;
for (MemberClass m : members)
if (m.getMemberID() == memberID) targetMember = m;
if (targetBook != null && targetMember != null) {
if (targetBook.isAvailable()) {
targetBook.setAvailable(false);

Loan newLoan = new Loan(targetMember, targetBook);targetMember.addLoan(newLoan);
System.out.println(
"Success: Book '" + targetBook.getTitle() + "' lent."
);
} else {
System.out.println("Rejected: Book is already on loan.");
}
}
}
public BookClass searchByTitle(String title) {
for (BookClass b : books) {
if (b.getTitle().equalsIgnoreCase(title)) return b;
}
return null;
}
void returnBook(String isbn) {
System.out.println("Return book functionality not yet implemented.");
}
}
