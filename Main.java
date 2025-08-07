import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Library library = new Library();

        //adding sample books (i added my few fav movies lol)
        library.addBook(new Book("Berserk", "Kentaro Miura"));
        library.addBook(new Book("Gone Girl", "Gillian Flynn"));
        library.addBook(new Book("Fight Club", "Chuck Palahnuik"));
        library.addBook(new Book("The Green Mile", "Stephen King"));
        library.addBook(new Book("The Monkey", "Stephen King"));
        library.addBook(new Book("The Shawshank Redemption", "Stephen King"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = sc.nextLine();
        User user = new User(userName);

        int choice;
        do{
            System.out.println("\n1. Show Available Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  //consume newline

            switch (choice){
                 case 1:
                    library.showAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String title = sc.nextLine();
                    library.issueBook(user, title);
                    break;
                case 3:
                    library.returnBook(user);
                    break;
                case 4:
                    System.out.println("Exiting... GoodBye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }while(choice !=4);
        sc.close();
    }
}