import java.util.*;
/**
 * Write a description of class Library here.
 *
 * @author (2018315033태영준,2018210083노승욱, 2018210025현기호, 2018210059송주호)
 * @version (2019.11.29)
 */
public class Library
{
    private String name;
    private TreeSet<Book> Books = new TreeSet<Book>();
    private HashSet<Borrower> registeredBorrowers = new HashSet<Borrower>();
    private ArrayList<Loan> Loans = new ArrayList<Loan>();
    public Library(String name){
        this.name = name;
    }

    public void RegisterOneBorrower(String name){
        Borrower borrower = new Borrower(name);
    }

    public void RegisterOneBook(String title, String author, int CatalogueNumber){
        Book book = new Book(title, author, CatalogueNumber);
        
    }

    public void LendOneBook(String name, int CatalogueNumber){

    } 

    public void ReturnOneBook(int CatalogueNumber){

    }
    
    public void DisplayBooksAvailableForLoan(Book book){
      
    }

    public void DisplayBooksAvailableOnLoan(Book book){
    }
    
    public String DisplayBorrowersLoanBook(int CatalogueNumber)
    {
        
    }
    
    
}
