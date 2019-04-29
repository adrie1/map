package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleacademico.Disciplina;

public class DisciplinaTest {
	
	Disciplina disciplina, disciplina1;

	@Before
	public void setUp() throws Exception {
		disciplina = new Disciplina("D01", "Laboratório de Programação 2", "Ciência da Computação", "Segunda 11h - 13h/Sexta 11h - 13h");
		disciplina1 = new Disciplina("D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Quarta 7h - 9h");
	}
	
	/**
	 * Testa o código 
	 */
	@Test
	public void testGetCodigo() {
		assertEquals("D01", disciplina.getCodigo());
		assertEquals("D02", disciplina1.getCodigo());
		assertNotEquals("D01", disciplina1.getCodigo());
		assertNotEquals("D02", disciplina.getCodigo());
	}

	/**
	 * Testa o nome 
	 */
	@Test
	public void testGetNome() {
		assertEquals("Laboratório de Programação 2", disciplina.getNome());
		assertEquals("Métodos Avançados de Programação", disciplina1.getNome());
		assertNotEquals("Métodos Avançados de Programação", disciplina.getNome());
		assertNotEquals("Laboratório de Programação 2", disciplina1.getNome());
	}
	
	/**
	 * Testa o curso 
	 */
	@Test
	public void testGetCurso() {
		assertEquals("Ciência da Computação", disciplina.getCurso());
		assertEquals("Ciência da Computação", disciplina1.getCurso());
		assertNotEquals("Matemática", disciplina.getCurso());
		assertNotEquals("Matemática", disciplina1.getCurso());
	}
	
	/**
	 * Testa o horário 
	 */
	@Test
	public void testGetHorario() {
		assertEquals("Segunda 11h - 13h/Sexta 11h - 13h", disciplina.getHorario());
		assertEquals("Segunda 9h - 11h/Quarta 7h - 9h", disciplina1.getHorario());
		assertNotEquals("Segunda 11h", disciplina.getHorario());
		assertNotEquals("Quarta 7h", disciplina1.getHorario());
	}

}
