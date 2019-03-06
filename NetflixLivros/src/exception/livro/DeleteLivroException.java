package exception.livro;

/**
 * Classe DeleteLivroException
 * @author Adriele e Samara
 */
public class DeleteLivroException extends Exception {
	
	public static final String DELETELIVRO_MSG = "N�o � poss�vel deletar um livro que n�o est� cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public DeleteLivroException(String codigo) {
		super(String.format(DELETELIVRO_MSG, codigo.toString()));
	}

}
