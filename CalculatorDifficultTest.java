import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.Calculator;

public class CalculatorDifficultTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculatorDifficultTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculatorDifficultTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Calculator calc = new Calculator();
        assertEquals(9, calc.sum(4,5));
    }
}
