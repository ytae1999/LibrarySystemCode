import java.util.*;
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    public Library(String name){
        this.name = name;
        TreeSet<Book> registeredBooks = new TreeSet<Book>();
        HashSet<Borrower> registeredBorrowers = new HashSet<Borrower>();
    }

    public String toString(){
        return  "Library(" + name + ")";
    }

    public void RegisterOneBorrower(String name){
        Borrower borrower = new Borrower(name);

    }

    public void RegisterOneBook(String title, String author, int CatalogueNumber){
        Book book = new Book(title, author, CatalogueNumber);
        f

    }

    public void LendOneBook(String name, int CatalogueNumber){

    }

    public void ReturnOneBook(int CatalogueNumber){

    }

    public void DisplayBooksAvailableForLoan(Book book){
        Iterator it = registeredBooks.iterator();
        while(it.hasNext() == true){
            Book book = (Book)it.next();
            if(book.getLoan() == null){
                display;
            }
        }
    }
    
    public void DisplayBooksAvailableOnLoan(Book book){
    }
}
