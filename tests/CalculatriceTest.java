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
}
