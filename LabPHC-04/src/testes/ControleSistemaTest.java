package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controle.ControleSistema;
import filme.Filme;
import funcionarios.Ator;
import funcionarios.Camera;
import funcionarios.Diretor;
import funcionarios.Funcionario;
import funcionarios.Roteirista;

public class ControleSistemaTest {

	ControleSistema controle;
	Filme filme;
	Funcionario ator, diretor, camera, roteirista;
	
	@Before
	public void setUp() {
		controle = new ControleSistema();
		ator = new Ator("Emma Watson");
		diretor = new Diretor("Amy Adams");
		camera = new Camera("James Horner");
		roteirista = new Roteirista("Steven Kloves");
		filme = new Filme("Maniac", 2018, "386 minutos", "Drama, Ficção Científica", "1 - Video Games / 2 - Lost On You / 3 - Dark Paradise", ator, diretor, camera, roteirista);
	}

	@Test
	public void testCadastrarFuncionario() {
		assertTrue(controle.cadastrarFuncionario(filme, ator));
		assertTrue(controle.cadastrarFuncionario(filme, diretor));
		assertTrue(controle.cadastrarFuncionario(filme, camera));
		assertTrue(controle.cadastrarFuncionario(filme, roteirista));
	}
	
	@Test
	public void testFilmografia() {
		controle.cadastrarFuncionario(filme, ator);
		controle.cadastrarFuncionario(filme, diretor);
		controle.cadastrarFuncionario(filme, camera);
		controle.cadastrarFuncionario(filme, roteirista);
		assertEquals("Ator em: Maniac", controle.filmografia("Emma Watson"));
		assertEquals("Diretor em: Maniac", controle.filmografia("Amy Adams"));
		assertEquals("Camera em: Maniac", controle.filmografia("James Horner"));
		assertEquals("Roteirista em: Maniac", controle.filmografia("Steven Kloves"));
	}
	

}
