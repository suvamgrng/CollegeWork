package WeekSeven;

/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publicationYear;
    private String genre;
    private boolean availabilityStatus;

    public Book(String title, String author, String isbn, int publicationYear, String genre, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.availabilityStatus = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public void isAvailable(boolean available) {
        this.availabilityStatus = available;
    }

    @Override
    public String toString() {
        return "Book: \n" + 
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "ISBN: " + isbn + "\n" +
                "Publication Year: " + publicationYear + "\n" +
                "Genre: " + genre + "\n" + 
                "AvailabilityStatus: " + availabilityStatus;
    }

}