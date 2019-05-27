package testes.figuras;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Retangulo;

/**
 * Classe RetanguloTest
 * @author Adriele e Samara
 */
public class RetanguloTest {
	
	Retangulo retangulo;

	@BeforeEach
	public void setUp() throws Exception {
		retangulo = new Retangulo(2, 3);
	}

	/**
	 * Método que testa os dados certo do retangulo
	 */
	@Test
	public void testDadosCerto() {
		assertEquals(2, retangulo.getBase(), 0);
		assertEquals(3, retangulo.getAltura(), 0);
	}

	/**
	 * Método que testa os dados errado do retangulo
	 */
	@Test
	public void testDadosErrado() {
		assertNotEquals(10, retangulo.getBase(), 0);
		assertNotEquals(20, retangulo.getAltura(), 0);
	}

}
