import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void showAvailableBooks(){
        System.out.println("\nAvailable Books:");
        for(Book book : books){
            if(!book.isIssued()){
                book.displayInfo();
            }
        }
    }

    public Book findBookByTitle(String title){
        for(Book book : books){
        if(book.getTitle().equalsIgnoreCase(title)){
            return book;
        }
    }
    return null;
}

public void issueBook(User user, String title){
    if(user.hasBook()){
        System.out.println(user.getName()+" already has a book issued.");
        return;
    }

    Book book = findBookByTitle(title);
    if(book != null && !book.isIssued()){
        book.issueBook();
        user.borrowBook(book);
        System.out.println("Book issued successfully to "+user.getName());
    }else{
        System.out.println("Book not available or already issued.");
    }
}

public void returnBook(User user){
    if(user.hasBook()){
        Book book = user.getBorrowedBook();
        book.returnBook();
        user.returnBook();
        System.out.println("Book returned successfully by "+user.getName());
    }else{
        System.out.println(user.getName()+" has no book to return.");
    }
}
}