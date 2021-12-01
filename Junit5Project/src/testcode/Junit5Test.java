package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import buisnesscode.colorBag;

class Junit5Test {

	private colorBag colorBag;
	@BeforeEach
	void setUp() throws Exception {
		colorBag=new colorBag();
		colorBag.add("red");
		colorBag.add("green");
		colorBag.add("yellow");
		colorBag.add("blue");
		colorBag.add("magenta");
		
		
	}

	
	@Test
	@DisplayName("Added color in Bag")
	void testAdd() {
		var newColor="pink";
		colorBag.add(newColor);
		assertTrue(colorBag.contains(newColor),"failure");	
	}
	
	@Test
	@DisplayName("Removed color not be in the bag")
	void testRemove() {
		var color="green";
		colorBag.remove(color);
		assertFalse(colorBag.contains(color),"failure");	
	}

	@Test
	void testToList() {
		fail("Not yet implemented");
	}

	@Test
	void testContains() {
		fail("Not yet implemented");
	}

	@Test
	void testSize() {
		fail("Not yet implemented");
	}

}
