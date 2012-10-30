package junitDemo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
public class SubOneTest extends SuperTest {
    
    @Override
    public Super createInstance() {
        return new SubOne();
    }

    /**
     * Test of saveInput method, of class SubOne.
     * 
     * This functionality can only be tested after knowing
     * details of the concrete implementation (in this case,
     * the name of the internal variable).  
     */
    @Test
    public void testSaveInput() {
        System.out.println("SubOne.saveInput");
        SubOne instance = new SubOne();
        instance.saveInput(5);
        
        assertEquals(5, instance.internal_variable);
    }

    /**
     * Test of fiveTimesInternal method, of class SubOne.
     * 
     * This is extra functionality found in SubTwo, but not
     * in any other subclasses.
     */
    @Test
    public void testFiveTimesInternal() {
        System.out.println("SubOne.testFiveTimesInternal");
        SubOne instance = new SubOne();
        
        instance.saveInput(4);
        assertEquals(20, instance.fiveTimesInternal());
    }
    
}
