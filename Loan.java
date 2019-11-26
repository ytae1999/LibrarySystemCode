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
