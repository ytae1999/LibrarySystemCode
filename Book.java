import java.util.TreeSet;
/**
 * Write a description of class Book here.
 *
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
 * @version (2019.11.29)
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

    public Book getBook(int CatalogueNumber){
        return Book; 
    }

    public void delLoan(){
        this.loan = null;
    }

    public void display(){
        this.
    }
}
