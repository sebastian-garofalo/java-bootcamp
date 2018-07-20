package Blog;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase{
	
	public AppTest(String testName) {
		super(testName);
	}

	
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test 
	 */
	public void testApp() {
		assertTrue(true);
	}
	
}
