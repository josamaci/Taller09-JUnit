package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class VideoGameRentalTest {

    public VideoGameRentalTest() {
    }

    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        VideoGameRental instance = null;
        int expResult = 0;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetVideoGame() {
        System.out.println("getVideoGame");
        VideoGameRental instance = null;
        Object expResult = null;
        Object result = instance.getVideoGame();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        VideoGameRental instance = null;
        double expResult = 0.0;
        double result = instance.getCharge();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        VideoGameRental instance = null;
        int expResult = 0;
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
