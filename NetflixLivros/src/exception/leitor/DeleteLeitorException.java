package exception.leitor;

/**
 * Classe DeleteLeitorException
 * @author Adriele e Samara
 */
public class DeleteLeitorException extends Exception {

	public static final String DELETELEITOR_MSG = "N�o � poss�vel deletar um leitor que n�o est� cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public DeleteLeitorException(String codigo) {
		super(String.format(DELETELEITOR_MSG, codigo.toString()));
	}
}
