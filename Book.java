import java.util.TreeSet;
/**
 * Write a description of class Book here.
 *
<<<<<<< HEAD
 * @author (2018315033태영준,2018210083노승욱, 2018210025현기호, 2018210059송주호)
=======
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
>>>>>>> e9e3ad21fccbe4032e74871f1a864f33711564d2
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
<<<<<<< HEAD
    public Book getBook(int CatalogueNumber){
        
    }
=======

    public Book getBook(int CatalogueNumber){
        return Book; 
    }

>>>>>>> e9e3ad21fccbe4032e74871f1a864f33711564d2
    public void delLoan(){
        this.loan = null;
    }
<<<<<<< HEAD
    public void display(Book book){
        
=======

    public void display(){
        this.
>>>>>>> e9e3ad21fccbe4032e74871f1a864f33711564d2
    }
}
