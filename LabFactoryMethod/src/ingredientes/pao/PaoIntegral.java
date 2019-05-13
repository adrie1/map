package ingredientes.pao;

/**
 * Representa um p�o integral que implementa a interface p�o
 * 
 * @author Adriele e Samara
 */
public class PaoIntegral implements Pao {

	private String paoIntegral;
	
	/**
	 * Construtor passando uma string que adiciona o p�o integral
	 * 
	 * @param paoIntegral
	 */
	public PaoIntegral(String paoIntegral) {
		this.paoIntegral = paoIntegral;
	}
	
	/**
	 * Adiciona o p�o integral
	 */
	@Override
	public Pao adicionarPao(String paoIntegral) {
		return new PaoIntegral(paoIntegral);
	}

	/**
	 * @return o p�o integral
	 */
	public String getPaoIntegral() {
		return paoIntegral;
	}

	/**
	 * Seta o p�o integral
	 * 
	 * @param paoIntegral
	 */
	public void setPaoIntegral(String paoIntegral) {
		this.paoIntegral = paoIntegral;
	}

	@Override
	public String toString() {
		return paoIntegral;
	}
	
	

}
