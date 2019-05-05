package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import setor.subsistema_infra.Infraestrutura;

public class InfraestruturaTest {
	
	Infraestrutura infra;

	@Before
	public void setUp() throws Exception {
		infra = new Infraestrutura();
	}

	@Test
	public void testAlocarSalar() {
		assertTrue(infra.alocarSala("A204"));
		assertFalse(infra.alocarSala("A204"));
		assertTrue(infra.alocarSala("B102"));
		assertFalse(infra.alocarSala("B102"));
	}

}
