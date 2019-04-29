package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import figurasgeometricas.Quadrado;

/**
 * Classe QuadradoTest
 * @author Adriele e Samara
 */
public class QuadradoTest {
	
	Quadrado quadrado;

	@Before
	public void setUp() {
		quadrado = new Quadrado(20);
	}

	/**
	 * Cálculo do área
	 */
	@Test
	public void testCalcularArea() {
		assertEquals(400, quadrado.calculaArea(), 0.5);
	}
	
	/**
	 * Cálculo do perímetro 
	 */
	@Test
	public void testCalcularPerimetro() {
		assertEquals(80, quadrado.calculaPerimetro(), 0.5);
	}

}
