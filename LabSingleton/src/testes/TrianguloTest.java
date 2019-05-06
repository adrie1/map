package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import figuraTriangulo.TrianguloEquilatero;
import figuraTriangulo.TrianguloIsosceles;
import figuraTriangulo.TrianguloRetangulo;

/**
 * Classe de teste para o tri�ngulo
 * 
 * @author Adriele e Samara
 */
public class TrianguloTest {

	TrianguloEquilatero equilatero1, equilatero2;
	TrianguloIsosceles isosceles1, isosceles2;
	TrianguloRetangulo retangulo1, retangulo2;

	@Before
	public void setUp() throws Exception {
		equilatero1 = TrianguloEquilatero.getInstancia();
		equilatero2 = TrianguloEquilatero.getInstancia();
		isosceles1 = TrianguloIsosceles.getInstancia();
		isosceles2 = TrianguloIsosceles.getInstancia();
		retangulo1 = TrianguloRetangulo.getInstancia();
		retangulo2 = TrianguloRetangulo.getInstancia();
	}

	/**
	 * Teste para criar um tri�ngulo equil�tero
	 */
	@Test
	public void testCriarTrianguloEquilatero() {
		// Verifica se o tri�ngulo equil�tero n�o est� nulo, se n�o est� significa que
		// est� obtendo a
		// inst�ncia
		assertNotNull(equilatero1);
		assertNotNull(equilatero2);

		// Verifica se a sa�da � igual ao m�todo criarTriangulo
		assertEquals("Triangulo criado com lados: 4.0, 4.0, 4.0", equilatero1.criarTriangulo(4, 4, 4));
		assertEquals("Triangulo criado com lados: 6.0, 6.0, 6.0", equilatero2.criarTriangulo(6, 6, 6));

		// Verifica se as int�ncias s�o iguais. Como o padr�o Singleton cria apenas uma
		// inst�ncia ent�o elas ser�o iguais
		assertEquals(equilatero1, equilatero2);
	}

	/**
	 * Teste para criar um tri�ngulo is�sceles
	 */
	@Test
	public void testCriarTrianguloIsosceles() {
		// Verifica se o tri�ngulo is�sceles n�o est� nulo, se n�o est� significa que
		// est� obtendo a
		// inst�ncia
		assertNotNull(isosceles1);
		assertNotNull(isosceles2);

		// Verifica se a sa�da � igual ao m�todo criarTriangulo
		assertEquals("Triangulo criado com lados: 2.0, 2.0, 4.0", isosceles1.criarTriangulo(2, 2, 4));
		assertEquals("Triangulo criado com lados: 4.0, 4.0, 6.0", isosceles2.criarTriangulo(4, 4, 6));

		// Verifica se as int�ncias s�o iguais. Como o padr�o Singleton cria apenas uma
		// inst�ncia ent�o elas ser�o iguais
		assertEquals(isosceles1, isosceles2);
	}

	/**
	 * Teste para criar um tri�ngulo ret�ngulo
	 */
	@Test
	public void testCriarTrianguloRetangulo() {
		// Verifica se o tri�ngulo ret�ngulo n�o est� nulo, se n�o est� significa que
		// est� obtendo a
		// inst�ncia
		assertNotNull(retangulo1);
		assertNotNull(retangulo2);

		// Verifica se a sa�da � igual ao m�todo criarTriangulo
		assertEquals("Triangulo criado com lados: 20.0, 40.0, 90.0", retangulo1.criarTriangulo(20, 40, 90));
		assertEquals("Triangulo criado com lados: 15.0, 30.0, 90.0", retangulo2.criarTriangulo(15, 30, 90));

		// Verifica se as int�ncias s�o iguais. Como o padr�o Singleton cria apenas uma
		// inst�ncia ent�o elas ser�o iguais
		assertEquals(retangulo1, retangulo2);
	}

}
