package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import figuraTriangulo.TrianguloEquilatero;
import figuraTriangulo.TrianguloIsosceles;
import figuraTriangulo.TrianguloRetangulo;

/**
 * Classe de teste para o triângulo
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
	 * Teste para criar um triângulo equilátero
	 */
	@Test
	public void testCriarTrianguloEquilatero() {
		// Verifica se o triângulo equilátero não está nulo, se não está significa que
		// está obtendo a
		// instância
		assertNotNull(equilatero1);
		assertNotNull(equilatero2);

		// Verifica se a saída é igual ao método criarTriangulo
		assertEquals("Triangulo criado com lados: 4.0, 4.0, 4.0", equilatero1.criarTriangulo(4, 4, 4));
		assertEquals("Triangulo criado com lados: 6.0, 6.0, 6.0", equilatero2.criarTriangulo(6, 6, 6));

		// Verifica se as intâncias são iguais. Como o padrão Singleton cria apenas uma
		// instância então elas serão iguais
		assertEquals(equilatero1, equilatero2);
	}

	/**
	 * Teste para criar um triângulo isósceles
	 */
	@Test
	public void testCriarTrianguloIsosceles() {
		// Verifica se o triângulo isósceles não está nulo, se não está significa que
		// está obtendo a
		// instância
		assertNotNull(isosceles1);
		assertNotNull(isosceles2);

		// Verifica se a saída é igual ao método criarTriangulo
		assertEquals("Triangulo criado com lados: 2.0, 2.0, 4.0", isosceles1.criarTriangulo(2, 2, 4));
		assertEquals("Triangulo criado com lados: 4.0, 4.0, 6.0", isosceles2.criarTriangulo(4, 4, 6));

		// Verifica se as intâncias são iguais. Como o padrão Singleton cria apenas uma
		// instância então elas serão iguais
		assertEquals(isosceles1, isosceles2);
	}

	/**
	 * Teste para criar um triângulo retângulo
	 */
	@Test
	public void testCriarTrianguloRetangulo() {
		// Verifica se o triângulo retângulo não está nulo, se não está significa que
		// está obtendo a
		// instância
		assertNotNull(retangulo1);
		assertNotNull(retangulo2);

		// Verifica se a saída é igual ao método criarTriangulo
		assertEquals("Triangulo criado com lados: 20.0, 40.0, 90.0", retangulo1.criarTriangulo(20, 40, 90));
		assertEquals("Triangulo criado com lados: 15.0, 30.0, 90.0", retangulo2.criarTriangulo(15, 30, 90));

		// Verifica se as intâncias são iguais. Como o padrão Singleton cria apenas uma
		// instância então elas serão iguais
		assertEquals(retangulo1, retangulo2);
	}

}
