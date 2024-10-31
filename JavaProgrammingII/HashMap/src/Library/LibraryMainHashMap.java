package Library;

import java.util.HashMap;

/*
Add book objects to a hashmaps using book name as key to simulate a directory of books.
 */
public class LibraryMainHashMap {
    public static void main(String[] args) {
        HashMap<String, Book> directory = new HashMap<>();

        Book goosebumps = new Book("Goosebumps", 1995, "Scary story");
        Book runner = new Book("Runner", 2005, "Running advice");

        directory.put(goosebumps.getName(), goosebumps);
        directory.put(runner.getName(), runner);

        long start = System.nanoTime();
        System.out.println(directory.get("Goosebumps"));
        long end = System.nanoTime();

        double durationInMilliseconds = 1.0 * (end - start) / 1000000;
        System.out.println(durationInMilliseconds); //Performance for hashmaps
    }
}
