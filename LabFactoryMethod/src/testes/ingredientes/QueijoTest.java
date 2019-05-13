package testes.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ingredientes.queijo.Queijo;
import ingredientes.queijo.QueijoCheddar;
import ingredientes.queijo.QueijoMussarela;
import ingredientes.queijo.QueijoPrata;
import sanduiche.Sanduiche;

/**
 * Teste do queijo
 * 
 * @author Adriele e Samara
 */
public class QueijoTest {
	Queijo cheddar, mussarela, prata;

	Sanduiche sanduiche;

	@Before
	public void setUp() throws Exception {
		prata = new QueijoPrata("Adicionando queijo prato");
		cheddar = new QueijoCheddar("Adicionando queijo cheddar");
		mussarela = new QueijoMussarela("Adicionando queijo mussarela");
		sanduiche = new Sanduiche();
	}

	/**
	 * Testa o queijo prato
	 */
	@Test
	public void testQueijoPrato() {
		sanduiche.setQueijo(prata);
		assertEquals("Adicionando queijo prato", sanduiche.getQueijo().toString());
	}

	/**
	 * Testa o queijo cheddar
	 */
	@Test
	public void testQueijoCheddar() {
		sanduiche.setQueijo(cheddar);
		assertEquals("Adicionando queijo cheddar", sanduiche.getQueijo().toString());
	}

	/**
	 * Testa o queijo mussarela
	 */
	@Test
	public void testQueijoMussarela() {
		sanduiche.setQueijo(mussarela);
		assertEquals("Adicionando queijo mussarela", sanduiche.getQueijo().toString());
	}

}
