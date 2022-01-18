
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class VideoGameRentalTest {

    protected Ps3Game ps3Game;
    protected Xbox360Game xbox360Game;
    protected WiiGame wiiGame;

    public VideoGameRentalTest() {
    }

    @Before
    public void setUp() {
        ps3Game = new Ps3Game("Ps3Game");
        xbox360Game = new Xbox360Game("Xbox360Game");
        wiiGame = new WiiGame("WiiGame");
    }

    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        VideoGameRental instance = new VideoGameRental(ps3Game, 0, true);
        int expResult = 0;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        VideoGameRental instance = new VideoGameRental(xbox360Game, 0, true);
        Object expResult = xbox360Game;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        VideoGameRental instance = new VideoGameRental(wiiGame, 10, true);
        double expResult = wiiGame.getCharge(10, true);
        double result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        VideoGameRental instance = new VideoGameRental(wiiGame, 10, true);
        int expResult = wiiGame.getFrequentRenterPoints(10, true);
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
    }

}
