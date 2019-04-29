package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import controleacademico.ControleProfessor;
import controleacademico.Disciplina;
import controleacademico.Professor;

public class ControleProfessorTest {

	Professor professor;
	Disciplina disc, disc1;
	ControleProfessor controle;
	List<Professor> professores;

	@Before
	public void setUp() throws Exception {
		professor = new Professor("01", "Aninha Lima");
		disc = new Disciplina("01", "Matemática", "Computação", "Terça 7h - 9h/Quinta 9h - 11h");
		disc1 = new Disciplina("02", "Cálculo I", "Matemática", "Segunda 7h - 9h/Quarta 9h - 11h");
		professores = new ArrayList<Professor>();
		controle = new ControleProfessor();
	}

	/**
	 * Teste se o professor foi cadastrado na disciplina
	 */
	@Test
	public void testCadastrarProfessor() {
		assertEquals(true, controle.cadastrarProfessor(professor, disc));
		assertEquals(false, controle.cadastrarProfessor(professor, disc));
		assertEquals(true, controle.cadastrarProfessor(professor, disc1));
		assertEquals(false, controle.cadastrarProfessor(professor, disc1));
	}

	/**
	 * Teste da lista de professores
	 */
	@Test
	public void testGetProfessores() {
		// Lista vazia
		assertTrue(professores.isEmpty());
		// Adiciona um professor na lista
		professores.add(professor);
		// Lista com um elemento
		assertEquals(1, professores.size());
		assertTrue(professores.contains(professor));
		assertFalse(professores.isEmpty());
	}
}
