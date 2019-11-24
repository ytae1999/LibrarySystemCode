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
    public Borrower(String name,Loan loan){
        this.name = name;
        this.loan = loan;
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
        return true;
    }

    public void delLoan(){

    }
}
