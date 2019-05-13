package ingredientes.pao;

/**
 * Define o p�o padr�o
 * 
 * @author Adriele, Samara e Tamyres
 */
public class PaoDefault implements Pao {

	private String pao;
	
	/**
	 * Construtor passando uma string que adiciona o p�o
	 * 
	 * @param pao
	 */
	public PaoDefault(String pao) {
		this.pao = pao;
	}
	
	/**
	 * Adiciona o p�o 
	 */
	@Override
	public Pao adicionarPao(String pao) {
		return new PaoDefault(pao);
	}

	/**
	 * @return o p�o
	 */
	public String getPao() {
		return pao;
	}

	/**
	 * Seta o p�o
	 * 
	 * @param pao
	 */
	public void setPao(String pao) {
		this.pao = pao;
	}

	@Override
	public String toString() {
		return "PaoDefault [pao=" + pao + "]";
	}

}
