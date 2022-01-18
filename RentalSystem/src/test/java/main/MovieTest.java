package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {

    public MovieTest() {
    }

    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie instance = null;
        int expResult = 0;
        int result = instance.getPriceCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int arg = 0;
        Movie instance = null;
        instance.setPriceCode(arg);
        fail("The test case is a prototype.");
    }

}
