package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import figuraCirculo.Circulo;

/**
 * Classe de teste para o circulo
 * 
 * @author Adriele e Samara
 */
public class CirculoTest {

	Circulo circulo1;
	Circulo circulo2;

	@Before
	public void setUp() throws Exception {
		circulo1 = Circulo.getInstancia();
		circulo2 = Circulo.getInstancia();
	}

	/**
	 * Teste para criar um circulo
	 */
	@Test
	public void testCriarCirculo() {
		// Verifica se o circulo não está nulo, se não está significa que está obtendo a
		// instância
		assertNotNull(circulo1);
		assertNotNull(circulo2);

		// Verifica se a saída é igual ao método criarCirculo
		assertEquals("Circulo criado com raio: 4.0", circulo1.criarCirculo(4));
		assertEquals("Circulo criado com raio: 8.0", circulo2.criarCirculo(8));

		// Verifica se as intâncias são iguais. Como o padrão Singleton cria apenas uma
		// instância então elas serão iguais
		assertEquals(circulo1, circulo2);

	}

}
