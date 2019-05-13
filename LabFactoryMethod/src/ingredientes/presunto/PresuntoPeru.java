package ingredientes.presunto;

/**
 * Representa um presunto de peru que implementa o presunto
 * 
 * @author Adriele e Samara
 */
public class PresuntoPeru implements Presunto {

	private String presuntoPeru;
	
	/**
	 * Construtor passando uma string que adiciona o presunto de peru
	 * 
	 * @param presuntoPeru
	 */
	public PresuntoPeru(String presuntoPeru) {
		this.presuntoPeru = presuntoPeru;
	}
	
	/**
	 * Adiciona o presunto de peru
	 */
	@Override
	public Presunto adicionarPresunto(String presuntoPeru) {
		return new PresuntoPeru(presuntoPeru);
	}

	/**
	 * @return o presunto de peru
	 */
	public String getPresuntoPeru() {
		return presuntoPeru;
	}

	/**
	 * Seta o presunto de peru
	 * 
	 * @param presuntoPeru
	 */
	public void setPresuntoPeru(String presuntoPeru) {
		this.presuntoPeru = presuntoPeru;
	}

	@Override
	public String toString() {
		return presuntoPeru;
	}
	
	
	
}
