package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorEasyTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculatorEasyTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculatorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){
        org.example.Calculator calc = new org.example.Calculator();
        assertEquals(5, calc.sum(2,3));
        assertEquals(7, calc.sum(3,4));
        assertEquals(2, calc.sum(1,-1));
        assertEquals(100, calc.sum(99,1));
    }
}
