package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import buisnesscode.JUnitMessage;

class JUnitMessageTest {
	String message="Java";
    JUnitMessage jm=new JUnitMessage(message);
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testJUnitMessage() {
		fail("Not yet implemented");
	}

	@Test
	void testPrintMessage() {
		System.out.println("JUnit message is printing");
		jm.printMessage();
		
	}

	@Test
	void testPrintHiMessage() {
	
		message="Hi"+message;
		System.out.println("Junit Hi msg is printing");
		
		jm.printHiMessage();		

	}

}
