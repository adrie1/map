package ingredientes.queijo;

/**
 * Representa um queijo prata que implementa a interface queijo
 * 
 * @author Adriele e Samara
 */
public class QueijoPrata implements Queijo {

	private String queijoPrata;
	
	/**
	 * Construtor passando uma string que adiciona o queijo prata
	 * 
	 * @param queijoPrata
	 */
	public QueijoPrata(String queijoPrata) {
		this.queijoPrata = queijoPrata;
	}
	
	/**
	 * Adiciona o queijo prata
	 */
	@Override
	public Queijo adicionarQueijo(String queijoPrata) {
		return new QueijoPrata(queijoPrata);
	}

	/**
	 * @return o queijo prata
	 */
	public String getQueijoPrata() {
		return queijoPrata;
	}

	/**
	 * Seta o queijo prata
	 * 
	 * @param queijoPrata
	 */
	public void setQueijoPrata(String queijoPrata) {
		this.queijoPrata = queijoPrata;
	}

	@Override
	public String toString() {
		return queijoPrata;
	}
	
	

}
