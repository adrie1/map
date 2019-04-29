package funcionarios;

/**
 * Classe Camera estende a classe Pessoa e implementa a interface Funcionario
 * 
 * @author Adriele e Samara
 */
public class Camera extends Pessoa implements Funcionario {

	/**
	 * Construtor da classe Camera
	 * 
	 * @param nome
	 */
	public Camera(String nome) {
		super(nome);
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getFuncao() {
		return this.funcao = "Câmera";
	}

	@Override
	public String toString() {
		return "Nome = " + nome + " - Função = " + funcao + "";
	}

}
