
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
        registeredBooks = new TreeSet<Book>
        registeredBorrowers = new HashSet<Borrower>
    }

    public String toString(){
        return  "Library(" + name + ")";
    }

    public void RegisterOneBorrower(String name){
<<<<<<< HEAD
        Borrower borrower = new Borrower(name);
        registeredBorrowers.add(borrower);
=======
>>>>>>> 458bb3fc7e062804cc461cad1015751814120355
    }

    public void RegisterOneBook(String title, String author, int CatalogueNumber){
        Book book = new Book(title, author, CatalogueNumber);
        registeredBooks.add(book);
    }

    public void LendOneBook(String name, int CatalogueNumber){

    }

    public void ReturnOneBook(int CatalogueNumber){

    }

    public void DisplayBooksAvailableForLoan(Book book){

    }

    public void DisplayBooksAvailableOnLoan(Book book){

    }
}
