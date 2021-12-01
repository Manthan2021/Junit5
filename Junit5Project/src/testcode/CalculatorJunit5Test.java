package testcode;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import buisnesscode.Calculator;
@DisplayName("Calculator Test Case")
class CalculatorJunit5Test {
//create Object of class to be Tested
	Calculator calc;
	@BeforeEach
	void setUp() throws Exception {
	calc=new Calculator();	
	}

	@AfterEach
	void tearDown() throws Exception {
		calc=null;
	}

	
	
	@Test
	@DisplayName("Calculator add Test")
	void testAdd() {
		double result=calc.add(10.5, 10.32);
		assertEquals(20.82,result,0);
	}
@Test
@DisplayName("Calculator subtract Test")
void testSubtract() {
	double result=calc.subtract(100.5,95);
	assertEquals(5.5,result,0);
}
	@Test
	void testMultiply() {
		double result=calc.multiply(200,2.5);
		assertEquals(500,result,0);
	}
	
	@Test
	@DisplayName("Calculator divide test")
	public void testDivide() {
		double result=calc.divide(100, 10);
		assertEquals(10,result,0);
	}
	
	
	
	
	
}
