package ingredientes.pao;

/**
 * Define o pão padrão
 * 
 * @author Adriele, Samara e Tamyres
 */
public class PaoDefault implements Pao {

	private String pao;
	
	/**
	 * Construtor passando uma string que adiciona o pão
	 * 
	 * @param pao
	 */
	public PaoDefault(String pao) {
		this.pao = pao;
	}
	
	/**
	 * Adiciona o pão 
	 */
	@Override
	public Pao adicionarPao(String pao) {
		return new PaoDefault(pao);
	}

	/**
	 * @return o pão
	 */
	public String getPao() {
		return pao;
	}

	/**
	 * Seta o pão
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
