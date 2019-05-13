package ingredientes.queijo;

/**
 * Representa um queijo mussarela que implementa a interface queijo
 * 
 * @author Adriele e Samara
 */
public class QueijoMussarela implements Queijo {

	private String queijoMussarela;
	
	/**
	 * Construtor passando uma string que adiciona o queijo mussarela
	 * 
	 * @param queijoMussarela
	 */
	public QueijoMussarela(String queijoMussarela) {
		this.queijoMussarela = queijoMussarela;
	}
	
	/**
	 * Adiciona o queijo mussarela
	 */
	@Override
	public Queijo adicionarQueijo(String queijoMussarela) {
		return new QueijoMussarela(queijoMussarela);
	}

	/**
	 * @return o queijo mussarela
	 */
	public String getQueijoMussarela() {
		return queijoMussarela;
	}

	/**
	 * Seta o queijo mussarela
	 * 
	 * @param queijoMussarela
	 */
	public void setQueijoMussarela(String queijoMussarela) {
		this.queijoMussarela = queijoMussarela;
	}

	@Override
	public String toString() {
		return queijoMussarela;
	}
	
	

}
