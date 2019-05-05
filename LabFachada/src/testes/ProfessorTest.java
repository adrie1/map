package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import setor.subsistema_professor.Professor;

public class ProfessorTest {
	
	Professor professor;

	@Before
	public void setUp() throws Exception {
		professor = new Professor("4 anos", "Algoritmos");
	}

	@Test
	public void testTempo() {
		assertEquals("4 anos", professor.getTempo());
		professor.setTempo("3");
		assertNotEquals("3 anos", professor.getTempo());
		assertEquals("3", professor.getTempo());
	}
	
	@Test
	public void testDisciplina() {
		assertEquals("Algoritmos", professor.getDisciplina());
		professor.setDisciplina("Cálculo I");
		assertEquals("Cálculo I", professor.getDisciplina());
		assertNotEquals("Algoritmos", professor.getDisciplina());
	}

}
