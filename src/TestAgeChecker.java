import static org.junit.Assert.*;

import org.junit.Test;


public class TestAgeChecker {
	
	AgeChecker tester = new AgeChecker();
	
	@Test
	public void testConcatenateNames() {
		String result = tester.concatenateNames("Brett" , "Bernard");
		assertEquals("Brett Bernard", result);
	}
	
	@Test
	public void testVerifyLegalAgeTrue() {
		boolean result = tester.verifyLegalAge(1990);
		assertTrue(result);
	}

	@Test
	public void testVerifyLegalAgeFalse() {
		boolean result = tester.verifyLegalAge(1997);
		assertFalse(result);
	}
}
