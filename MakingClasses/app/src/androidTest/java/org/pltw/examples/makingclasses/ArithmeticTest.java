package org.pltw.examples.makingclasses;
import junit.framework.TestCase;

/**
 * Created by tamir71 on 4/17/2017.
 */
public class ArithmeticTest extends TestCase {

    Arithmetic a;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        a = new Arithmetic();
    }

    public void testArtithmeticAdd() {
        assertEquals(a.add(), 5);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
