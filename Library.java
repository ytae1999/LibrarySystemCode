
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    public Library(String name){
        this.name = name;
    }

    public String toString(){
        return  "Library(" + name + ")";
    }

    public void RegisterOneBorrower(String name){

    }

    public void RegisterOneBook(String title,String author,int CatalogueNumber){

    }

    public void LendOneBook(String name,int CatalogueNumber){

    }

    public void ReturnOneBook(int CatalogueNumber){

    }

    public void DisplayBooksAvailableForLoan(Book book){

    }

    public void DisplayBooksAvailableOnLoan(Book book){

    }
}
