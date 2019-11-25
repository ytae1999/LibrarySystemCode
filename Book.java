
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
    public Book(int CatalogueNumber, String title, String author){
        this.CatalogueNumber = CatalogueNumber;
        this.title = title;
        this.author = author;
        
    }
    public String toString(){
        return "Book(" + CatalogueNumber + "," + title + "," + author + ")";
    }
    public void Check(int CatalogueNumber, String title, String author){
        
    }
    public void getBook(int CatalogueNumber){
        
    }
    public void getBook(){
    }
    public void delLoan(){
    }
    public void display(Book book){
    }
}
