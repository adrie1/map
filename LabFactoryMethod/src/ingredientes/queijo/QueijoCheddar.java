package ingredientes.queijo;

/**
 * Representa um quejo cheddar que implementa a interface queijo
 * 
 * @author Adriele e Samara
 */
public class QueijoCheddar implements Queijo {

	private String queijoCheddar;
	
	/**
	 * Construtor passando uma string que adiciona o queijo cheddar
	 * 
	 * @param queijoCheddar
	 */
	public QueijoCheddar(String queijoCheddar) {
		this.queijoCheddar = queijoCheddar;
	}
	
	/**
	 * Adiciona o queijo cheddar
	 */
	@Override
	public Queijo adicionarQueijo(String queijoCheddar) {
		return new QueijoCheddar(queijoCheddar);
	}

	/**
	 * @return o queijo cheddar
	 */
	public String getQueijoCheddar() {
		return queijoCheddar;
	}

	/**
	 * Seta o queijo cheddar
	 * 
	 * @param queijoCheddar
	 */
	public void setQueijoCheddar(String queijoCheddar) {
		this.queijoCheddar = queijoCheddar;
	}

	@Override
	public String toString() {
		return queijoCheddar;
	}
	
	

}
