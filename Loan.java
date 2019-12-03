import java.util.ArrayList;
/**
 * Write a description of class Loan here.
 *
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
 * @version (2019.12.03)
 */
public class Loan
{
    private int loanDate;
    private int returnDate;
    private Book book;
    private Borrower borrower;
    
    public Loan(int loanDate, int returnDate, Book book, Borrower borrower){
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.book = book;
        this.borrower = borrower;
    }
    
    public void getLoan(int CatalogNumber){
        return loan;
    }
        
    public void getLoan(String name){
        return loan;
    }
    
    public String findName(int CatalogueNumber){
        return name;
    }
    
    public void getBorrowerName(String name){
        return 
    }
    
    public void display(){
        return 
    }
    
    public void printReturnDate(){
        System.out.println(returnDate + "까지 반납해주세요");
    }
}
