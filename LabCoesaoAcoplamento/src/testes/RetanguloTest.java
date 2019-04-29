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
	 * C�lculo da �rea
	 */
	@Test
	public void testCalcularArea() {
		assertEquals(80, retangulo.calculaArea(), 0.5);
	}
	
	/**
	 * C�lculo do per�metro
	 */
	@Test
	public void testCalcularPerimetro() {
		assertEquals(36, retangulo.calculaPerimetro(), 0.5);
	}

}
