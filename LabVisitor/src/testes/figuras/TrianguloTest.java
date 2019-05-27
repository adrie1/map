package testes.figuras;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Triangulo;

/**
 * Classe TrianguloTest
 * @author Adriele e Samara
 */
public class TrianguloTest {
	
	Triangulo triangulo;

	@BeforeEach
	public void setUp() throws Exception {
		triangulo = new Triangulo(20, 15, 1);
	}

	/**
	 * Método que testa os dados certo do triangulo
	 */
	@Test
	public void testDadosCerto() {
		assertEquals(20, triangulo.getLadoBase(), 0);
		assertEquals(15, triangulo.getLadoAltura(), 0);
		assertEquals(1, triangulo.getLado3(), 0);
	}

	/**
	 * Método que testa os dados errado do triangulo
	 */
	@Test
	public void testDadosErrado() {
		assertNotEquals(2, triangulo.getLadoBase(), 0);
		assertNotEquals(1, triangulo.getLadoAltura(), 0);
		assertNotEquals(10, triangulo.getLado3(), 0);
	}
}
