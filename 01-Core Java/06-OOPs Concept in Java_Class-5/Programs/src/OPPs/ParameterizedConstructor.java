package OPPs;

class Book {
    String title;

    Book(String t){
        title = t;
    }

    void display(){
        System.out.println("Book Title: " + title);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Book b = new Book("Java Basics");
        b.display();
    }
}
