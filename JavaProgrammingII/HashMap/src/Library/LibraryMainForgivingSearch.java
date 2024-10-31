package Library;

import java.util.HashMap;

/*
Using built in methods to make search easier and more forgiving.
 */

public class LibraryMainForgivingSearch {
    public static void main(String[] args) {
        HashMap<String, Book> directory = new HashMap<>();

        Book b1 = new Book("Goosebumps", 1996, "Scary stories");
        Book b2 = new Book("Runner", 2009, "Running advice");
        Book b3 = new Book("Java for dummies", 2019, "Java basics");

        directory.put("goosebumps", b1);
        directory.put("runner", b2);
        directory.put("java for dummies", b3);

        String bookSearch = "Java for dummies   ";
        bookSearch = bookSearch.toLowerCase();
        bookSearch = bookSearch.trim();

        System.out.println(bookSearch);
        System.out.println(directory.get(bookSearch));
    }
}
