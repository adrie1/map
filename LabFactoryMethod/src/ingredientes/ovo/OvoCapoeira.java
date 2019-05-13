package ingredientes.ovo;

/**
 * Representa o ovo de capoeira que implementa a interface ovo
 * 
 * @author Adriele e Samara
 */
public class OvoCapoeira implements Ovo {

	private String ovoCapoeira;
	
	/**
	 * Construtor passando uma string que adiciona o ovo de capoeira
	 * 
	 * @param ovoCapoeira
	 */
	public OvoCapoeira(String ovoCapoeira) {
		this.ovoCapoeira = ovoCapoeira;
	}
	
	/**
	 * Adiciona o ovo de capoeira
	 */
	@Override
	public Ovo adicionarOvo(String ovoCapoeira) {
		return new OvoCapoeira(ovoCapoeira);
	}

	/**
	 * @return o ovo de capoeira
	 */
	public String getOvoCapoeira() {
		return ovoCapoeira;
	}

	/**
	 * Seta o ovo de capoeira
	 * 
	 * @param ovoCapoeira
	 */
	public void setOvoCapoeira(String ovoCapoeira) {
		this.ovoCapoeira = ovoCapoeira;
	}

	@Override
	public String toString() {
		return ovoCapoeira;
	}
	
	

}
