package fizzbuzz;

import fizzbuzz.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzbuzzTest {

	@Test
	void testUn() {
		assertEquals(fizzbuzz.fizzbuzz(1),"1");
	}
	
	@Test
	void testDeux() {
		assertEquals(fizzbuzz.fizzbuzz(2),"2");
	}
	
	@Test
	void testTrois() {
		assertEquals(fizzbuzz.fizzbuzz(3), "fizz");
	}
	
	@Test
	void testSommeValues() {
		assertEquals(fizzbuzz.fizzbuzz(4),"4");
		assertEquals(fizzbuzz.fizzbuzz(9),"fizz");
		assertEquals(fizzbuzz.fizzbuzz(12),"fizz");
		assertEquals(fizzbuzz.fizzbuzz(14), "14");
	}
	
	@Test
	void testCinq() {
		assertEquals(fizzbuzz.fizzbuzz(5),"buzz");
	}
	
	@Test
	void testDifferentsValues() {
		assertEquals(fizzbuzz.fizzbuzz(15),"fizzbuzz");
		assertEquals(fizzbuzz.fizzbuzz(20),"buzz");
		assertEquals(fizzbuzz.fizzbuzz(26),"26");
		assertEquals(fizzbuzz.fizzbuzz(33),"fizz");
		assertEquals(fizzbuzz.fizzbuzz(100),"buzz");
		assertEquals(fizzbuzz.fizzbuzz(77),"77");
	}

}
