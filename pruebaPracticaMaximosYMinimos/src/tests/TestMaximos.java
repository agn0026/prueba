package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Maximos;

class TestMaximos {

	@Test
	void testMaximoDe2EnterosPositivos() {
		Maximos m1 = new Maximos();
		int numObtenido = m1.MaximoDe2EnterosPositivos(0, 7);
		int numEsperado = 7;
		assertEquals(numEsperado, numObtenido);
	}

	@Test
	void testMaximoDe3EnterosPositivos() {
		Maximos m1 = new Maximos();
		int numObtenido = m1.MaximoDe3EnterosPositivos(0, 7, 5);
		int numEsperado = 7;
		assertEquals(numEsperado, numObtenido);
	}

}
