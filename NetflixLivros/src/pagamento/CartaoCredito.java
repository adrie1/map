package pagamento;

/**
 * Classe CartaoCredito que herda os atributos de Pagamento.
 * @author Adriele e Samara
 */
public class CartaoCredito extends Pagamento {
	
	private int numeroCartao;
	private String dataValidade;
	
	/**
	 * Construtor da classe CartaoCredito.
	 * @param valor
	 * @param nome
	 * @param dataVencimento
	 */
	/*public CartaoCredito(double valor, String nome, String dataVencimento) {
		super(valor, nome, dataVencimento);
	}*/

	/**
	 * Métodos get e set
	 * @return
	 */
	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

}
