import java.util.*;
import java.lang.*;
/**
 * Write a description of class Library here.
 *
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
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
        boolean result = registeredBorrowers.contains(borrower);
        if(result == false){
            registeredBorrowers.add(borrower);
            System.out.println("등록되었습니다.");
        }
        else{
            borrower = null;
            System.out.println("이미 등록되었습니다.");
        }
    }

    public void RegisterOneBook(String title, String author, int CatalogueNumber){
        Book book = new Book(title, author, CatalogueNumber);
        boolean result = Books.contains(book);
        if(result == false){
            Books.add(book);
            System.out.println("등록되었습니다.");
        }
        else{
            book = null;
            System.out.println("이미 등록되었습니다.");
        }
    }

    public void LendOneBook(String name, int CatalogueNumber)
    {
        Iterator<Book> it = Books.iterator();      
        while(it.hasNext()){        
            Book books = it.next();     
            if(books.getCatalogueNumber() == CatalogueNumber)
            {
                break;
            }     
        } 
        Iterator<Borrower> it2 = registeredBorrowers.iterator();      
        while(it.hasNext()){        
            Borrower borrowers = it2.next();     
            if(borrowers.getName() == name)
            {
                break;
            }     
        } 
        Book book = it.next();
        Borrower borrower = it2.next();
        Loan loan = new Loan(book, borrower);
        Loans.add(loan);
        book.addLoan(loan);
        borrower.addLoan(loan);
    }
    
    public void ReturnOneBook(int CatalogueNumber)
    {
        Iterator<Book> it = Books.iterator();      
        while(it.hasNext()){        
            Book books = it.next();     
            if(books.getCatalogueNumber() == CatalogueNumber)
            {
                break;
            }     
        } 
        Iterator<Loan> it2 = Loans.iterator();      
        while(it.hasNext()){        
            Loan loans = it2.next();     
            if(loans.findName() == name)
            {
                break;
            }     
        } 
        Iterator<Borrower> it3 = registeredBorrowers.iterator();    
        while(it.hasNext()){        
            Borrower borrowers = it3.next();     
            if(borrowers.getName() == name)
            {
                break;
            }     
        } 
        
        Book book = it.next();
        Loan loan = it2.next(); 
        Borrower borrower = it3.next();
        book.delLoan();
        borrower.delLoan();
    }
        

    public void DisplayBooksAvailableForLoan(Book book)
    {
        Iterator<Book> it = Books.iterator();      
        while(it.hasNext()){        
            Book books = it.next();     
            if(books.getLoan() != null)
            {
                books.display();
            }     
        } 
    }

    public void DisplayBooksAvailableOnLoan(Book book)
    {
        Iterator<Book> it = Books.iterator();      
        while(it.hasNext()){        
            Book books = it.next();     
            if(books.getLoan() == null)
            {
                books.display();
            }     
        } 
    }

    public String DisplayBorrowersLoanBook(int CatalogueNumber)
    {
        Iterator<Loan> it = Loans.iterator();      
        while(it.hasNext()){        
            Loan loans = it.next();
            if(loans.get)
            return "";
        } 
    }

    public String DisplayBooksLoanedByBorrower(String name)
    {
        return "";
    }
} 