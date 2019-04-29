package funcionarios;

/**
 * Classe Pessoa com seus atributos
 * 
 * @author Adriele e Samara
 */
public class Pessoa {

	protected String nome;
	protected String funcao;

	/**
	 * Construtor da classe Pessoa
	 * 
	 * @param nome
	 */
	public Pessoa(String nome) {
		this.nome = nome;
	}

	/**
	 * @return o nome da pessoa
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Seta o nome da pessoa
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return a funcao da pessoa
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * Seta a funcao da pessoa
	 * 
	 * @param funcao
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", funcao=" + funcao + "]";
	}

}
