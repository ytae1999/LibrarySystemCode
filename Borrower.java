
import java.util.HashSet;
/**
 * Write a description of class Borrower here.
 *
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
 * @version (2019.12.03)
 */
public class Borrower
{
    private String name;
    private Loan loan;

    public Borrower(String name){
        this.name = name;
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public Borrower getBorrower(String name){
        
        return this.Borrower;
    }
    
=======

>>>>>>> 4103b05f8958fa54cba213222897d1d91f67b8db
=======

>>>>>>> 4103b05f8958fa54cba213222897d1d91f67b8db
=======

>>>>>>> 4103b05f8958fa54cba213222897d1d91f67b8db
=======

>>>>>>> 4103b05f8958fa54cba213222897d1d91f67b8db
    public void addLoan(Loan loan){
        this.loan = loan;
    }
    
    public void delLoan(){
        this.loan = null; 
    }
    
    public Loan getLoan(int CatalogueNumber){
        return this.loan;
    }
    
    public String getName()
    {
        return this.name;
    }
}