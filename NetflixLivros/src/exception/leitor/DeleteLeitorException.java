package exception.leitor;

/**
 * Classe DeleteLeitorException
 * @author Adriele e Samara
 */
public class DeleteLeitorException extends Exception {

	public static final String DELETELEITOR_MSG = "Não é possível deletar um leitor que não está cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public DeleteLeitorException(String codigo) {
		super(String.format(DELETELEITOR_MSG, codigo.toString()));
	}
}
