package comptage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComptageTest {
	Comptage comptage;
	
	@BeforeEach
	void init() {
		comptage=new Comptage("olé");
	}
	
	@Test
	void testTab1() {
		comptage.initTab(1);
		assertEquals(comptage.count(), 1);
	}
	
	@Test
	void testTab2() {
		comptage.initTab(2);
		assertEquals(comptage.count(), 1);
	}
	
	@Test
	void testTab3() {
		comptage.initTab(3);
		assertEquals(comptage.count(),1);
	}
	
	@Test
	void testRandom() {
		comptage.initTab(7);
		assertEquals(comptage.count(),3);
	}

	@Test 
	void testTab10(){
		comptage.initTab(10);
		assertEquals(comptage.count(), 745);
	}
	
	@Test
	void testTab15(){
		comptage.initTab(15);
		assertEquals(comptage.count(),745);
	}
	
	@Test
	void testRandoms() {
		comptage.initTab(145);
		assertEquals(comptage.count(),745);
		comptage.initTab(9);
		assertEquals(comptage.count(), 3);
	}
}
