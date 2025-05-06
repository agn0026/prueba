package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import clases.Minimos;

class TestMinimos {

	@Test
	void testMinimoDe2EnterosPositivos() {
		Minimos m1 = new Minimos ();
		int obtenido = m1.MinimoDe2EnterosPositivos(3, 7);
		int numEsperado = 3;
		assertEquals(numEsperado, obtenido);
	}

	@Test
	void testMinimoDe3EnterosPositivos() {
		Minimos m1 = new Minimos ();
		int obtenido = m1.MinimoDe3EnterosPositivos(3, 7, 5);
		int numEsperado = 3;
		assertEquals(numEsperado, obtenido);
	}

}
