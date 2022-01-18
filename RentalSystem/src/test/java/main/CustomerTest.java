package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    public CustomerTest() {
    }

    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = null;
        Customer instance = null;
        instance.addMovieRental(arg);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = null;
        Customer instance = null;
        instance.addVideoGameRental(arg);
        fail("The test case is a prototype.");
    }

    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = null;
        String expResult = "";
        String result = instance.statement();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
