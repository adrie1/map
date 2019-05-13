package ingredientes.pao;

/**
 * Representa um pão integral que implementa a interface pão
 * 
 * @author Adriele e Samara
 */
public class PaoIntegral implements Pao {

	private String paoIntegral;
	
	/**
	 * Construtor passando uma string que adiciona o pão integral
	 * 
	 * @param paoIntegral
	 */
	public PaoIntegral(String paoIntegral) {
		this.paoIntegral = paoIntegral;
	}
	
	/**
	 * Adiciona o pão integral
	 */
	@Override
	public Pao adicionarPao(String paoIntegral) {
		return new PaoIntegral(paoIntegral);
	}

	/**
	 * @return o pão integral
	 */
	public String getPaoIntegral() {
		return paoIntegral;
	}

	/**
	 * Seta o pão integral
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
