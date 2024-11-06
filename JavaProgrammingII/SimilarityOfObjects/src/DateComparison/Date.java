package DateComparison;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(Date date) {

        if (date == null || this.getClass() != date.getClass()) {
            return false;
        }

        return this.day == date.day && this.month == date.month && this.year == date.year;
    }

    public int hashCode() {
        return this.day + this.month + this.year;
    }
}
