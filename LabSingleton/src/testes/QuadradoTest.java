package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import figuraQuadrado.Quadrado;

/**
 * Classe de teste para o quadrado
 * 
 * @author Adriele e Samara
 */
public class QuadradoTest {

	Quadrado quadrado1;
	Quadrado quadrado2;

	@Before
	public void setUp() throws Exception {
		quadrado1 = new Quadrado(4);
		quadrado2 = new Quadrado(6);
	}

	/**
	 * Teste para criar um quadrado
	 */
	@Test
	public void testCriarQuadrado() {
		// Verifica se o quadrado não está nulo, se não está significa que está obtendo
		// a instância
		assertNotNull(quadrado1);
		assertNotNull(quadrado2);

		// Verifica se a saída é igual ao método criarQuadrado
		assertEquals("Quadrado criado com lados no valor de: 4.0", quadrado1.criarQuadrado());
		assertEquals("Quadrado criado com lados no valor de: 6.0", quadrado2.criarQuadrado());

		// Verifica se as instâncias não são iguais. Por não utilizar o padrão Singleton
		// as instâncias serão diferentes
		assertNotEquals(quadrado1, quadrado2);
	}

}
