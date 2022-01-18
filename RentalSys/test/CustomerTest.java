
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    public CustomerTest() {
    }

    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        Customer instance = new Customer("PEPITO");
        Movie movie = new Movie("Title", Movie.NEW_RELEASE);
        MovieRental arg = new MovieRental(movie, 1);
        instance.addMovieRental(arg);

        assertNotNull("Movie instace shouldn't be null", movie);
        assertNotNull("Movie rental instace shouldn't be null", arg);
        assertFalse("The movie wasn't succesfully added to the custumer", instance.getMovieRentals().isEmpty());
    }

    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        WiiGame game = new WiiGame("Mi Sports");
        Customer instance = new Customer("PEPITO");
        VideoGameRental arg = new VideoGameRental(game, 1, true);
        instance.addVideoGameRental(arg);

        assertNotNull("WiiGame instace shouldn't be null", game);
        assertNotNull("Movie rental instace shouldn't be null", arg);
        assertFalse("The movie wasn't succesfully added to the custumer", instance.getVideoGameRental().isEmpty());
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
