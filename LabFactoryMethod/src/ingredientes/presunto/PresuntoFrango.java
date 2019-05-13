package ingredientes.presunto;

/**
 * Representa um presunto de frango que implementa a interface presunto
 * 
 * @author Adriele e Samara
 */
public class PresuntoFrango implements Presunto {

	private String presuntoFrango;
	
	/**
	 * Construtor passando uma string que adiciona o presunto de frango
	 * 
	 * @param presuntoFrango
	 */
	public PresuntoFrango(String presuntoFrango) {
		this.presuntoFrango = presuntoFrango;
	}
	
	/**
	 * Adiciona o presunto de frango
	 */
	@Override
	public Presunto adicionarPresunto(String presuntoFrango) {
		return new PresuntoFrango(presuntoFrango);
	}

	/**
	 * @return o presunto de frango
	 */
	public String getPresuntoFrango() {
		return presuntoFrango;
	}

	/**
	 * Seta o presunto de frango
	 * 
	 * @param presuntoFrango
	 */
	public void setPresuntoFrango(String presuntoFrango) {
		this.presuntoFrango = presuntoFrango;
	}

	@Override
	public String toString() {
		return presuntoFrango;
	}
	
	

}
