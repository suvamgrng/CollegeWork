package WeekSeven;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    
    public static void main(String[] args) {
        
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", "978-0-345-33968-3", 1937, "Fantasy", true);
        Book b2 = new Book("Clean Code", "Robert C. Martin", "978-0-13-235088-4", 2008, "Programming", true);
        Book b3 = new Book("Old Algorithms", "Alice Author", "978-1-234-56789-7", 1999, "Computer Science", false);
        System.out.println('\u000C');
        List<Book> library = new ArrayList<>();
        library.add(b1);
        library.add(b2);
        library.add(b3);
        
        //Display book information (all books)
        System.out.println("All books in the library");
        System.out.println("-------------------------");
        
        for (Book b: library) {
            System.out.println(b);
            System.out.println();
        }
        
        //Books that are available(availability=true)
        System.out.println("Available Books");
        System.out.println("----------------");
        
        for (Book b: library) {
            if (b.isAvailable()) {
                System.out.println(b);
            }
            System.out.println();
        }
        
        //Books that are not available in the library
        System.out.println("Not availble books");
        System.out.println("-------------------");
        
        for (Book b: library) {
            if (!b.isAvailable()) {
                System.out.println(b);
            }
            System.out.println();
        }
        //Books that are available and have publicationYear greater than 2000
        System.out.println("Available books with publication year > 2000:");
        System.out.println("---------------------------------------------");
        for (Book b: library) {
            if (b.isAvailable() && b.getPublicationYear() > 2000) {

System.out.println(b.getTitle() + " by " + b.getAuthor() + " (" + b.getPublicationYear() + ")");     
        }
        }
    }
}
