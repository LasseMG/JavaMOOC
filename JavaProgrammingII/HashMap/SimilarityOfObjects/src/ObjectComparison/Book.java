package ObjectComparison;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /*
    Compare two objects, cast back to Book if object has been wrapped.
     */
    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) {
            return true;
        }

        if (!(objectToCompare instanceof Book)) {
            return false;
        }
        Book bookToCompare = (Book) objectToCompare;

        if (this.name.equals(bookToCompare.getName()) &&
                this.published == bookToCompare.published &&
                this.content.equals(bookToCompare.content)) {

            return true;
        }
        return false;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
                + "Content: " + this.content;
    }
}
