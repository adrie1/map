package funcionarios;

/**
 * Classe Roteirista que estende a classe Pessoa e implementa a interface
 * Funcionario
 * 
 * @author Adriele e Samara
 */
public class Roteirista extends Pessoa implements Funcionario {

	/**
	 * Construtor da classe Roteirista
	 * 
	 * @param nome
	 */
	public Roteirista(String nome) {
		super(nome);
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getFuncao() {
		return this.funcao = "Roteirista";
	}

	@Override
	public String toString() {
		return "Nome = " + nome + " - Função = " + funcao + "";
	}

}
