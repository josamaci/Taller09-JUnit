
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MovieRentalTest {

    protected Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;

    public MovieRentalTest() {
    }

    @Before
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);
    }

    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }

    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        MovieRental instance = new MovieRental(theManWhoKnewTooMuch, 10);
        int expResult = 10;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        MovieRental instance = new MovieRental(mulan, 10);
        Movie expResult = mulan;
        Movie result = instance.getMovie();
        assertEquals(expResult, result);
    }

}
