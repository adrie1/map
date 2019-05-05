package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import setor.subsistema_aluno.Aluno;
import setor.subsistema_aluno.Componente;
import setor.subsistema_aluno.Disciplina;

public class AlunoTest {
	
	Aluno aluno;
	Componente componente;
	Disciplina disciplina;

	@Before
	public void setUp() throws Exception {
		aluno = new Aluno();
		componente = new Componente(1, "Cálculo I", "2016.1", 8.4, "AP");
		disciplina = new Disciplina(1, "Algoritmo", "Josê Mendes", "Segunda 7h - 9h");
	}

	@Test
	public void testHistorico() {
		assertTrue(aluno.historico(componente));
		assertFalse(aluno.historico(componente));
	}
	
	@Test
	public void testRdm() {
		assertTrue(aluno.rdm(disciplina));
		assertFalse(aluno.rdm(disciplina));
	}

}
