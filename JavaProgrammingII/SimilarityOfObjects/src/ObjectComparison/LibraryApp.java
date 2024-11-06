package ObjectComparison;

public class LibraryApp {
    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        Book senseAndSensibility2 = new Book("Sense and Sensibility", 1811, "...");

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);
        library.addBook(senseAndSensibility2);

//        System.out.println(library.getBook("pride and prejudice"));
//        System.out.println();
//
//        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
//        System.out.println();
//
//        System.out.println(library.getBook("SENSE"));

        System.out.println();

        System.out.println(library.getBookByPart("pri"));

        System.out.println(senseAndSensibility.equals(senseAndSensibility2));
    }
}
