
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    public CustomerTest() {
    }

    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        Movie movie = new Movie("Title", Movie.NEW_RELEASE);
        MovieRental arg = new MovieRental(movie, 1);
        assertNotNull("Movie instace shouldn't be null",movie);
        assertNotNull("Movie rental instace shouldn't be null",arg);
    }

    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        WiiGame game = new WiiGame("Mi Sports");
        VideoGameRental arg = new VideoGameRental(game, 1, true);
        assertNotNull("WiiGame instace shouldn't be null",game);
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
