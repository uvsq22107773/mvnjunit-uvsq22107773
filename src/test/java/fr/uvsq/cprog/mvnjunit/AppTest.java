package fr.uvsq.cprog.mvnjunit;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Before     // it will be executed before all the tests
    public void mybeforetests(){
        System.out.println("starting tests..");
        Fraction fr = new Fraction(5,3);
        assertEquals(fr.getNum(),5);
        // the expected is 5 and the numerator value is 5
        // this tests shouls be matched

        assert fr.getDen() != 3 : "Denumurator not equal";
        // this should raise an assertion exception
    }


    @Test
    public void mytests()
    {
        Fraction fr = new Fraction(12,5);
        Fraction obj1 ;
        obj1 = fr;

        assertNotNull(obj1);                         // if fraction not null
        assertNull(obj1);
        // if fraction is null, this will cause the test to fail
        // because we expecting a null value, wich is not the case

        assertNotSame(fr, obj1);
        // this will cause also a test fail
        // our two fractions fr and obj1 are the same, and reference to the same addresse

        assertSame(fr, obj1);
    }
    @After
    public void myaftertests(){
        System.out.println("end of tests..");
    }
}
