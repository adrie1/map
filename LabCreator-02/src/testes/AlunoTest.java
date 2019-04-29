package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import controleacademico.Aluno;
import controleacademico.Disciplina;

public class AlunoTest {
	
	Aluno aluno;
	Disciplina disc;
	List<Disciplina> disciplinas;

	@Before
	public void setUp() throws Exception {
		aluno = new Aluno("1111", "Samara Lima");
		disc = new Disciplina("01", "Cálculo I", "Matemática", "Segunda 7h - 9h/Quarta 9h - 11h");
		disciplinas = new ArrayList<Disciplina>();
	}

	/**
	 * Teste do nome 
	 */
	@Test
	public void testGetNome() {
		assertEquals("Samara Lima", aluno.getNome());
		assertNotEquals("Samas", aluno.getNome());
	}
	
	/**
	 * Teste do ID 
	 */
	@Test
	public void testGetId() {
		assertEquals("1111", aluno.getId());
		assertNotEquals("2222", aluno.getId());
	}
	
	/**
	 * Teste da lista de disciplinas 
	 */
	@Test
	public void testGetDisciplinas() {
		//Lista vazia
		assertTrue(aluno.getDisciplinas().isEmpty());
		//Adiciona um elemento na lista
		aluno.getDisciplinas().add(disc);
		//Lista com um elemento
		assertEquals(1, aluno.getDisciplinas().size());
		assertTrue(aluno.getDisciplinas().contains(disc));
		assertFalse(aluno.getDisciplinas().isEmpty());
	}

}
