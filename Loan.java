import java.util.ArrayList;
import java.time.*;
/**
 * Write a description of class Loan here.
 *
 * @author (2018315033 태영준, 2018210083 노승욱, 2018210025 현기호, 2018210059 송주호)
 * @version (2019.12.03)
 */
public class Loan
{
    private LocalDate loanDate;
    private LocalDate returnDate;
    private Book book;
    private Borrower borrower;
    
    public Loan(Book book, Borrower borrower){
        this.loanDate = LocalDate.now();
        this.returnDate = loanDate.plusDays(14);
        this.book = book;
        this.borrower = borrower;
    }
    
    public Borrower getBorrower()
    {
        return this.borrower;
    }
    
    public void getBorrowerName(Loan loan){
        System.out.println(loan.getBorrower());
    }
    
    public void display(){
        System.out.println(this.getBorrower().getName());
    }
    
    public void printReturnDate(){
        System.out.println(returnDate + "까지 반납해주세요");
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
    
    public String findName(int CatalogueNumber){
        return name;
    }
>>>>>>> 4103b05f8958fa54cba213222897d1d91f67b8db
=======
    
    public String findName(int CatalogueNumber){
        return name;
    }
>>>>>>> 4103b05f8958fa54cba213222897d1d91f67b8db
=======
    
    public String findName(int CatalogueNumber){
        return name;
    }
>>>>>>> 4103b05f8958fa54cba213222897d1d91f67b8db
=======
    
    public String findName(int CatalogueNumber){
        return name;
    }
>>>>>>> 4103b05f8958fa54cba213222897d1d91f67b8db
}
