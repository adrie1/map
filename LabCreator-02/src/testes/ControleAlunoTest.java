package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import controleacademico.Aluno;
import controleacademico.ControleAluno;

public class ControleAlunoTest {

	Aluno aluno, aluno1;
	ControleAluno controle;
	List<Aluno> alunos;

	@Before
	public void setUp() throws Exception {
		aluno = new Aluno("4321", "Ana Paula");
		aluno1 = new Aluno("5678", "Aline Lins");
		alunos = new ArrayList<Aluno>();
		controle = new ControleAluno();
	}
	
	/**
	 * Teste cadastrando um aluno na disciplina
	 */
	@Test
	public void testCadastrarAluno() {
		assertEquals(true, controle.cadastrarAluno("4321", "Ana Paula", "01", "Banco de Dados", "Computação", "Terça 7h - 9h/Quinta 9h - 11h"));
		assertEquals(true, controle.cadastrarAluno("5678", "Aline Lins", "01", "Banco de Dados", "Computação", "Terça 7h - 9h/Quinta 9h - 11h"));
	}
	
	/**
	 * Teste da quantidade de alunos de uma disciplina
	 */
	@Test
	public void testQuantidadeAlunos() {
		controle.cadastrarAluno("4321", "Ana Paula", "01", "Banco de Dados", "Computação", "Terça 7h - 9h/Quinta 9h - 11h");
		controle.cadastrarAluno("5678", "Aline Lins", "01", "Banco de Dados", "Computação", "Terça 7h - 9h/Quinta 9h - 11h");
		assertEquals(2, controle.quantidadeAlunos("Banco de Dados"));
	}	
	
	/**
	 * Teste da lista de alunos 
	 */
	@Test
	public void testGetAlunos() {
		//Lista vazia
		assertTrue(alunos.isEmpty());
		alunos.add(aluno);
		alunos.add(aluno1);
		//Lista com dois elementos
		assertEquals(2, alunos.size());
		assertTrue(alunos.contains(aluno1));
		assertFalse(alunos.isEmpty());
		
	}
}
