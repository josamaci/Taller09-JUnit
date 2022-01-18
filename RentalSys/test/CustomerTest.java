
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    public CustomerTest() {
    }

    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = new MovieRental(new Movie("Title", Movie.NEW_RELEASE), 1);
        assertNotNull("Movie rental instace shouldn't be null",arg);
    }

    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = new VideoGameRental(new WiiGame("Mi Sports"), 1, true);
        assertNotNull("Movie rental instace shouldn't be null",arg);
    }

    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer cliente = new Customer("JUAN");
        String expResult = "Rental Record for JUAN\nAmount owed is 0.0\nYou earned 0 frequent renter points";
        String result = cliente.statement();
        assertEquals(expResult, result);
    }

}
