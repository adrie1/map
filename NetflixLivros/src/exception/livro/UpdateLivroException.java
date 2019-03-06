package exception.livro;

/**
 * Classe UpdateLivroException
 * @author Samara
 */
public class UpdateLivroException extends Exception {
	
	public static final String UPDATELIVRO_MSG = "Não é possível atualizar um livro que não está cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public UpdateLivroException(String codigo) {
		super(String.format(UPDATELIVRO_MSG, codigo.toString()));
	}	

}
