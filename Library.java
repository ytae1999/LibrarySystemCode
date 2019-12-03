import java.util.*;
/**
 * Write a description of class Library here.
 *
<<<<<<< HEAD
<<<<<<< HEAD
 * @author (2018315033태영준,2018210083노승욱, 2018210025현기호, 2018210059송주호)
=======
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
>>>>>>> e9e3ad21fccbe4032e74871f1a864f33711564d2
=======
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
>>>>>>> 4a3442b853ffa42d7a29054f46448d0c68d73bf5
 * @version (2019.11.29)
 */
public class Library
{
    private String name;
    private TreeSet<Book> Books = new TreeSet<Book>();
    private HashSet<Borrower> registeredBorrowers = new HashSet<Borrower>();
    private ArrayList<Loan> Loans = new ArrayList<Loan>();
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> e9e3ad21fccbe4032e74871f1a864f33711564d2
=======

>>>>>>> 4a3442b853ffa42d7a29054f46448d0c68d73bf5
    public Library(String name){
        this.name = name;
    }

    public void RegisterOneBorrower(String name){
        Borrower borrower = new Borrower(name);
    }

    public void RegisterOneBook(String title, String author, int CatalogueNumber){
<<<<<<< HEAD
<<<<<<< HEAD
        Book book = new Book(title, author, CatalogueNumber);
=======
>>>>>>> e9e3ad21fccbe4032e74871f1a864f33711564d2
=======
>>>>>>> 4a3442b853ffa42d7a29054f46448d0c68d73bf5
        
    }

    public void LendOneBook(String name, int CatalogueNumber){

    } 

    public void ReturnOneBook(int CatalogueNumber){

    }
<<<<<<< HEAD
<<<<<<< HEAD
    
    public void DisplayBooksAvailableForLoan(Book book){
      
=======

    public boolean Check(String name,HashSet<Borrower> registeredBorrowers){
        return true;
    }

    public boolean Check(int CatalogueNumber,TreeSet<Book> Books){
        return true;
>>>>>>> e9e3ad21fccbe4032e74871f1a864f33711564d2
=======

    public boolean Check(String name,HashSet<Borrower> registeredBorrowers){
        return true;
    }

    public boolean Check(int CatalogueNumber,TreeSet<Book> Books){
        return true;
>>>>>>> 4a3442b853ffa42d7a29054f46448d0c68d73bf5
    }

    public void DisplayBooksAvailableOnLoan(Book book){
        Iterator it = Book.iterator();
        while(it.hasNext() == false){
            Book book = (Book)it.next();
<<<<<<< HEAD
            if(book.getLoan() /= null)
=======
            if(book.getLoan() != null)
                display();
        }
    }

    public void DisplayBooksAvailableForLoan(Book book){
        Iterator it = Book.iterator();
        while(it.hasNext() == true){
            Book book = (Book)it.next();
            if(book.getLoan() == null)
>>>>>>> 4a3442b853ffa42d7a29054f46448d0c68d73bf5
                display();
        }
    }

    public void DisplayBooksAvailableForLoan(Book book){
        Iterator it = Book.iterator();
        while(it.hasNext() == true){
            Book book = (Book)it.next();
            if(book.getLoan() == null)
                display();
        }
    }
    
    public String DisplayBorrowersLoanBook(int CatalogueNumber)
    {
        
    }
    
    
}
