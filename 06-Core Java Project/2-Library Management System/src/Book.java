public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int isIssued, String author, String title) {
        this.isIssued = false;
        this.author = author;
        this.title = title;
        this.bookId = bookId;
    }

    public int getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Boolean isIssued(){
        return isIssued;
    }

    public void setIssued(boolean issued){
        isIssued = issued;
    }

    public String toString(){
        return bookId + " - " + title + " by " + author + (isIssued ? "[Issued]" : " [Available]");
    }


}
