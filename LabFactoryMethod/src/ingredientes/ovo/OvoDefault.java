package ingredientes.ovo;

/**
 * Define o ovo padrão
 * 
 * @author Adriele e Samara
 */
public class OvoDefault implements Ovo {

	private String ovo;
	
	/**
	 * Construtor passando uma string que adiciona o ovo
	 * 
	 * @param ovo
	 */
	public OvoDefault(String ovo) {
		this.ovo = ovo;
	}
	
	/**
	 * Adiciona o ovo
	 */
	@Override
	public Ovo adicionarOvo(String ovo) {
		return new OvoDefault(ovo);
	}

	/**
	 * @return o ovo
	 */
	public String getOvo() {
		return ovo;
	}

	/**
	 * Seta o ovo
	 * 
	 * @param ovo
	 */
	public void setOvo(String ovo) {
		this.ovo = ovo;
	}

	@Override
	public String toString() {
		return "OvoDefault [ovo=" + ovo + "]";
	}


}
