import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private Map<Integer, Integer> issuedBooks = new HashMap<>();  //bookId -> memberId

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void addMember(Member member){
        members.add(member);
        System.out.println("Member added: " + member);
    }

    public void displayBooks(){
        System.out.println("\n-----Book List-----");
        for(Book book : books){
            System.out.println(book);
        }
    }

    public  void displayMembers(){
        System.out.println("\n----Member List----");
        for(Member member : members){
            System.out.println(member);
        }
    }

    public void issueBook(int bookId, int memberId){
        for(Book book : books){
            if(book.getBookId() == bookId){
                if(!book.isIssued()){
                    book.setIssued(true);
                    issuedBooks.put(bookId, memberId);
                    System.out.println("Book issued to member ID " + memberId);
                    return;
                }else{
                    System.out.println("Book is already Issued.");
                    return;
                }
            }
        }
        System.out.println("Book ID not found.");
    }

    public void returnBook(int bookId){
        if(issuedBooks.containsKey(bookId)){
            for(Book book : books){
                if(book.getBookId() == bookId){
                    book.setIssued(false);
                    issuedBooks.remove(bookId);
                    System.out.println("Book returned");
                    return;
                }
            }
        }else {
            System.out.println("Book is not issued or Invalid ID.");
        }
    }
}
