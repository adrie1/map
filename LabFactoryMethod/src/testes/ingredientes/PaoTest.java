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
 * Teste do p�o
 * 
 * @author Adriele e Samara

 */
public class PaoTest {

	Pao pao, pao1, pao2;
	
	Sanduiche sanduiche;
	
	@Before
	public void setUp() throws Exception {
		pao = new PaoBola("Adicionando p�o bola");
		pao1 = new PaoFrances("Adicionando p�o franc�s");
		pao2 = new PaoIntegral("Adicionando p�o integral");
		sanduiche = new Sanduiche();
	}

	/**
	 * Testa o p�o bola
	 */
	@Test
	public void testPaoBola() {
		sanduiche.setPao(pao);
		assertEquals("Adicionando p�o bola", sanduiche.getPao().toString());
	}
	
	/**
	 * Testa o p�o franc�s
	 */
	@Test
	public void testPaoFrances() {
		sanduiche.setPao(pao1);
		assertEquals("Adicionando p�o franc�s", sanduiche.getPao().toString());
	}
	
	/**
	 * Testa o p�o integral
	 */
	@Test
	public void testPaoIntegral() {
		sanduiche.setPao(pao2);
		assertEquals("Adicionando p�o integral", sanduiche.getPao().toString());
	}

}
