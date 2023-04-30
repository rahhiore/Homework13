public class Book {
    String bookName;
    Author author;
    int releaseYear;
    public Book(String bookName, Author author, int releaseYear) {
        this.bookName = bookName;
        this.author = author;
        this.releaseYear = releaseYear;
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
