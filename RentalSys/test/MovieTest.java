
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {

    public MovieTest() {
    }

    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie[] movies = {new Movie("Title", Movie.CHILDRENS), new Movie("Title", Movie.NEW_RELEASE), new Movie("Title", Movie.REGULAR)};
        Movie instance = movies[new Random().nextInt(movies.length)];
        assertFalse("El codigo de precio no debe ser mayor que 2", instance.getPriceCode() >= 3 && instance.getPriceCode() < 0);
    }

    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        Movie instance = new Movie("Title", Movie.CHILDRENS);
        int expResult = Movie.NEW_RELEASE;
        instance.setPriceCode(expResult);
        assertTrue("El codigo de precio debe ser menor o igual que 2", instance.getPriceCode() == expResult);
    }
}
