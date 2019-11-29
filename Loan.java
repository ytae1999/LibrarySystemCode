import java.util.LinkedList;
/**
 * Write a description of class Loan here.
 *
 * @author (2018315033태영준,2018210083노승욱, 2018210025현기호, 2018210059송주호)
 * @version (2019.11.29)
 */
public class Loan
{
    private int loanDate;
    private int returnDate;
    private Book book;
    private Borrower borrower;
    public Loan(int loanDate, int returnDate,Book book,Borrower borrower){
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.book = book;
        this.borrower = borrower;
    }
    public String toString(){
        return "Laon(" + loanDate + "," + returnDate + ")";
    }
    public void delLoan(Loan loan){
        
    }
}
