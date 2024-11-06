package DateComparison;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    private Date date;

    /*
    Test equals metode, som sammenholder 2 objekter.
     */
    @Test
    void testDateComparator() {
        date = new Date(1, 8, 2024);
        Date testDate = new Date(1, 8, 2024);

        boolean actual = date.equals(testDate);

        assertTrue(actual);
    }

    @Test
    void testDateComparatorWrong() {
        date = new Date(1, 8, 2024);
        Date testDate = new Date(1, 9, 2024);

        boolean actual = date.equals(testDate);

        assertFalse(actual);
    }

    //Test hashcode metode 
}