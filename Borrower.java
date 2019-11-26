/**
 * Write a description of class Borrower here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
