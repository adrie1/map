package ingredientes.presunto;

/**
 * Define o presunto padrão
 * 
 * @author Adriele e Samara
 */
public class PresuntoDefault implements Presunto {

	private String presunto;

	/**
	 * Construtor passando uma string que adiciona o presunto
	 * 
	 * @param presunto
	 */
	public PresuntoDefault(String presunto) {
		this.presunto = presunto;
	}
	
	/**
	 * Adiciona o presunto
	 */
	@Override
	public Presunto adicionarPresunto(String presunto) {
		return new PresuntoDefault(presunto);
	}

	/**
	 * @return o presunto
	 */
	public String getPresunto() {
		return presunto;
	}

	/**
	 * Seta o presunto
	 * 
	 * @param presunto
	 */
	public void setPresunto(String presunto) {
		this.presunto = presunto;
	}

	@Override
	public String toString() {
		return "PresuntoDefault [presunto=" + presunto + "]";
	}
	
	
}
