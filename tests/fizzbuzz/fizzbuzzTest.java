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

}
