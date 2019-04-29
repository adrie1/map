package funcionarios;

/**
 * Classe Diretor que estende a classe Pessoa e implementa a interface
 * Funcionario
 * 
 * @author Adriele e Samara
 */
public class Diretor extends Pessoa implements Funcionario {

	/**
	 * Construtor da classe Diretor
	 * 
	 * @param nome
	 */
	public Diretor(String nome) {
		super(nome);
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getFuncao() {
		return this.funcao = "Diretor";
	}

	@Override
	public String toString() {
		return "Nome = " + nome + " - Função = " + funcao + "";
	}

}
