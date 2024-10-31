package Library;

import java.util.ArrayList;

public class LibraryMainList {
    public static void main(String[] args) {
        ArrayList<Book> directory = new ArrayList<>();

        Book b1 = new Book("Goosebumps", 2005, "Scary stories");
        Book b2 = new Book("Runner", 2006, "Running advice");
        directory.add(b1);
        directory.add(b2);

        long start = System.nanoTime();

        for (Book b : directory) {
            if (b.getName() == "Goosebumps") {
                System.out.println(b);
            }
        }
        long end = System.nanoTime();

        double durationInMilliseconds = 1.0 * (end - start) / 1000000;
        System.out.println(durationInMilliseconds); //Performance for lists
    }



}
