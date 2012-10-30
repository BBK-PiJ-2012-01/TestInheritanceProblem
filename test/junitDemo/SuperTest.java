package junitDemo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam Wright <swrigh11@dcs.bbk.ac.uk>
 */
abstract public class SuperTest {
    /**
     * Test for subclasses of Super on their Super-derived functionality
     * 
     * @return New instance of concrete subclass
     */
    abstract public Super createInstance();
    
    /**
     * Test of addOne method, of class Super.
     * 
     * This is an easily-tested function which requires
     * no further knowledge of its implementation.
     */
    @Test
    public void testAddOne() {
        System.out.println("Super.addOne");
        Super instance = createInstance();
        assertEquals(4, instance.addOne(3));
    }

    /**
     * Test of saveInput method, of class Super.
     * 
     * We need to know intimate details of the concrete implementation
     * to be able to test this, and by putting this here we require
     * subclasses' testSaveInput to be tested.
     */
    @Test
    abstract public void testSaveInput();
}
