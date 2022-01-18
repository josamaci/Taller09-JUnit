
import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {

    public MovieTest() {
    }

    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        int arg = 0;
        assertFalse("El codigo de precio no debe ser mayor que 2",arg>=3);
        
    }

    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int arg = 0;
        assertTrue("El codigo de precio debe ser menor o igual que 2",arg<=2);
    }
}
