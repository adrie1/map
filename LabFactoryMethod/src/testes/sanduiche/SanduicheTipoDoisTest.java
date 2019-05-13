package testes.sanduiche;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ingredientes.Tomate;
import ingredientes.ovo.Ovo;
import ingredientes.ovo.OvoGranja;
import ingredientes.pao.Pao;
import ingredientes.pao.PaoFrances;
import ingredientes.presunto.Presunto;
import ingredientes.presunto.PresuntoPeru;
import ingredientes.queijo.Queijo;
import ingredientes.queijo.QueijoMussarela;
import sanduiche.Sanduiche;

/**
 * Teste do sanduiche tipo dois
 * 
 * @author Adriele e Samara
 */
public class SanduicheTipoDoisTest {

	Pao pao;
	Ovo ovo;
	Presunto presunto;
	Queijo queijo;
	Tomate tomate;

	Sanduiche sanduiche;

	@Before
	public void setUp() throws Exception {
		pao = new PaoFrances("Adicionando pão francês");
		ovo = new OvoGranja("Adicionando ovo de granja");
		presunto = new PresuntoPeru("Adicionando presunto de peru");
		queijo = new QueijoMussarela("Adicionando queijo mussarela");
		tomate = new Tomate("Adicionando tomate");
		sanduiche = new Sanduiche();
	}

	/**
	 * Testa o sanduiche tipo dois
	 */
	@Test
	public void testCriarSanduiche() {
		sanduiche.setPao(pao);
		sanduiche.setOvo(ovo);
		sanduiche.setPresunto(presunto);
		sanduiche.setQueijo(queijo);
		sanduiche.setTomate(tomate);
		assertEquals("Adicionando pão francês", sanduiche.getPao().toString());
		assertEquals("Adicionando ovo de granja", sanduiche.getOvo().toString());
		assertEquals("Adicionando presunto de peru", sanduiche.getPresunto().toString());
		assertEquals("Adicionando queijo mussarela", sanduiche.getQueijo().toString());
		assertEquals("Adicionando tomate", sanduiche.getTomate().toString());
	}


}
