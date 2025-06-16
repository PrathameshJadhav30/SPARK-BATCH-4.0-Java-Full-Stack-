public class LibraryBook {
    String title, author, isbn;

    LibraryBook(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public void display(){
        System.out.println("Book: " + title + " By " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Clean Code", "Prathamesh Jadhav", "978-013");
        b.display();
    }
}
