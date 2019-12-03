import java.util.TreeSet;
/**
 * Write a description of class Book here.
 * 
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
 * @version (2019.12.03)
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
    
    public void addLoan(Loan loan)
{
        this.loan = loan;
    }
    
    public void delLoan(){
        this.loan = null;
    }

    public int getCatalogueNumber()
    {
        return this.CatalogueNumber;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public String getAuthor()
    {
        return this.author;
    }
    
    public Loan getLoan()
    {
        return this.loan;
    }
    
    public void display(){
        System.out.println(this.getCatalogueNumber());
        System.out.println(this.getTitle());
        System.out.println(this.getAuthor());
    }   
}