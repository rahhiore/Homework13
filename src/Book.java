import java.util.Objects;
public class Book {
    String bookName;
    Author author;
    int releaseYear;
    public Book(String bookName, Author author, int releaseYear) {
        this.bookName = bookName;
        this.author = author;
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString() {
        return "bookName=" + this.bookName + ", " + this.author + ", releaseYear=" + this.releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseYear == book.releaseYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, releaseYear);
    }
    public String getAuthor() {
        return author.getFullName();
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public String getBookName() {
        return bookName;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
