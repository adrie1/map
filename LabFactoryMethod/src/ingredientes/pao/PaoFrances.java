package ingredientes.pao;

/**
 * Representa um pão francês que implementa a interface pão
 * 
 * @author Adriele e Samara
 */
public class PaoFrances implements Pao {

	private String paoFrances;
	
	/**
	 * Construtor passando uma string que adiciona o pão francês
	 * 
	 * @param paoFrances
	 */
	public PaoFrances(String paoFrances) {
		this.paoFrances = paoFrances;
	}
	
	/**
	 * Adiciona o pão francês
	 */
	@Override
	public Pao adicionarPao(String paoFrances) {
		return new PaoFrances(paoFrances);
	}

	/**
	 * @return o pão francês
	 */
	public String getPaoFrances() {
		return paoFrances;
	}

	/**
	 * Seta o pão francês
	 * 
	 * @param paoFrances
	 */
	public void setPaoFrances(String paoFrances) {
		this.paoFrances = paoFrances;
	}

	@Override
	public String toString() {
		return paoFrances;
	}
	
	

}
