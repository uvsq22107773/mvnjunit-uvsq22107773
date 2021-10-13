package fr.uvsq.cprog.mvnjunit;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        Fraction obj = new Fraction(5,3);
        Fraction obj1 ;
        obj1 = obj;
        assertTrue( true );
        assertEquals(obj.getNum(),5);
        assertNotNull(obj);
        assertNull(null);
        //assertNotSame(obj, obj1);
        assertSame(obj, obj1);
    }
}
