package funcionarios;

/**
 * Classe Ator que estende a classe Pessoa e implmenta a interface Funcionario
 * 
 * @author Adriele e Samara
 */
public class Ator extends Pessoa implements Funcionario {

	/**
	 * Construtor da classe Ator
	 * 
	 * @param nome
	 */
	public Ator(String nome) {
		super(nome);
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getFuncao() {
		return this.funcao = "Ator";
	}

	@Override
	public String toString() {
		return "Nome = " + nome + " - Função = " + funcao + "";
	}

}
