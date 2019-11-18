
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String catalogueNumber;
    private String title;
    private String author;
    public Book(String catalogueNumber,String title,String author){
        this.catalogueNumber = catalogueNumber;
        this.title = title;
        this.author = author;
    }
    public String toString(){
        return "Book(" + catalogueNumber + "," + title + "," + author + ")";
    }
}
