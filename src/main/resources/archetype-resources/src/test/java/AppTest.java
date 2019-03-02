package $package;

import org.junit.Before;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    private App log4jTest;

    @Before
	protected void setUp() {
    	log4jTest = new App();
    }

   
    public void testLog() {
      
      String LOG_FILE_PATH = "C:/custom-maven-archetype/src/main/resources/archetype-resources/src/main/resources/log4j.properties";
      try {
		log4jTest.watchLogEvent(LOG_FILE_PATH);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
    
}
