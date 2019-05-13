package ingredientes.ovo;

/**
 * Representa um ovo de granja que implementa a interface ovo
 * 
 * @author Adriele e Samara
 */
public class OvoGranja implements Ovo {

	private String ovoGranja;
	
	/**
	 * Construtor passando uma string que adiciona o ovo de granja
	 * 
	 * @param ovoGranja
	 */
	public OvoGranja(String ovoGranja) {
		this.ovoGranja = ovoGranja;
	}
	
	/**
	 * Adiciona o ovo de granja
	 */
	@Override
	public Ovo adicionarOvo(String ovoGranja) {
		return new OvoGranja(ovoGranja);
	}

	/**
	 * @return o ovo de granja
	 */
	public String getOvoGranja() {
		return ovoGranja;
	}

	/**
	 * Seta o ovo de granja
	 * 
	 * @param ovoGranja
	 */
	public void setOvoGranja(String ovoGranja) {
		this.ovoGranja = ovoGranja;
	}

	@Override
	public String toString() {
		return ovoGranja;
	}
	
	

}
