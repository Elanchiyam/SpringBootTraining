package com.global.JacocoProject;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
	
	String input1 = "noon";
	App app = new App();
	boolean expected = true;
	
	@Test
	public void testPalindrome() {
		assertEquals(expected, app.isPalindrome(input1));
	}
	
	@Test
	public void testIsNotPalindrome() {
		assertEquals(false, app.isPalindrome("xyz"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void isNotPalindromeExceptionTest() {
		assertEquals(false, app.isPalindrome(null));
	}
}
