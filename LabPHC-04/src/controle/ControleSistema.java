package controle;

import java.util.ArrayList;
import java.util.List;

import filme.Filme;
import funcionarios.Funcionario;

/**
 * Classe ControleSistema no qual implementa os m�todos que controla o sistema
 * 
 * @author Adriele e Samara
 */
public class ControleSistema {

	private List<Filme> filmes;
	private List<Funcionario> funcionarios;

	/**
	 * Construtor da classe ControleSistema
	 */
	public ControleSistema() {
		this.filmes = new ArrayList<Filme>();
		this.funcionarios = new ArrayList<Funcionario>();
	}

	/**
	 * Cadastra um funcion�rio no filme
	 * 
	 * @param funcionario
	 * @return true se conseguir cadastrar o funcion�rio, caso contr�rio false
	 */
	public boolean cadastrarFuncionario(Filme filme, Funcionario funcionario) {
		if (!filme.getFuncionarios().contains(funcionario)) {
			funcionarios.add(funcionario);
			filme.setFuncionarios(funcionarios);
		    filmes.add(filme);
		    return true;
		}
		return false;
	}

	
	/**
	 * Mostra o filme e a respectiva fun��o do funcion�rio
	 * 
	 * @param nome
	 * @return o resultado com a fun��o e o filme
	 */
	public String filmografia(String nome) {
		String resultado = "";

		int i = 0;
		
		for (Filme film : filmes) {
			for (Funcionario func : funcionarios) {
				if (func.getNome().equals(nome) && film.getFuncionarios().get(i).getNome().equals(nome)) {
					resultado = func.getFuncao() + " em: " + film.getNome();
					//System.out.println(func.getFuncao() + " em: " + film.getNome());
				}
			}
			i++;
		}
		return resultado;
	}

	/**
	 * Verifica se um filme est� cadastrado, caso esteja mostra seus dados
	 * 
	 * @param filme
	 * @return o resultado com os dados
	 */
	public String caracteristicas(Filme filme) {
		String resultado = "";

		if (filmes.contains(filme)) {
			resultado = filme.toString();
		}
		return resultado;
	}

}
