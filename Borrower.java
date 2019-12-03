import java.util.HashSet;
/**
 * Write a description of class Borrower here.
 *
<<<<<<< HEAD
<<<<<<< HEAD
 * @author (2018315033태영준,2018210083노승욱, 2018210025현기호, 2018210059송주호)
=======
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
>>>>>>> e9e3ad21fccbe4032e74871f1a864f33711564d2
=======
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
>>>>>>> 4a3442b853ffa42d7a29054f46448d0c68d73bf5
 * @version (2019.11.29)
 */
public class Borrower
{
    private String name;
    private Loan loan;
    public Borrower(String name){
        this.name = name;
    }

    public Borrower getBorrower(String name){
        return Borrower;
    }

    public void addLoan(Loan loan){
        this.loan = loan;
    }

    public void delLoan(){
        this.loan = null; 
    }
}