package pagamento;

/**
 * Classe BoletoBancario que herda os atributos de Pagamento.
 * @author Adriele e Samara
 */
public class BoletoBancario extends Pagamento {
	
	private double taxaBancaria;
	
	/**
	 * Construtor da classe BoletoBancario.
	 * @param valor
	 * @param nome
	 * @param dataVencimento
	 */
	/*public BoletoBancario(double valor, String nome, String dataVencimento) {
		super(valor, nome, dataVencimento);
	}*/

	/**
	 * Métodos get e set
	 * @return
	 */
	public double getTaxaBancaria() {
		return taxaBancaria;
	}

	public void setTaxaBancaria(double taxaBancaria) {
		this.taxaBancaria = taxaBancaria;
	}

}
