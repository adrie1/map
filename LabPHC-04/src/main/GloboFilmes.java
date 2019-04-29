package main;

import controle.ControleSistema;
import filme.Filme;
import funcionarios.Ator;
import funcionarios.Camera;
import funcionarios.Diretor;
import funcionarios.Funcionario;
import funcionarios.Roteirista;

/**
 * Laboratório Polimorfismo, Composição e Herança - 04
 * 
 * @author Adriele e Samara
 *
 */
public class GloboFilmes {

	public static void main(String[] args) {

		// Instanciando um funcionario de cada tipo
		Funcionario ator = new Ator("Justin Timberlake");
		Funcionario diretor = new Diretor("Woody Allen");
		Funcionario camera = new Camera("Ralph Fiennes");
		Funcionario roteirista = new Roteirista("Ryan Gosling");

		// Chamando as funções
		ator.getFuncao();
		diretor.getFuncao();
		camera.getFuncao();
		roteirista.getFuncao();

		// Instanciando os filmes
		Filme filme = new Filme("Curvas da Vida", 2012, "111 minutos", "Drama", "1 - Good Mornin' Gus / 2 - Flanagan / 3 - Late Night Call", ator, diretor, camera, roteirista);
		
	//	Filme filme1 = new Filme("Roda Gigante", 2017, "101 minutos", "Comédia", "1 - Fly On / 2 - Impossible / 3 - Mad World", ator1, diretor1, camera1, roteirista1);
//		Filme filme2 = new Filme("Amizade Colorida", 2011, "109 minutos", "Comédia", "1 - Sweater Weather / 2 - Money Power Glory / 3 - Ride");
//		Filme filme3 = new Filme("Maniac", 2018, "386 minutos", "Drama, Ficção Científica", "1 - Video Games / 2 - Lost On You / 3 - Dark Paradise");

		// Instanciando a classe de controle
		ControleSistema controle = new ControleSistema();

		controle.cadastrarFuncionario(filme, ator);
		controle.cadastrarFuncionario(filme, diretor);
		controle.cadastrarFuncionario(filme, camera);
		controle.cadastrarFuncionario(filme, roteirista);

	//	c.cadastrarFuncionario(filme1, diretor1);
		

		// System.out.println(controle.caracteristicas(filme));

		 System.out.println(controle.filmografia("Justin Timberlake"));

	}

}
