public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[2];
        book[0] = new Book("Java Performance: The Definite Guide", new Author("Scott Oaks"), 2014);
        book[1] = new Book("Java Concurrency in Practice", new Author("Brian Goetz"), 2006);
        book[0].setReleaseYear(2023);
        for (Book value : book) {
            System.out.println(value.getBookName() + ", " + value.getAuthor() + ", " + value.getReleaseYear());
        }
    }
}