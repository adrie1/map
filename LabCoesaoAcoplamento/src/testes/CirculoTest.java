package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import figurasgeometricas.Circulo;

/**
 * Classe CirculoTest
 * @author Adriele e Samara
 */
public class CirculoTest {
	
	Circulo circulo;

	@Before
	public void setUp() {
		circulo = new Circulo(3);
	}

	/**
	 * C�lculo da �rea 
	 */
	@Test
	public void testCalcularArea() {
		assertEquals(28.26, circulo.calculaArea(), 0.5);
	}
	
	/**
	 * C�lculo do per�metro
	 */
	@Test
	public void testCalcularPerimetro() {
		assertEquals(18.84, circulo.calculaPerimetro(), 0.5);
	}

}
