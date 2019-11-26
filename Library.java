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
    private TreeSet<Book> registeredBook;
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
        test
    }

    public void RegisterOneBook(String title, String author, int CatalogueNumber){
<<<<<<< HEAD
<<<<<<< HEAD
        Book book = new Book(title, author, CatalogueNumber);
        f

=======
        if(CheckBook(CatalogNumber)){
=======
        if(Check(CatalogueNumber)){
>>>>>>> 8fcc2c750b2d23c7c7ff1c2abe63c21344ca2ea5
            Book book = new Book(title, author, CatalogueNumber);
            boolean result = registeredBook.add(book);
            if(result == true){
                System.out.println("등록되었습니다.");
            }
            else{
                System.out.println("등록에 실패하였습니다.");
            }
        }
>>>>>>> 9b8f3a166987f95a4582ea804ff74757ec4e7206
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
                display(book);
            }
        }
    }

    public void DisplayBooksAvailableOnLoan(Book book){
    }
}
