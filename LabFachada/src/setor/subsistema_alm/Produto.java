package setor.subsistema_alm;

/**
 * Classe Produto contendo o nome do produto, a quantidade e o pre�o
 * @author Adriele e Samara
 */
public class Produto {
	
	private int codigo;
	private String nome;
	private double preco;

	/**
	 * Construtor da classe Produto
	 * @param nome
	 * @param quantidade
	 * @param preco
	 */
	public Produto(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	/**
	 * @return o nome do produto
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Seta o nome do produto
	 * @param nomeProduto
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return o c�digo do produto
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Seta o c�digo do produto
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return o pre�o do produto
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * Seta o pre�o do produto
	 * @param preco
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}

}
