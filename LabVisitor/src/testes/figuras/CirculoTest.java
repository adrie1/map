package testes.figuras;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Circulo;

/**
 * Classe CirculoTest
 * @author Adriele e Samara
 */
public class CirculoTest {
	
	Circulo circulo;

	@BeforeEach
	public void setUp() throws Exception {
		circulo = new Circulo(5);
	}

	/**
	 * Método que testa os dados certo do circulo
	 */
	@Test
	public void testDadosCerto() {
		assertEquals(5, circulo.getRaio(), 0);
	}
	
	/**
	 * Método que testa os dados errado do circulo
	 */
	@Test
	public void testDadosErrado() {
		assertNotEquals(10, circulo.getRaio(), 0);
	}

}
