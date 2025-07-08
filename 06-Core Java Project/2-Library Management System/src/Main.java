public class Main {
    public static void main(String[] args) {
       Library library = new Library();

       while(true){
           System.out.println("\n -------Library Management System-------");
           System.out.println("1. Add Book");
           System.out.println("2. Add Member");
           System.out.println("3. Display Books");
           System.out.println("4. Display Members");
           System.out.println("5. Issue Book");
           System.out.println("6. Return Book");
           System.out.println("0. Exit");

           int choice = LibraryUtils.readInt("Enter Choice: ");

           switch (choice){
               case 1:
                   int bookId = LibraryUtils.readInt("Enter Book ID: ");
                   String title = LibraryUtils.readString("Enter Book Title: ");
                   String author = LibraryUtils.readString("Enter Author Name: ");
                   Book newBook = new Book(bookId, title, author);
                   library.addBook(newBook);
                   break;

               case 2:
                   int memberId = LibraryUtils.readInt("Enter Member ID: ");
                   String name = LibraryUtils.readString("Enter Member Name: ");
                   library.addMember(new Member(memberId, name));
                   break;

               case 3:
                   library.displayBooks();
                   break;

               case 4:
                   library.displayMembers();
                   break;

               case 5:
                   int issueBookId = LibraryUtils.readInt("Enter Book ID to Issue: ");
                   int issueMemberId = LibraryUtils.readInt("Enter Member ID: ");
                   library.issueBook(issueBookId, issueMemberId);
                   break;

               case 6:
                   int returnBookId = LibraryUtils.readInt("Enter Book ID to Return: ");
                   library.returnBook(returnBookId);
                   break;

               case 0:
                   System.out.println("Exiting.....");
                   System.exit(0);

               default:
                   System.out.println("Invalid Choice!");
           }


       }
    }
}
