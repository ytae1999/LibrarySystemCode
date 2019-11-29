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
    public Library(String name){
        this.name = name;
    }


    public void RegisterOneBorrower(String name){
        Borrower borrower = new Borrower(name);
    }

    public void RegisterOneBook(String title, String author, int CatalogueNumber){
        Book book = new Book(title, author, CatalogueNumber);

        if(Check(CatalogNumber)){
            
            boolean result = registeredBook.add(book);
            if(result == true){
                System.out.println("등록되었습니다.");
            }
            else{
                System.out.println("등록에 실패하였습니다.");

            }
        }
    }

    public void LendOneBook(String name, int CatalogueNumber){

    } 

    public void ReturnOneBook(int CatalogueNumber){

    }
    
    public boolean Check(String name){
        Iterator it = 
    }
    public boolean Check(int CatalogueNumber){
        
    }
    
    public void DisplayBooksAvailableForLoan(Book book){
        Iterator it = registeredBooks.iterator();
        while(it.hasNext() == true){
            Book book = (Book)it.next();
            if(book.getLoan() == null){
                display(book);
            }
        }
    }

    public void DisplayBooksAvailableOnLoan(Book book){
    }
    
}

