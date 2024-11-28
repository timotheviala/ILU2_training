import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calculatrice.Calculatrice;
import Calculatrice.Calculatrice;

class CalculatriceTest {
	private Calculatrice calculatrice;
	
	@BeforeEach
	void init() {
		calculatrice=new Calculatrice();
	}

	@Test
	void testAdditionUnZero() {
		assertEquals(calculatrice.additionner(1,0),1);
	}
	
	@Test
	void testAdditionDeuxValeurs() {
		assertEquals(calculatrice.additionner(2,3),5);
	}
	
	@Test
	void testSommeValues() {
		assertEquals(calculatrice.additionner(34, 3),37);
		assertEquals(calculatrice.additionner(-1, 1), 0);
		assertEquals(calculatrice.additionner(2,18),20);
	}
	
	@Test
	void testSoustrcationUnZero() {
		assertEquals(calculatrice.soustraire(1,0), 1);
	}
	
	@Test
	void testSoustractionDouzeDeux() {
		assertEquals(calculatrice.soustraire(12, 2),10);
	}
	
	@Test
	void testSomeValues() {
		assertEquals(calculatrice.soustraire(-2, -3), 1);
		assertEquals(calculatrice.soustraire(18, 10),8);
		assertEquals(calculatrice.soustraire(13, 20),-7);
	}
}
