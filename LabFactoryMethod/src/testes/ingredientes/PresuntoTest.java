package testes.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ingredientes.presunto.Presunto;
import ingredientes.presunto.PresuntoFrango;
import ingredientes.presunto.PresuntoPeru;
import sanduiche.Sanduiche;

/**
 * Teste do presunto
 * 
 * @author Adriele e Samara
 */
public class PresuntoTest {

	Presunto frango, peru;
	Sanduiche sanduiche;

	@Before
	public void setUp() throws Exception {
		frango = new PresuntoFrango("Adicionando presunto de frango");
		peru = new PresuntoPeru("Adicionando presunto de peru");
		sanduiche = new Sanduiche();
	}

	/**
	 * Testa o presunto de frango
	 */
	@Test
	public void testPresuntoFrango() {
		sanduiche.setPresunto(frango);
		assertEquals("Adicionando presunto de frango", sanduiche.getPresunto().toString());
	}

	/**
	 * Testa o presunto de peru
	 */
	@Test
	public void testPresuntoPeru() {
		sanduiche.setPresunto(peru);
		assertEquals("Adicionando presunto de peru", sanduiche.getPresunto().toString());
	}

}
