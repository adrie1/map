/**
 * 
 */
package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import filme.Filme;
import funcionarios.Ator;
import funcionarios.Camera;
import funcionarios.Diretor;
import funcionarios.Funcionario;
import funcionarios.Roteirista;

/**
 * @author Adriele e Samara
 *
 */
public class FilmeTest {
	
	Filme filme;
	Funcionario ator, diretor, camera, roteirista;

	@Before
	public void setUp() {
		ator = new Ator("Emma Watson");
		diretor = new Diretor("Amy Adams");
		camera = new Camera("James Horner");
		roteirista = new Roteirista("Steven Kloves");
		filme = new Filme("Curvas da Vida", 2012, "111 minutos", "Drama", "1 - Good Mornin' Gus / 2 - Flanagan / 3 - Late Night Call", ator, diretor, camera, roteirista);
	}

	@Test
	public void testDados() {
		assertEquals("Curvas da Vida", filme.getNome());
		assertEquals(2012, filme.getAno());
		assertEquals("111 minutos", filme.getDuracao());
		assertEquals("1 - Good Mornin' Gus / 2 - Flanagan / 3 - Late Night Call", filme.getTrilhasonora());
		assertEquals("Emma Watson", filme.getAtor().getNome());
		assertEquals("Amy Adams", filme.getDiretor().getNome());
		assertEquals("James Horner", filme.getCamera().getNome());
		assertEquals("Steven Kloves", filme.getRoteirista().getNome());
	}
	
	@Test
	public void testFuncao() {
		assertEquals("Ator", filme.getAtor().getFuncao());
		assertEquals("Diretor", filme.getDiretor().getFuncao());
		assertEquals("Câmera", filme.getCamera().getFuncao());
		assertEquals("Roteirista", filme.getRoteirista().getFuncao());
	}

}
