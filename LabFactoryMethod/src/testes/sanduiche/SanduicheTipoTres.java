package testes.sanduiche;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ingredientes.Tomate;
import ingredientes.ovo.Ovo;
import ingredientes.ovo.OvoCapoeira;
import ingredientes.pao.Pao;
import ingredientes.pao.PaoIntegral;
import ingredientes.presunto.Presunto;
import ingredientes.presunto.PresuntoPeru;
import ingredientes.queijo.Queijo;
import ingredientes.queijo.QueijoPrata;
import sanduiche.Sanduiche;

/**
 * Teste do sanduiche tipo três
 * 
 * @author Adriele e Samara
 */
public class SanduicheTipoTres {

	Pao pao;
	Ovo ovo;
	Presunto presunto;
	Queijo queijo;
	Tomate tomate;

	Sanduiche sanduiche;

	@Before
	public void setUp() throws Exception {
		pao = new PaoIntegral("Adicionando pão integral");
		ovo = new OvoCapoeira("Adicionando ovo de capoeira");
		presunto = new PresuntoPeru("Adicionando presunto de peru");
		queijo = new QueijoPrata("Adicionando queijo prato");
		tomate = new Tomate("Adicionando tomate");
		sanduiche = new Sanduiche();
	}

	/**
	 * Testa o sanduiche tipo três
	 */
	@Test
	public void testCriarSanduiche() {
		sanduiche.setPao(pao);
		sanduiche.setOvo(ovo);
		sanduiche.setPresunto(presunto);
		sanduiche.setQueijo(queijo);
		sanduiche.setTomate(tomate);
		assertEquals("Adicionando pão integral", sanduiche.getPao().toString());
		assertEquals("Adicionando ovo de capoeira", sanduiche.getOvo().toString());
		assertEquals("Adicionando presunto de peru", sanduiche.getPresunto().toString());
		assertEquals("Adicionando queijo prato", sanduiche.getQueijo().toString());
		assertEquals("Adicionando tomate", sanduiche.getTomate().toString());
	}


}
