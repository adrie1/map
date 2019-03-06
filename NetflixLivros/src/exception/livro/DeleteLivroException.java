package exception.livro;

/**
 * Classe DeleteLivroException
 * @author Adriele e Samara
 */
public class DeleteLivroException extends Exception {
	
	public static final String DELETELIVRO_MSG = "Não é possível deletar um livro que não está cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public DeleteLivroException(String codigo) {
		super(String.format(DELETELIVRO_MSG, codigo.toString()));
	}

}
