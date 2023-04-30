public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[2];
        book[0] = new Book("Java Performance: The Definite Guide", new Author("Scott Oaks"), 2014);
        book[1] = new Book("Java Concurrency in Practice", new Author("Brian Goetz"), 2006);
        book[0].setReleaseYear(2023);
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].toString());
            System.out.println(book[i].equals(book[0]));
            System.out.println(book[i].hashCode());
        }

    }
}