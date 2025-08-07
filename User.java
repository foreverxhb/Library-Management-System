public class User {
    private String name;
    private Book borrowedBook;

    public User(String name){
        this.name = name;
        this.borrowedBook = null;
    }

    public String getName(){
        return name;
    }
    public Book getBorrowedBook(){
        return borrowedBook;
    }
    public boolean hasBook(){
        return borrowedBook !=null;
    }
    public void borrowBook(Book book){
        this.borrowedBook = book;
    }
    public void returnBook(){
        this.borrowedBook = null;
    }
}
