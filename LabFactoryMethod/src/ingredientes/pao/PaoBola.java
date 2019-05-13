package ingredientes.pao;

/**
 * Representa um p�o bola que implementa a interface p�o 
 * 
 * @author Adriele e Samara
 */
public class PaoBola implements Pao {

	private String paoBola;
	
	/**
	 * Construtor passando uma string que adiciona o p�o bola
	 * 
	 * @param paoBola
	 */
	public PaoBola(String paoBola) {
		this.paoBola = paoBola;
	}
	
	/**
	 * Adiciona o p�o bola
	 */
	@Override
	public Pao adicionarPao(String adicionarPao) {
		return new PaoBola(adicionarPao);
	}

	/**
	 * @return o p�o bola
	 */
	public String getPaoBola() {
		return paoBola;
	}

	/**
	 * Seta o p�o bola
	 * 
	 * @param paoBola
	 */
	public void setPaoBola(String paoBola) {
		this.paoBola = paoBola;
	}

	@Override
	public String toString() {
		return paoBola;
	}

}
