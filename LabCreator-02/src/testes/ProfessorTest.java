package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import controleacademico.Disciplina;
import controleacademico.Professor;

public class ProfessorTest {
	
	Professor professor;
	Disciplina disc;
	List<Disciplina> disciplinas;

	@Before
	public void setUp() throws Exception {
		professor = new Professor("P01", "Sabrina Souto");
		disc = new Disciplina("D01", "Laboratório de Programação 2", "Ciência da Computação", "Segunda 7h - 9h/Quarta 9h - 11h");
		disciplinas = new ArrayList<Disciplina>();
	}

	/**
	 * Teste do nome 
	 */
	@Test
	public void testGetNome() {
		assertEquals("Sabrina Souto", professor.getNome());
		assertNotEquals("Sabrina", professor.getNome());
	}
	
	/**
	 * Teste do ID 
	 */
	@Test
	public void testGetId() {
		assertEquals("P01", professor.getId());
		assertNotEquals("P02", professor.getId());
	}
	
	/**
	 * Teste da lista de disciplinas 
	 */
	@Test
	public void testGetDisciplinas() {
		//Lista vazia
		assertTrue(professor.getDisciplinas().isEmpty());
		//Adiciona um elemento na lista
		professor.getDisciplinas().add(disc);
		//Lista com um elemento
		assertEquals(1, professor.getDisciplinas().size());
		assertTrue(professor.getDisciplinas().contains(disc));
		assertFalse(professor.getDisciplinas().isEmpty());
	}

}
