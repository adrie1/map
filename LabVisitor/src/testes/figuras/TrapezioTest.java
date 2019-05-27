package testes.figuras;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Trapezio;

/**
 * Classe TrapezioTest
 * @author Adriele e Samara
 */
public class TrapezioTest {
	
	Trapezio trapezio;

	@BeforeEach
	public void setUp() throws Exception {
		trapezio = new Trapezio(20, 15, 1, 2, 1);
	}

	/**
	 * Método que testa os dados certo do trapezio
	 */
	@Test
	public void testDadosCerto() {
		assertEquals(20, trapezio.getBaseMaior(), 0);
		assertEquals(15, trapezio.getBaseMenor(), 0);
		assertEquals(1, trapezio.getLado1(), 0);
		assertEquals(2, trapezio.getLado2(), 0);
		assertEquals(1, trapezio.getAltura(), 0);
	}

	/**
	 * Método que testa os dados errado do trapezio
	 */
	@Test
	public void testDadosErrado() {
		assertNotEquals(2, trapezio.getBaseMaior(), 0);
		assertNotEquals(1, trapezio.getBaseMenor(), 0);
		assertNotEquals(10, trapezio.getLado1(), 0);
		assertNotEquals(20, trapezio.getLado2(), 0);
		assertNotEquals(10, trapezio.getAltura(), 0);
	}
}
