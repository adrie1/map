package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import setor.subsistema_adm.Administrativo;

public class AdministrativoTest {

	Administrativo adm;
	
	@Before
	public void setUp() throws Exception {
		adm = new Administrativo();
	}

	@Test
	public void testAgendarReuniao() {
		assertTrue(adm.agendarReuniao("Segunda as 14hrs"));
		assertFalse(adm.agendarReuniao("Segunda as 14hrs"));
	}
	
	@Test
	public void testAgendarEntrevista() {
		assertTrue(adm.agendarEntrevista("Ter�a as 12hrs"));
		assertFalse(adm.agendarEntrevista("Ter�a as 12hrs"));
	}

}
