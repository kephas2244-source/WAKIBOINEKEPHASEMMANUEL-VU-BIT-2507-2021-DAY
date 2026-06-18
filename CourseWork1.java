

package vu.coursework1;


public class CourseWork1 {

    public static void main(String[] args) {
        //Part d)
        // 1. Instantiate the Library object
        Library communityLibrary = new Library();

        // 2. Create at least two members and register them 
        MemberClass member1 = new MemberClass(1001, "Kelly Johnson");
        MemberClass member2 = new MemberClass(1002, "John Smith");
        communityLibrary.registerMember(member1);
        communityLibrary.registerMember(member2);

        // 3. Create at least three books
        // Using overloaded constructors as defined in the previous requirements 
        BookClass book1 = new BookClass("ISBN001", "Intro to Java Programming", "Y. Daniel Liang");
        BookClass book2 = new BookClass("ISBN002", "Data Structures", "Daniel Liang");
        BookClass book3 = new BookClass("ISBN003", "Effective Java"); // constructor 1
        
        communityLibrary.addBook(book1);
        communityLibrary.addBook(book2);
        communityLibrary.addBook(book3);

        // 4. Print the state of the library before operations
        System.out.println("=== Library State: Before Operations ===");
        System.out.println(communityLibrary);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("----------------------------------------");

        // 5. Perform a sequence of lend/return operations
        System.out.println("\n--- Initiating Lending Operations ---");
        
        // Operation A: Successful loan
        System.out.println("Action: Lending 'Intro to Java' to Alice...");
        communityLibrary.lendBook("ISBN001", 1001);

        // Operation B: Rejected loan (Correctly rejected because book is already on loan)
        // This demonstrates the "at most one active loan per book" rule
        System.out.println("\nAction: Attempting to lend the SAME book to Bob...");
        communityLibrary.lendBook("ISBN002", 1002); 

        // Operation C: Return the book
        System.out.println("\nAction: Alice returns 'Intro to Java'...");
        communityLibrary.returnBook("ISBN001");

        // Operation D: Successful loan after return
        System.out.println("\nAction: Bob lends 'Intro to Java' now that it is available...");
        communityLibrary.lendBook("978-0134670942", 1002);

        // 6. Print the state of the library after operations
        System.out.println("\n=== Library State: After Operations ===");
        System.out.println(communityLibrary);
        System.out.println(book1); // Should show status as "On Loan"
        System.out.println(book2); // Should show status as "Available"
        System.out.println("========================================");
    }
    }

