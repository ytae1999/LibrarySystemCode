import java.util.LinkedList;
/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    private int loanDate;
    private int returnDate;
    public Loan(int loanDate, int returnDate){
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
    public String toString(){
        return "Laon(" + loanDate + "," + returnDate + ")";
    }
    public void delLoan(Loan loan){
    }
}
