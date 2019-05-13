package testes.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ingredientes.pao.Pao;
import ingredientes.pao.PaoBola;
import ingredientes.pao.PaoFrances;
import ingredientes.pao.PaoIntegral;
import sanduiche.Sanduiche;

/**
 * Teste do pão
 * 
 * @author Adriele e Samara

 */
public class PaoTest {

	Pao pao, pao1, pao2;
	
	Sanduiche sanduiche;
	
	@Before
	public void setUp() throws Exception {
		pao = new PaoBola("Adicionando pão bola");
		pao1 = new PaoFrances("Adicionando pão francês");
		pao2 = new PaoIntegral("Adicionando pão integral");
		sanduiche = new Sanduiche();
	}

	/**
	 * Testa o pão bola
	 */
	@Test
	public void testPaoBola() {
		sanduiche.setPao(pao);
		assertEquals("Adicionando pão bola", sanduiche.getPao().toString());
	}
	
	/**
	 * Testa o pão francês
	 */
	@Test
	public void testPaoFrances() {
		sanduiche.setPao(pao1);
		assertEquals("Adicionando pão francês", sanduiche.getPao().toString());
	}
	
	/**
	 * Testa o pão integral
	 */
	@Test
	public void testPaoIntegral() {
		sanduiche.setPao(pao2);
		assertEquals("Adicionando pão integral", sanduiche.getPao().toString());
	}

}
