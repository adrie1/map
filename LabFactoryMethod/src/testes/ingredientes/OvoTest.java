package testes.ingredientes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ingredientes.ovo.Ovo;
import ingredientes.ovo.OvoCapoeira;
import ingredientes.ovo.OvoGranja;
import sanduiche.Sanduiche;

/**
 * Teste do ovo
 * 
 * @author Adriele e Samara
 */
public class OvoTest {

	Ovo ovo, ovo1;
	Sanduiche sanduiche;

	@Before
	public void setUp() throws Exception {
		ovo = new OvoCapoeira("Adicionando ovo de capoeira");
		ovo1 = new OvoGranja("Adicionando ovo de granja");
		sanduiche = new Sanduiche();
	}

	/**
	 * Testa o ovo de capoeira
	 */
	@Test
	public void testOvoCapoeira() {
		sanduiche.setOvo(ovo);
		assertEquals("Adicionando ovo de capoeira", sanduiche.getOvo().toString());
	}

	/**
	 * Testa o ovo de granja
	 */
	@Test
	public void testOvoGranja() {
		sanduiche.setOvo(ovo1);
		assertEquals("Adicionando ovo de granja", sanduiche.getOvo().toString());
	}


}
