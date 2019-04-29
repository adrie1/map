package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import figurasgeometricas.Retangulo;

/**
 * Classe RetanguloTest
 * @author Adriele e Samara
 */
public class RetanguloTest {
	
	Retangulo retangulo;

	@Before
	public void setUp() {
		retangulo = new Retangulo(8, 10);
	}

	/**
	 * Cálculo da área
	 */
	@Test
	public void testCalcularArea() {
		assertEquals(80, retangulo.calculaArea(), 0.5);
	}
	
	/**
	 * Cálculo do perímetro
	 */
	@Test
	public void testCalcularPerimetro() {
		assertEquals(36, retangulo.calculaPerimetro(), 0.5);
	}

}
