package ingredientes.queijo;

/**
 * Define o queijo padrão
 * 
 * @author Adriele e Samara
 */
public class QueijoDefault implements Queijo {
	
	private String queijo;
	
	/**
	 * Construtor passando uma string que adiciona o queijo
	 * 
	 * @param queijo
	 */
	public QueijoDefault(String queijo) {
		this.queijo = queijo;
	}

	/**
	 * Adiciona o queijo
	 */
	@Override
	public Queijo adicionarQueijo(String queijo) {
		return new QueijoDefault(queijo);
	}

	/**
	 * @return o queijo
	 */
	public String getQueijo() {
		return queijo;
	}

	/**
	 * Seta o queijo
	 * 
	 * @param queijo
	 */
	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}

	@Override
	public String toString() {
		return "QueijoDefault [queijo=" + queijo + "]";
	}
	
	

}
