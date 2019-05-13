package testes.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ingredientes.Tomate;
import sanduiche.Sanduiche;

/**
 * Teste do tomate
 * 
 * @author Adriele e Samara
 */
public class TomateTest {
	
	Tomate tomate;
	Sanduiche sanduiche;

	@Before
	public void setUp() throws Exception {
		tomate = new Tomate("Adicionando tomate");
		sanduiche = new Sanduiche();
	}

	/**
	 * Testa o tomate
	 */
	@Test
	public void testTomate() {
		sanduiche.setTomate(tomate);
		assertEquals("Adicionando tomate", sanduiche.getTomate().toString());
	}

}
