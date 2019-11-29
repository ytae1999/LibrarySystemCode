import java.util.HashSet;
/**
 * Write a description of class Borrower here.
 *
 * @author (2018315033태영준,2018210083노승욱, 2018210025현기호, 2018210059송주호)
 * @version (2019.11.29)
 */
public class Borrower
{
    private String name;
    private Loan loan;
    public Borrower(String name){
        this.name = name;
    }

    public String toString(){
        return  "Borrower" + name + ")";
    }

    public boolean Check(String name){
        return true;
    }

    public void getBorrower(String name){
                                                                                                
    }

    public boolean addLoan(Loan loan){
        this.loan = loan;
        return true;
    }

    public void delLoan(){

    }
}
