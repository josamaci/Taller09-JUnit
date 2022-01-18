
import org.junit.Test;
import static org.junit.Assert.*;

public class MovieRentalTest {

    public MovieRentalTest() {
    }

    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        MovieRental instance = null;
        int expResult = 0;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        MovieRental instance = null;
        Movie expResult = null;
        Movie result = instance.getMovie();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
