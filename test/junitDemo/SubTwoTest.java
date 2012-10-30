package junitDemo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class SubTwoTest extends SuperTest {
    
    @Override
    public Super createInstance() {
        return new SubTwo();
    }

    /**
     * Test of saveInput method, of class SubTwo.
     * 
     * This functionality can only be tested after knowing
     * details of the concrete implementation (in this case,
     * the name of the internal variable).  
     */
    @Test
    public void testSaveInput() {
        System.out.println("SubTwo.saveInput");
        SubTwo instance = new SubTwo();
        instance.saveInput(5);
        
        assertEquals(5, instance.some_other_internal_value);
    }

    /**
     * Test of tenTimesInternal method, of class SubTwo.
     * 
     * This is extra functionality found in SubTwo, but not
     * in any other subclasses.
     */
    @Test
    public void testTenTimesInternal() {
        System.out.println("SubTwo.tenTimesInternal");
        SubTwo instance = new SubTwo();
        
        instance.saveInput(4);
        assertEquals(40, instance.tenTimesInternal());
    }
    
}
