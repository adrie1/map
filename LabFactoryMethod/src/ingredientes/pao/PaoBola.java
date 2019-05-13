package ingredientes.pao;

/**
 * Representa um pão bola que implementa a interface pão 
 * 
 * @author Adriele e Samara
 */
public class PaoBola implements Pao {

	private String paoBola;
	
	/**
	 * Construtor passando uma string que adiciona o pão bola
	 * 
	 * @param paoBola
	 */
	public PaoBola(String paoBola) {
		this.paoBola = paoBola;
	}
	
	/**
	 * Adiciona o pão bola
	 */
	@Override
	public Pao adicionarPao(String adicionarPao) {
		return new PaoBola(adicionarPao);
	}

	/**
	 * @return o pão bola
	 */
	public String getPaoBola() {
		return paoBola;
	}

	/**
	 * Seta o pão bola
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
