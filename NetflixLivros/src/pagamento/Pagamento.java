package pagamento;

import java.util.Scanner;

/**
 * Classe Pagamento
 * @author Adriele e Samara
 */
public class Pagamento {

	private double valor;
	private String nome;
	private String dataVencimento;

	/**
	 * Construtor da classe Pagamento.
	 * @param valor
	 * @param nome
	 * @param dataVencimento
	 */
	/*public Pagamento(double valor, String nome, String dataVencimento) {
		this.valor = valor;
		this.nome = nome;
		this.dataVencimento = dataVencimento;
	}
	*/
	Scanner in = new Scanner(System.in);
	
	/**
	 * Método para selecionar o pagamento.
	 * @param valor
	 * @param nome
	 * @param dataVencimento
	 */
	public void selecionarPagamento(double valor, String nome, String dataVencimento) {
		System.out.println("\n----------PAGAMENTO----------\n\n1 - CARTÃO DE CRÉDITO\n2 - BOLETO BANCÁRIO");
		System.out.println("\nINFORME A OPÇÃO: ");
		int opc = in.nextInt();

		switch (opc) {

		case 1:
			CartaoCredito pg = new CartaoCredito();
			pg.setNome(nome);
			pg.setValor(valor);
			pg.setDataVencimento(dataVencimento);
			System.out.println("Número do Cartão: "); pg.setNumeroCartao(in.nextInt());
			System.out.println("Data de Validade: "); pg.setDataValidade(in.next());
			break;
		case 2:
			BoletoBancario boleto = new BoletoBancario();
			boleto.setNome(nome);
			boleto.setValor(valor);
			boleto.setDataVencimento(dataVencimento);
			System.out.println("Taxa Bancária: "); boleto.setTaxaBancaria(in.nextDouble());
			break;
		default:
			System.out.println("Opção inválida");
		}
	}
	
	/**
	 * Métodos get e set
	 * @return
	 */
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}
