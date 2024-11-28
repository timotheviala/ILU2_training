package TrouveJeuTest;

import static org.junit.jupiter.api.Assertions.*;
import TrouveJeu.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class jeuTest {
	jeu jeu;
	
	@BeforeEach
	void init() {
		jeu=new jeu(3,2,2);
	}
	
	@Test
	void testTrouver() {
		assertEquals(jeu.tryCoordonnees(2,2), 0);
	}
	
	@Test
	void testNonTrouver() {
		assertEquals(jeu.tryCoordonnees(1, 0), 10);
	}
	
	@Test
	void testValues() {
		assertEquals(jeu.tryCoordonnees(2,0 ),10);
		assertEquals(jeu.tryCoordonnees(1, 1), 10);
	}

}
