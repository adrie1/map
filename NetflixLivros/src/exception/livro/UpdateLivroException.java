package exception.livro;

/**
 * Classe UpdateLivroException
 * @author Samara
 */
public class UpdateLivroException extends Exception {
	
	public static final String UPDATELIVRO_MSG = "N�o � poss�vel atualizar um livro que n�o est� cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public UpdateLivroException(String codigo) {
		super(String.format(UPDATELIVRO_MSG, codigo.toString()));
	}	

}
