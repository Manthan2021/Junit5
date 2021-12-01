package testcode;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;



class JunitTestCase {

	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

	@ParameterizedTest
	@ValueSource(strings = {"madam","radar","dad"})
	void testIsPalindrome(String inputText) {
	assertTrue(()->MyUtils.isPalindrome(inputText),()->"Not Palindrome");
	}
	
	@Test
	void testMultiply() {
		fail("Not yet implemented");
	}

}
