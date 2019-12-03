import java.util.*;
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
        boolean result = contains(borrower);
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
        boolean result = contains(book);
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
            if(books.CatalogueNumber == CatalogueNumber)
            {
                Book book = getBook();//빌리려는 책
            }     
        } 
        Iterator<Borrower> it = registeredBorrowers.iterator();      
        while(it.hasNext()){        
            Borrower borrowers = it.next();     
            if(books.CatalogueNumber == CatalogueNumber)
            {
                Borrower borrower = getBorrower();//빌리려는 이용자
            }     
        } 
        
    }
    
    public void ReturnOneBook(int CatalogueNumber)
    {

    }
        

    public void DisplayBooksAvailableForLoan(Book book){
        Iterator<Book> it = Books.iterator();      
        while(it.hasNext()){        
            Book book = it.next();        
            if(book.getLoan() == null)          
                display(book);  
        }   
    }

    public void DisplayBooksAvailableOnLoan(Book book){
        Iterator<Book> it = Book.iterator();
        while(it.hasNext()){
            Book book = it.next();
            if(book.getLoan() != null)
                display(book);
        }
    }

    public String DisplayBorrowersLoanBook(int CatalogueNumber)
    {
        display();
    }

    public String DisplayBooksLoanedByBorrower(String name)
    {

    }
} 
