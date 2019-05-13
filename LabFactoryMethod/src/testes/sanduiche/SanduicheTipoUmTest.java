package testes.sanduiche;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ingredientes.Tomate;
import ingredientes.ovo.Ovo;
import ingredientes.ovo.OvoCapoeira;
import ingredientes.pao.Pao;
import ingredientes.pao.PaoBola;
import ingredientes.presunto.Presunto;
import ingredientes.presunto.PresuntoFrango;
import ingredientes.queijo.Queijo;
import ingredientes.queijo.QueijoCheddar;
import sanduiche.Sanduiche;

/**
 * Teste do sanduiche tipo um
 * 
 * @author Adriele e Samara
 */
public class SanduicheTipoUmTest {

	Pao pao;
	Ovo ovo;
	Presunto presunto;
	Queijo queijo;
	Tomate tomate;

	Sanduiche sanduiche;

	@Before
	public void setUp() throws Exception {
		pao = new PaoBola("Adicionando pão bola");
		ovo = new OvoCapoeira("Adicionando ovo de capoeira");
		presunto = new PresuntoFrango("Adicionando presunto de frango");
		queijo = new QueijoCheddar("Adicionando queijo cheddar");
		tomate = new Tomate("Adicionando tomate");
		sanduiche = new Sanduiche();
	}

	/**
	 * Testa o sanduiche tipo um
	 */
	@Test
	public void testCriarSanduiche() {
		sanduiche.setPao(pao);
		sanduiche.setOvo(ovo);
		sanduiche.setPresunto(presunto);
		sanduiche.setQueijo(queijo);
		sanduiche.setTomate(tomate);
		assertEquals("Adicionando pão bola", sanduiche.getPao().toString());
		assertEquals("Adicionando ovo de capoeira", sanduiche.getOvo().toString());
		assertEquals("Adicionando presunto de frango", sanduiche.getPresunto().toString());
		assertEquals("Adicionando queijo cheddar", sanduiche.getQueijo().toString());
		assertEquals("Adicionando tomate", sanduiche.getTomate().toString());
	}

}
