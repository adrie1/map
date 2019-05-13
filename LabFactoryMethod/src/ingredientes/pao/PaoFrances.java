package ingredientes.pao;

/**
 * Representa um p�o franc�s que implementa a interface p�o
 * 
 * @author Adriele e Samara
 */
public class PaoFrances implements Pao {

	private String paoFrances;
	
	/**
	 * Construtor passando uma string que adiciona o p�o franc�s
	 * 
	 * @param paoFrances
	 */
	public PaoFrances(String paoFrances) {
		this.paoFrances = paoFrances;
	}
	
	/**
	 * Adiciona o p�o franc�s
	 */
	@Override
	public Pao adicionarPao(String paoFrances) {
		return new PaoFrances(paoFrances);
	}

	/**
	 * @return o p�o franc�s
	 */
	public String getPaoFrances() {
		return paoFrances;
	}

	/**
	 * Seta o p�o franc�s
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
