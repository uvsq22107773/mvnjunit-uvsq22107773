package fr.uvsq.cprog.mvnjunit;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.math.BigInteger;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Before     // it will be executed before all the tests
    public void mybeforetests(){
        System.out.println("starting tests..");
        Fraction fr = new Fraction(BigInteger.valueOf(5),BigInteger.valueOf(3));
        assertEquals(fr.getNum(),BigInteger.valueOf(5));
        // the expected is 5 and the numerator value is 5
        // this tests shouls be matched

        //assertNotEquals(fr.getDen() , BigInteger.valueOf(5));
        // this should not succeed anad raise an exception
    }
    

    @Test
    public void mytests()
    {
        Fraction fr = new Fraction(BigInteger.valueOf(12),BigInteger.valueOf(5));
        Fraction obj1;
        obj1 = fr;

        assertNotNull(obj1);                         // if fraction not null
        //assertNull(obj1);
        // if fraction is null, this will cause the test to fail
        // because we expecting a null value, wich is not the case

        //assertNotSame(fr, obj1);
        // this will cause also a test fail
        // our two fractions fr and obj1 are the same, and reference to the same addresse

        assertSame(fr, obj1);
    }
    @Test
    public void deuxNombres() {
      Fraction one = new Fraction(BigInteger.valueOf(1), BigInteger.valueOf(1));
      assertEquals(BigInteger.valueOf(1), one.getNum());
      assertEquals(BigInteger.valueOf(1), one.getDen());
      // this should succeed 
    }
    public void unNombre() {
        Fraction one = new Fraction(BigInteger.valueOf(1));
        assertEquals(BigInteger.valueOf(1), one.getNum());
        assertEquals(BigInteger.valueOf(1), one.getDen());
        // this should succeed 
    }
    public void aucunNombre() {
        Fraction zero = new Fraction();
        assertEquals(BigInteger.valueOf(0), zero.getNum());
        assertEquals(BigInteger.valueOf(1), zero.getDen());
        // this should succeed 
    }

    @Test
    public void equalstest() {
        Fraction fr = new Fraction(BigInteger.valueOf(15),BigInteger.valueOf(3));
        Fraction fr2 = new Fraction(BigInteger.valueOf(5),BigInteger.valueOf(1));

      assertEquals(fr, fr2);
    }

    public void ajoutdeuxfractions() {
        Fraction fr = new Fraction(BigInteger.valueOf(2),BigInteger.valueOf(3));
        Fraction fr2 = new Fraction(BigInteger.valueOf(3),BigInteger.valueOf(3));

        Fraction result = fr.addd(fr2);
        Fraction expected = new Fraction(BigInteger.valueOf(5), BigInteger.valueOf(3));
        assertEquals(expected, result);
      }
    

      @Test
      public void tostringtest() {
        assertEquals("2 / 3", (new Fraction(BigInteger.valueOf(2),BigInteger.valueOf(3))).toString());
      }
    
      
      @Test
    public void comparetest(){
        Fraction fr = new Fraction(BigInteger.valueOf(12),BigInteger.valueOf(16));
        int n = fr.compareTo(new Fraction(BigInteger.valueOf(1),BigInteger.valueOf(7))).intValue();
        System.out.println(n);
        assertTrue( n<0 );
    }
    
  
    @After
    public void myaftertests(){
        System.out.println("end of tests..");
    }
}
