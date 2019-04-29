package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controleacademico.Disciplina;

public class DisciplinaTest {
	
	Disciplina disciplina, disciplina1;

	@Before
	public void setUp() throws Exception {
		disciplina = new Disciplina("D01", "Laborat�rio de Programa��o 2", "Ci�ncia da Computa��o", "Segunda 11h - 13h/Sexta 11h - 13h");
		disciplina1 = new Disciplina("D02", "M�todos Avan�ados de Programa��o", "Ci�ncia da Computa��o", "Segunda 9h - 11h/Quarta 7h - 9h");
	}
	
	/**
	 * Testa o c�digo 
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
		assertEquals("Laborat�rio de Programa��o 2", disciplina.getNome());
		assertEquals("M�todos Avan�ados de Programa��o", disciplina1.getNome());
		assertNotEquals("M�todos Avan�ados de Programa��o", disciplina.getNome());
		assertNotEquals("Laborat�rio de Programa��o 2", disciplina1.getNome());
	}
	
	/**
	 * Testa o curso 
	 */
	@Test
	public void testGetCurso() {
		assertEquals("Ci�ncia da Computa��o", disciplina.getCurso());
		assertEquals("Ci�ncia da Computa��o", disciplina1.getCurso());
		assertNotEquals("Matem�tica", disciplina.getCurso());
		assertNotEquals("Matem�tica", disciplina1.getCurso());
	}
	
	/**
	 * Testa o hor�rio 
	 */
	@Test
	public void testGetHorario() {
		assertEquals("Segunda 11h - 13h/Sexta 11h - 13h", disciplina.getHorario());
		assertEquals("Segunda 9h - 11h/Quarta 7h - 9h", disciplina1.getHorario());
		assertNotEquals("Segunda 11h", disciplina.getHorario());
		assertNotEquals("Quarta 7h", disciplina1.getHorario());
	}

}
