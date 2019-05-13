package ingredientes;

/**
 * Representa um tomate
 * 
 * @author Adriele e Samara
 */
public class Tomate {

	private String tomate;

	/**
	 * Construtor passando uma string que adiciona o tomate
	 * 
	 * @param tomate
	 */
	public Tomate(String tomate) {
		this.tomate = tomate;
	}
	
	/**
	 * Adiciona o tomate
	 * 
	 * @param tomate
	 * @return tomate
	 */
	public Tomate adicionarTomate(String tomate) {
		return new Tomate(tomate);
	}

	/**
	 * @return o tomate
	 */
	public String getTomate() {
		return tomate;
	}

	/**
	 * Seta o tomate
	 * 
	 * @param tomate
	 */
	public void setTomate(String tomate) {
		this.tomate = tomate;
	}

	@Override
	public String toString() {
		return tomate;
	}
	
	

}
