import java.util.TreeSet;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private int CatalogueNumber;
    private String title;
    private String author;
    private Loan loan;
    
    public Book(String title, String author, int CatalogueNumber){
        this.CatalogueNumber = CatalogueNumber;
        this.title = title;
        this.author = author;
    }
    public String toString(){
        return "Book(" + CatalogueNumber + "," + title + "," + author + ")";
    }
    public void Check(String title, String author, int CatalogueNumber){
        
    }
    public void getBook(int CatalogueNumber){
        
    }
    public void delLoan(){
        this.loan = null;
    }
    public void display(Book book){
    }
}
